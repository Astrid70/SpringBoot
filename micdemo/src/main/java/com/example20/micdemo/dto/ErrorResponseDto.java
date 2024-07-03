package com.example20.micdemo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
public class ErrorResponseDto {

    private String statusCode;
    private String statusMsg;
    private HttpStatus errorCode;
    private LocalDateTime errorTime;

}



