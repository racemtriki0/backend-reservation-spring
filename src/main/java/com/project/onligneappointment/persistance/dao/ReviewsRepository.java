package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Appointment;
import com.project.onligneappointment.persistance.entities.Reviews;
import com.project.onligneappointment.service.interfaces.IReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    Reviews saveReviews(Reviews reviews);
    Reviews updateReviews(Reviews reviews);
    boolean deleteReviews(Long id);
    List<Reviews> getListReviews();
    Reviews findById(long id);

    @Query(value = "select count(*) from reviews",nativeQuery = true)
    int getQuantityOfReviews();
    @Query(value = "select * from reviews where id= :id",nativeQuery = true)
    Reviews getReviewsById(@Param("id") Long id);
}
