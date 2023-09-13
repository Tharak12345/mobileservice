package mobile.com.example.mobileservice.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import mobile.com.example.mobileservice.demo.Repository.MobileRepo;
import mobile.com.example.mobileservice.demo.Service.MobileService;
import mobile.com.example.mobileservice.demo.entity.Mobiles;
import mobile.com.example.mobileservice.demo.vo.Details;
import mobile.com.example.mobileservice.demo.vo.ResponseVo;
@Service
public class ServiceImpl implements MobileService{
	@Autowired
	private MobileRepo mobilerepo;

	@Override
	public Mobiles saveMobile(Mobiles mobiles) {
		return mobilerepo.save(mobiles);
	}

	@Override
	public ResponseVo getDetailsWithMobiles(long id) {
		ResponseVo response = new ResponseVo();
		Mobiles mobiles = mobilerepo.findById(id).get();
		RestTemplate restTemplate = new RestTemplate();
		Details details = restTemplate.getForObject("http://localhost:8083/details/"+mobiles.getDetailsId(), Details.class);
		response.setDetails(details);
		response.setMobiles(mobiles);
		return response;
	}

}
