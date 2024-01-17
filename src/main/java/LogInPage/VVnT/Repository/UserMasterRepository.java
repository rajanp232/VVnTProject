package LogInPage.VVnT.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import LogInPage.VVnT.Entity.UserEntity;
import LogInPage.VVnT.Entity.UserMaster;
import LogInPage.VVnT.Model.LoginRequest;

public interface UserMasterRepository extends CrudRepository<UserMaster, String> {

//	Optional<UserEntity> findByUser_idAndPassword(String user_id, String password);

	@Query(value = "SELECT * from user_master um join company_master cm on (um.company_code=cm.company_code) WHERE cm.company_name= :company_name AND um.user_id= :user_id AND um.password= :password ", nativeQuery = true)
	Object loginUser(@Param("company_name") String company_name, @Param("user_id") String user_id, @Param("password") String password);

}
