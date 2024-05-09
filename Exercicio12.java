package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio12 extends JFrame {
    
    JLabel rotulo1, rotulo2;
    JButton habilitar, desabilitar;
    
    public  Exercicio12(){
        super ("Habilitar e Desabilitar Componentes");
        ImageIcon icon = new ImageIcon("alavanca.png");
        setIconImage(icon.getImage());
        Container mostrar = getContentPane();
        setLayout(null);
        setVisible(true);
        setSize(260, 170);
        setLocationRelativeTo(null);
        
        mostrar.setBackground(Color.black);
        
        rotulo1 = new JLabel ("1° Conteúdo");
        rotulo2 = new JLabel ("2° Conteúdo");
        rotulo1.setForeground(Color.white);
        rotulo2.setForeground(Color.white);
        rotulo1.setBounds (87, 60, 100, 20);
        rotulo2.setBounds(87, 80, 100, 20);
        mostrar.add(rotulo1);
        mostrar.add(rotulo2);
        
        habilitar = new JButton ("Habilitar");
        desabilitar = new JButton ("Desabilitar");
        habilitar.setBackground(Color.black);
        desabilitar.setBackground(Color.black);
        habilitar.setForeground(new Color(221,160,221));
        desabilitar.setForeground(new Color (221,160,221));
        habilitar.setBounds (20, 20, 100, 20);
        desabilitar.setBounds (125, 20, 105, 20);
        mostrar.add(habilitar);
        mostrar.add(desabilitar);
        
        //FUNCIONALIDADES DOS BOTÕES
        desabilitar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setEnabled(false);
                        rotulo2.setEnabled(false);
                    }
                }
        );
        
        habilitar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setEnabled(true);
                        rotulo2.setEnabled(true);
                    }
                }
        );
       
    }
    
    
    public static void main(String[] args) {
        Exercicio12 start = new Exercicio12();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
