module com.example.kjj {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;
    requires lombok;
    requires java.validation;
    requires java.persistence;


    opens com.example.kjj to javafx.fxml;
    exports com.example.kjj;
}