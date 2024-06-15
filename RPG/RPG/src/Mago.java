public class Mago extends Jogador{
    int Mana;
    public Mago(String nome){
        super(nome, 800, 1400, 300);
        this.Mana = 800;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(this.nome + " Concentrou o resto de sua Mana!");
        this.ataque = (ataque * Mana) / 80;
    }
}
