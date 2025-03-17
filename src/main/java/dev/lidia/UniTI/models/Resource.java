package dev.lidia.UniTI.models;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resources")

public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String category;
    // @Column ( columnDefinition = "BLOB")
    // private byte[] image;
    @Column (name = "link")
    private String link;
    @Column (name = "description", nullable =  false, columnDefinition = "VARCHAR(100)" )
    private String description;

    public Resource() {
    }

    public Resource(Long id, String category, String link, String description) {
        // byte[] image,

        this.id = id;
        this.category = category;
        // this.image = image;
        this.link = link;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // public byte[] getImage() {
    // return image;
    // }

    // public void setImage(byte[] image) {
    // this.image = image;
    // }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
