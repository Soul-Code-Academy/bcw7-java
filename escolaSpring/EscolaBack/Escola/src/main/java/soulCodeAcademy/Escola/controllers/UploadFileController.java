package soulCodeAcademy.Escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import soulCodeAcademy.Escola.models.Professor;
import soulCodeAcademy.Escola.services.ProfessorService;
import soulCodeAcademy.Escola.utils.UploadFileUtil;

@RestController
@CrossOrigin
@RequestMapping("escola")
public class UploadFileController {
	
	@Autowired
	private ProfessorService  professorService;

	@PostMapping("/envio/{id_professor}")
	public ResponseEntity<String> enviarDados(@PathVariable Integer id_professor, MultipartFile foto, @RequestParam(value="nomeDoArquivo")String nome){
		String fileName = nome;
		
		String uploadDir = "/eclipse-workspace/java/escolaSpring/escolaFront/src/assets/img";
		String nomeMaisCaminho = "c:" + uploadDir + "/" + nome;
		
		Professor professor = professorService.salvarFoto(id_professor, nomeMaisCaminho);
		
		try {
			UploadFileUtil.salvarArquivo(uploadDir, fileName, foto);
		}catch(Exception e) {
			System.out.print("Arquivo não enviado" +  e );
		}
			System.out.println("Arquivo enviado!" + nomeMaisCaminho);
			return ResponseEntity.ok("Finalizado!");
	}
}
