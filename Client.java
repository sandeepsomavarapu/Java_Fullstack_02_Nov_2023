package pack2;

import pack1.Test;

public class Client extends Test {

	public static void main(String[] args) {
		Client client = new Client();
		client.m1();// different package sub-class
	}
}

class TestClient {

	public void display() {
		Test test = new Test();
		test.m1();// different package non-sub class
	}
}
