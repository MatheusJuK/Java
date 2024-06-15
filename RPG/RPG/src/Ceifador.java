public class Ceifador extends Jogador{
    public Ceifador(String nome){
        super(nome, 1000, 1000, 500);
        
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(this.nome + " Sacrificou metade de sua vida por poder!");
        this.vida = vida / 2;
        this.ataque = ataque * 3;
    }
}
