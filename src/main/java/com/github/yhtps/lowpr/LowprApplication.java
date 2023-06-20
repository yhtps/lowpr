package com.github.yhtps.lowpr;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.github.yhtps.lowpr.domain.common.enums.MemberRole;
import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.github.yhtps.lowpr.domain.member.repository.MemberRepository;

@SpringBootApplication
public class LowprApplication {

	public static void main(String[] args) {
		SpringApplication.run(LowprApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(MemberRepository repo, PasswordEncoder pe) {
		return args -> {
			repo.save(
					MemberEntity.builder().email("a").password(pe.encode("a")).name("a").nickname("a").build().addRole(MemberRole.MEMBER));
		};
	}

}
