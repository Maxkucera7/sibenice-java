/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3ita_obesenec;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Krouzek
 */
public class TlacitkoPismenko extends JButton{
    
    private Okno o;
    
    public TlacitkoPismenko(String z, int velikost, Okno o){
        this.setVisible(true);
        this.setSize(velikost, velikost);
        this.setText(z);
        this.o=o;
        
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                TlacitkoPismenko x=(TlacitkoPismenko)me.getSource();
                try {
                    x.Hadajii(x.getText());
                    x.setEnabled(false);
                } catch (IOException ex) {
                    Logger.getLogger(TlacitkoPismenko.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
        });
    }
    
    public void Hadajii(String s) throws IOException{
        o.Hadaji(s);
    }
    
    public String getPismeno(){
        return this.getText();
    }
    
}
