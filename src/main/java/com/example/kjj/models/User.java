package com.example.kjj.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
// import dao.interfaces.UserDao;


@Entity
@Table(	name = "User",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class User {
        @Id
        @Getter @Setter
        @GeneratedValue(strategy =  GenerationType.SEQUENCE)
        private Long id;
    
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

        @Getter @Setter
        @OneToMany
        private Set<Sader> saders = new HashSet<>();

        @Getter @Setter
        @OneToMany
        private Set<Vared> vareds = new HashSet<>();


        @Getter @Setter
        @Column(name="is_allowed_to_trade", nullable = false)
        private boolean isAllowedToTrade;

        /// String IdCardNum;
        // This needs a lot of thought

        public User(){}

        public User(String firstName, String lastName, String username, String email, String password){
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.username = username;
                this.password = password;
//        this.roles = roles;
        }
}
