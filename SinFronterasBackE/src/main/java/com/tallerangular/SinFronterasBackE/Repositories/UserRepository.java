package com.tallerangular.SinFronterasBackE.Repositories;

import com.tallerangular.SinFronterasBackE.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
