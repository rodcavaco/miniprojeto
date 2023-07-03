import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner escolhas = new Scanner(System.in);
        System.out.println("Essa é uma história iterativa em que você pode escolher o rumo a ser tomado" +
                "\nEm posse dessa informação, vamos prosseguir!");
        System.out.println();

        String titulo = "Todo Mundo Odeia o Chris";
        String cap1 = "É dia das mães, Chris deseja comprar um presente pra sua mãe mas ainda não sabe o que." + 
        "\nNa TV, passa um comercial do perfume puro voodoo. Rochelle enloquece e quer muito um." + 
        "\nChris já sabe o que dar pra sua mãe de presente. Ao ver o preço, sabe que não tem condições de comprar aquele presente.";

        String esc1Cap1 = "1: Chris desiste de comprar o perfume e não dá nenhum presente pra sua mãe.";
        String esc2Cap1 = "2: Chris vai atrás do perfume.";
        
        String cap2 = "Chris decide ir atrás do perfume na loja, mas ainda tem aula e por isso pede pra Greg dizer aos professores que ele estava doente." +
        "\nAo chegar na loja, Chris percebe que o preço do perfume é muito acima do seu orçamento mesmo depois de negociar com a vendedora.";
        
        String esc1Cap2 = "1: Chris leva o perfume na mão leve";
        String esc2Cap2 = "2: Ele deixa pra lá e decide ir em outros lugares.";

        String cap3 = "Chris lembra que o Perigo, vendedor de artigos gerais do seu bairro, pode vender o Puro Voodoo." + 
        "\nAo chegar lá encontra o perfume por um preço bem mais acessível, mas desconfia da qualidade e procedência dele.";

        String esc1Cap3 = "1: Levar mesmo assim.";
        String esc2Cap3 = "2: Fazer uma bolsa de macarrão para o presente.";

        String final1 = "A mãe de Chris fica triste porque ele não deu nada mas diz que o melhor rpesente foi seu filho." + 
        "\nEla recebe a ligação da escola dizendo que seu filho não foi a aula. Chris se da mal!!";

        String final2 = "Chris é pego pelos seguranças da loja e é encaminhado pela delegacia. Julius vai buscar ele lá. Chris se da mal!!";

        String final3 = "Chris leva o perfume do Perigo e dá a sua mãe que fica super feliz. Ao usar o perfume, a pele de Rochelle tem uma reação alergica" +
        "\nChris se dá mal!!!";

        String final4 = "Chris, assim como nos anos anteriores, faz um presente de macarrão e dá a sua mãe! Ela fica feliz e diz que o maior presente são seus filhos" +
        "\nChris quase se dá mal!";
        
        System.out.println(titulo);
        System.out.println(cap1);
        System.out.println(esc1Cap1);
        System.out.println(esc2Cap1);
        int resposta = escolhas.nextInt();

        if (resposta == 1) {
            System.out.println(final1);
        } else if (resposta == 2){
            System.out.println();
            System.out.println(cap2);
            System.out.println(esc1Cap2);
            System.out.println(esc2Cap2);
            int resposta2 = escolhas.nextInt();

            if (resposta2 == 1){
                System.out.println(final2);
            } else if (resposta2 == 2){
                System.out.println();
                System.out.println(cap3);
                System.out.println(esc1Cap3);
                System.out.println(esc2Cap3);
                int resposta3 = escolhas.nextInt();

                if (resposta3 == 1) {
                    System.out.println(final3);
                } else if (resposta3 == 2){
                    System.out.println(final4);
                } else {
                }
            }    
        }    
    }
}
       