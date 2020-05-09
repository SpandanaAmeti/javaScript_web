package com.capg.placeproductorder.exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {
	 public UserNotFoundException(String msg)
	 
	    {
	        super(msg);
	    }
	    public UserNotFoundException(String msg,Throwable exception)
	    {
	        super(msg,exception);
	    }
}
