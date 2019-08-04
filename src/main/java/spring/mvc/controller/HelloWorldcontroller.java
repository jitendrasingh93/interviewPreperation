package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by JitendraSingh on 02/01/18.
 */

@Controller
public class HelloWorldcontroller {

        @RequestMapping("/hello")
        public ModelAndView helloWorld() {
            String message = "Hello World!";
            return new ModelAndView("hello", "message", message);
    }
}
