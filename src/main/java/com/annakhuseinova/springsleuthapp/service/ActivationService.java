package com.annakhuseinova.springsleuthapp.service;

import com.annakhuseinova.springsleuthapp.dto.ActivationDto;

/**
 * Сервис активации некоторой функциональности
 * */
public interface ActivationService {

    /**
     * Активировать некоторую функцию
     *
     * @param activationDto данные активации
     * */
    String activate(ActivationDto activationDto) throws InterruptedException;
}
