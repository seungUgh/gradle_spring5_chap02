package gradle_spring5_chap02.dl;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForSpring3 {
private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException {
		ctx= new AnnotationConfigApplicationContext(AppConf1.class, AppConf2.class);
	
		
		//@Configuration 설정 클래스도 빈으로 등록함
		AppConf1 appConf1 = ctx.getBean(AppConf1.class);
		System.out.println(appConf1 != null);
	}
}