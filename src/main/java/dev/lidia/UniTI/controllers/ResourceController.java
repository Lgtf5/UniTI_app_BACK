package dev.lidia.UniTI.controllers;




import java.util.List;


import dev.lidia.UniTI.services.ResourceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.lidia.UniTI.models.Resource;

@RestController
@RequestMapping (path = "api/v1")
public class ResourceController {

    // @Autowired
    private ResourceService service;

    public ResourceController (ResourceService service) {
        this.service = service;
    }

    @GetMapping ("/resources")
    public List<Resource> index() { 
        
            return service.findAll(); 

            // List<Resource> resources = new ArrayList<>();

            // Service sass = new Resource (1L, "Fronted","https://sass-lang.com/",
            // "Página del propio procesador de CSS (Sass) que te hace más fácil y eficiente el desarrollo");

            // Service dataCamp = new Resource (2L, "Backend", "https://www.datacamp.com/es/doc/java/polymorphism", "Página dónde explican el Polimorfismo Java con tipos, ejemplos y buenas prácticas");

            // Service cssTricks = new Resource (3L, "Fronted", "https://css-tricks.com/snippets/css/complete-guide-grid/", "Guía completísima sobre CSS GRID y con ejemplos");

            // Service webDev = new Resource (4L, "Testing", "https://web.dev/learn/testing/get-started/what-testing-is?hl=es-419", "Página donde encuentras sección de testing con ejemplos y pruebas a librerías");

            // resources.add (sass);
            // resources.add (dataCamp);
            // resources.add (cssTricks);
            // resources.add (webDev);

            // return resources;
        }
    }

