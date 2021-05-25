package objects;

/**
 *
 * @author Guilherme
 */
public class Od {

    String codigo;
    String dec_servico;
    String desc_detalhada;
    String responsavel;
    String data_ordem;
    String preco_servico;
    String ativo;

    Product product;
    Cliente cliente;
    User user;

    public Od(String dec_servico, String desc_detalhada, String responsavel, String data_ordem, String preco_servico, String ativo) {
        this.dec_servico = dec_servico;
        this.desc_detalhada = desc_detalhada;
        this.responsavel = responsavel;
        this.data_ordem = data_ordem;
        this.preco_servico = preco_servico;
        this.ativo = ativo;
    }

    public Od() {
    }

    public String getPreco_servico() {
        return preco_servico;
    }

    public void setPreco_servico(String preco_servico) {
        this.preco_servico = preco_servico;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDec_servico() {
        return dec_servico;
    }

    public void setDec_servico(String dec_servico) {
        this.dec_servico = dec_servico;
    }

    public String getDesc_detalhada() {
        return desc_detalhada;
    }

    public void setDesc_detalhada(String desc_detalhada) {
        this.desc_detalhada = desc_detalhada;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getData_ordem() {
        return data_ordem;
    }

    public void setData_ordem(String data_ordem) {
        this.data_ordem = data_ordem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
