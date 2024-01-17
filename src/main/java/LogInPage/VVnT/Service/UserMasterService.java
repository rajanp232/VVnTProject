package LogInPage.VVnT.Service;

import LogInPage.VVnT.Model.UserMasterRequest;
import LogInPage.VVnT.Utils.CommonResponse;

public interface UserMasterService {

    CommonResponse getUserMaster( UserMasterRequest req);

	CommonResponse addUserMaster(UserMasterRequest req);

}
