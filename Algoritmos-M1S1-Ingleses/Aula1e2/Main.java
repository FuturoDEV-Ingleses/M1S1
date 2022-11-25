package M1S1.Aula12;

public class Main {
    public static void main(String[] args) {

        //Códigos da minha primeira aula

        /*System.out.println("Meu primeiro código Java");
        System.out.print("Meu nome é: ");
        System.out.print("Otto\nHannemann");*/

        //System.out.println("Meu primeiro código Java\nMeu nome é: Otto Hannemann");

        //System.out.print("Otto Hannemann\n30 anos\nSão José - SC");

        //Variaveis
        /*String nomeCompleto = "Otto Rodrigo Hannemann";
        int idade = 50;
        String cidade = "São José";
        String UF = "SC";

        //idade = 30;

        System.out.print("Meu nome é "+nomeCompleto+" tenho "+idade+" anos " +
                "moro em " + cidade + " - " + UF);*/

        /*System.out.println(7+22);
        System.out.println(21-1);
        System.out.println((7+6+5+9)/4);
        System.out.print(((7+6+5+9)/4)*2);*/

    /*int meuNumero = 18;
    boolean resposta = false;
    String nome = "Pedro";

        if(meuNumero != 15){
        System.out.println("É igual");
    }*/


        /*if(resposta){
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");
        }

        if(nome == "João"){
            System.out.println("Sou João");
        }
        else{
            System.out.println("Não sou João");
        }*/

        int numero = 11;
        char resposta = 'S';

        if(numero < 12){
            System.out.println(numero*1);
            System.out.println(numero*2);
            System.out.println(numero*3);
            System.out.println(numero*4);
            System.out.println(numero*5);
            System.out.println(numero*6);
            System.out.println(numero*7);
            System.out.println(numero*8);
            System.out.println(numero*9);
            System.out.println(numero*10);
        }
        else if(numero > 12 && resposta == 'S'){
            System.out.println(numero*2);
        }
        else if(numero > 12 && resposta=='N'){
            System.out.println(numero+15);
        } else {
            System.out.println("é uma duzia");
        }


    }
}