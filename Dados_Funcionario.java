import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dados_Funcionario extends JFrame{
    private static String cargo;

    // labels:
    JLabel textoInicial = new JLabel("Para solicitar suas férias, favor informar:", SwingConstants.CENTER);
    JLabel labelCargo   = new JLabel("Cargo:    ");
    JLabel labelUnidade = new JLabel("Unidade:"  );

    // opcoes:
    JComboBox<String> comboCargo = new JComboBox<>();
    JComboBox<String> comboUnidade = new JComboBox<>();

    Dados_Funcionario(){
        super("Dados do Funcionário");
        System.out.println("TELA2.JAVA");
        Container pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(4, 1));


        JPanel pane2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel pane3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel pane4 = new JPanel(new FlowLayout(FlowLayout.CENTER));


        comboCargo.addItem("Estagiario");
        comboCargo.addItem("Desenv. Junior");
        comboCargo.addItem("Desenv. Pleno");
        comboCargo.addItem("Desenv. Senior");

        comboUnidade.addItem("Sao Paulo");
        comboUnidade.addItem("Rio de Janeiro");
        comboUnidade.addItem("Minas Gerais");
        comboUnidade.addItem("Santa Catarina");

        //cria botao de botao
        JButton botao = new JButton("submit");
        botao.setSize(40,40);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargo = (String) comboCargo.getSelectedItem();
                String unidade = (String) comboUnidade.getSelectedItem();
                System.out.println(String.format("Cargo = %s | Unidade = %s", cargo, unidade));
                dispose();
                new Marcar_Ferias();
            }
        });

        pane1.add(textoInicial);
        pane2.add(labelCargo);
        pane2.add(comboCargo);
        pane1.add(pane2);
        pane3.add(labelUnidade);
        pane3.add(comboUnidade);
        pane1.add(pane3);
        pane4.add(botao);
        pane1.add(pane4);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setVisible(true);
    }
}
