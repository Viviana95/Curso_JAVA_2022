package empleado;


import java.util.Date;
import java.util.Objects;

public class Employee {
 private Date fechaIngreso;
 private double salario;
 private String nombre;
 private int edad;

/**
 * @param fechaIngreso
 * @param salario
 * @param nombre
 * @param edad
 */

public Employee() {
	super();
	nombre = "";
	fechaIngreso = new Date();
	
}
public Employee(Date fechaIngreso, double salario, String nombre, int edad) {

	setFechaIngreso(getFechaIngreso());
	this.salario = salario;
	setNombre(nombre);
	this.edad = edad;
}

public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public Date getFechaIngreso() {
	return fechaIngreso;
}
public void setFechaIngreso(Date fechaIngreso) {
	if(nombre == null)
		fechaIngreso = new Date();
	else
	this.fechaIngreso = fechaIngreso;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	if(nombre == null)
		nombre = "";
	else
	this.nombre = nombre;
}
/**
 * 
 */

@Override
public int hashCode() {
	//return Objects.hash(edad, fechaIngreso, nombre, salario);
	
	return 7 * nombre.hashCode()  + 
			11 * new Double(salario).hashCode() +
			13 * fechaIngreso.hashCode() +
			10 * new Integer(edad).hashCode();
	
}
@Override
public boolean equals(Object obj) {
	
	boolean emp = false;
	
	if(obj instanceof Employee) {
	Employee employee = (Employee)obj;
	
	emp =  employee.getNombre() != null && employee.getNombre().equals(nombre) 						&&
		   employee.getFechaIngreso() != null && employee.getFechaIngreso().equals(fechaIngreso) 	&&
		   employee.getEdad() != 0 && employee.getEdad()==(edad)									&&
	       employee.getSalario() != 0 && employee.getSalario()==(salario);
	}
	return emp;
	}

@Override
public String toString() {// imprimo el obj
	StringBuilder sb = new StringBuilder(super.toString());
	sb.append("Nombre:");
	sb.append(nombre);
	sb.append("Edad:");
	sb.append(edad);
	sb.append("Fecha de ingreso:");
	sb.append(fechaIngreso);
	sb.append("Salario :");
	sb.append(salario);
	return sb.toString();
	
}

 
}
