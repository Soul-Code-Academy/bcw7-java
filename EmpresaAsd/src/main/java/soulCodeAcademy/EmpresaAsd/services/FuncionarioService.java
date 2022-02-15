package soulCodeAcademy.EmpresaAsd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.EmpresaAsd.models.Funcionario;
import soulCodeAcademy.EmpresaAsd.repositorys.FuncionarioRepository;


@Service //Criação dos serviços para utilizar os métodos JPA
public class FuncionarioService {

	//Fazendo a injeção de dependência
	
		@Autowired
		private FuncionarioRepository funcionarioRepository;
		
		// Serviço: implementar listagem dos funcionariocadastrados
		public List<Funcionario> mostrarTodosFuncionarios(){
			return funcionarioRepository.findAll();	//findAll mostra todos os registros
			}
		
		public Funcionario buscarUmFuncionario(Integer id_funcionario) {
			
			//Optional - evita os erros NullPointerExcetion, tirando a necessidade da verificação por criação de código. Ex.: (if aluno != null
			//orElseThrow() - se o funcionario estiver no banco de dados, retorna o aluno. Se não, lança uma exceção.
			Optional<Funcionario> funcionario = funcionarioRepository.findById(id_funcionario);
			return funcionario.orElseThrow();
		}
		
		public Funcionario inserirFuncionario(Funcionario funcionario) {
			return funcionarioRepository.save(funcionario);
		}
		
		public void deletarUmFuncionario(Integer id_funcionario) {
			funcionarioRepository.deleteById(id_funcionario);
		}
		
		public Funcionario editarFuncionario(Funcionario funcionario) {
			buscarUmFuncionario(funcionario.getId_funcionario());
			return funcionarioRepository.save(funcionario);
		}
		


}
