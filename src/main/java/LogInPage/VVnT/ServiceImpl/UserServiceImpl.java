package LogInPage.VVnT.ServiceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.apache.catalina.User;
import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.AbstractListenerWriteFlushProcessor;
import org.springframework.stereotype.Service;

import LogInPage.VVnT.Entity.CompanyMaster;

import LogInPage.VVnT.Entity.UniqueDefect;
import LogInPage.VVnT.Entity.UserEntity;
import LogInPage.VVnT.Entity.UserMaster;
import LogInPage.VVnT.Entity.WCAG_Guidelines;
import LogInPage.VVnT.Model.CompanyMasterRequest;
import LogInPage.VVnT.Model.CompanyMasterResponse;
import LogInPage.VVnT.Model.UserMasterRequest;
import LogInPage.VVnT.Model.UserMasterResponse;
import LogInPage.VVnT.Model.UserUniqRequest;
import LogInPage.VVnT.Model.UserUniqResponse;
import LogInPage.VVnT.Model.WcagEntityRequest;
import LogInPage.VVnT.Model.WcagEntityResponse;
import LogInPage.VVnT.Repository.CompanyMasterRepository;
import LogInPage.VVnT.Repository.UniqEntityRepository;
import LogInPage.VVnT.Repository.UserEntityRepository;
import LogInPage.VVnT.Repository.UserMasterRepository;
import LogInPage.VVnT.Repository.WcagEntityRepository;
import LogInPage.VVnT.Service.UserService;
import LogInPage.VVnT.Utils.CommonResponse;
import jakarta.validation.constraints.AssertFalse.List;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UniqEntityRepository uniqEntityRepository;
    @Autowired
	WcagEntityRepository wcagEntityRepository;
    @Override
	public CommonResponse addUser(WcagEntityRequest req) {
		CommonResponse response = new CommonResponse();
		WCAG_Guidelines user = new WCAG_Guidelines();
		user.setID(req.getID());
		user.setCategory(req.getCategory());
		user.setGuideline(req.getGuidline());
		user.setLevel(req.getLevel());
		user.setPrinciple(req.getPrinciple());
		
		
		wcagEntityRepository.save(user);
		
		response.setMessage("Added successfuly");
		return response;
	}
	@Override
	public CommonResponse getUser(WcagEntityRequest req) {
		CommonResponse response = new CommonResponse();
		Iterable<WCAG_Guidelines> userList = new ArrayList<>();
		ArrayList<WcagEntityResponse> resList = new ArrayList<>();
		userList = wcagEntityRepository.findAll();
		for (WCAG_Guidelines  user: userList) {
			if(user != null) {
			WcagEntityResponse res = new WcagEntityResponse();
			res.setID(user.getID());
			res.setCategory(user.getCategory());
			res.setGuidline(user.getGuideline());
			res.setLevel(user.getLevel());
			res.setPrinciple(user.getPrinciple());
			resList.add(res);
			}
		}
		response.setData(resList);
		return response;
	}
     @Override
	public CommonResponse addUniqDefect(UserUniqRequest req) {
		CommonResponse response = new CommonResponse();
		UniqueDefect user = new UniqueDefect();
		user.setDateandtime(req.getDateandtime());
		user.setSource(req.getSource());
		user.setUrl(req.getUrl());
		user.setTitle(req.getTitle());
		user.setDescription(req.getDescription());
		user.setPath(req.getPath());
		user.setCode_snippet(req.getCode_snippet());
		user.setImpact(req.getImpact());
		user.setSuccess_criteria(req.getSucces_criteria());
		user.setRecommendation(req.getRecommendation());
		uniqEntityRepository.save(user);
		
		response.setMessage("Added successfuly");
		return response;
	}
     @Override
     public CommonResponse getUniqDefect(UserUniqRequest req) {
    	 CommonResponse response=new 	CommonResponse();
    	 Iterable<UniqueDefect>userList=new ArrayList<>();
		ArrayList<UserUniqResponse>resList=new ArrayList<>();
		userList=uniqEntityRepository.findAll();
		for (UniqueDefect  user: userList) {
			if(user != null) {
			UserUniqResponse res = new UserUniqResponse();
			res.setDateandtime(user.getDateandtime());
			res.setSource(user.getSource());
			res.setUrl(user.getUrl());
			res.setTitle(user.getTitle());
			res.setDescription(user.getDescription());
			res.setPath(user.getPath());
			res.setCode_snippet(user.getCode_snippet());
			res.setImpact(user.getImpact());
			res.setSuccess_criteria(user.getSuccess_criteria());
			res.setRecommendation(user.getRecommendation());
			resList.add(res);
			}
		}
		response.setData(resList);
		return response;	
			}
	@Override
	public boolean authenticate(Object userName, Object password) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean authenticate1(Object userName, Object password) {
		// TODO Auto-generated method stub
		return false;
		}

	
}
