/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.controlador;

import din_reto0.interfaces.View;
import din_reto0.interfaces.Model;

public class Controller {
    
    public static View v;
    public static Model m;
    
    public Controller(View v, Model m) {
        this.v = v;
        this.m=m;
    }

    
    public void run(){
  
        v.showGreeting(m.getGreeting());
    }
    
}
