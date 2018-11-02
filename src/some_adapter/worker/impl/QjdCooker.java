package some_adapter.worker.impl;

import some_adapter.worker.ICooker;

public class QjdCooker implements ICooker {
	@Override
	public String cook() {
		return "烤制美味烤鸭";
	}

}
