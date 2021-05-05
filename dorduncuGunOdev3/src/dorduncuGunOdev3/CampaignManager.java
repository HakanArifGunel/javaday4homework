package dorduncuGunOdev3;

public class CampaignManager extends Campaign{
	
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.id +" Numaralý kampanya sisteme eklendi");
	}

	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.id +" Numaralý kampanya sistemden silindi");
	}

	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.id +" Numaralý kampanya sistemde güncellendi");
	}
}
