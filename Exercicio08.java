package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio08 extends JFrame{
    
    JLabel rotulo1, rotulo2, resultado;
    JTextField campo1, campo2;
    JButton somar;
    
    public Exercicio08(){
        super("Exemplo com Soma");
        ImageIcon icon = new ImageIcon("appSoma.png");
        setIconImage(icon.getImage());
        Container show = getContentPane();
        setLayout(null);
        setVisible(true);
        setSize(300, 200);
        setLocationRelativeTo(null);
        
        show.setBackground(Color.black);
        
        rotulo1 = new JLabel ("Insira o 1° valor:");
        rotulo2 = new JLabel ("Insira o 2° valor:");
        rotulo1.setForeground(Color.white);
        rotulo2.setForeground(Color.white);
        rotulo1.setBounds(30, 20, 100, 20);
        rotulo2.setBounds(30, 60, 100, 20);
        show.add(rotulo1);
        show.add(rotulo2);
        
        campo1 = new JTextField (5);
        campo2 = new JTextField (5);
        campo1.setBackground(new Color(54, 54, 54));
        campo2.setBackground(new Color(54, 54, 54));
        campo1.setForeground(Color.white);
        campo2.setForeground(Color.white);
        campo1.setBounds(135, 20, 120, 20);
        campo2.setBounds(135, 60, 120, 20);
        show.add(campo1);
        show.add(campo2);
        
        somar = new JButton ("Somar");
        somar.setBackground(new Color(54, 54, 54));
        somar.setForeground(new Color(100,149,237));
        somar.setBounds(100, 100, 80, 20);
        show.add(somar);

        resultado = new JLabel ("");
        resultado.setForeground(Color.white);
        resultado.setBounds(80, 130, 200, 20);
        show.add(resultado);
        
        //FUNCIONALIDADE NO BOTÃO
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int v1 = 0, v2 = 0, soma = 0;
                        v1 = Integer.parseInt(campo1.getText());
                        v2 = Integer.parseInt(campo2.getText());
                        soma = v1 + v2;
                        resultado.setText("O valor da soma é: " +soma);
                        resultado.setVisible(true);
                    }
                }
        );
    }
    
    public static void main(String[] args) {
        Exercicio08 start = new Exercicio08();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
