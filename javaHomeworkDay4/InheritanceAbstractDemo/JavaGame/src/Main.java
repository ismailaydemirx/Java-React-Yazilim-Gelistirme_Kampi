
public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		game.setCategory("Strateji");
		game.setName("League Of Legends");
		game.setPrice(27.99);
		System.out.println(game.getCategory() + " kategorisindeki " + game.getName() + " adlý oyunun fiyatý :"
				+ game.getPrice());

		Users user = new Users();
		user.setUserName("ismail");
		user.setDateOfBirth("2001");
		user.setMail("ismailaydemir@gmail.com");
		user.setBoughtGames(game);

		Campaign campaign = new Campaign();

		campaign.setCampaignRate(0.3f);
		campaign.setCampaignTime(3);
		campaign.setName("eglencemodu");

		UsersManager usersmanager = new UsersManager();
		usersmanager.register(user);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);

		GameManager gameManager = new GameManager();
		gameManager.sales(user, game);
		gameManager.campaignSales(game, campaign);
	}

}
