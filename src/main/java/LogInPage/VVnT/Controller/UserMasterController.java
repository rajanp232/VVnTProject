package LogInPage.VVnT.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import LogInPage.VVnT.Exception.UserMasterException;
import LogInPage.VVnT.Model.UserMasterRequest;
import LogInPage.VVnT.Service.UserMasterService;
import LogInPage.VVnT.Utils.CommonResponse;

@RestController
//@RequestMapping(value = "user/master")
public class UserMasterController {
    
    @Autowired
    UserMasterService userMasterService;

    @RequestMapping(value = "user/master/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addUserMaster(@Valid @RequestBody UserMasterRequest req) {
        CommonResponse response = new CommonResponse();
        try {
            response = userMasterService.addUserMaster(req);
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCode(500);
            response.setMessage(e.getMessage());
            response.setError(true);
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        }
    }

//    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
    @GetMapping("user/master/get")
    public ResponseEntity<Object> getUserMaster(@Valid  UserMasterRequest req) throws UserMasterException {
        CommonResponse response = new CommonResponse();
        try {
            response = userMasterService.getUserMaster(req);
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCode(500);
            response.setMessage(e.getMessage());
            response.setError(true);
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        }
    }

}
