
package quizeapplication;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewFame extends JFrame implements ActionListener {
    String  name;
    JButton Back,Start;
     NewFame(String name){
         
         this.name = name;
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
         JLabel heading = new JLabel ("Welcome "+ name +" Simple Mind");
         heading.setBounds(50,20,700,30);
         heading.setForeground(new Color(30,144,254));
         heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
         add(heading);
         
         JLabel rules = new JLabel ();
         rules.setBounds(20,90,700,350);
        // rules.setForeground(new Color(30,144,254));
         rules.setFont(new Font("Tahoma",Font.PLAIN,15));
         rules.setText(
                   "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
         
         );
         add(rules);
         
         Back = new JButton("Back");
         Back.setBounds(100,415,100,30);
         Back.setBackground(new Color(30,144,254));
         Back.setForeground(Color.WHITE);
         Back.addActionListener(this);
         add(Back);
         
         Start = new JButton("Next");
         Start.setBounds(600,415,100,30);
         Start.setBackground(new Color(30,144,254));
         Start.setForeground(Color.WHITE);
         Start.addActionListener(this);
         add(Start);
         
         
         setSize(800,500);
         setLocation(300,150);
         setVisible(true);
         
         }
     public void actionPerformed(ActionEvent ae){
      
          if(ae.getSource()== Start){
                     
          }else{
              setVisible(false);
              new Login();
          }
     
     
     }
     
     public static void main(String[]args){
         new NewFame("user");
         
     }
    
}
