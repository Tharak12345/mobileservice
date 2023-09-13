package mobile.com.example.mobileservice.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobiles")
public class Mobiles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long mobileId;
	public Mobiles(String mobileName, long detailsId) {
		super();
		this.mobileName = mobileName;
		this.detailsId = detailsId;
	}
	@Column
	private String mobileName;
	public long getMobileId() {
		return mobileId;
	}
	public void setMobileId(long mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public long getDetailsId() {
		return detailsId;
	}
	public void setDetailsId(long detailsId) {
		this.detailsId = detailsId;
	}
	@Column
	private long detailsId;
	
	public Mobiles() {
		
	}

}
