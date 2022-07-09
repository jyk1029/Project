package com.example.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NoticeResponse {
    private final String accountId;
    private final String password;
    private final String name;
    private final Long number;
}
