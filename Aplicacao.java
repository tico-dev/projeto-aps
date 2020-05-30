public class Aplicacao{
    public static void main(String[] args){
        // Devido ao Charset padrao de cada computador ser diferente, evitamos de usar acentos nas palavras.
        // A tela1 invoca a tela2 e assim por diante, até o fim da execução do programa.
        inicio();
    }

    public static void inicio(){
        // Instancia uma tela do tipo "data":
        new Data();
    }
}