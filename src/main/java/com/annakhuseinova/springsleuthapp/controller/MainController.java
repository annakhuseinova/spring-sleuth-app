package com.annakhuseinova.springsleuthapp.controller;

import com.annakhuseinova.springsleuthapp.dto.ActivationDto;
import com.annakhuseinova.springsleuthapp.service.ActivationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Основной контроллер
 * */
@RestController
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private final ActivationService activationService;

    /**
     * Activate something
     * */
    @PostMapping("${urls.activate}")
    public ResponseEntity<String> activateSomething(@RequestBody ActivationDto activationDto) throws InterruptedException {
        return ResponseEntity.status(200).body(activationService.activate(activationDto));
    }
}
