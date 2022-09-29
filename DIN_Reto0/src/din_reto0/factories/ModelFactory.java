/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.factories;

import din_reto0.interfaces.Model;
import din_reto0.modelo.ModelImplementation;
import din_reto0.modelo.ModelDB;

public class ModelFactory {
        private static Model model;
        
        public static Model getModel(String access) {
            if (access.equalsIgnoreCase("FILE")) {
                model = new ModelImplementation();
            }
            else {
                model = new ModelDB();
            }
            return model;
        }
}
