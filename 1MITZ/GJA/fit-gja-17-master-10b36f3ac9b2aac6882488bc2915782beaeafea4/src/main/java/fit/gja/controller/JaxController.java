package fit.gja.controller;

import static fit.gja.util.TemplateUtils.Type.JSP;
        import static fit.gja.util.TemplateUtils.resolve;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/jax")
public class JaxController {

    @RequestMapping("/{name}")
    public String show(@PathVariable("name") String name) {
        return resolve(JSP, "jax/" + name);
    }
}