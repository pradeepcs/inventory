package org.csp.inventory.supply;

import org.csp.inventory.Application;
import org.csp.inventory.model.Stock;
import org.csp.inventory.si.amqp.InventorySiAmqp.ManageSupply;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("supply")
public class SupplyManager {
	
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public void addSupply(@RequestBody Stock stock) {
		Application.context.getBean(ManageSupply.class).addSupply("foo-csp");
	}
	
}
