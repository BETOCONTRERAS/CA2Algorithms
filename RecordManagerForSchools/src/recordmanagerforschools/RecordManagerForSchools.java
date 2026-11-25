/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recordmanagerforschools;

/**
 *
 * @author jaccc
 */
public class RecordManagerForSchools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        RecordController controller = new Controller(menu,recordManager);
        controller.start();
        
        
        
    }
    
}
