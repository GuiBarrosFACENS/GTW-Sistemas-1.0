package objects;

/**
 *
 * @author Guilherme
 */
public class Product {

    String codigo;
    String descricao;
    String preco_compra;
    String preco_Venda;
    String estoque;
    String categoria;
    String ativo;

    public Product() {
    }

    public Product(String descricao, String preco_compra, String preco_Venda, String estoque, String categoria, String ativo) {
        this.descricao = descricao;
        this.preco_compra = preco_compra;
        this.preco_Venda = preco_Venda;
        this.estoque = estoque;
        this.categoria = categoria;
        this.ativo = ativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(String preco_compra) {
        this.preco_compra = preco_compra;
    }

    public String getPreco_Venda() {
        return preco_Venda;
    }

    public void setPreco_Venda(String preco_Venda) {
        this.preco_Venda = preco_Venda;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}
