import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner escolhas = new Scanner(System.in);

        Personagens chris = new Personagens ("Chris", 100);
        Personagens drew = new Personagens ("Drew", 100);
        System.out.println("Essa é uma história iterativa em que você pode escolher o rumo a ser tomado" +
                "\nEm posse dessa informação, vamos prosseguir!");
        System.out.println();

        String titulo = "Todo Mundo Odeia o " + chris.nome;
        String intro = "Brooklyn, 1986";
        String CHcap1 = "É dia das mães, Chris deseja comprar um presente pra sua mãe mas ainda não sabe o que." +
                "\nNa TV, passa um comercial do perfume puro voodoo. Rochelle enloquece e quer muito um." +
                "\nChris já sabe o que dar pra sua mãe de presente. Ao ver o preço, sabe que não tem condições de comprar aquele presente.";

        String CHesc1Cap1 = "1: Chris decide fazer um presente de macarrão pra economizar dinheiro";
        String CHesc2Cap1 = "2: Chris vai atrás do perfume.";

        String CHcap2 = "Chris decide ir atrás do perfume na loja, mas ainda tem aula e por isso pede pra Greg dizer aos professores que ele estava doente."
                +
                "\nAo chegar na loja, Chris percebe que o preço do perfume é muito acima do seu orçamento mesmo depois de negociar com a vendedora.";

        String CHesc1Cap2 = "1: Chris leva o perfume na mão leve";
        String CHesc2Cap2 = "2: Ele deixa pra lá e decide ir em outros lugares.";

        String CHcap3 = "Chris lembra que o Perigo, vendedor de artigos gerais do seu bairro, pode vender o Puro Voodoo."
                +
                "\nAo chegar lá, ele encontra uma versão similar do perfume, com o nome de 'puru vudu' e um preço bem mais acessível .";

        String CHesc1Cap3 = "1: Levar o perfume mesmo assim.";
        String CHesc2Cap3 = "2: Desistir do perfume e resolver fazer uma bolsa de macarrão como presente.";


        String CHfinal1 = "Chris fez o presente de macarrão e deu pra sua mãe" +
                "\nEla recebe a ligação da escola dizendo que seu filho não foi a aula. Chris se da mal!!" + 
                "\nFazer o presente de macarrão cansou " + chris.nome + " e por isso ele perdeu 15 de energia";

        String CHfinal2 = "Chris é pego pelos seguranças da loja e é encaminhado pela delegacia. Julius vai buscar ele lá. Chris se da mal!!";

        String CHfinal3 = "Chris leva o perfume do Perigo e dá a sua mãe que fica super feliz. Ao usar o perfume, a pele de Rochelle tem uma reação alergica" +
                "\nChris se deu mal dessa vez!!!";

        String CHfinal4 = "Chris, assim como nos anos anteriores, faz um presente de macarrão e dá a sua mãe! Ela fica feliz e diz que o maior presente são seus filhos" +
                "\nChris escapa e quase se dá mal!";



        String DRcap1 = "Enquanto isso Drew, o arrasador de corações, tem algumas questões à serem resolvidas." + 
                "\n Sr. Omar precisa de alguém pra completar o poker das funerárias";

        String DResc1Cap1 = "1: Ficar de boa em casa assistindo TV com a Tônia";
        String DResc2Cap1 = "2: Ganhar o dinheiro dos velhos das funerárias";

        String DRcap2 = "Drew decidiu jogar poker com os donos de funerárias e, pra isso, levou todo o dinheiro da sua mesada pra apostar" + 
                "\n Chegando lá, drew ganhou a maioria dos jogos, graças a suas habilidades matemáticas, herdadas de seu pai." +
                "\n Na última rodada Drew tem a difícil escolhar a fazer";

        String DResc1Cap2 = "1: Apostar tudo e ganhar ainda mais dinheiro";
        String DResc2Cap2 = "2: Apostar tudo e deixar o Sr. Omar ganhar";

        String DRcap3 = "Depois de deixar o Sr. Omar ganhar, ele ficou zoando Drew. Drew com raiva promete a si mesmo que não vai mais perder pra esses velhotes" + 
                "\n Como já estava sem dinheiro pra apostar nas próximas, Drew só tem duas opções:";

        String DResc1Cap3 = "1: Pedir dinheiro emprestado com Chris";
        String DResc2Cap3 = "2: Pedir dinheiro emprestado com a Tônia";

 

        String DRfinal1 = "Drew e tônia brigaram pra decidir o que iam assistir. No final tudo ficou bem";
        String DRfinal2 = "Os donos de funerárias não gostoara de perder pra um adolescente e por isso não convidaram mais Drew." + 
                "\n Julius viu que Drew tinha ganhado mais dinheiro e pergunta como, depois de saber, recolhe o dinheiro para si já que ele que tinha dado a mesada.";
        String DRfinal3 = "Como um bom irmão, Chris emprewstou o dinheiro e só pediu isso de volta" + 
                "\n Drew foi jogar poker cheio de ódio e ganhou todas, sem perdoar ninguém. Recuperou 4 vezes mais do que tinha apostado e pagou a Chris";
        String DRfinal4 = "Tônia concordou em emprestar o dinheiro à Drew! Porém ele teria que pagar com juros tudo que pegou" + 
                "\n Drew ganhou as partidas e fez muito dinheiro! Na hora de pagar, Tônia exigiu 50% de tudo pra não contar pra Rochelle";

        System.out.println(titulo);
        System.out.println();
        System.out.println(intro);
        System.out.println(CHcap1);
        System.out.println(CHesc1Cap1);
        System.out.println(CHesc2Cap1);
        int resposta = escolhas.nextInt();

        if (resposta == 1) {
            System.out.println();
            System.out.println(CHfinal1);
            chris.energia = chris.energia - 15;
            System.out.println("A energia total de Chris é de: " + chris.energia);

        } else if (resposta == 2) {
            System.out.println();
            System.out.println(CHcap2);
            System.out.println(CHesc1Cap2);
            System.out.println(CHesc2Cap2);
            int resposta2 = escolhas.nextInt();

                if (resposta2 == 1) {
                        System.out.println();  
                        System.out.println(CHfinal2);
                        System.out.println("Ser preso fez com que o Jovem Negro Chris perdesse toda sua energia vital");
                        chris.energia = 0;
                        System.out.println("A energia total de Chris é de: " + chris.energia + ". Ele vai precisar tomar um xarope!");

                } else if (resposta2 == 2) {
                        System.out.println();
                        chris.energia = chris.energia - 30;
                        System.out.println("Procurar o perfume fez com que Chris perdesse 30 de energia. A Energia total de Chris é de: " + chris.energia);
                        System.out.println();
                        System.out.println(CHcap3);
                        System.out.println(CHesc1Cap3);
                        System.out.println(CHesc2Cap3);
                        int resposta3 = escolhas.nextInt();

                        if (resposta3 == 1) {
                                System.out.println(CHfinal3);
                                System.out.println("Ele não perdeu energia. A Energia total de Chris é de: " + chris.energia);
                        } else if (resposta3 == 2) {
                                System.out.println(CHfinal4);
                                chris.energia = chris.energia - 15;
                                System.out.println("Fazer o presente de macarrão só gastou 15 de energia. a Energia total de Chris é de: " + chris.energia);
                        }
                }
        }
        
        System.out.println();
        System.out.println(DRcap1);
        System.out.println(DResc1Cap1);
        System.out.println(DResc2Cap1);

        int respostadre = escolhas.nextInt();

        if (respostadre == 1) {
            System.out.println();
            System.out.println(DRfinal1);
            drew.energia = drew.energia - 15;
            System.out.println("Drew perdeu só 15 de energia enquanto brigava. Sua energia total agora é de: " + drew.energia);

        } else if (respostadre == 2) {
                System.out.println();
                System.out.println(DRcap2);
                System.out.println(DResc1Cap2);
                System.out.println(DResc2Cap2);
                int respostadre2 = escolhas.nextInt();

                if (respostadre2 == 1) {
                        System.out.println();  
                        System.out.println(DRfinal2);
                        System.out.println("Apostar tudo fez com que Drew perdesse 70 de energia");
                        drew.energia = drew.energia - 70;
                        System.out.println("A energia total de Drwe é de: " + drew.energia + ". Ele vai precisar descansar");

                } else if (respostadre2 == 2) {
                        System.out.println();
                        System.out.println(DRcap3);
                        System.out.println(DResc1Cap3);
                        System.out.println(DResc2Cap3);
                        int respostadre3 = escolhas.nextInt();

                        if (respostadre3 == 1) {
                                System.out.println(DRfinal3);
                                drew.energia = drew.energia - 20;
                                System.out.println("Ele perdeu apenas 20 de energia. A energia total de Drew é de: " + drew.energia);
                        } else if (respostadre3 == 2) {
                                System.out.println(DRfinal4);
                                drew.energia = 0;
                                System.out.println("Tudo isso fez com que a energia de drew fosse zerada, por isso sua energia é de: " + drew.energia);
                        }
                }
        }
    }
}       