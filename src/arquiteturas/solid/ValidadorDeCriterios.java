package arquiteturas.solid;

//SRP - Classe de Validação de Critérios
public class ValidadorDeCriterios {

 /**
  * Valida os critérios de consulta.
  *
  * @param criterios Os critérios de consulta.
  * @throws IllegalArgumentException Se os critérios forem inválidos.
  */
 public void validar(Object criterios) {
     // Lógica de validação dos critérios
     // ...
     if (criterios == null) {
         throw new IllegalArgumentException("Critérios de consulta inválidos.");
     }
 }
}
