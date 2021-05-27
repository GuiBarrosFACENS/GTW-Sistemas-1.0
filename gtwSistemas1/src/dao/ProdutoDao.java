package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objects.Product;

/**
 *
 * @author Guilherme
 */
public class ProdutoDao {

    private static final Logger LOG = Logger.getLogger("");
    private static ProdutoDao instance;
    ResultSet rs = null;
    PreparedStatement stmt = null;

    public static ProdutoDao getInstance() {
        if (instance == null) {
            instance = new ProdutoDao();
        }

        return instance;
    }

    /* Prevent the TabelaPrecoDAO class from being instantiated. */
    private Connection conexao;

    public ProdutoDao() {
        conexao = ConnectionModule.conector();
    }

    public List<Product> produtoTable(String like) throws SQLException {

        List<Product> list = new ArrayList<>();

        String sql = "SELECT "
                + "id , "
                + "descricao , "
                + "preco_Venda , "
                + "categoria "
                + "FROM tab_produto "
                + "WHERE ativo = 1 "
                + "and descricao LIKE ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + like + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Product p = new Product();
                p.setCodigo(rs.getString("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco_Venda(rs.getString("preco_Venda"));
                p.setCategoria(rs.getString("categoria"));
                list.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return list;
    }
    
    public List<Product> produtoTable2() throws SQLException {

        List<Product> list = new ArrayList<>();

        String sql = "SELECT "
                + "id , "
                + "descricao , "
                + "preco_Venda , "
                + "categoria "
                + "FROM tab_produto "
                + "WHERE ativo = 1 ";

        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Product p = new Product();
                p.setCodigo(rs.getString("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco_Venda(rs.getString("preco_Venda"));
                p.setCategoria(rs.getString("categoria"));
                list.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return list;
    }
    
    public void excluir(String productId) throws SQLException {

        String sql = "UPDATE tab_produto "
                + "SET ativo = '0' "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, productId);
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public void Save(Product product) throws SQLException {

        String sql = "INSERT INTO "
                + "tab_produto "
                + "(descricao, "
                + "preco_Compra, "
                + "preco_Venda, "
                + "estoque,  "
                + "categoria, "
                + "ativo) "
                + "VALUES(?, ?, ?, ?, ?, ?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, product.getDescricao());
            stmt.setString(2, product.getPreco_compra());
            stmt.setString(3, product.getPreco_Venda());
            stmt.setString(4, product.getEstoque());
            stmt.setString(5, product.getCategoria());
            stmt.setString(6, product.getAtivo());
            stmt.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
    }

    public Product editarSelect(String produtoId) throws SQLException {

        Product product = new Product();

        String sql = "SELECT "
                + " id, "
                + "descricao, "
                + "preco_Compra, "
                + "preco_Venda, "
                + "estoque, "
                + "categoria, "
                + "ativo  "
                + "FROM tab_produto "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produtoId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                product.setCodigo(rs.getString("id"));
                product.setDescricao(rs.getString("descricao"));
                product.setPreco_compra(rs.getString("preco_Compra"));
                product.setPreco_Venda(rs.getString("preco_Venda"));
                product.setEstoque(rs.getString("estoque"));
                product.setCategoria(rs.getString("categoria"));
                product.setAtivo(rs.getString("ativo"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return product;
    }

    public void editar(Product product, String id) throws SQLException {

        String sql = "UPDATE tab_produto "
                + "SET descricao = ?, preco_Compra = ?, preco_Venda = ? , estoque = ? , categoria = ?, ativo = ? "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, product.getDescricao());
            stmt.setString(2, product.getPreco_compra());
            stmt.setString(3, product.getPreco_Venda());
            stmt.setString(4, product.getEstoque());
            stmt.setString(5, product.getCategoria());
            stmt.setString(6, product.getAtivo());
            stmt.setString(7, id);

            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }
    
    public String odProduto(String desc) throws SQLException {

        String sql = "SELECT "
                + "id "
                + "FROM tab_produto "
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
