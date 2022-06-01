package models;
import org.jetbrains.annotations.NotNull;

import java.lang.String;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.*;
// import dao.interfaces.UserDao;
import DaoFactory.daoFactory;


public class User {
        @Id
        @Getter @Setter
        private int id;
    
        @Size(max = 20)
        @Getter @Setter
        private String firstName;
    
        @Size(max = 20)
        @Getter @Setter
        private String lastName;
    
        @Email @Size(max = 50)
        @Getter @Setter
        private String email;
    
        @Size(max = 20)
        @Getter @Setter 
        private String username;
    
        @Size(max = 120)
        @Getter @Setter
        private String password;
        
    String emailAddress;
    boolean isAllowedToTrade;
    String IdCardNum;


}
