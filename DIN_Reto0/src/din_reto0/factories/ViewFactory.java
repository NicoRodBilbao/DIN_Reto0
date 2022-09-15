/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.factories;

import din_reto0.ViewImplementation;
import din_reto0.interfaces.View;

public class ViewFactory {
        private static View v = new ViewImplementation();
        
        public static View getAccessView() {
            return v;
        }
}
