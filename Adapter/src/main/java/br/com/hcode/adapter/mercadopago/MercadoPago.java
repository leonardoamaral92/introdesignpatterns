package br.com.hcode.adapter.mercadopago;

public class MercadoPago implements IMercadoPagoPayments {
    @Override
    public void mercadoPagoReceive() {
        System.out.println("Recebendo um pagamento via Mercado Pago");
    }

    @Override
    public void mercadoPagoPayment() {
        System.out.println("Realizando um pagamento via Mercado Pago");
    }
}
