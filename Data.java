import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;


public class Data extends JFrame{
    private String mes;
    private int ano;
    private static int mes_selecionado;
    JLabel labelTexto = new JLabel(" Informe a data do seu ultimo período de férias (ou a data de ingressão na empresa): ", JLabel.CENTER);
    JLabel labelMes = new JLabel("Informe o MÊS:", JLabel.CENTER);
    JLabel labelAno = new JLabel("Informe o ANO:", JLabel.CENTER);


    private JComboBox<String> comboMes = new JComboBox<>();
    private JComboBox<Integer> comboAno = new JComboBox<>();


    Data() {
        // Painel principal
        super("Datas para verificaçao");            // seta o nome do painel

        System.out.println("DATA.JAVA");
        Container pane1 = this.getContentPane();        // Acessa o painel
        pane1.setLayout(new GridLayout(4, 2, 4, 4)); // Ajusta o layout para 4 linhas

        JPanel pane2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel pane3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel pane4 = new JPanel(new FlowLayout(FlowLayout.CENTER));

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

        for (int i = 2000; i <= LocalDate.now().getYear(); i++) comboAno.addItem(i); // adiciona opcoes ao comboAno


        //cria botao de botao
        JButton botao = new JButton("submit");
        botao.setSize(40, 40);

        botao.addActionListener(e -> {
            System.out.println("Enviando data para análise...");
            mes_selecionado = comboMes.getSelectedIndex() + 1;
            this.ano = (int) comboAno.getSelectedItem();
            this.mes = (String) comboMes.getSelectedItem();

            // Fecha a janela atual:
            dispose();

            // Chama o metodo verificador (para verificar a data):
            new Verificador_Ferias(mes_selecionado, ano);
        });

        pane1.add(labelTexto);
        pane2.add(labelMes);
        pane2.add(comboMes);
        pane3.add(labelAno);
        pane3.add(comboAno);
        pane4.add(botao);
        pane1.add(pane2);
        pane1.add(pane3);
        pane1.add(pane4);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }
}
