package din_reto0.modelo;

import din_reto0.interfaces.Model;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
    /**
     * This method searches for a database named "helloworld" and gets the 
     * message 
     * @author Nico-Nerea
     */
public class ModelDB extends MasterConnection implements Model {
   
        private static final String bucarMsg = 
                "SELECT msg FROM greeting";
    
    @Override
    public String getGreeting() {
        String resultado = null;
            try {
                openConnection();
                stmt = con.prepareStatement(bucarMsg);
                rs = stmt.executeQuery();
                rs.next();
               resultado = rs.getString(1);
                
            } catch (SQLException ex) {
                Logger.getLogger(ModelDB.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                closeConnection();
            }
        
        return resultado;
    }
    
    
}
