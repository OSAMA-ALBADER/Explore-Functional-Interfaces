package com.example.lambda.expressions.Controller;
import com.example.lambda.expressions.Entity.GuestSuggestionEntity;
import com.example.lambda.expressions.Service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController

public class SuggestionStatusController {
    @Autowired
    private  GuestSuggestionService guestSuggestionService;

    @GetMapping("/suggestion/create")
    public List<GuestSuggestionEntity> getAllCreatedSuggestions(){
        return guestSuggestionService.findAllCreatedSuggestions();
    }
    @GetMapping("/suggestion/remove")
    public List<GuestSuggestionEntity> getAllRemovedSuggestions(){
        return guestSuggestionService.findAllRemovedSuggestions();
    }


}
