package LogInPage.VVnT.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import LogInPage.VVnT.Entity.WCAG_Guidelines;

@Repository
public interface WcagEntityRepository extends CrudRepository<WCAG_Guidelines,String> {
 
}
