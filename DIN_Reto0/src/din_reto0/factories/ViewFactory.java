/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.factories;

import din_reto0.vista.ViewImplementation;
import din_reto0.interfaces.View;
import din_reto0.vista.ViewGUI;

/**
     * @author Nico-Nerea
     * 
     * This factory instances a View interface as either ViewImplementation 
     * (Text view) or ViewGUI (Javafx Window)
     */

public class ViewFactory {
        private static View view;
        /**
         * This method returns an interfaces instances as another class
         * 
         * @param viewType It contains either the word "TXT" (Text view) or 
         *               any other(Window view)
         * @return Retrns the model trype based on "viewType"
         */
        public static View getView(String viewType) {
            
            if(viewType.equalsIgnoreCase("TXT")){
                view = new ViewImplementation();
            }else{
                view = new ViewGUI();
            }
            return view;
        }
        
        
}
