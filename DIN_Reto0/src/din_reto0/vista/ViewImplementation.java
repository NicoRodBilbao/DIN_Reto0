package din_reto0.vista;

import din_reto0.interfaces.View;
    /**
     * This class shows a message via text
     * 
     * @author Nico-Nerea
     */
public class ViewImplementation implements View{
        /**
         * Shows the message on the output
         * @param greeting The message recieved that will be shown
         */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
