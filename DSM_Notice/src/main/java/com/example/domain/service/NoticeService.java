package com.example.domain.service;

import com.example.domain.domain.NoticeEntity;
import com.example.domain.domain.repository.NoticeRepository;
import com.example.domain.dto.NoticeRequest;
import org.springframework.transaction.annotation.Transactional;

public class NoticeService {

    private NoticeRepository noticeRepository;

    @Transactional
    public void noticeEntity(NoticeRequest noticeRequest){
        NoticeEntity noticeEntity = NoticeEntity.builder()
                .accountId(noticeRequest.getAccountId())
                .password(noticeRequest.getPassword())
                .name(noticeRequest.getName())
                .studentId(noticeRequest.getStudentId())
                .build();
        noticeRepository.save(noticeEntity);
    }
}
