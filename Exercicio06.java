package exerciciosfixacao;
import javax.swing.*; //PACOTE QUE EXIBE CONTEÚDOS NA JANELA
import java.awt.*; //PACOTE QUE EXIBE CONTEÚDOS NA JANELA
import java.awt.event.*; //PACOTE QUE TRABALHA COM EVENTOS
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio06 extends JFrame{
    JButton bsair;
    public Exercicio06(){
        
        super("Botão com Funcionalidades");
        Container tela = getContentPane();
        setLayout(null);
        ImageIcon icon = new ImageIcon("sair.png");
        setIconImage(icon.getImage());
        tela.setBackground(new Color(128,0,0));
        
        //CONFIG BOTÃO
        bsair = new JButton ("Sair");
        bsair.setBackground(Color.white);
        bsair.setForeground(Color.red);
        bsair.setBounds(90, 45, 100, 20);
        tela.add(bsair);
        
        // ADICIONANDO FUNCIONALIDADE
        
        //ADICIONA AÇÃO A LISTA QUE ESTÁ DENTRO DO BOTÃO
        bsair.addActionListener(
            // NOVA AÇÃO A SER LISTADA
            new ActionListener(){
                //COMO A AÇÃO IRÁ SE COMPORTAR - EVENTO PÚBLICO QUE O BOTÃO IRÁ ADQUIRIR 
                public void actionPerformed(ActionEvent e){
                    // FINALIZA O ARQUIVO
                    System.exit(0);
                }
            }
        );

        /*
        USAR PARA QUANDO QUISER DAR FUNCIONALIDADE A UM BOTÃO
        nomebotao.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
            }   
        });
        */
        
        //CONFIG TELA
        setVisible(true);
        setSize(300, 150);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        Exercicio06 app = new Exercicio06();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
