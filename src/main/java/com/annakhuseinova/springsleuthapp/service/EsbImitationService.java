package com.annakhuseinova.springsleuthapp.service;

import com.annakhuseinova.springsleuthapp.dto.ActivationDto;

/**
 * Сервис, имитирующий функционал ESB для активации некоторой функциональности
 * */
public interface EsbImitationService {

    /**
     * Активировать некоторый функционал через ESB
     *
     * @param activationDto данные для активации
     * @return данные для активации
     * */
    String activate(ActivationDto activationDto) throws InterruptedException;
}
