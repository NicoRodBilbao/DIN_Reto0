/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0;

import din_reto0.interfaces.View;
import din_reto0.interfaces.Model;

public class Controller {
    
    public static View v;
    public static Model m;
    
    public Controller(View v, Model m) {
        v = this.v;
        m=this.m;
    }

    public static View getV() {
        return v;
    }

    public static Model getM() {
        return m;
    }

    public static void setV(View v) {
        this.v = v;
    }

    public static void setM(Model m) {
        this.m = m;
    }
    
}
