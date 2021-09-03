package com.aws.pattern.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResource {
	
	private final Logger log = LoggerFactory.getLogger(HelloResource.class);
	
	/**
	 * Say hello
	 * @return String
	 */
    @GetMapping
    public ResponseEntity<String> sayHello() {
        log.debug("REST request to say hello");
        return ResponseEntity
                .ok()
                .body("Hello !!!!");
    }


}
