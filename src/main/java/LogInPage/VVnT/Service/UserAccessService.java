package LogInPage.VVnT.Service;

import LogInPage.VVnT.Model.UserAccessRequest;
import LogInPage.VVnT.Utils.CommonResponse;

public interface UserAccessService {
	CommonResponse addUserAccess(UserAccessRequest req);
	 CommonResponse getUserAccess(UserAccessRequest req);
	
}
