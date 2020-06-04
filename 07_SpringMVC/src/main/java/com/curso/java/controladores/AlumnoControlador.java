package com.curso.java.controladores;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.curso.java.configuraciones.DataSource;
import com.curso.java.entidades.Alumno;

@Controller
public class AlumnoControlador {
	ModelAndView mav = new ModelAndView();
	DataSource ds = new DataSource();
	JdbcTemplate jdbct = new JdbcTemplate(ds.getDriverManagerDataSource());

	@RequestMapping(value = { "/index.html" }, method = RequestMethod.GET)
	public ModelAndView listar() {
		String query = "SELECT TipoDoc,Documento,RazonSocial FROM Alumnos";
		List<Map<String, Object>> listaAlumnos = jdbct.queryForList(query);
		mav.addObject("mensaje", "Hola desde el AlumnoControlador");
		mav.addObject("listaAlumnos", listaAlumnos);
		mav.setViewName("index");

		return mav;
	}

	@RequestMapping(value = { "/insertar.html" }, method = RequestMethod.POST)
	public ModelAndView agregar(Alumno alumno) {
		String query = "INSERT INTO alumnos (TipoDoc,Documento,RazonSocial) VALUES (?,?,?)";
		jdbct.update(query, alumno.getTipoDoc(), alumno.getDocumento(), alumno.getRazonSocial());
		listar();
		return mav;

	}

	@RequestMapping(value = { "/editar.html" }, method = RequestMethod.GET)
	public ModelAndView listarAlumno(HttpServletRequest request) {
		String TipoDoc = request.getParameter("TipoDoc");
		String Documento = request.getParameter("Documento");
		String query = "SELECT TipoDoc,Documento,RazonSocial FROM Alumnos WHERE TipoDoc = ? AND  Documento = ? ";
		List<Map<String, Object>> alumno = jdbct.queryForList(query, TipoDoc, Documento);
		mav.addObject("alumno", alumno);
		mav.setViewName("editar");
		return mav;
	}

	@RequestMapping(value = { "/actualizar.html" }, method = RequestMethod.POST)
	public ModelAndView actualizar(Alumno alumno) {
		String query = "UPDATE alumnos SET RazonSocial = ? WHERE TipoDoc = ? AND  Documento = ?";
		jdbct.update(query, alumno.getRazonSocial(), alumno.getTipoDoc(), alumno.getDocumento());
		listar();
		return mav;

	}

	@RequestMapping(value = { "/agregar.html" }, method = RequestMethod.GET)
	public String insertar() {

		return "agregar";
	}

	@RequestMapping(value = { "/eliminar.html" }, method = RequestMethod.GET)
	public ModelAndView elimniar(HttpServletRequest request) {
		String TipoDoc = request.getParameter("TipoDoc");
		String Documento = request.getParameter("Documento");
		String query = "DELETE FROM Alumnos WHERE TipoDoc = ? AND  Documento = ? ";
		jdbct.update(query, TipoDoc, Documento);
		listar();
		return mav;
	}

}
