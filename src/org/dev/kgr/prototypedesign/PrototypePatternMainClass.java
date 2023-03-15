package org.dev.kgr.prototypedesign;

public class PrototypePatternMainClass {

	public static void main(String[] args) {

		ProfessionCache.loadProfessionCache();

		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);

		Profession enggProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(enggProfession);

		Profession teachProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teachProfession);

		Profession docProfession1 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession1);
	}
}
