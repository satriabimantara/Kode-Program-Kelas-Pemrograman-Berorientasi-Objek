module com.satriabimantara {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.satriabimantara to javafx.fxml;
    exports com.satriabimantara;
}
