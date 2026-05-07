package com.gloriane.service;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAIServiceImpl implements OpenAIService{

@Autowired
    public OpenAIServiceImpl(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    private final OpenAiChatModel openAiChatModel;


    @Override
    public String processSimpleChatQuery(String query) {
        if(query == null) {
            throw new IllegalArgumentException("Query cannot be null");
        }
        return openAiChatModel.call(query);
    }
}
