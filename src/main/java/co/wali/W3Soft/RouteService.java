package co.wali.W3Soft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.json.JSONObject;
import java.util.Map;

@Service
public class RouteService {

    @Autowired
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    public JSONObject getAllRoutes() {
        JSONObject routes = new JSONObject();        
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();

        handlerMethods.forEach((key, value) -> {
            String pattern = key.getPatternsCondition().getPatterns().iterator().next();
            String methodName = value.getMethod().getName();
            routes.put(pattern, methodName);
        });
        return routes;
    }
}
