
//BlueDart.java (Dependent class)
package com.nit.comp;

public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}
	@Override
	public String deliver(int old) {
		return old+"order id order delivered by BlueDart ";
	}

}
