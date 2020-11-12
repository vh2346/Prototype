  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;
import Prototipos.*;



public class PruebaPrototipo {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        FolderPrototipo folderBase = new FolderPrototipo();
        folderBase.setHoja(new HojaPrototipo(30,10));
        folderBase.setSeparador(new SeparadorPrototipo(31,12));
        
        FolderPrototipo folderDupA = new FolderPrototipo();
        folderDupA = (FolderPrototipo)folderBase.duplicar();
        folderDupA.setDise�o(" de flores");
        
        FolderPrototipo folderDupB = new FolderPrototipo();
        folderDupB = (FolderPrototipo)folderBase.duplicar();
        folderDupB.setDise�o(" de carros");
        
        System.out.println("info base: "+folderBase+" tiene un dise�o"+folderBase.getDise�());
        System.out.println("info duplicado 1:"+folderDupA+" tiene un dise�o"+folderDupA.getDise�());
        // TODO code application logic here
    }
    
}