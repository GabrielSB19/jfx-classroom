package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

public class Main extends Application{
	
	private ClassroomGUI classroomGUI;
	private Classroom classroom;
	
	public Main() {
		classroom = new Classroom();
		classroomGUI = new ClassroomGUI(classroom);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainPane.fxml"));
		
		fxmlLoader.setController(classroomGUI);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ClassRoom");
		primaryStage.show();
	}
}
