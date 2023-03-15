package org.dev.kgr.builderpattern;

public class MainClass {

	public static void main(String[] args) {

		// Create object of required home builder
		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();

		// Create object of director that will keep eye on your builder
		Director director = new Director(earthQuakeResistantBuilder);

		director.manageRequireHomeConstructor();
		Home homeConstructedAtEnd = director.getComplexObjectOfHome();

		System.out.println(homeConstructedAtEnd);
		System.out.println(homeConstructedAtEnd.floor);

	}
}
