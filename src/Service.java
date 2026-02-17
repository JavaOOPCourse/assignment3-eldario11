public abstract class Service {

    // TODO: declare private fields
    private String serviceName;
    private int serviceId;
    private boolean isActive;

    // TODO: constructor
    Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService() {
        isActive = true;
        System.out.println("you activated");
    }

    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService() {
        isActive = false;
        System.out.println("you disactivated");
    }

    // TODO: getter for serviceName
    public String getServiceName() {
        return this.serviceName;
    }

    // TODO: getter for isActive
    public boolean getIsActive() {
        return this.isActive;
    }

    // TODO: abstract method performService()
    public abstract void performService();
}