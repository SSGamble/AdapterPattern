package no_adapter.worker.impl;

import no_adapter.worker.ICooker;

/**
 * 厨师实现类
 */
public class QjdCooker implements ICooker {
	@Override
	public String cook() {
		return "烤制美味烤鸭";
	}
}
