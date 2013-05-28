/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import klapersuite.backbone.dtmc.*;
import rmc.core.*;
import rmc.importer.dtmc.Transfomation;

public class RmcImporterTest {

	@Test
	public void testModelName() throws NumberFormatException, NodeInstantiationException, NodeNotFoundException, ProbabilityException, ModuleInstantiationException {
		assertEquals(new DtmcModelStub(null).getName(), (new Transfomation()).generateRMC(new DtmcModelStub(new ArrayList<IDtmcModule>())).name);
	}
	public void testModelModule() throws NumberFormatException, NodeInstantiationException, NodeNotFoundException, ProbabilityException, ModuleInstantiationException {
		DtmcModuleStub m1 = new DtmcModuleStub(true);
		DtmcModuleStub m2 = new DtmcModuleStub(false);
		ArrayList<IDtmcModule> modules = new ArrayList<IDtmcModule>();
		modules.add(m1);
		modules.add(m2);	

		Transfomation t = new Transfomation();
		RMC rmc = t.generateRMC(new DtmcModelStub(modules));
		assertEquals(2, rmc.getModules().size());
		assertEquals(2, t.modules.size());
		assertNotNull(rmc.getInitialModule());
		assertEquals("module", rmc.getInitialModule().getName());
	}
	public void baseModelWithOneModuleContainingAStartAndAnEnd() throws NumberFormatException, NodeInstantiationException, NodeNotFoundException, ProbabilityException, ModuleInstantiationException {
		(new Transfomation()).mapModule(new RMC(null), new DtmcModuleStub(true), new Module("test"));
	}
}
class DtmcNodeStub implements IDtmcNode {
	public List<IDtmcTransition> getInTransitions() {
		return null;
	}
	public String getName() {
		return null;
	}
	public List<IDtmcTransition> getOutTransitions() {
		return null;
	}
	public boolean isEndNode() {
		return false;
	}
	public boolean isFailNode() {
		return false;
	}
	public boolean isStartNode() {
		return false;
	}
}
class DtmcModelStub implements IDtmcModel {
	private List<IDtmcModule> modules;
	public DtmcModelStub(List<IDtmcModule> arrayList) {
		this.modules=arrayList;
	}
	public List<IDtmcModule> getModules() {
		return modules;
	}
	public String getName() {
		return "test";
	}
}
class DtmcModuleStub implements IDtmcModule {
	private boolean isAutonomous;
	public DtmcModuleStub(boolean isAutonomous) {
		this.isAutonomous = isAutonomous;
	}
	public String getName() {
		return "module";
	}
	public List<IDtmcNode> getNodes() {
		return new ArrayList<IDtmcNode>();
	}
	public List<IDtmcTransition> getTransitions() {
		return new ArrayList<IDtmcTransition>();
	}
	public boolean isAutonomous() {
		return isAutonomous;
	}
};