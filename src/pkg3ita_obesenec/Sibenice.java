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
 * @author Krouzek
 */
public class Sibenice {
    private ArrayList<String> slova=new ArrayList<>(); //pro nactena slova ze souboru
    private char[] slovoPodtrzitka; //pro zobrazeni v labelu
    private String hadaneSlovo;
    
    public Sibenice(){
        slova.add("abeceda");
        VemSlovo();
        UdelejPodtrzitka(hadaneSlovo);
        
        
    }
    
    private void VemSlovo(){
        if(slova.size()>0){
            hadaneSlovo=slova.get(0);
            slova.remove(0);
        }
        else{
            System.out.println("seznam je prazdny");
        }
    }
    
    private void UdelejPodtrzitka(String s){
        slovoPodtrzitka=new char[s.length()];
        for(int i=0;i<s.length();i++){
            slovoPodtrzitka[i]='_';
        }
    }
    
    public void VypisDoLabelu(JLabel label){
        String slovo="";
        for(int i=0;i<slovoPodtrzitka.length;i++){
            slovo+=Character.toString(slovoPodtrzitka[i])+" ";
        }
        label.setText(slovo);
    }
    
    public boolean Hadam(String s){//zjisti zda je tam hledane pismeno
        boolean uhodl=false;
        char[] pismena=hadaneSlovo.toCharArray();
        for(int i=0;i<pismena.length;i++){
            if(pismena[i]==s.charAt(0)){
                slovoPodtrzitka[i]=s.charAt(0);
                uhodl=true;
            }
        }//i
        return uhodl;
    }//hadam
    
    private boolean VyhralJsem(){
        for (int i = 0; i < slovoPodtrzitka.length; i++) {
            if(slovoPodtrzitka[i]=='_'){
                return false;
            }
        }
        return true;
    }
}
