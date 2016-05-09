package com.factory;

public class ConcreteCreator extends Creator{

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		
		Product p = null;
		
		try{
			
			p = (Product)Class.forName(c.getName()).newInstance();
			
		}catch( Exception e ){
			e.printStackTrace();
		}
		
		if( p != null ){
			return (T)p;
		}
		
		return null;
	}

}
