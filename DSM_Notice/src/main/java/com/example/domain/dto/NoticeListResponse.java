package com.example.domain.dto;

import com.example.domain.domain.NoticeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class NoticeListResponse {
    private final List<NoticeEntity> userLists;
}
