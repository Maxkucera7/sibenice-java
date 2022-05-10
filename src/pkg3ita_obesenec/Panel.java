/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3ita_obesenec;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Krouzek
 */
public class Panel extends JPanel{

    File f;
    BufferedImage im;
    private int cisloObrazku=1;
    
    public Panel(int velikosttl) throws IOException{
        this.setVisible(true);
        this.setSize(415, 423);
        this.setLocation(10, 10+3*velikosttl+50);       
        f=new File("C:\\Users\\Martin\\Documents\\NetBeansProjects\\3ITA_obesenec\\14\\"+cisloObrazku+".png");
        im=ImageIO.read(f); //nacteni obrazku 
        repaint();
    }   
    
    public void Prekresli(boolean uhodli) throws IOException{
        if(!uhodli){ //neuhodli
            cisloObrazku++;
            f=new File("C:\\Users\\Martin\\Documents\\NetBeansProjects\\3ITA_obesenec\\14\\"+cisloObrazku+".png");
        }
        im=ImageIO.read(f); //nacteni obrazku 
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(im, 0, 0, this); //vykresleni obrazku do panelu
    }
    
}
