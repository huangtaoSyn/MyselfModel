package ModelOne;/**
 * @author: huangtao
 * @description:
 * @date: 2018-12-30 3:50
 * @version: $version$
 */

//只能继承一个子类   可以实现多个接口
public class GreenHeadDuck  extends  Duck{
	//实现Duck
	@Override
	public void display() {
		System.out.println("驴头压");
	}

	@Override
	public void fly() {
		System.out.println("不会飞");
	}
}
