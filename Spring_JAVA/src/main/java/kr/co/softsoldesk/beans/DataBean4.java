package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component(value="applicationBean4")
@ApplicationScope
public class DataBean4 {
	
	private String data7;
	private String data8;
		
}