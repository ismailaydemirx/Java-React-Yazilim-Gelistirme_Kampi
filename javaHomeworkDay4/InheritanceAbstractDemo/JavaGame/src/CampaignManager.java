
public class CampaignManager {
	
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý eklendi.");
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý silindi.");
	}
	
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý güncellendi.");
	}

}
