import java.util.Scanner;
public class RPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean opcaoValida = false;
        Jogador jogador = null;
        while (!opcaoValida) {
            System.out.println("\n[1] Mago\n[2] Lutador\n[3] Tank\n[4] Ceifador");
            System.out.println("Escolha uma das classes acima: ");
            int escolha = input.nextInt();
            input.nextLine();
            System.out.print("Insira o nome do seu personagem: ");
            String nome = input.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu ser um mago!");
                    jogador = new Mago(nome);
                    opcaoValida = true;
                    break;
                case 2:
                    System.out.println("Você escolheu ser um Lutador!");                  
                    jogador = new Lutador(nome);
                    opcaoValida = true;
                    break;
                case 3:
                    System.out.println("Você escolheu ser um Tank!");                   
                    jogador = new Tank(nome);
                    opcaoValida = true;
                    break;
                case 4:
                    System.out.println("Você escolheu ser um Ceifador!");       
                    jogador = new Ceifador(nome);
                    opcaoValida = true;
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente por favor.");    
            }
        }
        jogador.exibirInformacoes();
        System.out.println("Contra quem deseja lutar?\n" + 
                        "[1] Mago\n" + 
                        "[2] Lutador\n" + 
                        "[3] Tank\n" + 
                        "[4] Ceifador");
        int escolhaLuta = input.nextInt();
        input.nextLine();
        switch (escolhaLuta) {
            case 1:
                Jogador Inimigo = new Mago("Inimigo");
                while (jogador.estaVivo() && Inimigo.estaVivo()) {
                    jogador.atacar(Inimigo);
                    if (Inimigo.estaVivo()) {
                        Inimigo.atacar(jogador);
                    }
                }
            break;
            case 2:
                Jogador lutador = new Lutador("Inimigo");
                while (jogador.estaVivo() && lutador.estaVivo()) {
                    jogador.atacar(lutador);
                    if (lutador.estaVivo()) {
                        lutador.atacar(jogador);
                    }
                }
            break;
            case 3:
                Jogador tank = new Tank("Inimigo");
                while (jogador.estaVivo() && tank.estaVivo()) {
                    jogador.atacar(tank);
                    if (tank.estaVivo()) {
                        tank.atacar(jogador);
                    }
                }
            break;
            case 4:
            Jogador ceifador = new Ceifador("Inimigo");
            while (jogador.estaVivo() && ceifador.estaVivo()) {
                jogador.atacar(ceifador);
                if (ceifador.estaVivo()) {
                    ceifador.atacar(jogador);
                }
            }
            break;
            default:
                System.out.println("Opcao Invalida, escolha um inimigo disponivel! ");
                break;
        }
        if (jogador.estaVivo()) {
            System.out.println("Parabens, voce venceu a batalha!");
        }else{
            System.out.println("GAME OVER");
        }
        input.close();
    }
}
