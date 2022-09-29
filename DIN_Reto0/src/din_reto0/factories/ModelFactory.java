/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.factories;

import din_reto0.interfaces.Model;
import din_reto0.modelo.ModelImplementation;
import din_reto0.modelo.ModelDB;

    /**
     * @author Nico-Nerea
     * 
     * This factory instances a Model interface as either ModelImplementation 
     * (File access) or ModelDB (Database access)
     */
public class ModelFactory {
        private static Model model;
        /**
         * This method returns an interfaces instances as another class
         * 
         * @param access It contains either the word "FILE" (File access) or 
         *               any other(Database access)
         * @return Retrns the model trype based on "access"
         */
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
