/**
 * 
 */
package org.pjay.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vijayk
 *
 */
@RestController
public class SpringbootProfilesMavenConfigController {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootProfilesMavenConfigController.class);
	
	@Value("${current.profile:NA}")
	private String profile;
	
	@GetMapping(value = { "/", "/profile" })
	public ResponseEntity<String> getProfile(){
		log.info("Start of method getProfile() output {}", profile);
		return new ResponseEntity<>(profile, HttpStatus.OK);
	}

}
