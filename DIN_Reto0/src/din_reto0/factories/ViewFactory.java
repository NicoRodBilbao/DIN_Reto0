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
        private static View view;
        
        public static View getView(String viewType) {
            
            if(viewType.equalsIgnoreCase("TXT")){
                view = new ViewImplementation();
            }else{
                view = new ViewGUI();
            }
            return view;
        }
        
        
}
