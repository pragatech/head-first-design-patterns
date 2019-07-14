package com.praga.design.intro.duck;

import com.praga.design.intro.behavior.fly.FlyWithWings;
import com.praga.design.intro.behavior.quack.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
