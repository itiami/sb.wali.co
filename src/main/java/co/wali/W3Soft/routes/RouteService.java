package co.wali.W3Soft.routes;

import com.fasterxml.jackson.core.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RouteService {

    @Autowired
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    public JSONObject getAllRoutes() {
        JSONObject routes = new JSONObject();
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();
        handlerMethods.forEach((key, value) -> {
            String path = key.getPatternsCondition().getPatterns().iterator().next();
            String methodName = value.getMethod().getName();
            routes.put(methodName, path);
        });
        return routes;
    }

    public List<Route> routeList() throws Exception {
        List<Route> routes = new ArrayList<>();
        getAllRoutes().toMap().entrySet().forEach(el -> {
            routes.add(new Route(el.getKey(), el.getValue().toString()));
        });
        return routes;
    }

}
