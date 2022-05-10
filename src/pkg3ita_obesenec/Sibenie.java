/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3ita_obesenec;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author monty
 */
public class Sibenie {
    private ArrayList<String> slova=new ArrayList<>();
    private String slovoPodtrzitka = "";
    
    public Sibenie(){
        slova.add("");
        udelejPodtrzitka(slova.get(0));
    }
    
    private void udelejPodtrzitka (String s){
        for (int i = 0; i < s.length(); i++) {
            slovoPodtrzitka+="_";
        }
    }
    
    public void vypisDoLabelu (JLabel label){
        String slovo="";
        for (int i = 0; i < slovoPodtrzitka.length(); i++) {
            slovo+=Character.toString(slovoPodtrzitka.charAt(i))+" ";
        }
        label.setText(slovoPodtrzitka);
    }
    
    public void Hadam (String s){
        for (int i = 0; i < slovoPodtrzitka.length(); i++) {
            if (Character.toString(slovoPodtrzitka.charAt(i)).equals(s)) {
                slovoPodtrzitka.replace(s, s);
            }
        }
    }
}
