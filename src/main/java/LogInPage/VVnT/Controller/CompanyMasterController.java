//package LogInPage.VVnT.Controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import LogInPage.VVnT.Model.CompanyMasterRequest;
//import LogInPage.VVnT.Service.CompanyMasterService;
//import LogInPage.VVnT.Utils.CommonResponse;
//import jakarta.validation.constraints.NotNull;
//
//@RestController
//@RequestMapping(value = "user/company")
//public class CompanyMasterController {
//	@Autowired
//	CompanyMasterService companyMasterService;
//
//	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
//	public ResponseEntity<Object> addCompanyMaster(@Valid @RequestBody CompanyMasterRequest req) {
//
//		CommonResponse response = new CommonResponse();
//		try {
//			response = companyMasterService.addCompanyMaster(req);
//			return new ResponseEntity<Object>(response, HttpStatus.OK);
//		} catch (Exception e) {
//			response.setCode(500);
//			response.setMessage(e.getMessage());
//			response.setError(true);
//			return new ResponseEntity<Object>(response, HttpStatus.OK);
//		}
//	}
//
//	@GetMapping(value = "/get", consumes ="application/json", produces = "application/json")
//	public ResponseEntity<Object> getCompanyMaster(@Valid @NotNull @RequestBody CompanyMasterRequest req) {
//
//		CommonResponse response = new CommonResponse();
//		try {
//			response = companyMasterService.addCompanyMaster(req);
//			return new ResponseEntity<Object>(response, HttpStatus.OK);
//		} catch (Exception e) {
//			response.setCode(500);
//			response.setMessage(e.getMessage());
//			response.setError(true);
//			return new ResponseEntity<Object>(response, HttpStatus.OK);
//		}
//	}
//}
