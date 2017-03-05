package Classes;

public class Pizza {
    private String sabor;
    private String tamanho;
    private float preco;

    // construtor
    public Pizza(String sabor, String tamanho, float preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
