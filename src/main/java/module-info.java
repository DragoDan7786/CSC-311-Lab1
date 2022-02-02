module com.mycompany.helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.helloworld to javafx.fxml;
    exports com.mycompany.helloworld;
}
