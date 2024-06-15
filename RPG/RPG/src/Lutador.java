public class Lutador extends Jogador{
    public Lutador(String nome){
        super(nome, 1000, 700, 800);
        
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(this.nome + " Avançou com tudo para cima do inimigo!");
        this.ataque = 1400;
    }
}
