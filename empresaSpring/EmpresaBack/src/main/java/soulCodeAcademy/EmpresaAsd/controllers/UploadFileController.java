package soulCodeAcademy.EmpresaAsd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import soulCodeAcademy.Empresa.utils.UploadFileUtil;
import soulCodeAcademy.EmpresaAsd.models.Funcionario;
import soulCodeAcademy.EmpresaAsd.services.FuncionarioService;

@RestController
	@CrossOrigin
	@RequestMapping("empresa")
	public class UploadFileController {
		
		@Autowired
		private FuncionarioService funcionarioService;

		@PostMapping("/envio/{id_funcionario}")
		public ResponseEntity<String> enviarDados(@PathVariable Integer id_funcionario, MultipartFile foto, @RequestParam(value="nomeDoArquivo")String nome){
			String fileName = nome;
			
			String uploadDir = "/eclipse-workspace/java/empresaSpring/empresaFront/src/assets/img";
			
//			String nomeMaisCaminho = "c:" + uploadDir + "/" + nome;
			
			String nomeMaisCaminho = "c:" + "assets/img" + "/" + nome;
			
			Funcionario funcionario = funcionarioService.salvarFoto(id_funcionario, nomeMaisCaminho);
			
			try {
				UploadFileUtil.salvarArquivo(uploadDir, fileName, foto);
			}catch(Exception e) {
				System.out.print("Arquivo não enviado" +  e );
			}
				System.out.println("Arquivo enviado!" + nomeMaisCaminho);
				return ResponseEntity.ok("Finalizado!");
		}
	}

