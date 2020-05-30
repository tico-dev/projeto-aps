import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Sucesso extends JFrame{
    Sucesso(int mes_selecionado){
        super("Agendamento concluido");

        // Criando tela principal:
        Container pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(3, 1));
        JLabel labelTexto = new JLabel("           Férias marcadas com sucesso!           ", JLabel.CENTER);


        // Criando lógica de mes / ano:
        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();

        if(mes > mes_selecionado){
            ano += 1;
        }

        // Mes_Index -> Mes_Nome:

        ArrayList<String> mes_name = new ArrayList<>();
        mes_name.add("JANEIRO");    // Indice 0
        mes_name.add("FEVEIRO");    // Indice 1
        mes_name.add("MARÇO");      // ...
        mes_name.add("ABRIL");
        mes_name.add("MAIO");
        mes_name.add("JUNHO");
        mes_name.add("JULHO");
        mes_name.add("AGOSTO");
        mes_name.add("SETEMBRO");
        mes_name.add("OUTUBRO");
        mes_name.add("NOVEMBRO");
        mes_name.add("DEZEMBRO");   // Indice 11

        // Criando caixa de texto:
        JLabel labelText2 = new JLabel(String.format("Férias marcadas para %s/%d.", mes_name.get(mes_selecionado - 1), ano), JLabel.CENTER);


        //cria botao de botao
        JPanel pane2 = new JPanel(new FlowLayout());
        JButton botao = new JButton("Feito");
        botao.setSize(40, 40);

        botao.addActionListener(e -> {
            dispose();
        });
        pane2.add(botao);


        // Adicionando conteudo às janelas:
        pane1.add(labelTexto);
        pane1.add(labelText2);
        pane1.add(pane2);

        // Configuração da Janela (JFRAME).
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setResizable(false);
        this.setVisible(true);
        // this.pack();
    }
}
