package co.wali.W3Soft.routes;

public class Route {
    private String name;
    private String path;

    // Constructor

    public Route(){}

    public Route(String name, String path) {
        this.name = name;
        this.path = path;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
