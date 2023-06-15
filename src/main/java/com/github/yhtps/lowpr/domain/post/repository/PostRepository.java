package com.github.yhtps.lowpr.domain.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.post.PostEntity;

@Transactional(readOnly = true)
public interface PostRepository extends JpaRepository<PostEntity, Long>, PostRepositoryCustom {
}
