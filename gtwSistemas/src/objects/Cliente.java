package objects;

/**
 *
 * @author Guilherme
 */
public class Cliente {

    String codigo;
    String descricao;
    String endereco;
    String cidade;
    String contato;
    String nascimentop;
    String data_entrada;
    String cpf;
    String cnpj;
    String rg;
    String celular;
    String telefone;
    String complemento;
    String municipio;
    String pais;
    String uf;
    String bairro;
    String orgaoEmissor;
    String fantatasia;
    String wpp;
    String limiteCredito;
    String facebook;
    String email;
    String observacao;

    String ativo;

    public Cliente(String descricao) {
        this.descricao = descricao;
    }

    public Cliente(String descricao, String endereco, String cidade, String contato, String nascimentop, String data_entrada, String cpf, String cnpj, String rg, String celular, String telefone, String pais, String uf, String bairro, String fantatasia, String wpp, String limiteCredito, String facebook, String email, String observacao) {
        this.descricao = descricao;
        this.endereco = endereco;
        this.cidade = cidade;
        this.contato = contato;
        this.nascimentop = nascimentop;
        this.data_entrada = data_entrada;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.rg = rg;
        this.celular = celular;
        this.telefone = telefone;
        this.pais = pais;
        this.uf = uf;
        this.bairro = bairro;
        this.fantatasia = fantatasia;
        this.wpp = wpp;
        this.limiteCredito = limiteCredito;
        this.facebook = facebook;
        this.email = email;
        this.observacao = observacao;
    }

    public Cliente() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNascimentop() {
        return nascimentop;
    }

    public void setNascimentop(String nascimentop) {
        this.nascimentop = nascimentop;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getFantatasia() {
        return fantatasia;
    }

    public void setFantatasia(String fantatasia) {
        this.fantatasia = fantatasia;
    }

    public String getWpp() {
        return wpp;
    }

    public void setWpp(String wpp) {
        this.wpp = wpp;
    }

    public String getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(String limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
