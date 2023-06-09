package online.store.services;


import lombok.Data;
import online.store.models.User;
import online.store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
//@NoArgsConstructor
@Data
//@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(long id){
        Optional<User> findUser = userRepository.findById(id);
        return findUser.orElse(null);
    }

    public User findByName(String name){
        Optional<User> findUser = userRepository.findByUsername(name);
        return findUser.orElse(null);
    }

    public Boolean existsByUsername(String username){
        return userRepository.existsByUsername(username);
    }

    public Boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }
    @Transactional
    public void save(User user){
        userRepository.save(user);
    }

    @Transactional
    public void update(long id, User updatedUser){
        updatedUser.setId(id);
        userRepository.save(updatedUser);
    }

    @Transactional
    public void delete(long id){
        userRepository.deleteById(id);
    }
}

