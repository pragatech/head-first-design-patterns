package com.praga.design.intro.duck;

import com.praga.design.intro.behavior.fly.FlyNoWay;
import com.praga.design.intro.behavior.quack.Quack;

public class ModelDuck extends Duck{
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a Model duck");
	}
}
