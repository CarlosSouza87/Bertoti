package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 1234;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarCarros();

		Controller controller = new Controller(model);
		
		controller.buscarCarro();
		controller.buscarCarroMarca();
		controller.buscarCarroPlaca();
		controller.buscarCarroModelo();
		
    }
    
    public static void inicializarCarros(){
    	model.addCarro(new Carro("AAA-1111", new Especificacao("gol", "vw", "verde")));
    	model.addCarro(new Carro("HHH-1111", new Especificacao("siena", "fiat", "azul")));
    	model.addCarro(new Carro("CCC-1111", new Especificacao("palio", "fiat", "branco")));
    	model.addCarro(new Carro("DDD-1111", new Especificacao("fordka", "ford", "branco")));
    	model.addCarro(new Carro("GGG-1111", new Especificacao("brasilia", "ferrari", "vermelho")));  	
    	model.addCarro(new Carro("BBB-1111", new Especificacao("dkv", "ferrari", "verde")));
    }
}
