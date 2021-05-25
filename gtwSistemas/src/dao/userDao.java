package dao;

import dao.ConnectionModule;
import java.sql.Connection;
import objects.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class userDao {

    private static final Logger LOG = Logger.getLogger("");
    private static userDao instance;
    ResultSet rs = null;
    PreparedStatement stmt = null;

    public static userDao getInstance() {
        if (instance == null) {
            instance = new userDao();
        }

        return instance;
    }

    /* Prevent the TabelaPrecoDAO class from being instantiated. */
    private Connection conexao;

    public userDao() {
        conexao = ConnectionModule.conector();
    }

    public boolean select(User user) throws SQLException {

        String sql = "SELECT * FROM"
                + " tab_usuario"
                + " WHERE"
                + " usuario = ?"
                + " and"
                + " senha = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());

            rs = stmt.executeQuery();

            return rs.next();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public String userName(String usuario) throws SQLException {

        String sql = "SELECT "
                + "nome "
                + "FROM tab_usuario "
                + "WHERE "
                + "usuario = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario);
            rs = stmt.executeQuery();

            if (rs.next()) {
                String run = rs.getString("nome");
                return run;
            } else {
                return "admin";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public List<User> userTable(String like) throws SQLException {

        List<User> list = new ArrayList<>();

        String sql = "SELECT "
                + "id , "
                + "usuario , "
                + "nome , "
                + "celular "
                + "FROM tab_usuario\n"
                + "WHERE ativo = 1 "
                + "and nome LIKE ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + like + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setCodigo(rs.getString("id"));
                user.setLogin(rs.getString("usuario"));
                user.setName(rs.getString("nome"));
                user.setCellphone(rs.getString("celular"));
                list.add(user);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return list;
    }

    public List<User> userOd() throws SQLException {

        List<User> list = new ArrayList<>();

        String sql = "SELECT "
                + "id , "
                + "usuario , "
                + "nome , "
                + "celular "
                + "FROM tab_usuario "
                + "WHERE ativo = '1' ";

        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setCodigo(rs.getString("id"));
                user.setLogin(rs.getString("usuario"));
                user.setName(rs.getString("nome"));
                user.setCellphone(rs.getString("celular"));
                list.add(user);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return list;
    }

    public void Save(User user) throws SQLException {

        String sql = "INSERT INTO "
                + "tab_usuario "
                + "(usuario,senha,nome,rg,celular,rua,bairro,telefone,cidade,estado,email,numero,observacao,cep,ativo) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getRg());
            stmt.setString(5, user.getCellphone());
            stmt.setString(6, user.getRua());
            stmt.setString(7, user.getBairro());
            stmt.setString(8, user.getPhone());
            stmt.setString(9, user.getCity());
            stmt.setString(10, user.getState());
            stmt.setString(11, user.getEmail());
            stmt.setString(12, user.getNumber());
            stmt.setString(13, user.getObservation());
            stmt.setString(14, user.getCep());
            stmt.setString(15, user.getAtivo());

            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
    }

    public void excluir(String userId) throws SQLException {

        String sql = "UPDATE tab_usuario "
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

    public User editarSelect(String userId) throws SQLException {
        User user = new User();

        String sql = "SELECT "
                + "id, "
                + "usuario, "
                + "senha, "
                + "nome, "
                + "rg, "
                + "celular, "
                + "rua, "
                + "bairro, "
                + "telefone, "
                + "cidade, "
                + "estado, "
                + "email, "
                + "numero, "
                + "observacao, "
                + "cep, "
                + "ativo "
                + "FROM tab_usuario "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, userId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                user.setCodigo(rs.getString("id"));
                user.setLogin(rs.getString("usuario"));
                user.setPassword(rs.getString("senha"));
                user.setName(rs.getString("nome"));
                user.setRg(rs.getString("rg"));
                user.setCellphone(rs.getString("celular"));
                user.setRua(rs.getString("rua"));
                user.setBairro(rs.getString("bairro"));
                user.setPhone(rs.getString("telefone"));
                user.setCity(rs.getString("cidade"));
                user.setState(rs.getString("estado"));
                user.setEmail(rs.getString("email"));
                user.setNumber(rs.getString("numero"));
                user.setObservation(rs.getString("observacao"));
                user.setCep(rs.getString("cep"));
                user.setAtivo(rs.getString("ativo"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }
        return user;
    }

    public void editar(User user, String userId) throws SQLException {

        String sql = "UPDATE tab_usuario "
                + "SET usuario = ? ,senha = ?,nome = ?,rg = ?,celular = ?,rua = ?,bairro = ?,telefone = ?,cidade = ?,estado = ?,email = ?,numero = ?,observacao = ? ,cep = ?,ativo = ? "
                + "WHERE id = ?";

        try {
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getRg());
            stmt.setString(5, user.getCellphone());
            stmt.setString(6, user.getRua());
            stmt.setString(7, user.getBairro());
            stmt.setString(8, user.getPhone());
            stmt.setString(9, user.getCity());
            stmt.setString(10, user.getState());
            stmt.setString(11, user.getEmail());
            stmt.setString(12, user.getNumber());
            stmt.setString(13, user.getObservation());
            stmt.setString(14, user.getCep());
            stmt.setString(15, user.getAtivo());

            stmt.setString(16, userId);

            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public String odUsuario(String desc) throws SQLException {

        String sql = "SELECT "
                + "id "
                + "FROM tab_usuario "
                + "WHERE nome = ? ";

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
