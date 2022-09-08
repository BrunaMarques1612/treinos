package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{
JButton Somar, Subtrair, Multiplicar, Dividir;
JTextField texto1, texto2, texto3;
int num1, num2, resultado=0;

public Calculadora(){
super("CALCULADORA");
Container tela = getContentPane();
setLayout(null);

texto1 = new JTextField(15);
texto2 = new JTextField(15);
texto3 = new JTextField(15);

Somar = new JButton(" SOMAR ");
Subtrair = new JButton(" SUBTRAIR ");
Multiplicar = new JButton(" MULTIPLICAR ");
Dividir = new JButton(" DIVIDIR ");

texto1.setBounds(95,20,200,20);
texto2.setBounds(95,40,200,20);
texto3.setBounds(95,180,200,20);

//BOTOES DE ACOES

Somar.setBounds(120,80,150,20);
Subtrair.setBounds(120,100,150,20);
Multiplicar.setBounds(120,120,150,20);
Dividir.setBounds(120,140,150,20);

tela.add(Somar);
tela.add(Subtrair);
tela.add(Multiplicar);
tela.add(Dividir);

tela.add(texto1);
tela.add(texto2);
tela.add(texto3);

Somar.addActionListener((ActionEvent event) -> {
    num1 = Integer.parseInt(texto1.getText());
    num2 = Integer.parseInt(texto2.getText());
    resultado = num1 + num2;
    String resul = String.valueOf(resultado);
    
    texto3.setText(Integer.toString(resultado));
});


Subtrair.addActionListener((ActionEvent event) -> {
    num1 = Integer.parseInt(texto1.getText());
    num2 = Integer.parseInt(texto2.getText());
    resultado = num1 - num2;
    String resul = String.valueOf(resultado);
    
    texto3.setText(Integer.toString(resultado));
});

Multiplicar.addActionListener((ActionEvent event) -> {
    num1 = Integer.parseInt(texto1.getText());
    num2 = Integer.parseInt(texto2.getText());
    resultado = num1 * num2;
    String resul = String.valueOf(resultado);
    
    texto3.setText(Integer.toString(resultado));
});

Dividir.addActionListener((ActionEvent event) -> {
    num1 = Integer.parseInt(texto1.getText());
    num2 = Integer.parseInt(texto2.getText());
    resultado = num1 / num2;
    String resul = String.valueOf(resultado);
    
    texto3.setText(Integer.toString(resultado));
});

setSize(400,250);
setVisible(true);
texto1.requestFocus();
}

public static void main (String[] args){
Calculadora app = new Calculadora();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
