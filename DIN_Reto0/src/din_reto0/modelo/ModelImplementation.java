package din_reto0.modelo;

import din_reto0.interfaces.Model;
import java.util.ResourceBundle;
    /**
     * This class gets a message from a file
     * 
     * @author Nico-Nerea
     */
public class ModelImplementation implements Model {
        /**
         * This method searches for a file names "control.properties" and
         * takes the MSG field
         * @return The content of the MSG field from the file
         */
    @Override
    public String getGreeting() {
        ResourceBundle configFile = 
        ResourceBundle.getBundle("din_reto0.controlador.control");
        return configFile.getString("MSG");
    }

    
}
