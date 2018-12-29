package ModelOne;/**
 * @author: huangtao
 * @description:
 * @date: 2018-12-30 3:46
 * @version: $version$
 */

public abstract class Duck {
	public Duck() {
	}

	//鸭子的共同特性会叫
	public void quack(){
		System.out.println("gaga...");
	}
	//外形显示有子类定义，如盐水鸭和烤鸭颜色不一样
	public abstract void display();
	//鸭子的共同特性是会游泳
	public void swimming(){
		System.out.println("游泳。。。");
	}
	/*public void fly(){  改用了接口  可以实现多个接口
		System.out.println("会飞");
	}*/
}
