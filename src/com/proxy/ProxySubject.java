package com.proxy;

public class ProxySubject implements ISubject{

	private ISubject subject = null;
	
	public ProxySubject() {
		this.subject = new RealSubject();
	}
	
	public ProxySubject(ISubject subject) {
		super();
		this.subject = subject;
	}


	@Override
	public void request() {
		
		before();
		
		this.subject.request();
		
		after();
	}

	
	private void before(){
		
	}
	
	private void after(){
		
	}
}
