
public class GameManager {

	public void sales(Users user, Game game) {
		user.setBoughtGames(game);
		
		System.out.println(game.getName() + " oyununu " + user.getUserName() + " adl� oyuncu sat�n ald�");
		
	}
	
	public void campaignSales(Game game, Campaign campaign) {
		game.setPrice(game.getPrice());
		System.out.println(game.getName() + " oyununun kampanyal� fiyat� : " + game.getPrice() );
	}

}
