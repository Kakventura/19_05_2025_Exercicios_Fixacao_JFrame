/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio02 extends JFrame {
    // VARIÁVEIS DE INSTÂNCIA
    JLabel rotulo1, rotulo2, rotulo3;
    JTextField campo1, campo2, campo3;
    JButton botao1, botao2;
    
    //MÉTODO CONSTRUTOR
    public Exercicio02(){
        
        //TÍTULO
        super("Feedbacks");
        
        // CONFIG DE VISIBILIDADE
        setSize(430, 470);
        setVisible(true);
        setLocationRelativeTo(null);
        
        //ICONE DA PÁGINA
        ImageIcon icon = new ImageIcon("feedback.png");
        setIconImage(icon.getImage());
        
        //CONFIG DOS ELEMENTOS
        /* CONTAINER PARA RECEBER OBJETOS DO JFRAME CONFIGURAÇÃO DA TELA */
        Container show = getContentPane();
        setLayout(null);
        
        //JLABEL's
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("Senha:");
        rotulo3 = new JLabel ("Comentários:");
       
        // POSIÇÃO
        rotulo1.setBounds(50, 20, 80, 20);
        rotulo2.setBounds(50, 80, 80, 20);
        rotulo3.setBounds(50, 140, 80, 20);
        
        //EXIBIR
        show.add(rotulo1);
        show.add(rotulo2);
        show.add(rotulo3);
        
        //TEXTFIELD's
        campo1 = new JTextField(50);
        campo2 = new JTextField(50);
        campo3 = new JTextField(210);
        
        campo1.setBounds(50, 45, 310, 20);
        campo2.setBounds(50, 105, 310, 20);
        campo3.setBounds(50, 165, 310, 200);
        
        show.add(campo1);
        show.add(campo2);
        show.add(campo3);
        
        //JButtons
        // ADICIONAR ICONE AO BOTÃO 
        ImageIcon botaoum = new ImageIcon("verificar.png");
        ImageIcon botaodois = new ImageIcon("cancelar.png");
        
        botao1 = new JButton("Ok", botaoum);
        botao2 = new JButton ("Cancelar", botaodois);
        
        botao1.setForeground(Color.green);
        botao2.setForeground(Color.red);
        
        botao1.setBounds(50,370,75,20);
        botao2.setBounds(130,370,105,20);
        
        show.add(botao1);
        show.add(botao2);
    
    }
    
    
    
    public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio02 start = new Exercicio02();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
