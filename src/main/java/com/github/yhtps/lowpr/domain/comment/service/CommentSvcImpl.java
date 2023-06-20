package com.github.yhtps.lowpr.domain.comment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.comment.CommentEntity;
import com.github.yhtps.lowpr.domain.comment.dto.CommentDto;
import com.github.yhtps.lowpr.domain.comment.repository.CommentRepository;
import com.github.yhtps.lowpr.domain.member.MemberEntity;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentSvcImpl implements CommentSvc {

	private final CommentRepository cr;

	private CommentDto toDTO(CommentEntity entity) {
		if (entity == null) return null;
		final var dto = CommentDto.builder();
		if (entity.getContent() != null) dto.content(entity.getContent());
		if (entity.getCreatedDate() != null) dto.createdDate(entity.getCreatedDate());
		dto.hide(entity.isHide());
		if (entity.getMember() != null) dto.nickname(entity.getMember().getNickname());
		dto.no(entity.getNo());
		if (entity.getUpdatedDate() != null) dto.updatedDate(entity.getUpdatedDate());
		return dto.build();
	}

	private CommentEntity toEntity(CommentDto dto) {
		if (dto == null) return null;
		final var entity = CommentEntity.builder();
		if (dto.getContent() != null) entity.content(dto.getContent());
		if (dto.getNickname() != null) entity.member(MemberEntity.builder().nickname(dto.getNickname()).build());
		entity.no(dto.getNo());
		return entity.build();
	}

	private List<CommentDto> toDTOs(List<CommentEntity> entities) {
		if (entities == null) return null;
		return entities.stream().map(this::toDTO).collect(Collectors.toList());
	}

	private List<CommentEntity> toEntities(List<CommentDto> dtos) {
		if (dtos == null) return null;
		// return dtos.stream().map(this::toEntity).collect(Collectors.toList());
		return dtos.stream().map(this::toEntity).toList();
	}

	private void update(CommentDto dto, CommentEntity entity) {
		if (dto == null) return;
		entity.setHide(dto.isHide());
	}

}
