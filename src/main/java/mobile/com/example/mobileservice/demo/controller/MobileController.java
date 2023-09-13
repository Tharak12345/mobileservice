package mobile.com.example.mobileservice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mobile.com.example.mobileservice.demo.Service.MobileService;
import mobile.com.example.mobileservice.demo.entity.Mobiles;
import mobile.com.example.mobileservice.demo.vo.ResponseVo;

@RestController
@RequestMapping("/mobiles")
public class MobileController {
	@Autowired
	private MobileService mobileservice;
	@PostMapping("/")
	public ResponseEntity<Mobiles> saveMobile(@RequestBody Mobiles mobiles) {
		return new ResponseEntity<Mobiles>(mobileservice.saveMobile(mobiles),HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<ResponseVo> getDetailsWithMobiles(@PathVariable("id") long id){
		return new ResponseEntity<ResponseVo>(mobileservice.getDetailsWithMobiles(id),HttpStatus.OK);
	}

}
