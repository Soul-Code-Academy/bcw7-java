package soulCodeAcademy.Escola.controllers;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("escola")
public class EmailController {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@GetMapping("/email-send/{contato_email}")
	public String enviarEmail(@PathVariable String contato_email) {
		
		String alfaNum = "ABCDEFGHIJKLMNOPQRSTUVWXZabcderfghijklmnoprstuvwxyz0123456789*#@";
		
		Random random = new Random();
		
		String senhaGerada = "";
		
		int index = 0;
		
		for(int i=0; i<9; i++) {
			index = random.nextInt(alfaNum.length());
			senhaGerada += alfaNum.substring(index,index +1);
		}
		
		SimpleMailMessage mensagem = new SimpleMailMessage();
		
		mensagem.setText("Sua nova senha é: " + senhaGerada); 
		mensagem.setTo(contato_email);
		mensagem.setFrom("ads.pict@gmail.com");
		
		try {
			mailSender.send(mensagem);
			return ("Email enviado com sucesso!");
		}catch(Exception e) {
			e.printStackTrace();
			return ("Email não nviado.");
		}
	}

}
