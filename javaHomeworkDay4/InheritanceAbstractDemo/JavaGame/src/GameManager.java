
public class GameManager {

	public void sales(Users user, Game game) {
		user.setBoughtGames(game);
		
		System.out.println(game.getName() + " oyununu " + user.getUserName() + " adlý oyuncu satýn aldý");
		
	}
	
	public void campaignSales(Game game, Campaign campaign) {
		game.setPrice(game.getPrice());
		System.out.println(game.getName() + " oyununun kampanyalý fiyatý : " + game.getPrice() );
	}

}
