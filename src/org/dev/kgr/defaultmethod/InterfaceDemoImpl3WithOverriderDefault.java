package org.dev.kgr.defaultmethod;

public class InterfaceDemoImpl3WithOverriderDefault implements InterfaceDemo {

	@Override
	public void printName() {
		System.out.println("Welcome to overridden default methods of interface");
	}

	public static void main(String[] args) {
		InterfaceDemoImpl3WithOverriderDefault default1 = new InterfaceDemoImpl3WithOverriderDefault();
		default1.printName();
	}
}
