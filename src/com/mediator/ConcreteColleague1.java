package com.mediator;

/**
 * �����ͬ����
 * @author Administrator
 *
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1( Mediator _mediator){
		super(_mediator);
	}
	
	public void selfMethod1(){
		//�����Լ��ķ���
	}
	
	public void depMethod1(){
		super.mediator.doSomething1();
	}
}
