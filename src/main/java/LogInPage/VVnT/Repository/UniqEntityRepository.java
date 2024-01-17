package LogInPage.VVnT.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import LogInPage.VVnT.Entity.UniqueDefect;
@Repository
public interface UniqEntityRepository extends CrudRepository<UniqueDefect,String> {

}
