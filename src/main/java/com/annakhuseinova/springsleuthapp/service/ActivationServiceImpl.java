package com.annakhuseinova.springsleuthapp.service;

import com.annakhuseinova.springsleuthapp.dto.ActivationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActivationServiceImpl implements ActivationService {

    private final EsbImitationService esbImitationService;

    @Override
    public String activate(ActivationDto activationDto) throws InterruptedException {
        return esbImitationService.activate(activationDto);
    }
}
