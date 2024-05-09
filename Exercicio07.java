package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio07 extends JFrame{
     
    JLabel rotulo, resultado;
    JPasswordField campo;
    JButton botao;
    
    public Exercicio07(){
    super("Exibição de Senha");

        //CONFIG DA PÁGINA
        setSize(440, 230);
        setVisible(true);
        setLocationRelativeTo(null); // POSICIONAR NO MEIO DA TELA
        
        //ÍCONE DA PAGINA
        ImageIcon icon = new ImageIcon("mostrarsenha.png");
        setIconImage(icon.getImage());
        
        Container adicionar = getContentPane();
        setLayout(null);
        
        adicionar.setBackground(Color.black); //MUDAR COR DO FUNDO DA PÁGINA
        
        rotulo = new JLabel("Senha:");
        rotulo.setFont(new Font("Monospaced", Font.BOLD, 18));
        rotulo.setForeground(Color.white);
        rotulo.setBounds(50, 30, 100, 20);
        adicionar.add(rotulo);
        
        campo = new JPasswordField(10);
        campo.setBounds(50,70,315,20);  
        campo.setForeground(new Color(154,205,50)); //ALTERAR A COR DO PASSWORD
        campo.setBackground(new Color(54, 54, 54));
        campo.setEchoChar('*'); //MUDAR O CARACTER DA SENHA
        adicionar.add(campo);
        
        botao = new JButton("Mostrar!");
        botao.setBackground(new Color(28,28,28));
        botao.setForeground(new Color(154,205,50));
        botao.setFont(new Font("Monospaced", Font.BOLD, 12));
        botao.setBounds(160, 120, 100, 20);
        adicionar.add(botao);
        
        resultado = new JLabel("A senha digitada é:");
        resultado.setFont(new Font("Monospaced", Font.BOLD, 12));
        resultado.setForeground(Color.white);
        resultado.setBounds(90, 150, 250, 20);
        adicionar.add(resultado);
        resultado.setVisible(false); // INVISIVEL POIS VAI EXIBIR APENAS APÓS O CLIQUE NO BOTÃO
        
        //FUNCIONALIDADE NO BOTÃO
        botao.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String senha = new String (campo.getPassword());// GET(RECEBE)
                    resultado.setVisible(true);
                    resultado.setText("A senha digitada é: "+senha);// ATRIBUIÇÃO NA EXIBIÇÃO DO TEXT - SET(EXIBE)
                } 
            }
        );
    }
    
    public static void main(String[] args) {
        Exercicio07 iniciar = new Exercicio07();
        iniciar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
