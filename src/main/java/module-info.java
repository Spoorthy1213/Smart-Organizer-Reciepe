module org.example.achive {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.achive to javafx.fxml;
    exports org.example.achive;
}