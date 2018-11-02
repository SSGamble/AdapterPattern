package some_adapter.adapters;

/**
 * 通用的适配器接口
 */
public interface IWorkerAdapter {
	String work(Object worker);
	boolean supports(Object worker);
}
