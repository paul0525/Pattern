package com.mediator;

public class ConcreteMediator extends Mediator {

	@Override
	public void doSomething1() {
		// TODO Auto-generated method stub
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

	@Override
	public void doSomething2() {
		// TODO Auto-generated method stub
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

}
