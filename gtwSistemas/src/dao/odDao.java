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
import objects.Od;

/**
 *
 * @author Guilherme
 */
public class odDao {

    private static final Logger LOG = Logger.getLogger("");
    private static odDao instance;
    ResultSet rs = null;
    PreparedStatement stmt = null;

    public static odDao getInstance() {
        if (instance == null) {
            instance = new odDao();
        }

        return instance;
    }

    /* Prevent the TabelaPrecoDAO class from being instantiated. */
    private Connection conexao;

    public odDao() {
        conexao = ConnectionModule.conector();
    }

    public List<Od> odTable(String like) throws SQLException {

        List<Od> list = new ArrayList<>();

        String sql = "SELECT "
                + "o.id id, "
                + "o.descricao_servico servico, "
                + "o.data_ordem data_ordem,  "
                + "c.descricao cliente_desc "
                + "FROM tab_ordem_servico o "
                + "JOIN tab_cliente c ON o.id_cliente = c.id "
                + "WHERE o.ativo = 1 "
                + "AND o.descricao_servico LIKE ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + like + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Od od = new Od();
                od.setCodigo(rs.getString("id"));
                od.setData_ordem(rs.getString("data_ordem"));
                od.setDec_servico(rs.getString("servico"));
                od.setCliente(new Cliente(rs.getString("cliente_desc")));
                list.add(od);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return list;
    }

    public void excluir(String odId) throws SQLException {

        String sql = "UPDATE tab_ordem_servico "
                + "SET ativo = '0' "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, odId);
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public void salvar(Od od,String produtoId,String emitenteId,String clienteId,String userId) throws SQLException{
        
        String sql = "INSERT INTO "
                + "tab_ordem_servico "
                + "(descricao_servico,descricao_detalhada,responsavel,data_ordem,preco_servico,ativo,id_emitente,id_usuario,id_cliente,id_produto) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?) ";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, od.getDec_servico());
            stmt.setString(2, od.getDesc_detalhada());
            stmt.setString(3, od.getResponsavel());
            stmt.setString(4, od.getData_ordem());
            stmt.setString(5, od.getPreco_servico());
            stmt.setString(6, od.getAtivo());
            stmt.setString(7, emitenteId);
            stmt.setString(8, userId);
            stmt.setString(9, clienteId);
            stmt.setString(10, produtoId);
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

}
