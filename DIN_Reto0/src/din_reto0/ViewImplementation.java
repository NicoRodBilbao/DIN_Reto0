/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0;

import din_reto0.interfaces.View;

public class ViewImplementation implements View{

    @Override
    public void showGreeting(String s) {
        System.out.println(s);
    }
    
}
