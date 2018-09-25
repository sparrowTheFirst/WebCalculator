package pl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.demo.domain.Variable;
import pl.demo.service.BasicMethodService;

@Controller
@RequestMapping("/basic")
public class CalcController {

    @Autowired
    private BasicMethodService basicMethodService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("variable", new Variable());
        return "basicHome";
    }

    @PostMapping(params = "add", value = "/")
    public String add(Variable variable, Model model) {
        model.addAttribute("result", basicMethodService.add(variable.getA(), variable.getB()));
        return "basicHome";
    }

    @PostMapping(params = "sub", value = "/")
    public String sub(Variable variable, Model model) {
        model.addAttribute("result", basicMethodService.substruct(variable.getA(), variable.getB()));
        return "basicHome";
    }

    @PostMapping(params = "mul", value = "/")
    public String mul(Variable variable, Model model) {
        model.addAttribute("result", basicMethodService.multiply(variable.getA(), variable.getB()));
        return "basicHome";
    }

    @PostMapping(params = "div", value = "/")
    public String div(Variable variable, Model model) {
        model.addAttribute("result", basicMethodService.divide(variable.getA(), variable.getB()));
        return "basicHome";
    }
}
