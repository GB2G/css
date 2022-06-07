module edu.kevin.css_test {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens edu.kevin.css_test to javafx.fxml;
    exports edu.kevin.css_test;
}
