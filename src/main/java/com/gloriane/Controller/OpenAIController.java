package com.gloriane.Controller;

import com.gloriane.service.OpenAIService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ai")
@RequiredArgsConstructor

public class OpenAIController {

    private final OpenAIService openAIService;

    @GetMapping("chat")
    public String processSimpleChatQuery(@RequestParam @NotNull(message="Question should not be null.")String question) {
        return openAIService.processSimpleChatQuery(question);
    }
}
