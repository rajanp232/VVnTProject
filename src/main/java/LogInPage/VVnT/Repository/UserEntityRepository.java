package LogInPage.VVnT.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import LogInPage.VVnT.Entity.UserEntity;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, Integer> {

}
 