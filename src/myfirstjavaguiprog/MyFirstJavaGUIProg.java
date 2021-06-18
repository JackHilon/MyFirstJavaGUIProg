
package myfirstjavaguiprog;

import javax.swing.JFrame;


public class MyFirstJavaGUIProg {

    
    public static void main(String[] args) {
        
        JFrame personInfo = new MyFirstJavaGUIProgUI();
        personInfo.setTitle("Person INFO");
        personInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        personInfo.setVisible(true);
    }
    
}
