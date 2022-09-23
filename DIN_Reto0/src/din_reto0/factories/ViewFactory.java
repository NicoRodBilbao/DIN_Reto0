/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.factories;

import din_reto0.vista.ViewImplementation;
import din_reto0.interfaces.View;
import din_reto0.vista.ViewGUI;

public class ViewFactory {
        private static View v;
        
        public static View getView(String view) {
            
            if(view.equalsIgnoreCase("TXT")){
                v = new ViewImplementation();
            }else{
                v = new ViewGUI();
            }
            return v;
        }
        
        
}
