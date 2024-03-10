package org.cibertec.edu.pe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class Venta {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private String nombreComprador;
	 private Date fechaVenta;
	 private double montoTotal;
	
	 public Venta() {
		
	}

	public Venta(String nombreComprador, Date fechaVenta, double montoTotal) {
		super();
		this.nombreComprador = nombreComprador;
		this.fechaVenta = fechaVenta;
		this.montoTotal = montoTotal;
	}

	public String getNombreComprador() {
		return nombreComprador;
	}

	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	 
	 
	 
	 

}
