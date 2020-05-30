import javax.swing.*;
import java.awt.*;

public class Sem_Ferias extends JFrame{
    public Sem_Ferias(int diferenca_mes){
        super("Sem férias");
        Container pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(2, 1));
        JPanel pane2 = new JPanel(new FlowLayout());

        int diferenca = 12 - diferenca_mes;
        JLabel labelTexto = new JLabel(String.format("           Faltam %d meses para você poder tirar férias.           ", diferenca), JLabel.CENTER);
        System.out.println(String.format("Faltam %d meses para você poder tirar férias.", diferenca));


        //cria botao de botao
        JButton botao = new JButton("Fechar");
        botao.setSize(40, 40);

        botao.addActionListener(e -> {
            dispose();
        });


        pane1.add(labelTexto);
        pane2.add(botao);
        pane1.add(pane2);

        // Configuração da Janela (JFRAME).
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }
}
