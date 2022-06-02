module sample.java {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.java to javafx.fxml;
    exports sample.java;
}
