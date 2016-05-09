package com.mediator;

/**
 * 具体的同事类
 * @author Administrator
 *
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1( Mediator _mediator){
		super(_mediator);
	}
	
	public void selfMethod1(){
		//处理自己的方法
	}
	
	public void depMethod1(){
		super.mediator.doSomething1();
	}
}
