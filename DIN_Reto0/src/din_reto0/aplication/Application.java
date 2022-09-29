package din_reto0.aplication;

import din_reto0.controlador.Controller;
import din_reto0.controlador.Controller;
import din_reto0.factories.ModelFactory;
import din_reto0.factories.ViewFactory;
import din_reto0.interfaces.View;
import din_reto0.interfaces.Model;
import java.util.ResourceBundle;
/** @author Nico-Nerea 
  * This is the main class of the program that will execute the whole application
  */
public class Application {
    /**This is the main method that starts the application
     * @param args Arguments added via cmd
     */
    public static void main(String[] args) {
            ResourceBundle configFile = 
        ResourceBundle.getBundle("din_reto0.controlador.control");
        String view = configFile.getString("VIEW"),
         access = configFile.getString("ACCESS");
        
        new Controller(ViewFactory.getView(view), ModelFactory.getModel(access)).
                run();
 
    }
   
}
