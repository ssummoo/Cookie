package kr.co.softsoldesk.conifg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;

//프로젝트 bean
@Configuration
@ComponentScan
public class RootAppContext {


	//DataBean1 타입 주입 @ApplicationScope
	@Bean
	@ApplicationScope
	public DataBean1 databean1() {
		return new DataBean1();
	}
	
	//DataBean2 이름으로 선언(applicationBean2)
	@Bean("applicationBean2")
	@ApplicationScope
	public DataBean2 databean2() {
		return new DataBean2();
	}
	//DataBean3
	@Bean
	public DataBean3 dataBean3() {
		return new DataBean3();
	}
	@Bean("applicationBean4")
	public DataBean4 databean4() {
		return new DataBean4();
	}
	
	//DataBean4
	
	
}
