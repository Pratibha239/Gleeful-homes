/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gleeful.homes;

/**
 *
 * @author abc
 */
public class SplashScreenExample {


public static void main(String args[]){
    homescreen obj = new homescreen();
    obj.setVisible(true);
  try
  {   
        for(int i = 0; i<=100; i++)
        { 
             Thread.sleep(100);
            obj.jProgressBar1.setValue(i);
        }
    //obj.dispose();
    mainscreen obj1 = new mainscreen();
    obj1.setVisible(true);
     obj.dispose();
        }
        catch(Exception e)
        {

        }
        }

}
