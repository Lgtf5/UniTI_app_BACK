package dev.lidia.UniTI.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.lidia.UniTI.models.Resource;

public interface ResourceRepository  extends JpaRepository<Resource, Long>{
    List<Resource> findByCategory(String category);
}
