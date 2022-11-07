package com.mybudget.personalbudget.application.specification;



public interface Specification<T> {
	
	//T aqui acepta cualquier tipo de dato
	boolean isSatisfiedBy(T t);
	

}
