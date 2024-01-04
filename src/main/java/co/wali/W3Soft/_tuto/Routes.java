package co.wali.W3Soft._tuto;

import java.util.*;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.wali.W3Soft.RouteService;

@RestController()
@RequestMapping("/routes")
public class Routes {

    @Autowired
    private Environment env;

    @Autowired
    RouteService routeService;


    // http://192.168.1.200:3010/routes
    @GetMapping(path = "")
    public String routes() {
        StringBuilder stringBuilder = new StringBuilder(routeService.getAllRoutes().toString());
        routeService.getAllRoutes();
        System.out.println(stringBuilder);
        return routeService.getAllRoutes().toString();
    }



    // http://192.168.1.200:3010/
    @GetMapping(path = "/str")
    public String asString() {
        String str = "Welcome to Spring Boot by W3Soft";
        return str;
    }

    // http://192.168.1.200:3010/obj
    @GetMapping("/obj")
    public Map<String, String> asObj() {
        Map<String, String> mapString = new HashMap<>();
        mapString.put("name", "Wali");
        return mapString; // { "name": "Wali" }
    }

    // http://192.168.1.200:3010/asList
    @GetMapping("/asList")
    public List<String> asList() {
        List<String> list = Arrays.asList("List_1", "List_2", "List_3");
        ArrayList<String> arrList = new ArrayList<>(
                Arrays.asList("List_1", "List_2", "List_3", "List_4"));
        System.out.println(arrList);
        return list; // ["List_1","List_2","List_3","List_4"]
    }

    // http://192.168.1.200:3010/asHashMap
    @GetMapping("/asHashMap")
    public HashMap<String, Integer> asHashMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);
        return hashMap; // ["List_1","List_2","List_3","List_4"]
    }

    // http://192.168.1.200:3010/SysObj
    @GetMapping(path = "/SysObj", produces = "application/json")
    public String sysObj() {
        System.out.println(loadDotEnv().toString(4));
        return loadDotEnv().toString(4);
    }


    public void someMethod() {
        String activeProfiles = env.getProperty("JAVA_HOME");
        System.out.println("Read From ~bash_profile: " + activeProfiles);
    }

    private static JSONObject loadDotEnv() {

        JSONObject jObject = new JSONObject();

        System.getProperties().forEach((key, val) -> {
            jObject.put((String) key, val);

        });
        return jObject;
    }

}
