/**
 * 
 */
package com.dsw.security.price;

import java.math.BigDecimal;

//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Liker
 *
 */
@RestController
@RequestMapping("/prices")
@Slf4j
public class PriceController {
	
	private static Logger log = LoggerFactory.getLogger(PriceController.class);
	
	@GetMapping("/{id}")
//	public PriceInfo getPrice(@PathVariable Long id, @AuthenticationPrincipal String username) {
	public PriceInfo getPrice(@PathVariable Long id) {
		log.info("productId is "+id);
//		log.info("user is "+ username);
		PriceInfo info = new PriceInfo();
		info.setId(id);
		info.setPrice(new BigDecimal(100));
		return info;
	}

}
