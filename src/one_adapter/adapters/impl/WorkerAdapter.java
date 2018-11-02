package one_adapter.adapters.impl;

import one_adapter.adapters.IWorkerAdapter;
import one_adapter.worker.ICooker;
import one_adapter.worker.IProgrammer;

/**
 * 适配器类
 */
public class WorkerAdapter implements IWorkerAdapter {
	@Override
	public String work(Object worker) {
		String workContent = "";
		// 若传来的对象是厨师，则调用其 cook()方法
		if(worker instanceof ICooker) {
			workContent = ((ICooker)worker).cook();
		} else if(worker instanceof IProgrammer) {
			workContent = ((IProgrammer)worker).program();
		}
		return workContent;
	}
}
