package com.ibm.academy.patterns.comportacionales.command.exercise;

public class TratamientoPedidoMultiple implements TratamientoPedido{
    private Pedido[] pedidos;

    public TratamientoPedidoMultiple(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public void tratar() {
        for(Pedido p : this.pedidos){
            System.out.println("Es un pedido con peso " + p.getPeso() + " y urgente: "+ p.isUrgent());
        }

    }
}
