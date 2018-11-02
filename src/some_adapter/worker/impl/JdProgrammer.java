package some_adapter.worker.impl;

import some_adapter.worker.IProgrammer;

public class JdProgrammer implements IProgrammer {
	@Override
	public String program() {
		return "编写高效程序";
	}

}
