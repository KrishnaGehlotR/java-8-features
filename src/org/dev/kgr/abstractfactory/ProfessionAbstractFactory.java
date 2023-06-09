package org.dev.kgr.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getPrefession(String typeOfProfession) {

		if (typeOfProfession == null) {
			return null;
		} else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		} else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}

		return null;
	}

}
