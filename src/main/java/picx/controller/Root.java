package picx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Root {
    @RequestMapping(value = "test")
    public ModelAndView welcome(){
        return new ModelAndView("welcome");
    }
}
