package entitiees;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
   private Date moment;
   private OrderStatus status;
   List<OrderItem>pedido = new ArrayList<>();

    public Order() {}

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        pedido.add(item);
    }
    public void removeItem(OrderItem item){
        pedido.remove(item);
    }
    public double Total(){
        double valor = 0;
        for (OrderItem ordem:pedido) {
            valor += ordem.subTotal();
        }
        return valor;
    }

    public List<OrderItem> getPedido() {
        return pedido;
    }
}
