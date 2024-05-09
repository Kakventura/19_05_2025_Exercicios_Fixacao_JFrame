package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio10 extends JFrame{
    
    JLabel rotulo1, rotulo2;
    JTextField texto1, texto2;
    JButton limpar;
    
    public Exercicio10(){
        super ("Limpar Caixa de Texto");
        ImageIcon icon = new ImageIcon("limpar.png");
        setIconImage(icon.getImage());
        Container tela = getContentPane();
        setLayout(null);
        setVisible(true);
        setSize(260, 170);
        setLocationRelativeTo(null);
        
        tela.setBackground(new Color(70,130,180));
        
        rotulo1 = new JLabel ("1° Número:");
        rotulo2 = new JLabel ("2° Número:");
        rotulo1.setForeground(Color.white);
        rotulo2.setForeground(Color.white);
        rotulo1.setBounds (15, 20, 190, 20);
        rotulo2.setBounds (15, 60, 190, 20);
        tela.add(rotulo1);
        tela.add(rotulo2);
        
        texto1 = new JTextField (5);
        texto2 = new JTextField (5);
        texto1.setBackground(new Color(192,192,192));
        texto2.setBackground(new Color(192,192,192));
        texto1.setBounds(90, 20, 140, 20);
        texto2.setBounds(90, 60, 140, 20);
        tela.add(texto1);
        tela.add(texto2);
        
        limpar = new JButton ("Limpar");
        limpar.setBackground(new Color(192,192,192));
        limpar.setForeground(new Color(139,0,0));
        limpar.setBounds(85, 100, 80, 20);
        tela.add(limpar);
        
        //FUNCIONALIDADE NO BOTÃO   
        limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        // RETORNAR VALOR VAZIO (LIMPAR)
                        texto1.setText(null);
                        texto2.setText(null);
                        limpar.requestFocus();
                    }
                }
        );
        
    }
    
    public static void main(String[] args) {
        Exercicio10 comecar = new Exercicio10();
        comecar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
