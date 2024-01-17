package LogInPage.VVnT.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import LogInPage.VVnT.Model.UserUniqRequest;
import LogInPage.VVnT.Model.WcagEntityRequest;
import LogInPage.VVnT.Service.UserService;
import LogInPage.VVnT.Utils.CommonResponse;

@RestController
@RequestMapping(value = "/api/user") // Add "/api" to the base path
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addUser(@Valid @RequestBody WcagEntityRequest req) {
		
		CommonResponse response = new CommonResponse();
		try {
			response = userService.addUser(req);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> getUser(@Valid @RequestBody WcagEntityRequest req) {

		CommonResponse response = new CommonResponse();
		try {
			response = userService.getUser(req);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/add/uniqDefect", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addUniqDefect(@Valid @RequestBody UserUniqRequest req) {
		
		CommonResponse response = new CommonResponse();
		try {
			response = userService.addUniqDefect(req);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/get/uniqDefect", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> getUniqDefect(@Valid @RequestBody UserUniqRequest req) {

		CommonResponse response = new CommonResponse();
		try {
			response = userService.getUniqDefect(req);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setCode(500);
			response.setMessage(e.getMessage());
			response.setError(true);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
}
