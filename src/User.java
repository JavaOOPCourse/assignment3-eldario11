public abstract class User {

    // TODO: declare fields

    String name;
    int id;

    // TODO: constructor
    User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // TODO: abstract method manageService(Service s)
    public abstract void manageService(Service s);

    // TODO: abstract method useService(Service s)
    public abstract void useService(Service s);
}