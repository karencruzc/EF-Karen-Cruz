package org.cibertec.edu.pe.controller;

import org.cibertec.edu.pe.model.Venta;
import org.cibertec.edu.pe.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(path = "venta")
public class VentaController {
	
	@Autowired
	private IVentaRepository ventaRepository;
	
	@GetMapping(value="/mostrar")
	public String mostrarVenta(Model model) {
		model.addAttribute("venta", ventaRepository.findAll());
		return "Venta_list";
	}
	@GetMapping(value = "/agregar")
    public String agregarCliente(Model model) {
        model.addAttribute("venta", new Venta());
        return "venta_form";
    }
	
	@GetMapping(value = "/eliminar/{id}")
	public String eliminarCliente(@PathVariable String id, RedirectAttributes redirectAttrs) {
	    ventaRepository.deleteById(id);
	    redirectAttrs
	            .addFlashAttribute("mensaje", "Venta eliminada correctamente")
	            .addFlashAttribute("clase", "warning");
	    return "redirect:/venta/mostrar";
	}
	
	@PostMapping(value = "/agregar")
    public void guardarVenta(@ModelAttribute @Validated Venta venta, BindingResult bindingResult, RedirectAttributes redirectAttrs) {
        if (bindingResult.hasErrors());

	}
}
