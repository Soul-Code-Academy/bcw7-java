//package soulCodeAcademy.EmpresaAsd.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import soulCodeAcademy.EmpresaAsd.models.Usuario;
//import soulCodeAcademy.EmpresaAsd.services.UsuarioService;
//
//@CrossOrigin
//@RestController
//@RequestMapping("empresa")
//public class UsuarioController {
//	
//	@Autowired
//	private UsuarioService usuarioService;
//	
//	@GetMapping("/usuario")
//	public List<Usuario> findAll(){
//	 List<Usuario> usuario = usuarioService.findAll();
//		return usuario;
//	}
//}
//
