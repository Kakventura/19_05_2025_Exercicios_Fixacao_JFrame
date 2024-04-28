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
public class Exercicio01 extends JFrame {
    
    /* CRIAÇÃO DE VARIÁVEIS DE INSTANCIA */
    // DEFINIÇÕES DE ELEMENTOS DO JFRAME
    // JLABEL - USADO PARA CRIAR ESPAÇO DE JANELA
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6,rotulo7, titulo;
   
    // JTEXTFIELD - CAIXA DE TEXTO
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    
    //Botões
    JButton botao1, botao2;
    
    // CRAIAÇÃO DO MÉTODO CONSTRUTOR PARA DESENVOLVER A TELA
    public Exercicio01(){
        
        // TITULO DA PÁGINA
        super("Cadastro de Cliente");
        
        // CONFIGURAÇÃO DE EXIBIÇÃO E NAVEGAÇÃO DA INTEFACE
        // TAMANHO DA PÁGINA
        setSize(430, 450);
        
        // VISIBILIDADE DA INTERFACE
        setVisible(true);
        
        // POSICIONAMENTO DA TELA DO DISPOSITIVO
        setLocationRelativeTo(null);
        
        //O USUÁRIO NÃO CONSEGUE REDIMENSIONAR O TAMANHO DA PÁGINA
        setResizable(false);
        
        // COLOCAR O ÍCONE NA JANELA
        // INSTANCIAMENTO DA CLASSE E CRIAÇÃO DO OBJETO
        ImageIcon icone = new ImageIcon("icon.png");
        setIconImage(icone.getImage());
        
        
        // INSTANCIAMENTO DE UMA CLASSE DO JFRAME
        /* CONTAINER PARA RECEBER OBJETOS DO JFRAME CONFIGURAÇÃO DA TELA */
        Container mostrar = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        
        /* CRIAÇÃO DOS OBJETOS */
        
        // DEFINIÇÃO DO TITULO DA TELA
        // CRIAÇÃO DO OBJETO E DEFINIÇÃO NOS PARAMETROS 
        /* VARIÁVEL = NEW MÉTODO JLABEL(DEFINIÇÃO DO QUE VAI ESTAR ESCRITO, POSICIONAMENTO NA JANELA */
        titulo = new JLabel("Cadastro de Clientes", SwingConstants.CENTER);
        
        //ATRIBUINDO MÉTODOS MODIFICADORES AO OBJETO CRIADO
        /* objeto.metodo_do_JFrame(definicao_nos_parametros("valores nos parametros"));
                                ("desenho_da_fonte", estilizacao, tamanho));
        */
        titulo.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        // DEFINIÇÃO DA COR DA JLABEL TÍTULO
        titulo.setForeground(Color.GRAY);
        
        // POSICIONAMENTO DA JLABEL TÍTULO
        titulo.setBounds(0, 0, 400, 60);
        
        // EXIBIÇÃO DA DOS ELEMENTOS
        mostrar.add(titulo);
        
        
        /* CRIAÇÃO OS OUTRO ELEMENTOS NO MESMO SENTIDO */
                           //JLABEL'S
        // VARIÁVEL = NOVO OBJETO JLABEL ("NOME DO CAMPO")
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("CPF:");
        rotulo3 = new JLabel ("RG:");
        rotulo4 = new JLabel ("Endereço:");
        rotulo5 = new JLabel ("Cidade:");
        rotulo6 = new JLabel ("Estado:");
        rotulo7 = new JLabel ("CEP:");
        
        // POSICIONAMENTO DOS OBJETOS JLABEL
        rotulo1.setBounds(50, 60, 80, 20);
        rotulo2.setBounds(50, 100, 80, 20);
        rotulo3.setBounds(50, 140, 80, 20);
        rotulo4.setBounds(50, 180, 80, 20);
        rotulo5.setBounds(50, 220, 80, 20);
        rotulo6.setBounds(50, 260, 80, 20);
        rotulo7.setBounds(50, 300, 80, 20);
        
        // ADICIONANDO À TELA
        mostrar.add(rotulo1);
        mostrar.add(rotulo2);
        mostrar.add(rotulo3);
        mostrar.add(rotulo4);
        mostrar.add(rotulo5);
        mostrar.add(rotulo6);
        mostrar.add(rotulo7);
        
                            //JTEXTFIELDS'S
        // VARIÁVEL = NOVO OBJETO JTextField (QUANTIDADE DE CARACTERES QUE SUPORTA)
        texto1 = new JTextField (50);
        texto2 = new JTextField (3);
        texto3 = new JTextField (10);
        texto4 = new JTextField (50);
        texto5 = new JTextField (40);
        texto6 = new JTextField (30);
        texto7 = new JTextField (8);
        
        texto1.setBounds(50, 80, 240, 20);
        texto2.setBounds(50,120,140,20);
        texto3.setBounds(50,160,120,20);
        texto4.setBounds(50,200,220,20);
        texto5.setBounds(50,240,190,20);
        texto6.setBounds(50,280,70,20);
        texto7.setBounds(50,320,110,20);
        
        mostrar.add(texto1);
        mostrar.add(texto2);
        mostrar.add(texto3);
        mostrar.add(texto4);
        mostrar.add(texto5);
        mostrar.add(texto6);
        mostrar.add(texto7);
        
        /* CRIAÇÃO DE BOTÕES */
        
        // ADICIONAR ICONE AO BOTÃO 
        // INSTANCIAMENTO DA CLASSE JFRAME
        ImageIcon botaoEnviar = new ImageIcon("send.png");
        ImageIcon botaoCancel = new ImageIcon("cancel.png");
        
        
        // CRIAÇÃO DOS BOTÕES
        botao1 = new JButton ("Enviar",botaoEnviar);
        botao2 = new JButton ("Cancelar", botaoCancel);
        botao1.setForeground(Color.DARK_GRAY);
        botao2.setForeground(Color.red);
        
        // POSICIONAMENTO DOS ELEMENTOS
        botao1.setBounds(70,360,110,20);
        botao2.setBounds(230,360,110,20);
        
        // EXIBIR BOTÕES 
        mostrar.add(botao1);
        mostrar.add(botao2);
        
        
    }
    
    public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio01 start = new Exercicio01();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
