package M1S1.Aula04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        String nome = "";
        String[] produto = {"Mouse", "Teclado", "Fone"};
        double[] valor = {15.00, 25.00, 50.00};

        do {
            System.out.print("Informe o nome do Cliente: ");
            nome = ler.nextLine();
        }while(nome.isBlank());


        System.out.println("Informe o nome do Produto]\n[1] Mouse\n[2] Teclado\n[3] Fone");
        System.out.print("Informe sua opção: ");
        opcao = ler.nextInt();

        System.out.print(nome + " comprou um " + produto[opcao-1] + " de valor R$" + valor[opcao-1]);






















        //[1] Adicionar Nome [2] Adicionar Idade [3] Adicionar Cidade e Estado
        //[4] Adicionar Profissão [5] Adicionar Hobbies [6] Sair
        //Se o número não existir no menu = opção invalida
        //Se a opção [6] for acinonada e não for informado o nome e idade não deixar finalizar. [.isBlank()]
        /*Scanner ler = new Scanner(System.in);
        int opcao, idade = 0;
        String nome = "", cidade, estado, profissao, hobbies;

        do{
            System.out.print("[1] Adicionar Nome\n[2] Adicionar Idade\n[3] Adicionar Cidade e Estado");
            System.out.print("\n[4] Adicionar Profissão\n[5] Adicionar Hobbies\n[6] Sair");
            System.out.print("\n\nDigite sua opção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite seu nome: ");
                    //ler.nextLine();
                    nome = ler.nextLine();
                    break;
                case 2:
                    System.out.print("Digite sua idade: ");
                    idade = ler.nextInt();
                    break;
                case 3:
                    System.out.print("Digite sua cidade: ");
                    cidade = ler.nextLine();
                    System.out.print("Digite seu estado: ");
                    estado = ler.nextLine();
                    break;
                case 4:
                    System.out.print("Digite sua profissão: ");
                    profissao = ler.nextLine();
                    break;
                case 5:
                    System.out.print("Digite seu hobbie: ");
                    hobbies = ler.nextLine();
                    break;
                case 6:
                    if(nome.isBlank() || idade == 0){
                        opcao = 0;
                        System.out.println("É obrigatório informar o nome e a idade!");
                    }
                    else{
                        System.out.println("Saindo...");
                    }
                    break;
                default:
                    System.out.println("Opção inválida?");
            }*/

            /*if(opcao == 1){
                System.out.print("Digite seu nome: ");
                ler.nextLine();
                nome = ler.nextLine();
            } else if (opcao == 2) {
                System.out.print("Digite sua idade: ");
                idade = ler.nextInt();
            } else if (opcao == 3) {
                System.out.print("Digite sua cidade: ");
                cidade = ler.nextLine();
                System.out.print("Digite seu estado: ");
                estado = ler.nextLine();
            } else if (opcao == 4) {
                System.out.print("Digite sua profissão: ");
                profissao = ler.nextLine();
            }
            else if (opcao == 5) {
                System.out.print("Digite seu hobbie: ");
                hobbies = ler.nextLine();
            } else if (opcao == 6) {
                if(nome.isBlank() || idade == 0){
                    opcao = 0;
                    System.out.println("É obrigatório informar o nome e a idade!");
                }
                else{
                    System.out.println("Saindo...");
                }
            } else{
                System.out.println("Opção inválida?");
            }*/
        /*}while(opcao != 6);

        System.out.print("Exibir saida de dados!!!");*/

    }

}
