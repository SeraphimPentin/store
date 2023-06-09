package online.store.services;

import online.store.models.ERole;
import online.store.models.Role;
import online.store.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    public Role findByName(ERole name){
        Optional<Role> findUser = roleRepository.findByName(name);
        return findUser.orElse(null);
    }
}
