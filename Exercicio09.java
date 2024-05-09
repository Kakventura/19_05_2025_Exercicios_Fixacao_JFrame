package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio09 extends JFrame{
    
    JLabel titulo, rotulo1, rotulo2, resultado;
    JTextField campo1, campo2;
    JButton somar, sub, mult, div, fechar;
    
    public Exercicio09(){
        super("Calculadora Simples");
        ImageIcon icon = new ImageIcon("calculadoraIcon.png");
        setIconImage(icon.getImage());
        Container show = getContentPane();
        setLayout(null);
        setVisible(true);
        setSize(300, 380);
        setLocationRelativeTo(null);
        
        show.setBackground(Color.black);
        
        titulo = new JLabel("Calculadora");
        titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        titulo.setForeground(new Color (255,215,0));
        titulo.setBounds(75, 10, 400, 60);
        show.add(titulo);
        
        rotulo1 = new JLabel ("Insira o 1° valor:");
        rotulo2 = new JLabel ("Insira o 2° valor:");
        rotulo1.setForeground(Color.white);
        rotulo2.setForeground(Color.white);
        rotulo1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        rotulo2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        rotulo1.setBounds(30, 80, 200, 20);
        rotulo2.setBounds(30, 120, 200, 20);
        show.add(rotulo1);
        show.add(rotulo2);
        
        campo1 = new JTextField (5);
        campo2 = new JTextField (5);
        campo1.setBackground(new Color(54, 54, 54));
        campo2.setBackground(new Color(54, 54, 54));
        campo1.setForeground(Color.white);
        campo2.setForeground(Color.white);
        campo1.setBounds(140, 80, 120, 20);
        campo2.setBounds(140, 120, 120, 20);
        show.add(campo1);
        show.add(campo2);
        
        somar = new JButton ("Adição");
        sub = new JButton ("Subtração");
        mult = new JButton ("Multiplicação");
        div = new JButton ("Divisão");
        somar.setBackground(new Color(54, 54, 54));
        sub.setBackground(new Color(54, 54, 54));
        mult.setBackground(new Color(54, 54, 54));
        div.setBackground(new Color(54, 54, 54));
        somar.setForeground(new Color(100,149,237));
        sub.setForeground(new Color(100,149,237));
        mult.setForeground(new Color(100,149,237));
        div.setForeground(new Color(100,149,237));
        somar.setBounds(15, 180, 110, 20);
        sub.setBounds(15, 230, 110, 20);
        mult.setBounds(160, 180, 110, 20);
        div.setBounds(160, 230, 110 , 20);
        show.add(somar);
        show.add(sub);
        show.add(mult);
        show.add(div);

        resultado = new JLabel ("", SwingConstants.CENTER);
        resultado.setForeground(Color.white);
        resultado.setBounds(40, 270, 200, 20);
        show.add(resultado);
        
        fechar = new JButton ("Sair");
        fechar.setBackground(new Color(54, 54, 54));
        fechar.setForeground(Color.red);
        fechar.setBounds(90, 300, 100, 20);
        show.add(fechar);
        
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
        
        sub.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int v1 = 0, v2 = 0, sub = 0;
                        v1 = Integer.parseInt(campo1.getText());
                        v2 = Integer.parseInt(campo2.getText());
                        sub = v1 - v2;
                        resultado.setText("O valor da subtração é: " +sub);
                        resultado.setVisible(true);
                    }
                }
        );
        
        mult.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int v1 = 0, v2 = 0, mult = 0;
                        v1 = Integer.parseInt(campo1.getText());
                        v2 = Integer.parseInt(campo2.getText());
                        mult = v1 * v2;
                        resultado.setText("O valor da multipliacação é: " +mult);
                        resultado.setVisible(true);
                    }
                }
        );
        
        div.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int v1 = 0, v2 = 0, div = 0;
                        v1 = Integer.parseInt(campo1.getText());
                        v2 = Integer.parseInt(campo2.getText());
                        div = v1 / v2;
                        resultado.setText("O valor da divisão é: " +div);
                        resultado.setVisible(true);
                    }
                }
        );
        
        fechar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );
    }
    
    public static void main(String[] args) {
        Exercicio09 start = new Exercicio09();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
