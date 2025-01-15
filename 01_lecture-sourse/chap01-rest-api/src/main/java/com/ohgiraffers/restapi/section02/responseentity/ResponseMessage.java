package com.ohgiraffers.restapi.section02.responseentity;

import lombok.*;

import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResponseMessage {

    private int httpStatusCode;
    private String message;
    private Map<String, Object> results;

}
