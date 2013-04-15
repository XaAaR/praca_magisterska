/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dexhello;

/**
 *
 * @author lucas
 */
public class DEXHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DEXManager manager = new DEXManager();
        try {
        manager.CreateDatabase();
        }
        catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
