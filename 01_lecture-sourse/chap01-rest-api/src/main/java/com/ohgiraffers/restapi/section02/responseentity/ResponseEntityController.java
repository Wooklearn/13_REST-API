package com.ohgiraffers.restapi.section02.responseentity;

import org.springframework.cglib.core.Local;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/entity")
public class ResponseEntityController {

    /* comment.
    *   ResponseEntity 란?
    *   결과 데이터 와 HTTP 상태 코드 를 직접 제어할 수 있는
    *   클래스이다.
    *   내부에 HttpStatus, HttpHeaders, HttpBody 를 포함한다.
    *  */

    private List<UserDTO> users;

    /* 임시 DB 에서 조회해온 값 설정 */
    public ResponseEntityController() {
        users = new ArrayList<>();

        users.add(new UserDTO(1, "user01", "pass01", "너구리", LocalDate.now()));
        users.add(new UserDTO(2, "user02", "pass02", "푸바오", LocalDate.now()));
        users.add(new UserDTO(3, "user03", "pass03", "러바오", LocalDate.now()));
    }

    @GetMapping("/users")
    public ResponseEntity<ResponseMessage> findAllUsers() {

        HttpHeaders headers = new HttpHeaders();
        // 응답 할 데이터의 양식 지정
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("user", users);

        ResponseMessage responseMessage = new ResponseMessage(200, "조회 성공", responseMap);

        return new ResponseEntity<>(responseMessage, headers, HttpStatus.OK);
    }
}
