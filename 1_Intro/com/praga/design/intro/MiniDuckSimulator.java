package com.praga.design.intro;

import com.praga.design.intro.behavior.fly.FlyRocketPowered;
import com.praga.design.intro.duck.Duck;
import com.praga.design.intro.duck.MallardDuck;
import com.praga.design.intro.duck.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
