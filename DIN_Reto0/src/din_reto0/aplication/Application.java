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

public class Application {

    public static void main(String[] args) {
            run();
    }
    
    private static void run() {
        ResourceBundle configFile = 
        ResourceBundle.getBundle("din_reto0.control");
        String view = configFile.getString("VIEW"),
         access = configFile.getString("ACCESS");
        
        Controller c = new Controller(getView(view), getModel(access));
        c.getV().showGreeting(c.getM().getGreeting());
    }
    private static View getView(String view) {
        return ViewFactory.getAccessView(view);
    }
    private static Model getModel(String access) {
        return ModelFactory.getAccessModel(access);
    }
}
