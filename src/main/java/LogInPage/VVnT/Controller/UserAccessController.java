package LogInPage.VVnT.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import LogInPage.VVnT.Model.UserAccessRequest;
import LogInPage.VVnT.Service.UserAccessService;
import LogInPage.VVnT.Service.UserService;
import LogInPage.VVnT.Utils.CommonResponse;

@RestController
@RequestMapping(value = "user/access")
public class UserAccessController {
	@Autowired
	UserAccessService  userAccessService;
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addUserAccess(@Valid @RequestBody UserAccessRequest req) {
		
		CommonResponse response = new CommonResponse();
		try {
			response = userAccessService.addUserAccess(req);
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> getUserAccess(@Valid  UserAccessRequest req) {

		CommonResponse response = new CommonResponse();
		try {
			response = userAccessService.getUserAccess(req);
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		}
	}

}
