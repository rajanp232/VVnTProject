package LogInPage.VVnT.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import LogInPage.VVnT.Entity.CompanyMaster;
import LogInPage.VVnT.Entity.UserEntity;


public interface CompanyMasterRepository extends CrudRepository<CompanyMaster, String > {

//	Optional<CompanyMaster> findByCompanyName(String username);
//
//	Optional<UserEntity> findByUserIdAndPassword(String username, String password);

}
