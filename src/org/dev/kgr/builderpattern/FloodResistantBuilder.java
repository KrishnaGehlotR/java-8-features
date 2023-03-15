package org.dev.kgr.builderpattern;

public class FloodResistantBuilder implements Builder {

	private Home floodResistantHome = new Home();

	@Override
	public void buildFloor() {
		floodResistantHome.floor = "10 feets Above ground level floor";
	}

	@Override
	public void buildWalls() {
		floodResistantHome.walls = "Water resistant walls";
	}

	@Override
	public void buildTerrace() {
		floodResistantHome.terrace = "Water leakage resistant terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return floodResistantHome;
	}

}
