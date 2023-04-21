package online.store.repository;

import online.store.models.Product;
import online.store.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
//    Optional findById(Long id);

}
