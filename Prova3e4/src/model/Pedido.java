package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date date;
    private double valor;
    Tipo tipo;

    public boolean manterPedido(int numero) {
        return true;
    }

    public boolean manterItem(int codItem) {
        return true;
    }
    List<Item> itemlist = new ArrayList<>();

    Vendedor vendedor;

    public Pedido() {
    }

    public Pedido(int numero, Date date, double valor, Tipo tipo, List<Item> itemlist, Vendedor vendedor) {
        this.numero = numero;
        this.date = date;
        this.valor = valor;
        this.tipo = tipo;
        this.itemlist = itemlist;
        this.vendedor = vendedor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Item> getItemlist() {
        return itemlist;
    }

    public void setItemlist(List<Item> itemlist) {
        this.itemlist = itemlist;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", date=" + date +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", itemlist=" + itemlist +
                ", vendedor=" + vendedor +
                '}';
    }
}
