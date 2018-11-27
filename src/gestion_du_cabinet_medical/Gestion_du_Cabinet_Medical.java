/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_du_cabinet_medical;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author pc
 */
public class Gestion_du_Cabinet_Medical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Identifiant cabinet_medical = new Identifiant(null, true);
Dimension taille_ecran = Toolkit.getDefaultToolkit().getScreenSize(); 
cabinet_medical.setBounds(taille_ecran.width / 2 - 700 / 2, taille_ecran.height / 2 -370 / 2,700,370);

cabinet_medical.setResizable(false);
cabinet_medical.setVisible(true);

    }
    
}
