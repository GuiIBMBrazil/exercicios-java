import entitiees.Client;
import entitiees.Order;
import entitiees.OrderItem;
import entitiees.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Order o1 = new Order();

        System.out.println("Entre com os dados do cliente:");
        String nome = sc.nextLine();
        String email = sc.next();
        Date nascimento = sdf.parse(sc.next());

        Client client = new Client(nascimento,nome,email);

        System.out.println("Entre com o status da ordem:");
        String status = sc.next();

        System.out.println("Quantos items vão existir nessa ordem?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do " + (i+1) + " item :");
            sc.nextLine();
            String name_p = sc.nextLine();
            double price_p = sc.nextDouble();
            int quantity = sc.nextInt();

            Product product = new Product(name_p,price_p);
            OrderItem orderItem = new OrderItem(quantity,product);

            o1.addItem(orderItem);
        }
        o1.setStatus(OrderStatus.valueOf(status));
        o1.setMoment(new Date());

        System.out.println("MOMENTO DA ORDEM:" + o1.getMoment());
        System.out.println("STATUS DA ORDEM: " + o1.getStatus());
        System.out.println("CLIENT:" + client.getName() +  " " + client.getBirthDate() + "-" + client.getEmail());
        System.out.println("Order items:");
        for (OrderItem oi:o1.getPedido()) {
            System.out.println("Nome: " + oi.getProduct().getName() + " Quantidade:" + oi.getQuantity() + " TOTAL:" + oi.subTotal());
        }
    }
}
