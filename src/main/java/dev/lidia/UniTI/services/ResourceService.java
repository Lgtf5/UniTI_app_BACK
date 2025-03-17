package dev.lidia.UniTI.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import dev.lidia.UniTI.models.Resource;

import dev.lidia.UniTI.repositories.ResourceRepository;



@Service
public class ResourceService {

    
    private final ResourceRepository resourceRepository;

    ResourceService( ResourceRepository resourceRepository) {
        

        this.resourceRepository = resourceRepository;
        }
    
    

    private Resource mapTo(Resource entity) {
        // Implement the mapping logic here
        Resource resource = new Resource();
        resource.setId(entity.getId());
        resource.setCategory(entity.getCategory());
        // Add other fields as necessary
        return resource;
    }
    // Removed constructor that does not initialize resourceRepository

    public Resource addResource(Resource resource) {
        return mapTo (resourceRepository.save(mapTo(resource)));
    }
    
    public List<Resource> findByCategory (String category) {
        return resourceRepository.findByCategory(category)
            .stream()
            .map(this::mapTo)
            .collect(Collectors.toList());
    }
    public List<Resource> findAll() {
        return resourceRepository.findAll();
    }
}
