import java.time.LocalDate;
import java.time.Period;

public class Verificador_Ferias {
    Verificador_Ferias(int mes, int ano){
        System.out.println("VERIFICADOR.JAVA");
        LocalDate hoje            = LocalDate.now();
        LocalDate verificar_ferias = LocalDate.of(ano, mes, 1);


        if(verificar_ferias.getYear() == hoje.getYear() && verificar_ferias.getMonthValue() >= hoje.getMonthValue()){
            new DataError();
        }
        else{
            Period periodo = Period.between(verificar_ferias, hoje);
            int diferenca_ano = periodo.getYears();
            int diferenca_mes = periodo.getMonths();

            System.out.println("-------------------------");
            System.out.println("diferenca_ano: " + diferenca_ano);
            System.out.println("diferenca_mes: " + diferenca_mes);
            System.out.println("-------------------------");

            if(diferenca_ano >= 1 || diferenca_mes >= 12){
                // Pode tirar férias.
                new Dados_Funcionario();
            }
            else{
                // Não pode tirar férias.
                new Sem_Ferias(diferenca_mes);
            }
        }
    }
}