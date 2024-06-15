public class Tank extends Jogador{
    public Tank(String nome){
        super(nome, 3000, 200, 1000);
        
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(this.nome + " Ativou Benção da Deusa!");
        this.defesa = 1500;
        this.vida = vida + defesa;
        
    }
}