module com.mycompany.foodwaste_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.foodwaste_project to javafx.fxml;
    exports com.mycompany.foodwaste_project;
}