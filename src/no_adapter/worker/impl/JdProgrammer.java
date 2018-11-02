package no_adapter.worker.impl;

import no_adapter.worker.IProgrammer;

/**
 * 程序员实现类
 */
public class JdProgrammer implements IProgrammer {
	@Override
	public String program() {
		return "编写高效程序";
	}
}
