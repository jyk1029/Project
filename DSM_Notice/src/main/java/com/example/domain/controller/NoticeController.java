package com.example.domain.controller;

import com.example.domain.dto.NoticeRequest;
import com.example.domain.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/notice")
@RestController
public class NoticeController {

    private final NoticeService noticeService;

    @CrossOrigin("*")
    @PostMapping("/account")
    public void noticeEntity(@Valid @RequestBody NoticeRequest noticeRequset){
        noticeService.noticeEntity(noticeRequset);
    }

}
