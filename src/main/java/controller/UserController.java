package controller;

import Dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(path = "userform",method = RequestMethod.GET)
    public String userform(){
        return "userform";
    }
    @RequestMapping(path = "regist",method = RequestMethod.POST)
    public String regist(@ModelAttribute User user){
        //하나하나 받는거보다는 같이 묶어서 사용하는게 좋으니깐
        //ModelAttribute 이녀석이 값도 넣어주는 역활도 하고  동작을 수행해주는 역활도함!
        System.out.println("사용자가 입력한 User정소 입니다 해당정보를 이용하는 코드가 와야됩니다");
        System.out.println(user);
        return "regist";
    }

}
