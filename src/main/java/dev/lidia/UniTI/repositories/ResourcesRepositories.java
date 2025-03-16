package dev.lidia.UniTI.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import dev.lidia.UniTI.models.Resource;

public interface ResourcesRepositories  extends JpaRepository<Resource, Long>{
    
}
