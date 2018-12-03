/*
 * Sistema de Gestão Acadêmica 
 */
package sistemaacademico;

import java.util.ArrayList;

/**
 * @author Wanderley de Souza Alencar
 */
public class SistemaAcademico {
        //
        // Aqui estão sendo declarados objetos das principais classes.
        // Evidentemente cada equipe utilizará somente alguns deles para 
        // implementar sua porção do sistema. 
        //
        // Todos os objetos foram declarados como sendo ArrayList e, portanto, 
        // ao finalizar uma execução da aplicação todos os dados serão perdidos
        //
        // 
        // Observação: Exclua as declarações que não necessitar...
        //
        //
        private static ArrayList <Curso>                   cursos;
        private static ArrayList <Academico>               academicos;
        private static ArrayList <Docente>                 docentes;
        private static ArrayList <TecnicoAdministrativo>   tecnicosAdministrativos;
        private static ArrayList <Disciplina>              disciplinas;
        private static ArrayList <RegistroAcademico>       historicos;
        //
        // Atributos auxiliares...
        //
        private static UnidadesFederativas            unidadesFederativas;
        
        
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        int i;
        cursos                  = new ArrayList<>();
        academicos              = new ArrayList<>();
        docentes                = new ArrayList<>();
        tecnicosAdministrativos = new ArrayList<>();
        disciplinas             = new ArrayList<>();
        historicos              = new ArrayList<>();
        //
        // Exemplo de uso...
        //
        unidadesFederativas       = new UnidadesFederativas();
        for (i = 0; (i < unidadesFederativas.size()); i++) {
            unidadesFederativas.show(i);
        }
        System.out.println("Fim");
    }
    
}
