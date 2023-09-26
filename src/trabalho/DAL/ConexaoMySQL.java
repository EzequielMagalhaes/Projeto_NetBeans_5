package trabalho.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author autologon
 */
public class ConexaoMySQL {
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String SQL;
    public void abrirBD()throws Exception
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       String url = "jdbc:mysql://localhost:3306/trabalho26_09";
       String user = "root";//Seu nome de usuário.
       String password = "";  //Sua senha.
       con = DriverManager.getConnection(url, user, password);
    }
    public void fecharBD() throws Exception
    {
        if(con != null)
        {
            con.close();
        }
    }
}