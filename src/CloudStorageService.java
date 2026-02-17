public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean premium;

    // TODO: constructor
    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.premium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (!super.getIsActive()) {
            System.out.println("cloud storage is not active");
            return;
        }

        if (this.premium) {
            System.out.println("premium cloud storage");
        } else {
            System.out.println("standard cloud storage");
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        if (!super.getIsActive()) {
            System.out.println("the service is not active");
            return;
        }

        if (this.premium) {
            System.out.println("the service is already premium");
        } else {
            this.premium = true;
            System.out.println("Upgraded to premium");
        }
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("your bill: $15");
    }
}