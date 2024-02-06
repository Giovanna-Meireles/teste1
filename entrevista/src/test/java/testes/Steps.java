package testes;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	ElementosWeb elementos = new ElementosWeb();
	
	@Given("que eu acesse ao {string}")
	public void que_eu_acesse_ao(String appUrl) {
		metodos.abrirNavegador(appUrl, "abrindo navegador");
		metodos.maximixarNavegador();
		metodos.click(elementos.getAceitartudo());
		metodos.click(elementos.getBarrapesquisa());



	}

	@When("pesquisar site de eletronicos {string}")
	public void pesquisar_site_de_eletronicos(String worten) throws InterruptedException {

		metodos.escrever(worten, elementos.getBarrapesquisa());
		metodos.submit(elementos.getBarrapesquisa());
		metodos.click(elementos.getResultadoworten());
		Thread.sleep(5000);
		metodos.click(elementos.getAceitarworten());
		metodos.click(elementos.getLoginworten());
		metodos.click(elementos.getPrimeiroitem());
		Thread.sleep(4000);
		metodos.click(elementos.getBicicletas());
		Thread.sleep(3000);
		metodos.click(elementos.getPrimeirabike());
		Thread.sleep(3000);
		metodos.click(elementos.getAdicionaraocarrinho());
		Thread.sleep(3000);
		metodos.click(elementos.getIraocarrinho());
		Thread.sleep(3000);
		metodos.fecharNavegador();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}


}
