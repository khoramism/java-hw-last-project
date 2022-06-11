module com.example.kjj {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;
    requires lombok;
    requires java.validation;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires spring.data.jpa;
    requires spring.security.crypto;
    requires java.transaction;

    opens com.example.kjj to javafx.fxml;
    exports com.example.kjj;
}