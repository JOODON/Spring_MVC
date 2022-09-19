package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class GoodsController {
    @GetMapping("goods/{id}")
    public String getGoodById(@PathVariable (name="id")int id,
                              @RequestHeader(value = "User-Agent",defaultValue = "myBrowser") String  userAgeent,
                              HttpServletRequest request,
                              ModelMap model){
        String path=request.getServletPath();

        System.out.println("id:" + id);
        System.out.println("UserAgent:" + userAgeent);
        System.out.println("path:" + path);

        model.addAttribute("id",id);
        model.addAttribute("userAgent",userAgeent);
        model.addAttribute("path",path);
        return "getGoodById";
    }
}
