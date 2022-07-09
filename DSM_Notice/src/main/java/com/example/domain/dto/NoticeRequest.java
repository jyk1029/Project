package com.example.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class NoticeRequest {
    private String accountId;
    private String password;
    private String name;
    private Long studentId;
}
