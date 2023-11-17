package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GitLoginController {
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String gitloging() {
		return "gitlogin";
	}
	
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String gitloging(String yourId,String yourPass, RedirectAttributes redirectAttributes) 
	{
		System.out.println(yourId);
		System.out.println(yourPass);
		
		//に格納
		redirectAttributes.addFlashAttribute("YourId", yourId);
		redirectAttributes.addFlashAttribute("YourPass", yourPass);
		
		//ページを跨ぎたい時は、
		//「redirect:/xxx」を使って移動先のGETメソッドのURLを使う。
		if((yourId .equals ("gitlogin")) && (yourPass .equals("gitpw"))){
			return "redirect:/gititemlist";
			}else if(yourId .equals ("gitlogin")){
				System.out.println("PASSWORDが間違ってます");
			return "redirect:/gitlogin";
			}else if(yourPass .equals("gitpw")) {
				System.out.println("IDが間違ってます");
				return "redirect:/gitlogin";
			}else {
				System.out.println("IDとPASSWORDどちらも間違ってます");				
				return "redirect:/gitlogin";
			}

	}
	
//	//遷移後ノページ
//	@RequestMapping(path = "/gititemlist", method = RequestMethod.GET)
//	public String githome() {
//		return "gititemlist";
//	}
	//遷移後ノページ
	@RequestMapping(path = "/gitlogin", method = RequestMethod.GET)
	public String gitloging1() {
		return "gitlogin";
	}
	
	
	}
