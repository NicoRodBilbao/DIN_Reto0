/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.modelo;

import din_reto0.interfaces.Model;
import java.util.ResourceBundle;

public class ModelImplementation implements Model {

    @Override
    public String getGreeting() {
        ResourceBundle configFile = 
        ResourceBundle.getBundle("din_reto0.control");
        return configFile.getString("MSG");
    }

    
}
