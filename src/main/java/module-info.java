module com.example.labone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labone to javafx.fxml;
    exports com.example.labone;
}