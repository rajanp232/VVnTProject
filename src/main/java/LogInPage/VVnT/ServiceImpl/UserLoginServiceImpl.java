package LogInPage.VVnT.ServiceImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LogInPage.VVnT.Model.LoginRequest;
import LogInPage.VVnT.Repository.UserMasterRepository;
import LogInPage.VVnT.Service.UserLoginService;
import LogInPage.VVnT.Utils.CommonResponse;

@Service
public class UserLoginServiceImpl implements  UserLoginService{
    @Autowired
    UserMasterRepository userMasterRepository;
    
    
	@Override
	public CommonResponse loginUser(@Valid LoginRequest req) {
		CommonResponse response=new CommonResponse();
		
		Object resObj= userMasterRepository.loginUser(req.getCompany_name(),req.getUser_id(),req.getPassword());
		if (resObj!=null) {
			response.setMessage("login successful");
			response.setCode(200);
			response.setData(resObj);
			response.setError(false);
			return response;
		}
		response.setMessage(" Wrong Credential");
		response.setCode(404);
		response.setError(true);
		return response ;
	}

}
