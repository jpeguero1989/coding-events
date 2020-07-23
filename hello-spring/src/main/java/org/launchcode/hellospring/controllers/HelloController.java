package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("hello2")
    @ResponseBody
    public String hello2()
    {
        return "hello";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye()
    {
        return "Goodbye, Spring";
    }

    @RequestMapping(value = "hello",method = {RequestMethod.GET,RequestMethod.POST})
    //@GetMapping("hello")
    //@ResponseBody
    public String hello(@RequestParam String name, Model model)
    {
        model.addAttribute("greeting","Hello, " + name + "!");
        return "hello";
    }

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST}, value = "helloFrench")
    //@GetMapping("hello")
    @ResponseBody
    public String helloFrench(@RequestParam String name)
    {
        return "Bonjour, " + name;
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String hellowithpathVariable(@PathVariable String name)
    {
        return "Hello, " + name;
    }

    @GetMapping("form")
    public String helloForm()
    {
        return "form";
    }

    public static String createMessage(String name,String language)
    {
        String message="";
        return message;
    }

    @GetMapping("hello-names")
    public  String helloNames(Model model)
    {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("Isaac");

        model.addAttribute("names",names);
        return "hello-list";
    }
}
