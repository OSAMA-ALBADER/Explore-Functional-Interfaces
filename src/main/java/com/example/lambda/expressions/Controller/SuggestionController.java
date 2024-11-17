package com.example.lambda.expressions.Controller;
import com.example.lambda.expressions.Service.GuestSuggestionService;
import com.example.lambda.expressions.bo.CreateSuggestionRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestionController {

     private final GuestSuggestionService guestSuggestionService;

    public SuggestionController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    @PostMapping("/api/suggestions")
    public ResponseEntity<String> newSuggestion(@RequestBody CreateSuggestionRequest request) {
        String response = guestSuggestionService.processSuggestion(request.getSuggestion(),request.getRate(), request.getStatus());
        if (response != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

    }

}
