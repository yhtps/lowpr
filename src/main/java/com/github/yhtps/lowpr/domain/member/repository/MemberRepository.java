package com.github.yhtps.lowpr.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.member.MemberEntity;

@Transactional(readOnly = true)
public interface MemberRepository extends JpaRepository<MemberEntity, Long>, MemberRepositoryCustom {

}
