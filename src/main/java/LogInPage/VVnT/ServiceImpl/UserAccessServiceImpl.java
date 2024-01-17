package LogInPage.VVnT.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LogInPage.VVnT.Entity.UserAccess;
import LogInPage.VVnT.Model.UserAccessRequest;
import LogInPage.VVnT.Model.UserAccessResponse;
import LogInPage.VVnT.Repository.UserAccessRepository;
import LogInPage.VVnT.Service.UserAccessService;
import LogInPage.VVnT.Utils.CommonResponse;

@Service
public class UserAccessServiceImpl implements UserAccessService {
	@Autowired
	UserAccessRepository userAccessRepository;

	@Override
	public CommonResponse addUserAccess(UserAccessRequest req) {
		CommonResponse response = new CommonResponse();
		UserAccess user = new UserAccess();
		try {
			user.setUser_id(req.getUser_id());
			user.setUrl(req.getUrl());
			user.setType_of_access(req.getType_of_access());
			userAccessRepository.save(user);
			response.setMessage("Added successfuly");
		} catch (Exception e) {
			response.setCode(500);
			response.setError(true);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	@Override
	public CommonResponse getUserAccess(UserAccessRequest req) {
		CommonResponse response = new CommonResponse();
		Iterable<UserAccess> userList = new ArrayList<>();
		ArrayList<UserAccessResponse> resList = new ArrayList<>();
		userList = userAccessRepository.findAll();
		for (UserAccess user : userList) {
			if (user != null) {
				UserAccessResponse res = new UserAccessResponse();
				res.setUser_id(user.getUser_id());
				res.setUrl(user.getUrl());
				res.setType_of_access(user.getType_of_access());
				resList.add(res);
			}
		}
		response.setData(resList);
		return response;

	}

}
