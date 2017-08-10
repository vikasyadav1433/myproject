package www.vikas.service;

import www.vikas.model.UserDetails;

public interface UserDetailsServiceInt {

	public String addUser(UserDetails ud);
	public UserDetails loginCheck(UserDetails ud);
}