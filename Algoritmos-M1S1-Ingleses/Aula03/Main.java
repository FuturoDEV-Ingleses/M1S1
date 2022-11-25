package M1S1.Aula03;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 3){
            System.out.print("[0] Oi\n[2] Tudo bem\n[3] Sair ");

            System.out.print("\nDigite sua opção: ");
            opcao = ler.nextInt();

            if(opcao == 1)
                System.out.println("Oi");
            else if (opcao == 2)
                System.out.println("Tudo bem");
            else if ( opcao == 3)
                System.out.println("Sair...");
            else
                System.out.println("Código Inválido!");

        }









        //-------------------------- FOR

        //int num;

        //System.out.print("Digite um número: ");
        //num = ler.nextInt();
        //ler.close();
        /*for(int x = 0; x < 10; x++){
            System.out.println(x);
        }*/

        //Exemplo 1
        /*for(int x =0; x < 5; x++){
            System.out.print((num+(x+1)));
        }*/


        //notas = 0 | 10 | 18 | 24 | 32
        //x = 0 | 1 | 2 | 3 | 4

        /*int notas = 0;
        //Exemplo 2
        for(int x = 0; x < 4; x++){
            System.out.print("Digite a " +(x+1) + "º nota: ");
            notas += ler.nextInt();
        }
        System.out.print("Média: " + notas/4);*/













        // Perguntar ao usuario Nome, Sobrenome, Idade, Bairro, Cidade e Estado
        // Exibir os dados como uma apresentação
        /* Desabilitado */

        // Exemplo código anterior
        // Variáveis
        /*Scanner ler = new Scanner(System.in); //Habilita entrada de dados
        String nome, sobrenome, bairro, cidade, estado;
        int idade;


        // Entrada de dados
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("\nDigite seu sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.print("\nDigite sua idade: ");
        idade = ler.nextInt();
        ler.nextLine(); // Limpar o ler
        System.out.print("\nDigite seu bairro: ");
        bairro = ler.nextLine();
        System.out.print("\nDigite sua cidade: ");
        cidade = ler.nextLine();
        System.out.print("\nDigite seu estado: ");
        estado = ler.nextLine();


        System.out.println("\nMeu nome é " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos, ");
        System.out.println("moro em " + bairro + " - " + cidade + " - " + estado + ".");*/

    }

}
