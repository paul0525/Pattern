package com.mediator;

/**
 * ����ͬ����
 * @author Administrator
 *
 */
public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator _mediator ){
		
		this.mediator = _mediator;
	}
	
}
