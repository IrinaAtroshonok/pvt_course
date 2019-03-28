package facade;

public class FacadeMetod {
	AllMetodsForFacade metodsForFacade = new AllMetodsForFacade();

	public void autorization() {
		metodsForFacade.enterDataForAutorization();
		metodsForFacade.clickEnterButton();
	}
}
