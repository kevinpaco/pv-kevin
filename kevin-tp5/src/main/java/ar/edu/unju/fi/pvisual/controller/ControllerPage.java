package ar.edu.unju.fi.pvisual.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.pvisual.model.Curso;
import ar.edu.unju.fi.pvisual.model.Docente;

@Controller
@RequestMapping("/pagina")
public class ControllerPage {
	public List<Curso> getCurso(){
		List<Curso> listacursos=new ArrayList<>();
		
		listacursos.add(new Curso(1,"tec. base de datos","base de datos", "27/03/22","01/06/22",150,"Presencial", "Raul Chato Padilla"));
		listacursos.add(new Curso(2,"tec. en redes","redes", "01/03/22","01/06/22",90,"Virtual", "Ruben Agirre"));
		listacursos.add(new Curso(3,"Desarrollo web","web", "03/06/22","01/12/22",150,"Presencial", "Juan Perez"));
		return listacursos;
	}
	public List<Docente> getDocente(){
		List<Docente> listadocente=new ArrayList<>();
		
		listadocente.add(new Docente(1234,"Raul", "Chato Padilla", "Raul45@gmail.com", 388563213));
        listadocente.add(new Docente(2345,"Ruben","Aguirre","Carlos43@gmail.com", 388232248));
        listadocente.add(new Docente(2343,"Juan","Parez","Perezjuan23@gmail.com", 388435217));
		return listadocente;
	}
   
	@RequestMapping("/cursos")
	public String getcursos(Model model) {
		model.addAttribute("cursos",getCurso());
		return "cursos";
	}
	
	@RequestMapping("/curso")
	public ModelAndView visualisarCurso(@RequestParam (name="codigo") int codigo) {
		ModelAndView modelandview =new ModelAndView("docente");
		
		/*Docente p=new Docente();
		for(Docente p1:this.getDocente()) {
			if(p1.getLegajo()==legajo) {
				p.setNombre(p1.getNombre());
			}
		}*/
	
		
		Docente p= new Docente();
		for(Curso p1: this.getCurso()) {
			if(p1.getCodigo()==codigo) {
			     p.setNombre(p1.getDocente());
				
				/*p.setDocente(p1.getDocente());
				p.setHoras(p1.getHoras());
				p.setCodigo(p1.getCodigo());*/
			}
		}
		
		modelandview.addObject("docente",p);
		return modelandview;
		
	}
	
	@RequestMapping("/Docente")
	public String getDocente(Model model) {
		
		model.addAttribute("docente",getDocente());
		return "docente";
	}
}
