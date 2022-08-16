import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List < Integer > numeros = new ArrayList<>();
        List <String> nomes = new ArrayList<>();

        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(8);


//O comando abaixo cria uma lista formada com todos os números pares da lista numeros.
//Convertendo uma lista para stream, depois realizando a operação Lambda e depois converte para Lista.
        List <Integer> pares = numeros.stream().filter(p -> p%2 == 0).collect(Collectors.toList());

        System.out.println("LISTA");
        for (int valores:numeros) {
            System.out.println(valores);
        }
        System.out.println("---------------------");

        System.out.println("PRIMEIRO PAR");
        int primeiro_par = numeros.stream().filter(x->x%2 == 0).findFirst().orElse(null);
        System.out.println(primeiro_par);

        System.out.println("---------------------");

        System.out.println("PARES");
        for (int par:pares) {
            System.out.println(par);
        }
        System.out.println("---------------------");
        int primeiro_maior_cem = numeros.stream().filter(x->x>100).findFirst().orElse(0);
        System.out.println(primeiro_maior_cem);


/*
        System.out.println("Digite três nomes:");
        for (int i = 0; i < 3; i++) {
            String nome = sc.next();
            nomes.add(nome);
        }
        System.out.println("------------------------------");
        for (String names:nomes) {
            System.out.println(names);
        }
        System.out.println("------------------------------");

        nomes.removeIf(s -> s.charAt(0) == 'B');

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        for (String names:nomes) {
            System.out.println(names);
        }
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        for (String names:nomes) {
            System.out.printf("POSIC: %d, NOME: %s%n",nomes.indexOf(names),names);
        }
        */

/*
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(8);

        for (int valores:numeros) {
            System.out.println(valores);
        }
        System.out.println("---------------------------------------");
        System.out.println("TAMANHO ATUAL:" + numeros.size());
        System.out.println("---------------------------------------");

        numeros.remove(4); //Remove o número que se encontra no index 4.
        numeros.removeIf(x -> x%2 == 0); //Remove todos os pares


        for (int valores:numeros) {
            System.out.println(valores);
        }


*/
    }
}
