package online.store.controllers;

import online.store.models.Reviews;
import online.store.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {


    @Autowired
    private ReviewService reviewService;

    @PostMapping("/send")
    public Reviews sendReview(Reviews review){
        return reviewService.saveReview(review);
    }


    /*
        http://store</st/>
    * - формирование заказа /create-order
    *   ---- хранение\сохранение корзины покупок /cart
    *   ---- проверка наличия продуктов
    *   ---- переход по категориям: store/smartphone/apple..
    * - отправка письма /email
    *
    * */
}
