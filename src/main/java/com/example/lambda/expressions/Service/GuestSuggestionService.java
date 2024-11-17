package com.example.lambda.expressions.Service;
import com.example.lambda.expressions.Entity.GuestSuggestionEntity;
import com.example.lambda.expressions.Entity.SuggestionStatus;
import com.example.lambda.expressions.Function.SuggestionProcessor;
import com.example.lambda.expressions.Repository.GuestSuggestionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
// business logic
public class GuestSuggestionService {

    private GuestSuggestionRepository guestSuggestionRepository;

    private void saveSuggestion(String text, double rate, String status) {
    }
    private final SuggestionProcessor suggestionProcessor = this :: saveSuggestion;

    public String processSuggestion(String text, double rate, String status){
        suggestionProcessor.suggestion(text,rate, status);
        return " successful! ";
    }

//    private void saveSuggestion( String suggestion,double rate, String status) {
//        GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
//        suggestionEntity.setSuggestion(suggestion);
//        suggestionEntity.setRate(rate);
//        suggestionEntity.setStatus(SuggestionStatus.valueOf(status));
//        guestSuggestionRepository.save(suggestionEntity);
//    };


    public List<GuestSuggestionEntity> findAllCreatedSuggestions(){
    return  guestSuggestionRepository.findAll()
            .stream()
           .filter((suggestion) -> SuggestionStatus.CREATE.equals(suggestion.getStatus()))
           .collect(Collectors.toList());
}

    public List<GuestSuggestionEntity> findAllRemovedSuggestions(){
        return  guestSuggestionRepository.findAll()
                .stream()
                .filter((suggestion) -> SuggestionStatus.REMOVE.equals(suggestion.getStatus()))
                .collect(Collectors.toList());

    }
}
