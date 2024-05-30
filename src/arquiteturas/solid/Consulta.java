package arquiteturas.solid;

//SRP - Interface de Consulta
public interface Consulta {

 /**
  * Realiza uma consulta com base nos critérios fornecidos.
  *
  * @param criterios Os critérios de consulta.
  * @return O resultado da consulta.
  */
 Object consultar(Object criterios);
}
