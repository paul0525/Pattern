package com.mediator;

/**
 * �����ͬ����
 * @author Administrator
 *
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2( Mediator _mediator){
		super(_mediator);
	}
	
	public void selfMethod2(){
		//�����Լ��ķ���
	}
	
	public void depMethod2(){
		super.mediator.doSomething2();
	}
}
