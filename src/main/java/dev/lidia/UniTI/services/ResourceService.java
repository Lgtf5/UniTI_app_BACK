package dev.lidia.UniTI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.lidia.UniTI.models.Resource;

@Service
public class ResourceService {
    
    public List<Resource> findAll() { 
        
        /* return service.findAll(); */

            List<Resource> resources = new ArrayList<>();

            Resource sass = new Resource (1L, "Fronted", "Sass","https://sass-lang.com/",
            "Página del propio procesador de CSS (Sass) que te hace más fácil y eficiente el desarrollo");

            Resource dataCamp = new Resource (2L, "Backend", "dataCamp", "https://www.datacamp.com/es/doc/java/polymorphism", "Página dónde explican el Polimorfismo Java con tipos, ejemplos y buenas prácticas");

            Resource cssTricks = new Resource (3L, "Fronted", "Css-Tricks", "https://css-tricks.com/snippets/css/complete-guide-grid/", "Guía completísima sobre CSS GRID y con ejemplos");

            Resource webDev = new Resource (4L, "Testing", "Web.dev", "https://web.dev/learn/testing/get-started/what-testing-is?hl=es-419", "Página donde encuentras sección de testing con ejemplos y pruebas a librerías");

            resources.add (sass);
            resources.add (dataCamp);
            resources.add (cssTricks);
            resources.add (webDev);

            return resources;
        }
}
