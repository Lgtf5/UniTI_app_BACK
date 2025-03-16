package dev.lidia.UniTI.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import dev.lidia.UniTI.models.User;

public interface UserRepositories extends JpaRepository<User, Long>{
    
}
