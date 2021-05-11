module com.mycompany.programacion2.depresiacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.programacion2.depresiacion to javafx.fxml;
    exports com.mycompany.programacion2.depresiacion;
    exports com.mycompany.programacion2.depresiacion.controller;
}
