package com.mediator;

/**
 * 具体的同事类
 * @author Administrator
 *
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2( Mediator _mediator){
		super(_mediator);
	}
	
	public void selfMethod2(){
		//处理自己的方法
	}
	
	public void depMethod2(){
		super.mediator.doSomething2();
	}
}
