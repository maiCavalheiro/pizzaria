package Classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    // um pedido tem vários itens, um item é composto por uma pizza, uma bebida e o preço deles somado
    private List<Item> itens;
    // um pedido tem um preço total
    private Double preco;
    
    // construtor
    public Pedido() {
        this.itens = new ArrayList<Item>();    
        this.preco = 0.0;
    }
    
    public void addItem(String title, Double preco){
        // nova instância de item
        Item it = new Item();    
        
        // populando item
        it.title = title;
        it.preco = preco;
        
        // aumentanto valor total do pedido
        this.setPreco((Double) (this.getPreco() + preco));
        
        // adicionando novo item ao array de itens
        this.getItens().add(it);
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
    
 
}
