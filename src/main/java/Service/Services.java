package Service;

import Persistence.ServicesDao;

public class Services {

    ServicesDao servicesDao;

    public Services(ServicesDao servicesDao) {
        this.servicesDao = servicesDao;
    }

    public long createUser(String nomUser) {
        return servicesDao.createUser(nomUser);
    }

}
