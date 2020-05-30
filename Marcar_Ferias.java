import javax.swing.*;
import java.awt.*;

public class Marcar_Ferias extends JFrame {
    Marcar_Ferias(){
        super("Marcar férias");

        Container pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(2, 1));
        JPanel pane2 = new JPanel(new FlowLayout());

        JLabel labelTexto = new JLabel("           Escolha um mês para começar as férias:           ");

        // Fazendo o Combo Mes:

        JComboBox<String> comboMes = new JComboBox<>();

        comboMes.addItem("JANEIRO");
        comboMes.addItem("FEVEIRO");
        comboMes.addItem("MARÇO");
        comboMes.addItem("ABRIL");
        comboMes.addItem("MAIO");
        comboMes.addItem("JUNHO");
        comboMes.addItem("JULHO");
        comboMes.addItem("AGOSTO");
        comboMes.addItem("SETEMBRO");
        comboMes.addItem("OUTUBRO");
        comboMes.addItem("NOVEMBRO");
        comboMes.addItem("DEZEMBRO");


        //cria botao de botao
        JButton botao = new JButton("Marcar");
        botao.setSize(40, 40);

        botao.addActionListener(e -> {
            dispose();
            new Sucesso(comboMes.getSelectedIndex() + 1);
        });


        pane1.add(labelTexto);
        pane1.add(comboMes);
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
