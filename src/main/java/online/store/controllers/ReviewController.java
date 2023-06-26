package online.store.controllers;

import lombok.Data;
import online.store.models.Reviews;
import online.store.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/send")
    public Reviews sendReview(Reviews review){
        return reviewService.saveReview(review);
    }






    }

