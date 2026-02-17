public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if (!super.getIsActive()) {
            System.out.println("the service is not active");
        } else {
            System.out.println("consultation starting...");
        }
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("your consultation bill: $10");
    }
}