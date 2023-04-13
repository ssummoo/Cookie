package kr.co.softsoldesk.controller;


import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/save_cookie")
	public String save_cookie(HttpServletResponse response) {
		
		try {
			//Encoding
			String data1=URLEncoder.encode("솔데스크","UTF-8");
			String data2=URLEncoder.encode("소프트웨어","UTF-8");
			
			//Cookie1 Cookie2 이름으로 데이터를 저장
			Cookie cookie1=new Cookie("cookie1", data1);
			Cookie cookie2=new Cookie("cookie2", data2);
			
			//수명
			cookie1.setMaxAge(365*24*60*60);
			cookie2.setMaxAge(365*24*60*60);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "save_cookie";
		
	}
	//요청정보에 담겨서 넘어오므로 request 객체 사용
	@GetMapping("/load_cookie")
	public String load_cookie(HttpServletRequest request) {
			
		
		try {
			Cookie[] cookies=request.getCookies();
			
			for(Cookie cookie:cookies) {
				String str=URLDecoder.decode(cookie.getValue(),"UTF-8");
				//선별적으로 쿠키 정보를 모두 가져와서 제어하여 분기할 수 있음
				if(cookie.getName().equals("cookie1")){
					System.out.println("cookie1 : "+str);
				}else if(cookie.getName().equals("cookie2")){
					System.out.println("cookie2 : "+str);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return "load_cookie";
		
		
	}
	@GetMapping("/load_cookie2")
	public String load_cookie2(@CookieValue("cookie1") String cookie1, @CookieValue("cookie2") String cookie2) {
		
		System.out.println("cookie1 : "+cookie1);
		System.out.println("cookie2 : "+cookie2);
		
		return "load_cookie2";
		
		
	}
}