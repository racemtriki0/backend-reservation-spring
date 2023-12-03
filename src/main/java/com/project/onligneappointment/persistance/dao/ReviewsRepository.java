package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Reviews;
import com.project.onligneappointment.service.interfaces.IReviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
}
