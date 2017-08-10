package www.vikas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.vikas.dao.UserDetailsDAOInt;
import www.vikas.model.UserDetails;

@Service
public class UserDetailsServicesImpl implements UserDetailsServiceInt {

	@Autowired
	private UserDetailsDAOInt userDetailsDao;
	
	public String addUser(UserDetails ud) {		
		return userDetailsDao.addUser(ud);
	}

	public UserDetails loginCheck(UserDetails ud) {		
		return userDetailsDao.loginCheck(ud);
	}
	
	

}