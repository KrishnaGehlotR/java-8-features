package org.dev.kgr.abstractfactory;

public class SingletonDesignPattern {

	public static void main(String[] args) {

		SingletonClass singletonClass1 = SingletonClass.getInstance();
		singletonClass1.simpleMethod();

		SingletonClass singletonClass2 = SingletonClass.getInstance();
		singletonClass2.simpleMethod();

		SingletonClass singletonClass3 = SingletonClass.getInstance();
		singletonClass3.simpleMethod();
	}
}

class SingletonClass {

	private static SingletonClass singletonInstance = null;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {

		if (singletonInstance == null) {
			singletonInstance = new SingletonClass();
		}
		return singletonInstance;
	}

	public void simpleMethod() {
		System.out.println("Hashcode of singleton object : " + singletonInstance);
	}

}
