package com.annakhuseinova.springsleuthapp.service;

import com.annakhuseinova.springsleuthapp.dto.ActivationDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EsbImitationServiceImpl implements EsbImitationService {

    private final ObjectMapper objectMapper;

    @Override
    public String activate(ActivationDto activationDto) throws InterruptedException {
        String json = null;
        try {
            json = objectMapper.writeValueAsString(activationDto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        log.debug("[EsbImitationServiceImpl] starting to imitate activation of a  function...");
        Thread.sleep(5000);
        return "Successfully performed activation for user: " + json;
    }
}
