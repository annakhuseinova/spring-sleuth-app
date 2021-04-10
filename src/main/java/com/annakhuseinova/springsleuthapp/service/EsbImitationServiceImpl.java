package com.annakhuseinova.springsleuthapp.service;

import com.annakhuseinova.springsleuthapp.dto.ActivationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EsbImitationServiceImpl implements EsbImitationService {

    @Override
    public String activate(ActivationDto activationDto) throws InterruptedException {
        log.debug("[EsbImitationServiceImpl] starting to imitation some function...");
        Thread.sleep(5000);
        return "OK";
    }
}
