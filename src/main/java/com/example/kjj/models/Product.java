package com.example.kjj.models;

import com.example.kjj.dao.concrete.ProductDaoMySQL;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.SQLException;
import java.util.List;

@Entity
@Table(name="Product")
public class Product extends AuditedModel {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    @Getter @Setter
    @Column
    private String title;

    @Getter @Setter
    @Column
    private String description;

    @Getter @Setter
    @Column
    private Integer price;

    @Getter @Setter
    @Column
    private Status status;

    @Getter @Setter
    @Column
    private Boolean isAllowed;
    public Product() {}
    public Product(
        String title,
        String description ,
        Integer price,
        Boolean isActive,
        String createdBy,
        String updatedBy,
        String deletedBy,
        boolean isAllowed
        ) {
        this.title = title;
        this.description  = description; 
        this.price = price; 
        this.isActive = isActive;
        this.createdBy = createdBy; 
        this.updatedBy = updatedBy;
        this.deletedBy = deletedBy;
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


//    /**
//     * Method to save the current product in the database.
//     */
//    public void save() throws SQLException {
//        new ProductDaoMySQL().insert(this);
//    }
//    /**
//     * Method to save the current user in the database
//     */
//    public void delete() throws SQLException{
//        new ProductDaoMySQL().delete(this);
//    }


//    /**
//     * Method to find all users from the database
//     * @return users all users from the database
//     */
//    public static List<Product> all() throws SQLException {
//        return new ProductDaoMySQL().all();
//    }
}
