
public class CampaignManager {
	
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası eklendi.");
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası silindi.");
	}
	
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası güncellendi.");
	}

}
