package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteController {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor(1234, "jose.fino@email", "josefino");
        Produto produto1 = new Produto(12, "Arroz", 200, 50);
        Fornecimento fornecimento1 = new Fornecimento(new Date(), 1000, fornecedor1, produto1);
        Fornecedor fornecedor2 = new Fornecedor(4321, "algo,alguma@mail", "finojose");
        Produto produto2 = new Produto(15, "Batata", 25, 12);
        Produto produto3 = new Produto(16, "Cenoura",30, 30);
        Fornecimento fornecimento2 = new Fornecimento(new Date(), 1350, fornecedor2, produto2);
        Fornecimento fornecimento3 = new Fornecimento(new Date(), 1500, fornecedor2, produto3);
        Item item2 = new Item(11, 0, 150, produto1);
        Item item3 = new Item(10, 0, 17, produto3);
        Item item1 = new Item(13, 0, 15, produto1);
        Item item4 = new Item(12, 0, 10, produto2);
        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fornecimento1);
        fornecimentoList.add(fornecimento2);
        fornecimentoList.add(fornecimento3);

        double custoTotalF = 0;
        System.out.println("\nDados de Fornecimento");
        for (Fornecimento fornecimento : fornecimentoList) {
            double valorTotalF = fornecimento.getValorTotal();
            custoTotalF += valorTotalF;
        }
        System.out.println(fornecimentoList);
        System.out.println("\nCusto Total dos Fornecimentos: " + custoTotalF);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item3);
        itemList.add(item4);

        List<Item> itens = new ArrayList<>();
        itens.add(item3);
        itens.add(item2);
        itens.add(item4);

        Vendedor vendedor1 = new Vendedor(9191, "Paula", "ruadasflores", "bairrolongo", "12c45v", "alguma", "sam", "flor");

        Date dataVenda = new Date();
        double totalPedido1 = 0;
        double totalPedido2 = 0;

        for (Item item : itens) {
            if (item.getProduto() == produto1) {
                try {
                    if (produto1.getQuantidade() < item.getQuantidade()) {
                        throw new EstoqueInsuficienteEXC("Erro, estoque insuficiente para o item de cod" + item.getCodItem());
                    }
                    totalPedido1 += item.getQuantidade() * produto1.getPreco();
                    produto1.setQuantidade(produto1.getQuantidade() - item.getQuantidade());
                } catch (EstoqueInsuficienteEXC e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        for (Item item : itens) {
            if (item.getProduto() == produto2) {
                try {
                    if (produto2.getQuantidade() < item.getQuantidade()) {
                        throw new EstoqueInsuficienteEXC("Erro, estoque insuficiente para o item de cod " + item.getCodItem());
                    }
                    totalPedido1 += item.getQuantidade() * produto2.getPreco();
                    produto2.setQuantidade(produto2.getQuantidade() - item.getQuantidade());
                } catch (EstoqueInsuficienteEXC e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        for (Item item : itens) {
            if (item.getProduto() == produto3) {
                try {
                    if (produto3.getQuantidade() < item.getQuantidade()) {
                        throw new EstoqueInsuficienteEXC("Erro, estoque insuficiente para o item de cod" + item.getCodItem());
                    }
                    totalPedido1 += item.getQuantidade() * produto3.getPreco();
                    produto3.setQuantidade(produto3.getQuantidade() - item.getQuantidade());
                } catch (EstoqueInsuficienteEXC e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        for (Item item : itemList) {
            if (item.getProduto() == produto1) {
                try {
                    if (produto1.getQuantidade() < item.getQuantidade()) {
                        throw new EstoqueInsuficienteEXC("Erro, estoque insuficiente para o item de cod" + item.getCodItem());
                    }
                    totalPedido2 += item.getQuantidade() * produto1.getPreco();
                    produto1.setQuantidade(produto1.getQuantidade() - item.getQuantidade());
                } catch (EstoqueInsuficienteEXC e) {
                    System.err.println(e.getMessage());
                }
            }
        }

        for (Item item : itemList) {
            if (item.getProduto() == produto2) {
                try {
                    if (produto2.getQuantidade() < item.getQuantidade()) {
                        throw new EstoqueInsuficienteEXC("Erro, estoque insuficiente para o item de cod " + item.getCodItem());
                    }
                    totalPedido2 += item.getQuantidade() * produto2.getPreco();
                    produto2.setQuantidade(produto2.getQuantidade() - item.getQuantidade());
                } catch (EstoqueInsuficienteEXC e) {
                    System.err.println(e.getMessage());
                }
            }
        }

        for (Item item : itemList) {
            if (item.getProduto() == produto3) {
                try {
                    if (produto3.getQuantidade() < item.getQuantidade()) {
                        throw new EstoqueInsuficienteEXC("Erro, estoque insuficiente para o item de cod " + item.getCodItem());
                    }
                    totalPedido2 += item.getQuantidade() * produto3.getPreco();
                    produto3.setQuantidade(produto3.getQuantidade() - item.getQuantidade());
                } catch (EstoqueInsuficienteEXC e) {
                    System.err.println(e.getMessage());
                }
            }
        }



        Pedido pedido1 = new Pedido(1, dataVenda, totalPedido1, Tipo.ATENDIDO, itens, vendedor1);
        Pedido pedido2 = new Pedido(2, dataVenda, totalPedido2, Tipo.PENDENTE, itemList, vendedor1);

        System.out.println("Relatório de Vendas:");
        System.out.println(pedido1);
        System.out.println(pedido2);


        System.out.println("Estoque de Produtos com as vendas, sem considerar as vendas não finalizadas por falta de estoque:");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
    }
}
