/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio03 extends JFrame {
    
    JButton botao1, botao2, botao3, botao4;
    
    public Exercicio03(){
        super("Exemplos de Botão");
        
        setSize(440, 90);
        setVisible(true);
        setLocationRelativeTo(null);
        
        ImageIcon icon = new ImageIcon("botao.png");
        setIconImage(icon.getImage());
        
        Container tela = getContentPane();
        setLayout(null);
        
        botao1 = new JButton("Procurar");
        botao2 = new JButton("Voltar <<");
        botao3 = new JButton("Próximo >>");
        botao4 = new JButton("Abrir");
        
        botao1.setBounds(5,20,100,20);
        botao2.setBounds(110,20,100,20);
        botao3.setBounds(215,20,100,20);
        botao4.setBounds(320,20,100,20);
        
        //  COR NO FUNDO DO BOTÃO
        botao1.setBackground(Color.white);
        botao2.setBackground(Color.white);
        botao3.setBackground(Color.white);
        botao4.setBackground(Color.white);
        

        
        //CRIAÇÃO DE ATALHOS
        //QUANDO O USUÁRIO APERTAR ALT+ o atalho DETERMINADO, O BOTÃO CORRESPONDENTE SERÁ ACIONADO
        botao1.setMnemonic(KeyEvent.VK_P);
        botao2.setMnemonic(KeyEvent.VK_V);
        botao3.setMnemonic(KeyEvent.VK_X);
        botao4.setMnemonic(KeyEvent.VK_S);
        
        // FOCO EM UM BOTÃO - AO CLICAR ENTER, O BOTÃO COM FOCO SERÁ ACIONADO.
        getRootPane().setDefaultButton(botao4);

        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
    }
    
    public static void main(String[] args) {
        Exercicio03 iniciar = new Exercicio03();
        iniciar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
