module com.example.kjj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires spring.security.crypto;
    requires java.persistence;
    requires lombok;
    requires java.validation;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires mysql.connector.java;
    opens com.example.kjj to javafx.fxml;
    exports com.example.kjj;

    opens com.example.kjj.controller to javafx.fxml;
    exports com.example.kjj.controller;

    opens com.example.kjj.models to org.hibernate.orm.core;
    exports com.example.kjj.models;
    exports com.example.kjj.enums;
    opens com.example.kjj.enums to org.hibernate.orm.core;

}