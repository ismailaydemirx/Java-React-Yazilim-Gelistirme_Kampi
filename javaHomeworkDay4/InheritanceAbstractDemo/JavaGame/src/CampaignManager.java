
public class CampaignManager {
	
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� eklendi.");
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� silindi.");
	}
	
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� g�ncellendi.");
	}

}
