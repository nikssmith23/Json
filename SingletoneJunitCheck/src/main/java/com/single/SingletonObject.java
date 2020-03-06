package com.single;

public class SingletonObject {
	private static SingletonObject object = null;

	private SingletonObject() {
	}

	static public SingletonObject createInstance() {
		if (object == null) {
			object= new SingletonObject();
		} 
		return object;
	}

}
