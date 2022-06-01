package src.models;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import src.models.Status;

import dao.interfaces.ProductDao;

import DaoFactory.daoFactory;

public class Product extends models.AuditedModel {
    Long id ;
    String title;
    String description;
    Integer price;

    Status status;

    boolean isAllowed;
    public Product() {}
    public Product(
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
        boolean isAllowed
        ) {
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
        this.isAllowed = isAllowed;
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
    public void setId(Long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }
    public boolean getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public String[] toArray() {
        return new String[] {this.id.toString(), this.title, this.price.toString()};
    }

    @Override
    public String toString() {
        return " id: " + id +
                " title: " + title +
                " Price : " + price ;
    }
    // Methods to Work with Database


    /**
     * Method to save the current product in the database.
     */
    public void save() throws SQLException {
        ProductDao().insert(this);
    }
    /**
     * Method to save the current user in the database
     */
    public void delete() throws SQLException{
        ProductDao().delete(this);
    }


    /**
     * Method to find all users from the database
     * @return users all users from the database
     */
    public static List<Product> all() throws SQLException {
        return ProductDao().all();
    }
}
