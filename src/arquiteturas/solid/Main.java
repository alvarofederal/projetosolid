package arquiteturas.solid;

//ISP - Classe Principal
public class Main {

 public static void main(String[] args) {

     // Criação de instâncias
     ValidadorDeCriterios validador = new ValidadorDeCriterios();
     Consulta consulta = new ConsultaBancoDeDados();
     GerenciadorDeConsultas gerenciador = new GerenciadorDeConsultas(consulta, validador);
     RegistradorDeConsultas registrador = new RegistradorDeConsultas();
     ApresentadorDeResultados apresentador = new ApresentadorDeResultados();

     // Realização da consulta
     Object criterios = new Object(); // Critérios de consulta
     Object resultado = gerenciador.realizarConsulta(criterios);

     // Registro e apresentação dos resultados
     registrador.registrar(criterios, resultado);
     apresentador.apresentar(resultado);
 }
}
