package org.cibertec.edu.pe.repository;

import org.cibertec.edu.pe.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta, String>{
	DetalleVenta findByCodigoPostaldetalleVenta(String codigoPostal);
	
	DetalleVenta findFirstSubTotaldetalleVenta(double subtotal);
	
	long count();	
	

}
