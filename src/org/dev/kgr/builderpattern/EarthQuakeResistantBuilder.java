package org.dev.kgr.builderpattern;

public class EarthQuakeResistantBuilder implements Builder {

	private Home earthQuakeResistantHome = new Home();

	@Override
	public void buildFloor() {
		earthQuakeResistantHome.floor = "Wooden floor";
	}

	@Override
	public void buildWalls() {
		earthQuakeResistantHome.walls = "Wooden walls";
	}

	@Override
	public void buildTerrace() {
		earthQuakeResistantHome.terrace = "Wooden terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return earthQuakeResistantHome;
	}

}
