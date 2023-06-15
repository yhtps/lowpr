package com.github.yhtps.lowpr.domain.common;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntityBody {

	@CreatedDate
	@Column(columnDefinition = "TimeStamp(6) null default null", updatable = false)
	private LocalDateTime createdDate;

	@LastModifiedDate
	@Column(columnDefinition = "TimeStamp(6) null default null")
	private LocalDateTime updatedDate;

	/**
	 * 삭제대신 true로 전환
	 */
	@Setter
	private boolean hide;

}