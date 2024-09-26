import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Quantos time serão criados?");
        n = sc.nextInt();
        sc.nextLine();
        Time times[] = new Time[n];


        for(int i=0; i<n; i++){

            System.out.println("Qual nome do time?");
            String nomeTime = sc.nextLine();

            System.out.println("Tem substituto? 1-S 2-N");
            int temSub = sc.nextInt();
            sc.nextLine();

            if(temSub == 2){
                Jogador jogadores [] = new Jogador[2];
                for(int j=0; j<2; j++){
                    System.out.println("nome titular " + (j+1) + ":");
                    String nome = sc.nextLine();
                    System.out.println("idade titular " + (j+1) + ":");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("altura titular " + (j+1) + ":");
                    float altura = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("peso titular " + (j+1) + ":");
                    float peso = sc.nextFloat();
                    sc.nextLine();
                    jogadores[j] = new Jogador(nome, idade, altura, peso);
                }
                System.out.println("IIIIIIIIIII: " + i);
                times[i] = new Time(nomeTime, jogadores[0], jogadores[1]);
            } else if (temSub == 1) {
                Jogador jogadores [] = new Jogador[3];
                for(int j=0; j<3; j++){
                    System.out.println("nome jogador:");
                    String nome = sc.nextLine();
                    System.out.println("idade jogador:");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("altura jogador:");
                    float altura = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("peso jogador:");
                    float peso = sc.nextFloat();
                    sc.nextLine();
                    jogadores[j] = new Jogador(nome, idade, altura, peso);
                }
                System.out.println("IIIIIIIIIII: " + i);
                times[i] = new Time(nomeTime, jogadores[0], jogadores[1], jogadores[2]);
            }
        }
        System.out.println(times[0].toString());
        System.out.println(times[1].toString());
        Time maiorMedia = times[0];
        for(int i = 0; i<times.length-1; i++){
            System.out.println("carahlooooooooooooooo");
            if(times[i].calcIdadeMedia() > maiorMedia.calcIdadeMedia()){
                System.out.println("porrannn\n\n");
                maiorMedia = times[i];
            }
        }
        System.out.println("\n\n maior media:\n" + maiorMedia.toString());


    }
}
