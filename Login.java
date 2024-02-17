/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizeapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,Next;
    JTextField tfname;
    
  
    
      Login(){
          
          getContentPane().setBackground(Color.WHITE);
          setLayout(null);
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/login.jpeg"));
          JLabel image = new JLabel(i1);
          image.setBounds(0,0,600,500);
          add(image);
      
         JLabel heading = new JLabel ("Simple Mind");
         heading.setBounds(750,20,300,45);
         heading.setForeground(new Color(30,144,254));
         heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
         add(heading);
         
         JLabel name = new JLabel("Enter your name");
         name.setBounds(800,150,300,20);
         name.setForeground(new Color(30,144,254));
         name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
         add(name);
         
         tfname =new JTextField();
         tfname.setBounds(720,185,275,25);
         tfname.setFont(new Font("Timos Now Roman",Font.BOLD,20));
         add(tfname);
         
         rules = new JButton("Back");
         rules.setBounds(735,270,120,25);
         rules.setBackground(new Color(30,144,254));
         rules.setForeground(Color.WHITE);
         rules.addActionListener(this);
         add(rules);
         
         Next = new JButton("Next");
         Next.setBounds(920,270,120,25);
         Next.setBackground(new Color(30,144,254));
         Next.setForeground(Color.WHITE);
         Next.addActionListener(this);
         add(Next);
         
         setSize(1200,500);
         setLocation(150,150);
         setVisible(true);
      }  
      public void actionPerformed(ActionEvent ae){
          if(ae.getSource() == Next){
             String name = tfname.getText();
              setVisible(false);
              new NewFame(name);
          }
          else if (ae.getSource() == rules){
              setVisible(false);
          }
      }
    public static void main(String[] args) {
        new Login();
    }
 }
