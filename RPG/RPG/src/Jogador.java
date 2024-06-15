public abstract class Jogador {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Jogador(String nome,int vida,int ataque,int defesa){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public void atacar(Jogador alvo){
        int dano = this.ataque - alvo.defesa;
        int contraAtaque = (alvo.defesa - this.ataque) / 2;
        if (dano > 0) {
            alvo.vida -= dano;
            System.out.println(this.nome + " atacou " + alvo.nome + " causando " + dano + " de dano!");
        }else if (dano == 0) {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + " mas o ataque foi defendido!");
        }else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + " mas a defesa do " + alvo.nome + " é grande demais!" + this.nome + " recebeu " + contraAtaque + "de dano!" );
        }
    }
    public boolean estaVivo(){
        return this.vida > 0;
    }
    public abstract void habilidadeEspecial();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public void exibirInformacoes(){
        System.out.println("Nome : " + nome);
        System.out.println("Vida : " + vida);
        System.out.println("Ataque : " + ataque);
        System.out.println("Defesa : " + defesa);
    }
}
