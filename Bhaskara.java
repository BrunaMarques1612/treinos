package bhaskara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Bhaskara extends JFrame {

    JLabel rotulo1, rotulo2, rotulo3, x1, x2;
    JTextField texto1, texto2, texto3, result1, result2;
    JButton botao;

    public Bhaskara(){
        super("Bhaskara");
        Container tela = getContentPane();
        setSize(450, 250);
        setLayout(null);

        rotulo1 = new JLabel("Valor de A");
        rotulo2 = new JLabel("Valor de B");
        rotulo3 = new JLabel("Valor de C");
        x1 = new JLabel("X1: ");
        x2 = new JLabel("X2: ");

        texto1 =  new JTextField(15);
        texto2 =  new JTextField(15);
        texto3 =  new JTextField(15);
        result1 = new JTextField(15);
        result2 = new JTextField(15);


        botao = new JButton("Calcular");

        rotulo1.setBounds(100,20,80,20);
        rotulo2.setBounds(100,40,80,20);
        rotulo3.setBounds(100,60,80,20);
        x1.setBounds(120,110,80,20);
        x2.setBounds(120,130,80,20);


        texto1.setBounds(170, 20, 100,20);
        texto2.setBounds(170, 40, 100,20);
        texto3.setBounds(170, 60, 100,20);
        result1.setBounds(170, 110, 100,20);
        result2.setBounds(170, 130, 100,20);

        botao.setBounds(170,85,100,20);

        botao.addActionListener(
                new ActionListener() {
                    @Override
                    
                    public void actionPerformed(ActionEvent e) {
                        double a = Double.parseDouble(texto1.getText());
                        double b = Double.parseDouble(texto2.getText());
                        double c = Double.parseDouble(texto3.getText());
                        double delta = (Math.pow(b,2) - 4 * a* c);
                        double x1 = (-b+Math.sqrt(delta))/2 * a;
                        double x2 = (-b-Math.sqrt(delta))/2 * a;

                        result1.setText(String.valueOf(x1));
                        result2.setText(String.valueOf(x2));
                    }
                }
        );


        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(x1);
        tela.add(x2);

        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(result1);
        tela.add(result2);

        tela.add(botao);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {       
        Bhaskara baskara = new Bhaskara();
        baskara.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

 




