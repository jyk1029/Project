package com.example.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class NoticeListResponse {
    private final List<NoticeResponse> userLists;
}
