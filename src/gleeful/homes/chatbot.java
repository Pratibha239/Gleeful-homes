/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gleeful.homes;

/**
 *
 * @author SP CHAUDHARY
 */
import javax.swing.*;   
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.lang.Math;
public class chatbot extends JFrame implements KeyListener 
 {
      JPanel p=new JPanel();
 
  JTextArea dialog = new JTextArea(20,50);
    JTextArea input=new JTextArea(3,50);
    JScrollPane scroll = new JScrollPane(
            dialog,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );
    
    String[][] chatBot = {
        //standard greetings
        {"hi","hii","hello", "hola", "ola", "howdy"},
        {"Hi","Hello","Hey","Hey"},
        //question greetings
        {"complaint", "problem", "issue"},
        {"Kindly write it"},
        //yes
        {"yes"},
        //{"no", "NO","NO!!!!!"},
        //{ "water","electricity","parking","others"},
        {"say your problem"},
        //default
        {"water not coming","electricity issue","parking problem since three days"},
        { "give 24 hours we will update soon"},
        {"ok","okay","okk"},
        {"Thank you for your concerene, your problem will be solved within 24 hours"
        
        }
        
    };
    
    
        
    public static void main(String[] args) {
        new chatbot();
    }
    
    public chatbot(){
        super("Chat Bot for your grievences");
        setSize(600,400);
        setResizable(false);
        
        
        dialog.setEditable(false);
        //connect keylistener to input
        input.addKeyListener(this);
        
        p.add(scroll);
        p.add(input);
        p.setBackground(new Color(255,200,0));
        add(p);
        
        setVisible(true);
        
    }
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            input.setEditable(false);
            //--grab quote--
            String quote=input.getText();
            input.setText("");
            //we will create the addText method
            addText("YOU :-"+quote);
            quote=quote.trim();
            while(
                quote.charAt(quote.length()-1)=='!' ||
                quote.charAt(quote.length()-1)=='.' ||
                quote.charAt(quote.length()-1)=='?' 
            ){
                quote=quote.substring(0,quote.length()-1);
            }
            quote=quote.trim();

            //--check for matches--
            byte response=0;
            /*
            0:searching through chatBot[][] for matches
            1:we didn't find anything in chatBot[][]
            2:we did find something in chatBot[][]
            */
            //which group we are checking
            int j=0;
            //didn't find anything yet!
            while(response==0){
                if(inArray(quote.toLowerCase(),chatBot[j*2])){
                    response=2;
                    int r =(int)Math.floor(Math.random()*chatBot[(j*2)+1].length);//possible response from Brian
                    addText("\nASSISTANCE :-"+chatBot[(j*2)+1][r]);
                }
                j++;
                //once j equals 2 then we want loop to stop
                if(j*2==chatBot.length-1 && response == 0){
                    response=1;
                }
   
            }
            //if no matches--default--
            if (response==1){
                int r =(int)Math.floor(Math.random()*chatBot[chatBot.length-1].length);//chatBot.length-1 is the bigger array or the last one
                addText("\nASSISTANCE :-"+chatBot[chatBot.length-1][r]);    
            }
            addText("\n");
            
        }
    }
    
    public void keyReleased(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            input.setEditable(true);
        }
    }
    
    public void keyTyped(KeyEvent e){}
    
    //no return type so void
    public void addText(String str){
        dialog.setText(dialog.getText()+str);
    }
    public boolean inArray(String in, String[] str){
        boolean match=false;
        //loop through entire array
        //length is for indices in array
        for(int i=0;i<str.length;i++){
            if(str[i].equals(in)){
                match = true;
            }
        }
        return match;
        
    }
    
}
