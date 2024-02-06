package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By aceitartudo = By.cssSelector("#L2AGLb > div");
	private By barrapesquisa = By.name("q");
	private By resultadoworten = By.cssSelector("#rso > div.hlcw0c > div > div > div > div > div > div > div > div.yuRUbf > div > span > a > h3");
	private By aceitarworten = By.cssSelector("body > div:nth-child(9) > div > div > div > div > section > footer > button.button--primary.button--md.button--black.button");
	private By loginworten = By.cssSelector("#\\30 1G62RN8JEE428X09RB8JA900S > div.main-nav__container > div > div.main-nav__right-container > nav > ul > li.main-nav__login > button");
	private By iniciarsessao = By.cssSelector("#\\30 1G62RN8JEE428X09RB8JA900S > div.main-nav__container > div > div.main-nav__right-container > nav > ul > li.main-nav__login > div > div > a.button--primary.button--md.button--red.button.w-app-link.button--primary.button--md.button--red.button");
	private By primeiroitem = By.cssSelector("#__nuxt > div > div > div:nth-child(2) > div:nth-child(10) > div > section > div > div > div.scroll-content--no-scroll.scroll-content--grid.scroll-content--mobile-slider.scroll-content__container > article:nth-child(1) > a > figure > img");
	private By bicicletas = By.cssSelector("#__nuxt > div > div > div:nth-child(2) > div:nth-child(8) > div > section > div > div > div.scroll-content--no-scroll.scroll-content--grid.scroll-content--mobile-slider.scroll-content__container > article:nth-child(4) > a > figure > img");
	private By primeirabike = By.cssSelector("#filtered-grid > div > div > section > div > div.listing-content__list-container > ul > li:nth-child(2) > div > a > div > header > figure > img");
	private By adicionaraocarrinho = By.cssSelector("#__nuxt > div > div > div:nth-child(2) > div:nth-child(9) > div > section > div > div > div.product-heading__buy-boxes > div.buy-box > div:nth-child(2) > div > div.button-list > div > button");
	private By iraocarrinho = By.cssSelector("#RICH_RELEVANCE-_0 > div > footer > button.cross-sell-products__cart-btn.button--secondary.button--md.button--red.button.cross-sell-products__cart-btn");
	private By fecharNavegador = By.id("quite");
	
	public By getAceitartudo() {
		return aceitartudo;
	}

	public By getBarrapesquisa() {
		return barrapesquisa;
	}

	public By getResultadoworten() {
		return resultadoworten;
	}

	public By getAceitarworten() {
		return aceitarworten;
	}

	public By getLoginworten() {
		return loginworten;
	}

	public By getIniciarsessao() {
		return iniciarsessao;
	}

	public By getPrimeiroitem() {
		return primeiroitem;
	}

	public By getBicicletas() {
		return bicicletas;
	}

	public By getPrimeirabike() {
		return primeirabike;
	}

	public By getAdicionaraocarrinho() {
		return adicionaraocarrinho;
	}

	public By getIraocarrinho() {
		return iraocarrinho;
	}

	public By getFecharNavegador() {
		return fecharNavegador;
	}



	

}
