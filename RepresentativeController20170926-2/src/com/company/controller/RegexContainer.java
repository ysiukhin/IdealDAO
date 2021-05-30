package com.company.controller;

/**
 * Created by student on 26.09.2017.
 */
public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЯІЇЄ][а-яіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // «nick@mail.com»
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}
