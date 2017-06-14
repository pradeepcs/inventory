package org.csp.inventory.supply;

import org.csp.inventory.Application;
import org.csp.inventory.si.amqp.InventorySiAmqp.MyGateway;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplyManager {

	@RequestMapping("supply")
	public void addSupply(String item, String node, Double qty) {
		MyGateway gateway = Application.context.getBean(MyGateway.class);
        gateway.addSupply("foo-csp");
		
	}
	
}
