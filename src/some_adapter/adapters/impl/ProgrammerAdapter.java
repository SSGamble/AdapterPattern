package some_adapter.adapters.impl;

import some_adapter.worker.IProgrammer;
import some_adapter.adapters.IWorkerAdapter;

/**
 * 程序员适配器
 */
public class ProgrammerAdapter implements IWorkerAdapter {
	@Override
	public String work(Object worker) {
		return ((IProgrammer)worker).program();
	}

	@Override
	public boolean supports(Object worker) {
		return (worker instanceof IProgrammer);
	}
}
