package com.example.domain.domain.repository;

import com.example.domain.domain.NoticeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface NoticeRepository extends CrudRepository {
    Optional<NoticeEntity> findByAccountId(String accountId);
    List<NoticeEntity> findAllByOrderByIdDesc();
}
