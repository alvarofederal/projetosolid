package arquiteturas.solid;

//DIP - Classe de Gerenciamento de Consultas
public class GerenciadorDeConsultas {

 private final Consulta consulta;
 private final ValidadorDeCriterios validador;

 // Injeção de dependências
 public GerenciadorDeConsultas(Consulta consulta, ValidadorDeCriterios validador) {
     this.consulta = consulta;
     this.validador = validador;
 }

 /**
  * Realiza uma consulta com base nos critérios fornecidos.
  *
  * @param criterios Os critérios de consulta.
  * @return O resultado da consulta.
  */
 public Object realizarConsulta(Object criterios) {
     validador.validar(criterios);
     return consulta.consultar(criterios);
 }
}
