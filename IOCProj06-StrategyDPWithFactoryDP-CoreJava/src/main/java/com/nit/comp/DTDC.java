//DTDC.java(Dependent class1)
package com.nit.comp;

public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC::0-param constructor");
	}
	@Override
	public String deliver(int old) {
		return old+"order id order delivered by DTDC ";
	}

}
