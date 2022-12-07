package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPrueba {

	public static void main(String[] args) {
		// Conectar base datos
		// 1-levantar driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2-Establecer conexion
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg", "root", "admin");
			// 3- Crear sentenci
			Statement sql = con.createStatement();
			// 4-Ejecutar consulta
			ResultSet res = sql.executeQuery("select * from contactos");
			// 5-mostra los resultados
			//sql.executeUpdate("update * from contactos");
			while (res.next()) {
				System.out.println("nombre = " + res.getString("nombre"));
    			System.out.println("telefono = " + res.getString("telefono"));
    			System.out.println("email = " + res.getString("email"));
				
			}
			sql.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
