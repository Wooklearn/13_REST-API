package com.ohgiraffers.restapi.section02.responseentity;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private int no;
    private String id;
    private String pwd;
    private String name;
    private LocalDate enrollDate;

}
