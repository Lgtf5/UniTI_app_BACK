package dev.lidia.UniTI.controllers;
import java.util.List;

import dev.lidia.UniTI.services.ResourceService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.lidia.UniTI.models.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/resources")
public class ResourceController {

   
    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
       
        this.resourceService = resourceService;
    }

    @PostMapping
    public ResponseEntity<Resource> addResource(@RequestBody Resource resource) {
        Resource addedResource = resourceService.addResource(resource);
        return new ResponseEntity<>(addedResource, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Resource> index() {
        return resourceService.findAll();
    }
}

