package dev.lidia.UniTI.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import dev.lidia.UniTI.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
        boolean existsByName(String username);
        User findByUsername(String username);
    }
    

