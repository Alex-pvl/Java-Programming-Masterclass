module com.alexpvl.layouts {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.alexpvl.layouts to javafx.fxml;
	exports com.alexpvl.layouts;
}