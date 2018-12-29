package ModelOne;/**
 * @author: huangtao
 * @description:
 * @date: 2018-12-30 4:16
 * @version: $version$
 */

//为好的飞行   需要实现 FlyBehavior
public class GoodFly implements FlyBehavior{
	public void fly() {
		System.out.println("飞得好");
	}
}
