package P04InterfacesAndAbstraction.P04SayHelloExtended;

public class Bulgarian extends BasePerson{

    protected Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}