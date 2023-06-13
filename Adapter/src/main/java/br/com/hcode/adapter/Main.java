package br.com.hcode.adapter;

import br.com.hcode.adapter.adapters.MercadoPagoAdapter;
import br.com.hcode.adapter.adapters.PayoneerAdapter;
import br.com.hcode.adapter.mercadopago.MercadoPago;
import br.com.hcode.adapter.payoneer.Payoneer;
import br.com.hcode.adapter.paypal.IPayPalPayments;

public class Main {
    public static void main(String[] args) {

        //Essa é nossa estrutura base com paypal. Se quisermos mudar o objeto para Payonner, vai quebrar. (Fere o princípio de Liskov do SOLID)
//        IPayPalPayments payment = new PayPal();
//        payment.paypalPayment();
//        payment.paypalReceive();

        //Nesse ponto que vamos usar o Adapter, para evitar modificar os métodos do paypal que já funcionam.
        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());
        payment.paypalPayment();
        payment.paypalReceive();

        //Agora vamos usar novamente um adapter para o Mercado Pago e respeitar o código previamente implementado com PayPal
        IPayPalPayments paymentMP = new MercadoPagoAdapter(new MercadoPago());
        paymentMP.paypalPayment();
        paymentMP.paypalReceive();

    }
}