package arquiteturas.solid;

//OCP - Implementação de Consulta Concreta
public class ConsultaBancoDeDados implements Consulta {

 @Override
 public Object consultar(Object criterios) {
     // Lógica de consulta ao banco de dados
     // ...
     return new Object();
 }
}
