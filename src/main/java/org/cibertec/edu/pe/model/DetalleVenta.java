package org.cibertec.edu.pe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DetalleVenta")
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigoPostal;
	private int idVenta;
	private int cantidad;
	private Date fechaViaje;
	private Date fechaRetorno;
	private double subTotal;
	
	public DetalleVenta() {
		
	}

	public DetalleVenta(String codigoPostal, int idVenta, int cantidad, Date fechaViaje, Date fechaRetorno,
			double subTotal) {
		super();
		this.codigoPostal = codigoPostal;
		this.idVenta = idVenta;
		this.cantidad = cantidad;
		this.fechaViaje = fechaViaje;
		this.fechaRetorno = fechaRetorno;
		this.subTotal = subTotal;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaViaje() {
		return fechaViaje;
	}

	public void setFechaViaje(Date fechaViaje) {
		this.fechaViaje = fechaViaje;
	}

	public Date getFechaRetorno() {
		return fechaRetorno;
	}

	public void setFechaRetorno(Date fechaRetorno) {
		this.fechaRetorno = fechaRetorno;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	
	
	

}
