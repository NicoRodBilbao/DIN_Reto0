package din_reto0.vista;

import din_reto0.interfaces.View;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

    /**
     * This class shows a message via window (Javafx)
     * 
     * @author Nico-Nerea
     */
public class ViewGUI extends javafx.application.Application implements View {
    public static String localGreeting;
        
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label(localGreeting   );
   
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Ventana!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        /**
         * Starts the window and shows the greeting gotten on it
         * @param greeting The message recieved that will be shown
         */
      @Override
    public  void showGreeting(String greeting) {
        localGreeting=greeting;
        launch(greeting);
    }

  
   
    
}
