module com.alexpvl.helloworldfx {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.alexpvl.helloworldfx to javafx.fxml;
	exports com.alexpvl.helloworldfx;
}