module bg.tu_varna.sit.usp_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens bg.tu_varna.sit.usp_project to javafx.fxml;
    exports bg.tu_varna.sit.usp_project;
    exports bg.tu_varna.sit.usp_project.application;
    opens bg.tu_varna.sit.usp_project.application to javafx.fxml;
}