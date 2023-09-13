package mobile.com.example.mobileservice.demo.Service;

import mobile.com.example.mobileservice.demo.entity.Mobiles;
import mobile.com.example.mobileservice.demo.vo.ResponseVo;

public interface MobileService {

	Mobiles saveMobile(Mobiles mobiles);

	ResponseVo getDetailsWithMobiles(long id);

	

}
