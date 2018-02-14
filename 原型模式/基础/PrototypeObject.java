package 原型模式.基础;

public class PrototypeObject implements Cloneable{
    
    private String name;
    private String version;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public PrototypeObject(String name, String version) {
        super();
        this.name = name;
        this.version = version;
    }
    @Override
    public String toString() {
        return "name=" + name + ", version=" + version;
    }
    public PrototypeObject() {
        super();
    }
}
