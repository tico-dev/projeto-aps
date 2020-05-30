import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataError extends JFrame {
    DataError(){
        super("Dados inconclusivos.");
        System.out.println("DATAERROR.JAVA");
        Container panel_error = this.getContentPane();
        panel_error.setLayout(new GridLayout(4, 1));
        JPanel panel2 = new JPanel(new FlowLayout());

        // Mensagens de erro para mostrar:
        JLabel mensagem_error = new JLabel("A data informada está incorreta.", JLabel.CENTER);
        JLabel mensagem_error2 = new JLabel("Favor colocar uma data entre 1990 e o mês atual.", JLabel.CENTER);
        JLabel mensagem_error3 = new JLabel("(A data de hoje e datas futuras não são válidas)", JLabel.CENTER);

        // Adiciona um botao
        JButton botao = new JButton("Recomeçar");
        botao.setSize(40,40);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Aplicacao inicio = new Aplicacao();
                Aplicacao.inicio();
            }
        });

        // Proporcao do tamanho da janela:
        this.setSize(400, 200);

        // Adiciona as mensagens(labels) de erro na janela.
        this.add(mensagem_error);
        this.add(mensagem_error2);
        this.add(mensagem_error3);

        // Adiciona o botao a janela
        panel2.add(botao);
        this.add(panel2);

        // Configuracoes basicas da janela:
        this.setVisible(true);                                    // Visivel
        this.setResizable(false);                                 // Tamanho fixo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}}    // O botão "X" no canto superior direito termina a execução caso clicado.
