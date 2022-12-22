module novikov.evsey.builder {
    requires javafx.controls;
    requires javafx.fxml;


    opens task.v.builder to javafx.fxml;
    exports task.v.builder;
}