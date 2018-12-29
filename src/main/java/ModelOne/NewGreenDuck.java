package ModelOne;/**
 * @author: huangtao
 * @description:
 * @date: 2018-12-30 4:25
 * @version: $version$
 */

/**
 *@ClassName Huangtao
 *@Description TODO
 *@Author 20354
 *@Date huangtao 4:25
 *@Version 1.0
 */
public class NewGreenDuck extends NewDuck {
	public NewGreenDuck() {
		flyBehavior = new BadFly(); //多态子类对象指向父类
		}
}
