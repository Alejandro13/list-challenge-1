package com.ibm.academy.patterns.comportacionales.command.exercise;

public class RunPedido {
    public static void main(String[] args) {
        /**
         * CreditCard creditCardActive = new CreditCard();
         *         CreditCard creditCardDesactive = new CreditCard();
         */
        Pedido[] pedidos = new Pedido[5];
        pedidos[0] = new Pedido(1);
        pedidos[1] = new Pedido(2);
        pedidos[2] = new Pedido(3);
        pedidos[3] = new Pedido(4);
        pedidos[4] = new Pedido(5);
        PedidoPeligroso pedidoPeligroso = new PedidoPeligroso();

        System.out.println("------------------------------------------------------------------------");
        OficinaInvoker invoker = new OficinaInvoker();
        invoker.setCommand(new TratamientoPedidoMultiple(pedidos));
        invoker.run();
        System.out.println("------------------------------------------------------------------------");
        invoker.setCommand(new TratamientoPedidoPeligroso(pedidoPeligroso));
        invoker.run();
        System.out.println("------------------------------------------------------------------------");

        /**
         * LO QUE DEBE MOSTRAR
         ------------------------------------------------------------------------
         Es un pedido con peso 1 y urgente: false
         Es un pedido con peso 2 y urgente: false
         Es un pedido con peso 3 y urgente: false
         Es un pedido con peso 4 y urgente: true
         Es un pedido con peso 5 y urgente: false
         ------------------------------------------------------------------------
         Esto es un pedido peligroso
         ------------------------------------------------------------------------
         */

    }
}
