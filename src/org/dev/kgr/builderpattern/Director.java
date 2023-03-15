package org.dev.kgr.builderpattern;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Home getComplexObjectOfHome() {
		return this.builder.getComplexHomeObject();
	}

	public void manageRequireHomeConstructor() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}

}
