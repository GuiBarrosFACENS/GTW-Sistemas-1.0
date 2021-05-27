package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objects.Cliente;

/**
 *
 * @author Guilherme
 */
public class clienteDao {

    private static final Logger LOG = Logger.getLogger("");
    private static clienteDao instance;
    ResultSet rs = null;
    PreparedStatement stmt = null;

    public static clienteDao getInstance() {
        if (instance == null) {
            instance = new clienteDao();
        }

        return instance;
    }

    /* Prevent the TabelaPrecoDAO class from being instantiated. */
    private Connection conexao;

    public clienteDao() {
        conexao = ConnectionModule.conector();
    }

    public List<Cliente> clienteTable(String like) throws SQLException {

        List<Cliente> list = new ArrayList<>();

        String sql = "SELECT "
                + "id , "
                + "descricao , "
                + "contato , "
                + "data_entrada "
                + "FROM tab_cliente "
                + "WHERE ativo = 1 "
                + "and descricao LIKE ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + like + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCodigo(rs.getString("id"));
                c.setDescricao(rs.getString("descricao"));
                c.setContato(rs.getString("contato"));
                c.setData_entrada(rs.getString("data_entrada"));
                list.add(c);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return list;
    }
    
    public List<Cliente> clienteTable2() throws SQLException {

        List<Cliente> list = new ArrayList<>();

        String sql = "SELECT "
                + "id , "
                + "descricao , "
                + "contato , "
                + "data_entrada "
                + "FROM tab_cliente "
                + "WHERE ativo = 1 ";

        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCodigo(rs.getString("id"));
                c.setDescricao(rs.getString("descricao"));
                c.setContato(rs.getString("contato"));
                c.setData_entrada(rs.getString("data_entrada"));
                list.add(c);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return list;
    }

    public void excluir(String userId) throws SQLException {

        String sql = "UPDATE tab_cliente "
                + "SET ativo = '0' "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, userId);
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public void Save(Cliente cliente, String ativoId) throws SQLException {

        String sql = "INSERT INTO "
                + "tab_cliente "
                + "(descricao, "
                + "endereco, "
                + "cidade, "
                + "contato, "
                + "nascimento, "
                + "data_entrada, "
                + "cpf, "
                + "cnpj, "
                + "rg, "
                + "celular, "
                + "telefone, "
                + "pais, "
                + "uf, "
                + "bairro, "
                + "fantasia, "
                + "wpp, "
                + "limiteCredito, "
                + "facebook, "
                + "email, "
                + "observacao, "
                + "ativo) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getDescricao());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCidade());
            stmt.setString(4, cliente.getContato());
            stmt.setString(5, cliente.getNascimentop());
            stmt.setString(6, cliente.getData_entrada());
            stmt.setString(7, cliente.getCpf());
            stmt.setString(8, cliente.getCnpj());
            stmt.setString(9, cliente.getRg());
            stmt.setString(10, cliente.getCelular());
            stmt.setString(11, cliente.getTelefone());
            stmt.setString(12, cliente.getPais());
            stmt.setString(13, cliente.getUf());
            stmt.setString(14, cliente.getBairro());
            stmt.setString(15, cliente.getFantatasia());
            stmt.setString(16, cliente.getWpp());
            stmt.setString(17, cliente.getLimiteCredito());
            stmt.setString(18, cliente.getFacebook());
            stmt.setString(19, cliente.getEmail());
            stmt.setString(20, cliente.getObservacao());
            stmt.setString(21, ativoId);
            stmt.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
    }

    public Cliente editarSelect(String clienteId) throws SQLException {

        Cliente cliente = new Cliente();

        String sql = "SELECT "
                + " id,"
                + "descricao, "
                + "endereco, "
                + "cidade, "
                + "contato, "
                + "nascimento, "
                + "data_entrada, "
                + "cpf, "
                + "cnpj, "
                + "rg, "
                + "celular, "
                + "telefone, "
                + "pais, "
                + "uf, "
                + "bairro, "
                + "fantasia, "
                + "wpp, "
                + "limiteCredito, "
                + "facebook, "
                + "email, "
                + "observacao, "
                + "ativo  "
                + "FROM tab_cliente "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clienteId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                cliente.setCodigo(rs.getString("id"));
                cliente.setDescricao(rs.getString("descricao"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setContato(rs.getString("contato"));
                cliente.setNascimentop(rs.getString("nascimento"));
                cliente.setData_entrada(rs.getString("data_entrada"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCnpj(rs.getString("cnpj"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setPais(rs.getString("pais"));
                cliente.setUf(rs.getString("uf"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setFantatasia(rs.getString("fantasia"));
                cliente.setWpp(rs.getString("wpp"));
                cliente.setLimiteCredito(rs.getString("limiteCredito"));
                cliente.setFacebook(rs.getString("facebook"));
                cliente.setEmail(rs.getString("email"));
                cliente.setObservacao(rs.getString("observacao"));
                cliente.setAtivo(rs.getString("ativo"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return cliente;
    }

    public void editar(Cliente cliente, String id, String ativo) throws SQLException {

        String sql = "UPDATE tab_cliente "
                + "SET descricao = ?, endereco = ?, cidade = ? , contato = ? , nascimento = ?, data_entrada = ?, cpf = ?, cnpj = ? , rg = ?, "
                + "celular = ?, telefone = ?, pais = ?, uf = ?, bairro = ?, fantasia = ?, wpp = ?, limiteCredito = ?, facebook = ?, "
                + "email = ?, observacao = ?, ativo = ? "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, cliente.getDescricao());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCidade());
            stmt.setString(4, cliente.getContato());
            stmt.setString(5, cliente.getNascimentop());
            stmt.setString(6, cliente.getData_entrada());
            stmt.setString(7, cliente.getCpf());
            stmt.setString(8, cliente.getCnpj());
            stmt.setString(9, cliente.getRg());
            stmt.setString(10, cliente.getCelular());
            stmt.setString(11, cliente.getTelefone());
            stmt.setString(12, cliente.getPais());
            stmt.setString(13, cliente.getUf());
            stmt.setString(14, cliente.getBairro());
            stmt.setString(15, cliente.getFantatasia());
            stmt.setString(16, cliente.getWpp());
            stmt.setString(17, cliente.getLimiteCredito());
            stmt.setString(18, cliente.getFacebook());
            stmt.setString(19, cliente.getEmail());
            stmt.setString(20, cliente.getObservacao());
            
            stmt.setString(21, ativo);
            stmt.setString(22, id);

            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }
    
    public String odCliente(String desc) throws SQLException {

        String sql = "SELECT "
                + "id "
                + "FROM tab_cliente "
                + "WHERE descricao = ? ";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, desc);
            rs = stmt.executeQuery();

            if (rs.next()) {
                String run = rs.getString("id");
                return run;
            } else {
                return "1";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

}
