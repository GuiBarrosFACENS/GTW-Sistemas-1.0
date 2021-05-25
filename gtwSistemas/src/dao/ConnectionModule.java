package dao;

import java.sql.DriverManager;

/**
 *
 * @author Guilherme
 */
public class ConnectionModule {

    public static java.sql.Connection conector() {

        java.sql.Connection conexao = null;

        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gtwSistemas", "root", "root");
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

}
