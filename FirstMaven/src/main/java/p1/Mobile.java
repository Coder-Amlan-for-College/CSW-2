package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config is loaded");
       //Sim sim = context.getBean("sim1",Sim.class);
		Sim sim = (Sim) context.getBean("sim1");
		sim.calling();
		sim.data();

		Sim sim2 = (Sim) context.getBean("sim2");
		sim2.calling();
		sim2.data();
	}

}
