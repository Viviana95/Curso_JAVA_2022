package html.jdbc;

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
			ResultSet res = sql.executeQuery("select employee_id, first_name, last_name, salary from employees");
			// 5-mostra los resultados
			while (res.next()) {
				System.out.println("id = " + res.getInt("employee_id"));
				System.out.println("first_name = " + res.getString("first_name"));
				System.out.println("last_name = " + res.getString("last_name"));
				System.out.println("salary = " + res.getFloat("salary"));
			}
			sql.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
