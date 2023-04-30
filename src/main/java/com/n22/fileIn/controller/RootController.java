/**
 * 
 */
package com.n22.fileIn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n22.fileIn.variables.PrimeVariables;

/**
 * @author Nishanthan
 *
 */

@RestController
@RequestMapping( value= {"/n22/fileIn","/n22/fn"} )
public class RootController {

	@GetMapping(name = "welcome_api",value = "/welcome")
	public String welcomeAPI() {
		
		String welcomeStr = PrimeVariables.WELCOME_STRING;
		return welcomeStr;
		
	}
}
