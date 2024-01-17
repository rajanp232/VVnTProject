package LogInPage.VVnT.Controller;

import javax.security.auth.login.LoginException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LogInPage.VVnT.Model.LoginRequest;
import LogInPage.VVnT.Service.UserLoginService;
import LogInPage.VVnT.Utils.CommonResponse;

@RestController
@Validated
@RequestMapping(value = "/userlogin")
public class LoginController {
	@Autowired
	private UserLoginService userLoginService;

	@PostMapping("/login")
	public ResponseEntity<Object> loginUser(@Valid @RequestBody LoginRequest req) {
		CommonResponse response = new CommonResponse();
		try {
			response = userLoginService.loginUser(req);
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<Object>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
@GetMapping("/loginUser")
	private ResponseEntity<Object> loginPage(@Valid LoginRequest req) throws LoginException {
		CommonResponse response = new CommonResponse();
		try {
			response = userLoginService.loginUser(req);
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<Object>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
