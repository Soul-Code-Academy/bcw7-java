import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Professor } from 'src/app/modelos/professorModel';
import { ProfessorService } from 'src/app/servicos/professor.service';

@Component({
  selector: 'app-excluir-professor',
  templateUrl: './excluir-professor.component.html',
  styleUrls: ['./excluir-professor.component.css']
})
export class ExcluirProfessorComponent implements OnInit {

  professor: Professor={
    id_professor:'',
    pro_nome:'',
    pro_formacao:'',
    pro_foto:''
  }

  constructor(private professorService:ProfessorService,
              private activatedRoute:ActivatedRoute,
              private router:Router) {
                this.professor.id_professor = this.activatedRoute.snapshot.paramMap.get('id_professor')
               }

  ngOnInit(): void {
    this.professorService.buscarUmProfessor(this.professor.id_professor).subscribe((resultado)=>{
      this.professor = resultado
      console.log(resultado)
    })
  }

  excluirProfessor() {
    this.professorService.excluirProfessor(this.professor.id_professor).subscribe({
      complete: () => alert('Professor excluído com sucesso!'),
      error: () => alert('Erro ao excluir professor.'),
    });
    this.router.navigate(['/professor']);

    }

}
