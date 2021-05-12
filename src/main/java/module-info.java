module com.mycompany.programacion2.tableviewfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.programacion2.tableviewfx to javafx.fxml;
    exports com.mycompany.programacion2.tableviewfx;
    exports com.mycompany.programacion2.tableviewfx.controller;
    exports com.mycompany.programacion2.tableviewfx.pojo;
}
