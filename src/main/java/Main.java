import Persistence.ServicesDao;
import Service.Services;

public class Main {
    public static void main(String[] args) {

        Services servicesPosts = new Services(new ServicesDao());

        var userId = servicesPosts.createUser("Abdou Diarra");
        System.out.println(userId);


    }
}
