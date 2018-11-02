package one_adapter.test;

import one_adapter.adapters.IWorkerAdapter;
import one_adapter.adapters.impl.WorkerAdapter;
import one_adapter.worker.ICooker;
import one_adapter.worker.IProgrammer;
import one_adapter.worker.impl.JdProgrammer;
import one_adapter.worker.impl.QjdCooker;

/**
 * 只定义一个适配器实现类
 */
public class MyTest {
	public static void main(String[] args) {
		ICooker qjdCooker = new QjdCooker();
		IProgrammer jdProgrammer = new JdProgrammer();
		Object[] workers = {qjdCooker, jdProgrammer};
		
		// 创建适配器对象
		IWorkerAdapter adapter = new WorkerAdapter();
		// 循环遍历每个工种对象，让每个工种对象在适配器中逐个进行匹配
		for (Object worker : workers) {
			String workContent = adapter.work(worker);
			System.out.println(workContent);
		}
	}
}
