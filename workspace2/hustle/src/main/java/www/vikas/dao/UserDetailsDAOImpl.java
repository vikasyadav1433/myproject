package www.vikas.dao;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Repository;

import www.vikas.model.UserDetails;

@Repository
public class UserDetailsDAOImpl implements UserDetailsDAOInt {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public String addUser(UserDetails ud) {
		Session ses = sessionFactory.openSession();		
	//	ud.setUserid(generateUserId());
		ses.save(ud);// save ud as record in table by executing insert qr
		ses.flush();
		ses.close();
		saveUserImage(ud);
		return ud.getUserid();
	}
	
	
	public UserDetails loginCheck(UserDetails ud) {
		
		Session ses = sessionFactory.openSession();
		String qr = "from UserDetails where userid=? and password=? and enabled=true";
		Query qry=ses.createQuery(qr);
		qry.setParameter(0, ud.getUserid());
		qry.setParameter(1, ud.getPassword());
		UserDetails result=(UserDetails)qry.uniqueResult();
		ses.close();		
		return result;
	}







	
	
	
	
	
	
private void saveUserImage(UserDetails ud){
		
		System.out.print("\nprd img : " + ud.getImageFile());	
			
		try{				    	
			if (ud.getImageFile() != null ) {	
				//C:\DT-22-Workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\project1\
				//C:\DT-22-Workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\project1\resources\images\products
				
	           //Path path=Paths.get("C://DT-22-Workspace//project1//src//main//webapp//resources//images//users//"+ud.getUserid()+".jpg");	
				Path path=Paths.get("F://workspace2//hustle//src//main//webapp//resources//images//customers//"+ud.getUserid()+".jpg");
	           	ud.getImageFile().transferTo(new File(path.toString()));                       	
	            System.out.print("\nUser Image saved");	            
	        }				
		}
		catch(Exception ex){
			System.out.print("\nUser Image not saved...");
		}				
	}	
	
	
	
	

}
