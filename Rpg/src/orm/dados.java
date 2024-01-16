package orm;

public class dados {
     public  static class personagem{
        private String nome;
        private String sexo;
        private int vida;
        private int dano;

        public personagem(String nome, String sexo, int vida, int dano){
            this.nome = nome;
            this.sexo = sexo;
            this.vida = vida;
            this.dano = dano;
        }

         public void receberDano(int quantidade){
             vida -= quantidade;
             System.out.println(nome + " recebe " + quantidade + " de dano. Vida restante: " + vida );
         }

        public void atacar(mostro inimigo) {
            System.out.println(nome + " ataca " + inimigo.getNome() + " causando " + dano + " de dano.");
            inimigo.receberDano(dano);
        }

        public String getNome(){
            return nome;
        }

         public int getVida(){
             return vida;
         }
    }

    public static class mostro{
         private String nome;
         private int vida;
         private int dano;

         public mostro(String nome, int vida, int dano){
             this.nome = nome;
             this.vida = vida;
             this.dano = dano;
         }

         public void atacar(personagem inimigo){
             System.out.println(nome + " ataca " + inimigo.getNome() + " causando " + dano + " de dano.");
             inimigo.receberDano(dano);
         }

         public void receberDano(int quantidade){
             vida -= quantidade;
             System.out.println(nome + " recebe " + quantidade + " de dano. Vida restante: " + vida );
         }

         public String getNome(){
             return nome;
         }

         public int getVida(){
             return vida;
         }

    }

}
