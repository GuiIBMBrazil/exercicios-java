import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de funcionários:");
        int n = sc.nextInt();

        Funcionario[] funcionario = new Funcionario[n];
        List <Integer> id = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite os dados do %da funcionário:%n",i+1);

            String name = sc.next();
            int id_func = sc.nextInt();
            double salary = sc.nextDouble();

            if(id.contains(id_func)){
                System.out.println("ID EXISTENTE, TENTE NOVAMENTE !");
                i--;
            }
            else{
                funcionario[i] = new Funcionario(name,id_func,salary);
                id.add(id_func);
            }
        }


        System.out.println("Digite o ID e o aumento em porcentagem:");
        int id_desejado = sc.nextInt();
        double porcentagem = sc.nextDouble();

        for (int i = 0; i < funcionario.length; i++) {
            if(funcionario[i].getId() == id_desejado){
                funcionario[i].setAumentarSalary(porcentagem);
            }
        }

        for (int i = 0; i < funcionario.length; i++) {
            System.out.println(funcionario[i].toString());
        }

    }
}
