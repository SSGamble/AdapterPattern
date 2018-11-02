package no_adapter.test;

import no_adapter.worker.ICooker;
import no_adapter.worker.IProgrammer;
import no_adapter.worker.impl.JdProgrammer;
import no_adapter.worker.impl.QjdCooker;

/**
 * 无适配器的实现方法
 */
public class MyTest {
	public static void main(String[] args) {
		ICooker qjdCooker = new QjdCooker();
		IProgrammer jdProgrammer = new JdProgrammer();
		System.out.println(qjdCooker.cook());
		System.out.println(jdProgrammer.program());
	}
}
