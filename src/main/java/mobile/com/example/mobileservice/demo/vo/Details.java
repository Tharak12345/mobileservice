package mobile.com.example.mobileservice.demo.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
public class Details {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long DetailsId;
	public Details(String storage, long cost, String ram) {
		super();
		Storage = storage;
		Cost = cost;
		Ram = ram;
	}
	@Column
	private String Storage;
	public long getDetailsId() {
		return DetailsId;
	}
	public void setDetailsId(long detailsId) {
		DetailsId = detailsId;
	}
	public String getStorage() {
		return Storage;
	}
	public void setStorage(String storage) {
		Storage = storage;
	}
	public long getCost() {
		return Cost;
	}
	public void setCost(long cost) {
		Cost = cost;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	@Column
	private long Cost;
	@Column
	private String Ram;
	
	public Details() {
		
	}

}

