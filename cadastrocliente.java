package cadastrocliente;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author bruna
 */
public class CadastroCliente extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    public CadastroCliente(){
        super("Cadastro de Cliente");
        Container tela = getContentPane();
        setLayout(null);
            rotulo1 = new JLabel ("Nome");
            rotulo2 = new JLabel ("CPF");
            rotulo3 = new JLabel ("RG");
            rotulo4 = new JLabel ("Endereço");
            rotulo5 = new JLabel ("Cidade");
            rotulo6 = new JLabel ("Estado");
            rotulo7 = new JLabel ("CEP");
            
            texto1 = new JTextField(50);
            texto2 = new JTextField(11);
            texto3 = new JTextField(9);
            texto4 = new JTextField(50);
            texto5 = new JTextField(50);
            texto6 = new JTextField(50);
            texto7 = new JTextField(9);
            
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,80,20);
            rotulo4.setBounds(50,140,80,20);
            rotulo5.setBounds(50,180,80,20);
            rotulo6.setBounds(50,220,80,20);
            rotulo7.setBounds(50,260,80,20);
            
            texto1.setBounds(110,20,200,20);
            texto2.setBounds(110,60,120,20);
            texto3.setBounds(110,100,100,20);
            texto4.setBounds(110,140,200,20);
            texto5.setBounds(110,180,180,20);
            texto6.setBounds(110,220,150,20);
            texto7.setBounds(110,260,100,20);
            
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            tela.add(rotulo5);
            tela.add(rotulo6);
            tela.add(rotulo7);
            
            tela.add(texto1);
            tela.add(texto2);
            tela.add(texto3);
            tela.add(texto4);
            tela.add(texto5);
            tela.add(texto6);
            tela.add(texto7);
            
            setSize(400,350);
            setVisible(true);
            setLocationRelativeTo(null);
    }
     public static void main(String args[]){
        CadastroCliente app= new CadastroCliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
     }