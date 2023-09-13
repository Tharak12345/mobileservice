package mobile.com.example.mobileservice.demo.vo;

import mobile.com.example.mobileservice.demo.entity.Mobiles;

public class ResponseVo {
	
	private Mobiles mobiles;
	private Details details;
	
	public Mobiles getMobiles() {
		return mobiles;
	}
	public void setMobiles(Mobiles mobiles) {
		this.mobiles = mobiles;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}

}
