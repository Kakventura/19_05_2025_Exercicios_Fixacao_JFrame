package exerciciosfixacao;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.text.*;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio05 extends JFrame {
    
    JLabel textocep, textotel, textocpf, textodata;
    JFormattedTextField cep, tel, cpf, data;
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;
    
    public Exercicio05(){
        super("Campos de Texto Formatados");
        
        //CONFIG DA TELA
        setVisible(true);
        setSize(400, 250);
        setLocationRelativeTo(null);
        
        //ÍCONE DA PAGINA
        ImageIcon icon = new ImageIcon("mascara.png");
        setIconImage(icon.getImage());
        
        // OBJETO DE EXIBIÇÃO
        Container pagina = getContentPane();
        setLayout(null);
        pagina.setBackground(Color.black);
        
        // JLABEL
        textocep = new JLabel("CEP:");
        textotel = new JLabel("Telefone:");
        textocpf = new JLabel("CPF:");
        textodata = new JLabel("Data:");
        
        textocep.setFont(new Font("Comic Sans MS",Font.PLAIN,14));
        textotel.setFont(new Font("Comic Sans MS",Font.PLAIN,14));
        textocpf.setFont(new Font("Comic Sans MS",Font.PLAIN,14));
        textodata.setFont(new Font("Comic Sans MS",Font.PLAIN,14));
        
        textocep.setForeground(Color.white);
        textotel.setForeground(Color.white);
        textocpf.setForeground(Color.white);
        textodata.setForeground(Color.white);
        
        textocep.setBounds(50, 40, 100, 20);
        textotel.setBounds(50, 80, 100, 20);
        textocpf.setBounds(50, 120, 100, 20);
        textodata.setBounds(50, 160, 100, 20);
        
        pagina.add(textocep);
        pagina.add(textotel);
        pagina.add(textocpf);
        pagina.add(textodata);
        
        // DEFINIÇÃO DAS MÁSCARAS - PRECISA ESTAR NO "TRY" PARA EVITAR EXCEÇÕES
        try{
            mascaracep = new MaskFormatter("#####-###");
            mascaratel = new MaskFormatter("(##) #####-####");
            mascaracpf = new MaskFormatter("########-##");
            mascaradata = new MaskFormatter("##/##/####");
        }
        catch(ParseException excp){}
        
        cep = new JFormattedTextField(mascaracep);
        tel = new JFormattedTextField(mascaratel);
        cpf = new JFormattedTextField(mascaracpf);
        data = new JFormattedTextField(mascaradata);
        
        cep.setBackground(new Color(54, 54, 54));
        tel.setBackground(new Color(54, 54, 54));
        cpf.setBackground(new Color(54, 54, 54));
        data.setBackground(new Color(54, 54, 54));
        
        cep.setForeground(Color.white);
        tel.setForeground(Color.white);
        cpf.setForeground(Color.white);
        data.setForeground(Color.white);
        
        cep.setBounds(130, 40, 100, 20);
        tel.setBounds(130, 80, 100, 20);
        cpf.setBounds(130, 120, 100, 20);
        data.setBounds(130, 160, 100, 20);
        
        pagina.add(cep);
        pagina.add(tel);
        pagina.add(cpf);
        pagina.add(data);
    }
    
    public static void main(String[] args) {
        Exercicio05 start = new Exercicio05();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
