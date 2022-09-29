package din_reto0.controlador;

import din_reto0.interfaces.View;
import din_reto0.interfaces.Model;
/** @author Nico-Nerea 
  * This is the class that will deal with the logic of the program and control
  * the data access and view type.
  */
public class Controller {
    
    public static View view;
    public static Model model;
    /**
     * It is mandatory to have a View and a Model object on the Controller object 
     * @param view Type of view, can be either on text or window (javafx)
     * @param model Type of model, can be either Database or File
     */
    public Controller(View view, Model model) {
        Controller.view = view;
        Controller.model = model;
    }

    /**
     * This method runs the methods from the objects Model and View, ths showing 
     * the greeting
     */
    public void run(){
  
        view.showGreeting(model.getGreeting());
    }
    
}
