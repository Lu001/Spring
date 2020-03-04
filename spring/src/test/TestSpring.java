package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Category;
import pojo.Product;
import service.ProductService;
/**
 * IOC���Ʒ�ת
 * 1ͨ��Spring�������� ����ע��ֱ��ʹ���õ����������
 * 2���ʵ�֣�ͨ�������ļ��ҵ����λ�ã�ȥ��������� ��ȡ�����ļ��Ķ���name����ֵ
 * ע�ⷽʽ 
 * @author Administrator
 *
 */
public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		//IOC DI
		/*Category c = (Category)context.getBean("c");
		System.out.println(c.getName());
		Product p = (Product) context.getBean("p");
		System.out.println(p.getGory().getName());*/
		//AOP
		ProductService s = (ProductService)context.getBean("s");
		s.doSomeService();
	}
}
