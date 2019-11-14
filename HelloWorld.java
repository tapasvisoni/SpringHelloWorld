/**
 * 
 */
package com.demo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author tsoni
 *
 */
public class HelloWorld {
	
	private String message;
	
	@Value("${sample.boolean")
	//@Value("#{new Boolean('${sample.boolean}')}") 
	private boolean isvalid;
       
	   public boolean isIsvalid() {
		return isvalid;
	}
	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}
	public void setMessage(String message){
	      this.message  = message;
	   }
	   public String getMessage(){
	      System.out.println("Your Message : " + message);
	      return message;
	   }

}
