/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.aplication;

import din_reto0.controlador.Controller;
import din_reto0.controlador.Controller;
import din_reto0.factories.ModelFactory;
import din_reto0.factories.ViewFactory;
import din_reto0.interfaces.View;
import din_reto0.interfaces.Model;
import java.util.ResourceBundle;
/**
  * 
  * @author nikol
 */
public class Application {
    /**
     * 
     * @param args 
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
