package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.Reviews;
import com.project.onligneappointment.persistance.entities.User;

import java.util.List;

public interface IReviews {
    Reviews saveReviews(Reviews reviews);
    Reviews updateReviews(Reviews reviews);
    boolean deleteReviews(Long id);
    List<Reviews> getListReviews();
    Reviews findById(Long id);

    int getQuantityOfReviews();
}
