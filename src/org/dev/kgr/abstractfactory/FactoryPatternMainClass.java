package org.dev.kgr.abstractfactory;

public class FactoryPatternMainClass {

	public static void main(String[] args) {

		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
		Profession prefession = abstractFactory.getPrefession("Teacher");
		prefession.print();
	}

}
