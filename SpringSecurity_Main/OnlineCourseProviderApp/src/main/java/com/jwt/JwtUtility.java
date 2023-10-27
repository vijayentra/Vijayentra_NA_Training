package com.jwt;



import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.service.UserDetailsImpl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JwtUtility {
	

	@Value("${jwtSecret}")
	private String jwtSecret;

	@Value("${jwtExpirationMs}")
	private int jwtExpirationMs;

	public String generateToken(Authentication authentication) {
		String username = ((UserDetailsImpl)authentication.getPrincipal()).getUsername();
		Date now = new Date();
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(now)
				.setExpiration(new Date(now.getTime()+jwtExpirationMs))
				.signWith(SignatureAlgorithm.HS512, jwtSecret)
				.compact();
	}

	public boolean validateToken(String token) {
		parse(token);
		return true;
	}
	
	public String getUsername(String token) {
		return parse(token).getBody().getSubject();
	}
	
	public Jws<Claims> parse(String token){
		return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
	}
}
