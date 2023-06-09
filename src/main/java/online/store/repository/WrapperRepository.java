package online.store.repository;

import online.store.models.Wrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WrapperRepository extends JpaRepository<Wrapper, Long> {
}
