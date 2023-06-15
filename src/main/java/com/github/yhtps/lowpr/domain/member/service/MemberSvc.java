package com.github.yhtps.lowpr.domain.member.service;

import com.github.yhtps.lowpr.domain.member.dto.MemberInsertDTO;

public interface MemberSvc {

	boolean existsByEmail(String email);

	void insertMember(MemberInsertDTO dto);

}