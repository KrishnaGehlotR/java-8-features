package org.dev.kgr.defaultmethod;

public class DiamondProblemDefaultMethodClass
		implements DiamondProblemDefaultMethodInterface1, DiamondProblemDefaultMethodInterface2 {

	@Override
	public void printDiamond() {
		DiamondProblemDefaultMethodInterface1.super.printDiamond();
		DiamondProblemDefaultMethodInterface2.super.printDiamond();
	}

	public static void main(String[] args) {
		DiamondProblemDefaultMethodClass methodClass = new DiamondProblemDefaultMethodClass();
		methodClass.printDiamond();
	}

}
