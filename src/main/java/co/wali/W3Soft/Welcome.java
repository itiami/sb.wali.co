package co.wali.W3Soft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.wali.W3Soft.routes.RouteService;

@Controller
public class Welcome {

    @Autowired
    RouteService routeService;

    // http://192.168.1.200:3010/routes
    @GetMapping(path = "")
    public String routes(Model model) throws Exception {
        model.addAttribute("routeList", routeService.routeList());
        return "index";
    }

}
