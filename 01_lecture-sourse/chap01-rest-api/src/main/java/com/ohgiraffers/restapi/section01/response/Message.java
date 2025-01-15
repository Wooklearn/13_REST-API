package com.ohgiraffers.restapi.section01.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Message {

    private int httpStatusCode;
    private String message;

}
