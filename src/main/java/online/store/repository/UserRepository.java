package online.store.repository;

import online.store.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByFirstNameAndLastName(String firstName, String lastName);

  Optional<User> findByEmail(String email);

  Boolean existsByFirstNameAndLastName(String firstName, String lastName);

  Boolean existsByEmail(String email);
}
