package com.coffeepoweredcrew.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException{
        Swordsman s=new Swordsman();
		s.move(new Point3D(-10, 0, 0), 20);
		s.attack();
		System.out.println(s);

		Swordsman so= (Swordsman)s.clone();
		System.out.println(so);

		General gen=new General();
		gen.boostMorale();
		System.out.println(gen);

		General g=(General)gen.clone();
		System.out.println(g);
	}

}
