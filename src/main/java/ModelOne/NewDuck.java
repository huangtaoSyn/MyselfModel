package ModelOne;/**
 * @author: huangtao
 * @description:
 * @date: 2018-12-30 4:21
 * @version: $version$
 */

/**
 *@ClassName HUnatao
 *@Description TODO
 *@Author 20354
 *@Date 1234 4:21
 *@Version 1.0
 */
public abstract class NewDuck {
	FlyBehavior flyBehavior;
	Speak speak;

	public NewDuck() {
	}
	public void fly(){
		flyBehavior.fly();//不是具体实现  调用行为对象
	}
	public void speak(){
		speak.speak();
	}
}
