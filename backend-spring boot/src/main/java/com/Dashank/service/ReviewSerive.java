package com.Dashank.service;

import java.util.List;

import com.Dashank.Exception.ReviewException;
import com.Dashank.model.Review;
import com.Dashank.model.User;
import com.Dashank.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
