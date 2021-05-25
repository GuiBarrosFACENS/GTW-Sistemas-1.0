package dao;

import java.sql.Connection;
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
public class emitenteDAO {

    private static final Logger LOG = Logger.getLogger("");
    private static emitenteDAO instance;
    ResultSet rs = null;
    PreparedStatement stmt = null;

    public static emitenteDAO getInstance() {
        if (instance == null) {
            instance = new emitenteDAO();
        }

        return instance;
    }

    /* Prevent the TabelaPrecoDAO class from being instantiated. */
    private Connection conexao;

    public emitenteDAO() {
        conexao = ConnectionModule.conector();
    }

    public List<String> fantasia() throws SQLException {

        List<String> list = new ArrayList<>();

        String sql = "SELECT "
                + "nome_fantasia , "
                + "cnpj "
                + "FROM tab_emitente ";

        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("nome_fantasia"));
                list.add(rs.getString("cnpj"));
            }

            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public List<String> fantasia2() throws SQLException {

        List<String> list = new ArrayList<>();

        String sql = "SELECT "
                + "nome_fantasia , "
                + "cnpj "
                + "FROM tab_emitente ";

        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("nome_fantasia"));
            }

            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            throw new SQLException(e);
        }

    }

    public String odFantasia(String desc) throws SQLException {

        String sql = "SELECT "
                + "id "
                + "FROM tab_emitente "
                + "WHERE nome_fantasia = ?";

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
