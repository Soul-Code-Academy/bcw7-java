import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Professor } from 'src/app/modelos/professorModel';
import { ProfessorService } from 'src/app/servicos/professor.service';

@Component({
  selector: 'app-editar-professor',
  templateUrl: './editar-professor.component.html',
  styleUrls: ['./editar-professor.component.css']
})
export class EditarProfessorComponent implements OnInit {

  professor: Professor = {
    id_professor:'',
    pro_nome:'',
    pro_formacao:'',
    pro_foto:'',
    pro_cpf:''
  }

  constructor(private professorService:ProfessorService,
    private route: ActivatedRoute,
    private router: Router) {
      this.professor.id_professor = this.route.snapshot.paramMap.get('id_professor')
     }

  ngOnInit(): void {
    this.professorService.buscarUmProfessor(this.professor.id_professor).subscribe((resposta)=>{
      this.professor = resposta
      console.log(this.professor)
    })
  }


  editarProfessor() {
    this.professorService.editarProfessor(this.professor).subscribe({
      complete: () => {alert('Professor editado com sucesso!')
                       this.router.navigate(['/professor'])},
      error: () => {alert('Não foi possível editar a professor!')
                      this.router.navigate(['/professor'])},
    });

    }

}
