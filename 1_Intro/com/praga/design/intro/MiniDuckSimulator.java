package com.praga.design.intro;

import com.praga.design.intro.duck.Duck;
import com.praga.design.intro.duck.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
	}

}
