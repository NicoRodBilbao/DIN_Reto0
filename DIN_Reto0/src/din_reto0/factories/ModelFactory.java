/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.factories;

import din_reto0.interfaces.Model;
import din_reto0.ModelImplementation;

public class ModelFactory {
        private static Model m = new ModelImplementation();
        
        public static Model getAccessModel() {
            return m;
        }
}
