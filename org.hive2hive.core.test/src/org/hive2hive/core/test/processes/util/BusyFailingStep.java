package org.hive2hive.core.test.processes.util;

import org.hive2hive.core.processes.framework.exceptions.InvalidProcessStateException;

public class BusyFailingStep extends FailingProcessStep {

	@Override
	protected void doExecute() throws InvalidProcessStateException {
		
		// super busy
		TestUtil.wait(3000);

		super.doExecute();
	}
}