package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ApplicationScope
public class DataBean3 {
	
	private String data5;
	private String data6;
		
}