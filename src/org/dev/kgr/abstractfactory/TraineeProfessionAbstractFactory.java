package org.dev.kgr.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getPrefession(String typeOfProfession) {

		if (typeOfProfession == null) {
			return null;
		} else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new TraineeEngineer();
		} else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new TraineeTeacher();
		}
		return null;
	}

}
