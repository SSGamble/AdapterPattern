package some_adapter.test;

import some_adapter.adapters.IWorkerAdapter;
import some_adapter.adapters.impl.CookerAdapter;
import some_adapter.adapters.impl.ProgrammerAdapter;
import some_adapter.worker.ICooker;
import some_adapter.worker.IProgrammer;
import some_adapter.worker.impl.JdProgrammer;
import some_adapter.worker.impl.QjdCooker;
import java.util.ArrayList;
import java.util.List;

/**
 * 为每一个工种都定义一个适配器
 */
public class MyTest {

	public static void main(String[] args) {
		ICooker qjdCooker = new QjdCooker();
		IProgrammer jdProgrammer = new JdProgrammer();
		Object[] workers = {qjdCooker, jdProgrammer};
		
		// 循环遍历每个工种对象，让每个工种对象在适配器中逐个进行匹配
		for (Object worker : workers) {
			IWorkerAdapter adapter = getAdapter(worker);
			System.out.println(adapter.work(worker));
		}
	}

	/**
	 * 根据 worker 获取相应的适配器对象
	 * @param worker 任何工人对象
	 * @return
	 */
	private static IWorkerAdapter getAdapter(Object worker) {
		List<IWorkerAdapter> adapters = getAllAdapters();
		for (IWorkerAdapter adapter : adapters) {
			if(adapter.supports(worker)) {
				return adapter;
			}
		}
		return null;
	}

	/**
	 * 获取所有的适配器
	 */
	private static List<IWorkerAdapter> getAllAdapters() {
		List<IWorkerAdapter> adapters = new ArrayList<>();
		adapters.add(new CookerAdapter());
		adapters.add(new ProgrammerAdapter());
		return adapters;
	}
}
