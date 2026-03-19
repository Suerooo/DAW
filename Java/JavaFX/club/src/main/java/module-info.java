module club {
    requires javafx.controls;
    requires javafx.fxml;

    opens club to javafx.fxml;
    opens club.controller to javafx.fxml;

    exports club;
    exports club.controller;
}