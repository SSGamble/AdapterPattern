package some_adapter.adapters.impl;

import some_adapter.adapters.IWorkerAdapter;
import some_adapter.worker.ICooker;

/**
 * 厨师适配器
 */
public class CookerAdapter implements IWorkerAdapter {
	@Override
	public String work(Object worker) {
		return ((ICooker)worker).cook();
	}

	@Override
	public boolean supports(Object worker) {
		return (worker instanceof ICooker);
	}

}
