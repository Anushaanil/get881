package com.lti.model;

public class Calci {
	public void addmethod(int n1, int n2) {
		int n3 = n1 + n2;
		System.out.println("Inside a add method");
	}
	public void submethod(int n1, int n2) {
		int n3 = n1 - n2;
		System.out.println(n3);
	}
	public void mulmethod(int n1, int n2) {
		int n3 = n1 * n2;
		System.out.println("Inside a mul method");
	}
	public void divmethod(int n1, int n2) {
		int n3 = n1/n2;
		System.out.println("Inside a div method");
	}
}
