package com.github.yhtps.lowpr.domain.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.comment.CommentEntity;

@Transactional(readOnly = true)
public interface CommentRepository extends JpaRepository<CommentEntity, Long>, CommentRepositoryCustom {
}
