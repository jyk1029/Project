package com.example.domain.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class NoticeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 255, nullable = false)
    private String accountId;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private Long studentId;

    @Builder
    public NoticeEntity(String accountId, String password, String name, Long studentId){
        this.accountId=accountId;
        this.password=password;
        this.name=name;
        this.studentId=studentId;
    }
}
