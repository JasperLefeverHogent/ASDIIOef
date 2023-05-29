package domein;

import calcLibrary.TargetDouble;

public class Calculator implements TargetLong{
	
	
	private TargetDouble adaptee;

	public Calculator(TargetDouble adaptee) {
		this.adaptee = adaptee;
	}

	public long add() {
		return (long) adaptee.add();
	}
	

}
