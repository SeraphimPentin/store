package online.store.services;

import online.store.models.Reviews;
import online.store.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReviewService {

    @Autowired
    private final ReviewsRepository reviewsRepository;

    public ReviewService(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    public List<Reviews> findAll(){
        return reviewsRepository.findAll();
    }

    public Reviews saveReview(Reviews reviews){
        return reviewsRepository.save(reviews);
    }

//    boolean isAuthorized() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return authentication.        //isAuthenticated();
//    }

    public void deleteReview(Reviews reviews){
        reviewsRepository.delete(reviews);
    }
 }
