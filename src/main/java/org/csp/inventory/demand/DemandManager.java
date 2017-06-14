package org.csp.inventory.demand;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemandManager {

	@RequestMapping("demand")
	public String reserveInventory(String item, String node, double qty) {
		return "hello";
	}
	
	public boolean checkAvailability(String item, String node, double qty) {
		return false;
	}
}
