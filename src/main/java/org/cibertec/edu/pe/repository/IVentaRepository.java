package org.cibertec.edu.pe.repository;

import org.cibertec.edu.pe.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRepository extends JpaRepository<Venta, String>{
	Venta findByIdventa(String nombre);
	Venta findFirstBymontoTotal(double montoTotal);
	long count();	

}
