package com.services.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.dao.t1002Dao;
import com.services.dao.t1008Dao;
import com.services.dao.t1010Dao;
import com.services.mail.EmailUtil;
import com.services.model.t001;
import com.services.model.t1002;
import com.services.model.t1008;
import com.services.model.t1010;

@RestController
@RequestMapping("/driver")
public class driverController {

	@Autowired
	t1002Dao t1002Dao; 
	@Autowired
	t1008Dao t1008Dao;
	@Autowired
	t1010Dao t1010Dao;
	
	@PostMapping(path="/signup",
			consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
			produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
	)
	public t001 driversignup(@RequestBody t1002 t1002 )
	{
		
		t001 t001=new t001();
		ArrayList<String> Str=new ArrayList<String>();
		List<t1002> lstt1002=t1002Dao.findAll();
		if(t1002Dao.findByc1006(t1002.getC1006())!=null){
			t001.setC1002("3");
		}
		else if(t1002.getC1002().isEmpty() || t1002.getC1003().isEmpty() || t1002.getC1004().isEmpty() || t1002.getC1005().isEmpty() || t1002.getC1006().isEmpty() || t1002.getC1007().isEmpty() )
		{
			t001.setC1002("2");
		}else{
			t001.setC1002("1");
			String uniqueReferralcode;
			String otp;
			lstt1002.forEach(x->Str.add(x.getC1009()));
			do
			{
				//uniqueString = UUID.randomUUID().toString();
				uniqueReferralcode=getAlphaNumericString(8);
			}
			while(Str.contains(uniqueReferralcode));
			otp=getAlphaNumericString(4);
			t1002.setC1008(otp);
			t1002.setC1009(uniqueReferralcode);
			t1002Dao.save(t1002);
			t001.setC1003(uniqueReferralcode);
			sendMail(t1002.getC1005(), otp);
		}
		return t001;
		
	}
	public void sendMail(String toemail,String otp){
		String mailStr=new String();
	        mailStr=otp;
	        
	    	     	        
	        final String fromEmail = "carassistcekauto@gmail.com"; //requires valid gmail id     	        
			final String password = "mypassword@9"; // correct password for gmail id
			final String toEmail = toemail; // can be any email id 
			
			System.out.println("Email Start");
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
			props.put("mail.smtp.port", "587"); //TLS Port
			props.put("mail.smtp.auth", "true"); //enable authentication
			props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
			
	                //create Authenticator object to pass in Session.getInstance argument
			Authenticator auth = new Authenticator() {
				//override the getPasswordAuthentication method
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromEmail, password);
				}
			};
			Session session = Session.getInstance(props, auth);
			
			EmailUtil.sendEmail(session, fromEmail,"",toEmail,"otp send", mailStr);
			
	}

	public String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        if(n==4){
        	AlphaNumericString = "0123456789";
        }
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
	
	@PostMapping(path="/otpverification",
			consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
			produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
	)
	public t001 driverotpverification(@RequestBody t1002 t1002 )
	{
		t001 t001=new t001();
		ArrayList<String> Str=new ArrayList<String>();
		t1002 t10022=t1002Dao.findByc1006(t1002.getC1006());
		List<t1002> lstt1002=t1002Dao.findAll();
		if(t1002.getC1008().equals(t10022.getC1008())){
			t001.setC1002("1");
			String uuid;
			lstt1002.forEach(x->Str.add(x.getC1009()));
			do
			{
				uuid = UUID.randomUUID().toString();
			}
			while(Str.contains(uuid));			
			
			if(t10022.getC1013()==null || t10022.getC1013().equals("")){t10022.setC1013(uuid+t10022.getId());}
			t1002Dao.save(t10022);
			t001.setC1003(t10022.getC1013());
			
		}else{
			t001.setC1002("2");
		}
		return t001;
	}
	
	@PostMapping(path="/carddetails",
			consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
			produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
	)
	public t001 drivercarddetails(@RequestBody t1008 t1008 ){
		t001 t001=new t001();
		try{		
			t1008Dao.save(t1008);
			t001.setC1002("1");
		}catch(Exception e){
			t001.setC1002("2");
		}
		
		return t001;
	}
	
	@PostMapping(path="/insurancedetails",
			consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
			produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
	)
	public t001 driverinsurancedetails(@RequestBody t1010 t1010 ){
		t001 t001=new t001();
		try{		
			t1010Dao.save(t1010);
			t001.setC1002("1");
		}catch(Exception e){
			t001.setC1002("2");
		}
		
		return t001;
	}

}
