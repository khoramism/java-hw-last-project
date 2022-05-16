package models;
import java.util.UUID;

public class Product extends AuditedModel {
    Long id ;
    String title;
    String description;
    Integer price;

    Status status;

    
    public Product() {}
    public Product(Long id, 
        String title,
        String description ,
        Integer price,
        Boolean isActive,
        Date created,
        Date updated,
        Date deleted,
        String createdBy,
        String updatedBy,
        String deletedBy,
        ) 
    {
        this.id = id
        this.title = title;
        this.description  = description; 
        this.price = price; 
        this.isActive = isActive; 
        this.created = created; 
        this.updated = updated; 
        this.deleted = deleted; 
        this.createdBy = createdBy; 
        this.updatedBy = updatedBy;
        this.deletedBy = deletedBy;

    }


    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}