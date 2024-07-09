package com.Dashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dashank.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
