package LogInPage.VVnT.Service;

import javax.validation.Valid;

import LogInPage.VVnT.Entity.CompanyMaster;
import LogInPage.VVnT.Model.CompanyMasterRequest;
import LogInPage.VVnT.Model.UserMasterRequest;

import LogInPage.VVnT.Model.UserUniqRequest;
import LogInPage.VVnT.Model.WcagEntityRequest;
import LogInPage.VVnT.Utils.CommonResponse;

public interface UserService {
 
    CommonResponse getUser(WcagEntityRequest req);

	boolean authenticate(Object userName, Object password);

	CommonResponse addUser(	WcagEntityRequest req);
	CommonResponse getUniqDefect(UserUniqRequest req);
	boolean authenticate1(Object userName, Object password);
	CommonResponse addUniqDefect(UserUniqRequest req);

	
	
	

	
	
}