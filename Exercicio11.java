package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio11 extends JFrame{
    
    JLabel rotulo1, rotulo2;
    JButton ocultar, exibir;
    
    public  Exercicio11(){
        super ("Ocultar e Exibir Componentes");
        ImageIcon icon = new ImageIcon("visibilidade.png");
        setIconImage(icon.getImage());
        Container mostrar = getContentPane();
        setLayout(null);
        setVisible(true);
        setSize(260, 170);
        setLocationRelativeTo(null);
        
        mostrar.setBackground(new Color(0,139,139));
        
        rotulo1 = new JLabel ("1° Conteúdo");
        rotulo2 = new JLabel ("2° Conteúdo");
        rotulo1.setForeground(Color.white);
        rotulo2.setForeground(Color.white);
        rotulo1.setBounds (87, 60, 100, 20);
        rotulo2.setBounds(87, 80, 100, 20);
        mostrar.add(rotulo1);
        mostrar.add(rotulo2);
        
        ocultar = new JButton ("Ocultar");
        exibir = new JButton ("Exibir");
        ocultar.setBackground(new Color(189,83,107));
        exibir.setBackground(new Color (189,83,107));
        ocultar.setForeground(Color.white);
        exibir.setForeground(Color.white);
        ocultar.setBounds (30, 20, 80, 20);
        exibir.setBounds (135, 20, 80, 20);
        mostrar.add(ocultar);
        mostrar.add(exibir);
        
        //FUNCIONALIDADES DOS BOTÕES
        ocultar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setVisible(false);
                        rotulo2.setVisible(false);
                    }
                }
        );
        
        exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setVisible(true);
                        rotulo2.setVisible(true);
                    }
                }
        );
       
    }
    
    
    public static void main(String[] args) {
        Exercicio11 start = new Exercicio11();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
