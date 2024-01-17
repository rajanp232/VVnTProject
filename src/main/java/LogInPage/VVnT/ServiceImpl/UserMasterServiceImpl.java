package LogInPage.VVnT.ServiceImpl;

import java.util.ArrayList;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LogInPage.VVnT.Entity.UserMaster;
import LogInPage.VVnT.Model.UserMasterRequest;
import LogInPage.VVnT.Model.UserMasterResponse;
import LogInPage.VVnT.Repository.UserMasterRepository;
import LogInPage.VVnT.Service.UserMasterService;
import LogInPage.VVnT.Utils.CommonResponse;
@Service
public class UserMasterServiceImpl implements UserMasterService {
	@Autowired
	UserMasterRepository userMasterRepository;
	public CommonResponse addUserMaster(UserMasterRequest req) {
		CommonResponse response=new CommonResponse();
		UserMaster user= new UserMaster();
		try {
			user.setCompany_code(req.getCompany_code());
			user.setUser_id(req.getUser_id());
			user.setPassword(req.getPassword());
			user.setEmail_id(req.getEmail_id());
			user.setContact_details(req.getContact_details());
			user.setType_of_users(req.getType_of_users());
			userMasterRepository.save(user);
			response.setMessage("Added successfuly");			
		} catch (Exception e) {
			response.setCode(500);
			response.setError(true);
			response.setMessage(e.getMessage());
		}
		return response;
	}
	public CommonResponse getUserMaster(UserMasterRequest req) {
		CommonResponse response=new CommonResponse();
//		UserMaster user=new UserMaster();
		Iterable<UserMaster> userList = new ArrayList<>();
		ArrayList<UserMasterResponse> resList= new ArrayList<>();
		userList=userMasterRepository.findAll();
		for(UserMaster user:userList) {
		if(user!=null) {
			UserMasterResponse res=new UserMasterResponse();
			res.setCompany_code(user.getCompany_code());
			res.setUser_id(user.getUser_id());
			res.setPassword(user.getPassword());
			res.setEmail_id(user.getEmail_id());
			res.setContact_deatils(user.getContact_details());
			res.setType_of_user(user.getType_of_users());
			resList.add(res);
		}
		
	}
	response.setData(resList);
	return response;
}
}
