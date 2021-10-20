module de.medieninformatik.prog3 {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens de.medieninformatik.prog3 to javafx.fxml;
    exports de.medieninformatik.prog3;
}