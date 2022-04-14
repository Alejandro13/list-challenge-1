package com.ibm.academy.patterns.comportacionales.command.exercise;

public class TratamientoPedidoPeligroso implements TratamientoPedido{
    private PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        this.pedido = pedido;
    }

    @Override
    public void tratar() {
        System.out.println("Esto es un pedido peligroso");
    }
}
