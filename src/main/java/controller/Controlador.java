package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import interfaceService.IEmpleadoService;
import modelo.Empleado;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IEmpleadoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado>empleados=service.listar();
		model.addAttribute("empleados", empleados);
		return "index";
	}

}
