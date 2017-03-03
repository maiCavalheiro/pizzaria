/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author igor
 */
public class Pedidos {
    
    private String saborPizza;
    private String bebida;
    private String tamanhoPizza;
    private float preco;
    private String entregar;

    public String getEntregar() {
        return entregar;
    }

    public void setEntregar(String entregar) {
        this.entregar = entregar;
    }

    public float getPreco() {
        return preco;
    }

    public float setPreco(float preco) {
        this.preco = preco;
        return this.preco;
    }

    public String getTamanhoPizza() {
        return tamanhoPizza;
    }

    public void setTamanhoPizza(String tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }

    public String getSaborPizza() {
        return saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
 
}
