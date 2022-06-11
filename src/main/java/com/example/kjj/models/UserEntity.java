package com.example.kjj.models;

import java.lang.String;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.*;
// import dao.interfaces.UserDao;
import  com.example.kjj.DaoFactory.daoFactory;


@Entity
@Table(	name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class UserEntity {
        @Id
        @Getter @Setter
        @GeneratedValue(strategy =  GenerationType.SEQUENCE)
        private Integer id;
    
        @Size(max = 20)
        @Getter @Setter
        @Column(name="first_name", nullable = false)
        private String firstName;
    
        @Size(max = 20)
        @Getter @Setter
        @Column(name="last_name", nullable = false)
        private String lastName;
    
        @Email @Size(max = 50)
        @Getter @Setter
        @Column
        private String email;
    
        @Size(max = 120)
        @Getter @Setter
        @Column(nullable = false)
        private String username;
    
        @Size(max = 120)
        @Getter @Setter
        private String password;

        // private boolean isAllowedToTrade;

        /// String IdCardNum;
        // This needs a lot of thought

        public UserEntity(){}

        public UserEntity(String firstName, String lastName,String username, String email, String password){
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.username = username;
                this.password = password;
//        this.roles = roles;
        }
}
