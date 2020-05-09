package com.capg.placeproductorder.exceptions;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException{
	  public IdNotFoundException(String msg){
	        super(msg);
	    }

	    public IdNotFoundException(String msg,Throwable exception){
	        super(msg,exception);
	    }

}
