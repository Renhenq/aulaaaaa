public class Time {
    private static String nome;
    private static Jogador t1;
    private static Jogador t2;
    private static Jogador sub;

    public Time(String nome, Jogador t1, Jogador t2, Jogador sub) {
        this.nome = nome;
        this.t1 = t1;
        this.t2 = t2;
        this.sub = sub;
    }

    public Time(String nome, Jogador t1, Jogador t2) {
        this.nome = nome;
        this.t1 = t1;
        this.t2 = t2;
    }

    public static float calcIdadeMedia(){
        int soma = t1.getIdade() + t2.getIdade();
        float media;
        if(sub != null){
            soma = soma + sub.getIdade();
            media = soma / 3;
        } else {
            media = soma/2;
        }
        return media;
    }

    @Override

    public String toString() {
        if(sub == null){
            return "Time{\n" +
                    "nome do time ='" + nome + '\'' +
                    ",\n titular 1 =" + t1 +
                    ",\n titular 2 =" + t2 +
                    '}';
        } else {
            return "Time{\n" +
                    "nome do time ='" + nome + '\'' +
                    ",\n titular 1 =" + t1 +
                    ",\n titular 2 =" + t2 +
                    ",\n substituto =" + sub +
                    '}';
        }

    }


}
