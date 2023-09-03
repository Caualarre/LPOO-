package controller;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Produto;
public class ProdutoController {
    public static void main(String[] args) {


        Produto produto1 = new Produto();
        Produto produto2 = new Produto(2, "Feijão", "carioca", 10.50, 1300);


        System.out.println("Produtos");
        System.out.println(produto1);
        System.out.println(produto2);


        produto1.setId(1);
        produto1.setNome("Nutella");
        produto1.setValor(13.30);
        produto1.setEstoque(3000);
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getEstoque());

        produto2.setNome("Macarrão");
        produto2.setValor(5.30);
        produto2.setEstoque(90000);
        System.out.println(produto2.getId());
        System.out.println(produto2.getNome());
        System.out.println(produto2.getEstoque());


        Produto produto3 = new Produto(3, "Batata", "branca",2.00, 4000);
        Produto produto4 = new Produto(3, "Batata", "branca", 2.00, 4000);
        Produto produto5 = new Produto(4, "Banana", "prata", 2.50, 1000);

        List<Produto> produtosList = new ArrayList<>();
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);
        produtosList.add(produto4);
        produtosList.add(produto5);
        System.out.println("List" + produtosList);

        System.out.println();
        Produto ProdutoFind = produtosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(ProdutoFind);

        System.out.println();
        produtosList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtosList);

        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);
        System.out.println(" Map" + produtosMap);

        System.out.println();
        System.out.println(produtosMap.get(3));

    }
}
