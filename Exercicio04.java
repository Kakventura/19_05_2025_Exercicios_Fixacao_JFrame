package exerciciosfixacao;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio04 extends JFrame {
    
    JLabel rotulo;
    JPasswordField campo; //CAMPO DE TEXTO PARA SENHAS
    
    public Exercicio04(){
        super("Exemplo Senha");

        //CONFIG DA PÁGINA
        setSize(440, 180);
        setVisible(true);
        setLocationRelativeTo(null);
        
        //ÍCONE DA PAGINA
        ImageIcon icon = new ImageIcon("senhaicone.png");
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
        campo.setForeground(Color.CYAN); //ALTERAR A COR DO PASSWORD
        //setForeground(new Color(115,99,128));​ PARA CRIAR UMA NOVA COR
        campo.setEchoChar('*'); //MUDAR O CARACTER DA SENHA
        adicionar.add(campo);
    }
    
    public static void main(String[] args) {
        Exercicio04 iniciar = new Exercicio04();
        iniciar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
