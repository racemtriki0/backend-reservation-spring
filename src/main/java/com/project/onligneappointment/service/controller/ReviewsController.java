package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.Reviews;
import com.project.onligneappointment.service.interfaces.IReviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewsController {
    @Autowired
    IReviews reviewservice;

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Reviews save(@RequestBody Reviews reviews){
        return reviewservice.saveReviews(reviews);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    Reviews update(@RequestBody Reviews reviews){
        return reviewservice.updateReviews(reviews);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id){
        reviewservice.deleteReviews(id);
        return true;
    }

    @GetMapping("/list")
    List<Reviews> getList(){
        return reviewservice.getListReviews();
    }

    @GetMapping("/get/{id}")
    Reviews getReviewsById(@PathVariable Long id){
        return reviewservice.findById(id);
    }

    @GetMapping("/quantity")
    int getQuantity(){
        return reviewservice.getQuantityOfReviews();
    }

}
