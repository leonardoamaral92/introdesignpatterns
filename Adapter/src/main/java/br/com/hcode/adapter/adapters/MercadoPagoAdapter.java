package br.com.hcode.adapter.adapters;

import br.com.hcode.adapter.mercadopago.MercadoPago;
import br.com.hcode.adapter.paypal.IPayPalPayments;
import br.com.hcode.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private MercadoPago mercadoPago;
    private Token token;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        token = authToken();
        mercadoPago.mercadoPagoPayment();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.mercadoPagoReceive();
    }
}
