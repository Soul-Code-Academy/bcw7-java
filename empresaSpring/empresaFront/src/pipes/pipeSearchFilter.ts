import { Pipe, PipeTransform} from '@angular/core';
import { FuncionarioGeral } from 'src/app/models/funcionarioGeralModelo';

@Pipe({
    name: 'pipeSearchFilter'
})

export class PipeSearchFilterPipe implements PipeTransform{
    transform(geral:FuncionarioGeral[], searchValue:string): FuncionarioGeral[]{

        if(!geral || ! searchValue){
            return geral
        }
            return geral.filter(geral =>
            geral.func_nome.toLocaleLowerCase().includes(searchValue.toLocaleLowerCase()))


    }
}

