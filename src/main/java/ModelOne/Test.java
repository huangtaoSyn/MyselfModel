package ModelOne;/**
 * @author: huangtao
 * @description:
 * @date: 2018-12-30 3:54
 * @version: $version$
 */

/**
 *@ClassName HUngtao
 *@Description TODO
 *@Author 20354
 *@Date 2018-12 3:54
 *@Version 1.0
 */
public class Test {
	public static void main(String[] args){
	    GreenHeadDuck ghd = new GreenHeadDuck();  //此处回到Duck类中查找构造函数
	    ghd.display();
	    ghd.fly();
	}
}
