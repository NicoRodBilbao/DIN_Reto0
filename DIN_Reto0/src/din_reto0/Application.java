/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0;

import din_reto0.factories.ModelFactory;
import din_reto0.factories.ViewFactory;
import din_reto0.interfaces.View;
import din_reto0.interfaces.Model;

public class Application {

    public static void main(String[] args) {
            run();
    }
    
    private static void run() {
        Controller c = new Controller(getView(), getModel());
        c.getV().showGreeting(c.getM().getGreeting());
    }
    private static View getView() {
        return ViewFactory.getAccessView();
    }
    private static Model getModel() {
        return ModelFactory.getAccessModel();
    }
}
