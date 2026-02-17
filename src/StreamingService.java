public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    private boolean premium;

    // TODO: constructor
    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.premium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal
        if (super.getIsActive() == true) {
            if (this.premium == true) {
                System.out.println("premium streaming");
            } else {
                System.out.println("standard streaming");
            }
        } else {
            System.out.println("service is not active, please activate first");
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        if (super.getIsActive()) {
            if (this.premium == false) {
                this.premium = true;
                System.out.println("Upgraded to premium");
            } else {
                System.out.println("Service is already premium");
            }
        } else {
            System.out.println("Service is not active");
        }
    }
}