package LogInPage.VVnT.Service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import LogInPage.VVnT.Model.LoginRequest;
import LogInPage.VVnT.Utils.CommonResponse;
@Service
public interface UserLoginService {
  

	CommonResponse loginUser(@Valid LoginRequest req);
	
}
