package com.jpa;

import java.io.Serializable;

public class JwtResponse  implements Serializable{

	
	private static final long serialVersionUID = 2233993121679814785L;

private final String jwttoken;

public JwtResponse(String jwttoken) {
	super();
	this.jwttoken = jwttoken;
}

/**
 * @return the jwttoken
 */
public String getJwttoken() {
	return jwttoken;
}

}
