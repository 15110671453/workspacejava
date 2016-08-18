package com.bjcric.di;

public class Person {
//  private  Dog dog;
//  private Snake s;
  //OCP设计
  //依赖抽象的接口 而不依赖具体的实现类
  //依赖注入
  private Pets pets;

public Pets getPets() {
	return pets;
}

public void setPets(Pets pets) {
	this.pets = pets;
}
  
  public void test()
  {
	  Pets.play();
  }
  
}
