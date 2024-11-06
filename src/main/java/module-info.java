module com.example.bigoalgorithmsdatastructures {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bigoalgorithmsdatastructures to javafx.fxml;
    exports com.example.bigoalgorithmsdatastructures;
}