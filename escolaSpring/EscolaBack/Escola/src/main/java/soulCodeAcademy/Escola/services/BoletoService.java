package soulCodeAcademy.Escola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.Escola.models.Aluno;
import soulCodeAcademy.Escola.models.Boleto;
import soulCodeAcademy.Escola.models.StatusBoleto;
import soulCodeAcademy.Escola.repositorys.BoletoRepository;

@Service
public class BoletoService {
	
	@Autowired
	private BoletoRepository boletoRepository;
	
	@Autowired
	private AlunoService alunoService;
					
	//o primeiro serviço que vamos implementar é a listagem de todos os alunos cadastrados
	
	public List<Boleto> buscarTodosBoletos(){
		return boletoRepository.findAll();
	}
	
	public Boleto buscarUmBoleto(Integer codigo) {
		Optional<Boleto> boleto = boletoRepository.findById(codigo);
		return boleto.orElseThrow();
	}
	
	public List<Boleto> buscarBoletosDoAluno(Integer ra_aluno){
		List<Boleto> boleto = boletoRepository.buscarBoletosDoAluno(ra_aluno);
		return boleto;
	}
	
	public Boleto inserirBoleto(Boleto boleto, Integer ra_aluno) {
		boleto.setCodigo(null);
		Aluno aluno = alunoService.buscarUmAluno(ra_aluno);
		boleto.setAluno(aluno);
		return boletoRepository.save(boleto);
	}
	
//	public void deletarUmBoleto(Integer codigo) {
//		boletoRepository.deleteById(codigo);
//	}
	
	public Boleto editarBoleto(Boleto boleto, Integer codigo, Integer ra_aluno) {
		buscarUmBoleto(codigo);
		Aluno aluno = alunoService.buscarUmAluno(ra_aluno);
		boleto.setAluno(aluno);
		return boletoRepository.save(boleto);
	}
	
	public Boleto pagarBoleto(Integer codigo) {
		Boleto boleto = buscarUmBoleto(codigo);
		StatusBoleto st1 = StatusBoleto.RECEBIDO;
		boleto.setBo_status(st1);
		return boletoRepository.save(boleto);
	}
	
	public Boleto cancelarBoleto(Integer codigo) {
		Boleto boleto = buscarUmBoleto(codigo);
		StatusBoleto st1 = StatusBoleto.CANCELADO;
		boleto.setBo_status(st1);
		return boletoRepository.save(boleto);
	}
	
	
}