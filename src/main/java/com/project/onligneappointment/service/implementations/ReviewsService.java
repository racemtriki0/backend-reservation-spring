package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.ReviewsRepository;
import com.project.onligneappointment.persistance.entities.Reviews;
import com.project.onligneappointment.service.interfaces.IAppointment;
import com.project.onligneappointment.service.interfaces.IReviews;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ReviewsService implements IReviews {
    @Autowired
    ReviewsRepository reviewsRepository;
    @Override
    public Reviews saveReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    @Override
    public Reviews updateReviews(Reviews reviews) {
        return reviewsRepository.saveAndFlush(reviews);
    }

    @Override
    public boolean deleteReviews(Long id) {
        reviewsRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Reviews> getListReviews() {
        return reviewsRepository.findAll();
    }

    @Override
    public Reviews findById(Long id) {
        return reviewsRepository.getReviewsById(id);
    }

    @Override
    public int getQuantityOfReviews() {
        return reviewsRepository.getQuantityOfReviews();
    }
}
