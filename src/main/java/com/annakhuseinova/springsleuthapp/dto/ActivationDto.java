package com.annakhuseinova.springsleuthapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data for activation
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActivationDto {

    /**
     * Имя лица, которому активируется функция
     * */
    private String firstName;

    /**
     * Фамилия лица, которому активируется функция
     * */
    private String lastName;

    /**
     * Возраст лица, которому активируется функция
     * */
    private int age;
}
