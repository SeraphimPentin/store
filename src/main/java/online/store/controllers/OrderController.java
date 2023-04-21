//package online.store.controllers;
//
//import online.store.email.EmailService;
//import online.store.models.Product;
//import online.store.models.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailException;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("bag/order")
//public class OrderController {
//
//    @Autowired
//    EmailService emailService;
//
//    @PostMapping("/buy")
//    public void OrderProduct(User user, Product product, Integer currentProducts) {
//        if (product.getQuantity() > currentProducts) {
//            int countProducts = product.getQuantity();
//            product.setQuantity(countProducts - currentProducts);
//        }
//        String email = user.getEmail();
//
//        String message = "Ваш заказ: \n" + SomeClassWithListProduct.list() + " что-то еще трали вали и т.д. ";
//        try {
//            emailService.sendSimpleEmail(email, "Welcome", "This is a welcome email for your!!");
//        } catch (MailException mailException) {
////            LOG.error("Error while sending out email..{}", mailException.getStackTrace());
////            return new ResponseEntity<>("Unable to send email", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }
//}
//
