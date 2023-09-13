package mobile.com.example.mobileservice.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mobile.com.example.mobileservice.demo.entity.Mobiles;
@Repository
public interface MobileRepo extends JpaRepository<Mobiles, Long> {

	Mobiles save(Mobiles mobiles);

}
