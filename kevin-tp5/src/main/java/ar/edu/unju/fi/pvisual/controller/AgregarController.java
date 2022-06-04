package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgregarController {

	@RequestMapping("nuevo")
	public String NuevoDocente() {
		
		return "nuevo-docente";
	}
}
