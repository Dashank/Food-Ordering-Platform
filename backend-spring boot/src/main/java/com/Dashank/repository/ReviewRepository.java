package com.Dashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dashank.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
