package models;
import java.util.UUID;

public class Product extends AuditedModel {
    UUID uuid = UUID.randomUUID();
    String title;
    String description;
    Integer price;

    Status status;


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
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid.toString();
    }
}
