/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.Font;
import javax.swing.*;
/**
 *
 * @author Alumno
 */
public class ventana extends JFrame{
    
    private JTextField nume;
    private JLabel fibonacci, factorial;
    private JButton calcular;
    public ventana(){
        setSize(500, 300);
        setTitle("Series chidorris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        elem();
        
    }
    
    private void elem(){
        
        nume= new JTextField("", 10);
        nume.setBounds(10, 10, 400, 25);
        nume.setFont(new Font("Arial", Font.BOLD, 25));
        nume.setVisible(true);
        this.add(nume);
        
        calcular = new JButton("calcular");
        calcular.setBounds(405, 10, 50, 25);
        calcular.setFont(new Font("Arial", Font.BOLD, 25));
        calcular.setVisible(true);
        this.add(calcular);

    }
    
    
    
}
