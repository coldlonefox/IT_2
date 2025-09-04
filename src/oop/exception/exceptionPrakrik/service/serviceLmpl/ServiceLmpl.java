package oop.exception.exceptionPrakrik.service.serviceLmpl;

import oop.exception.exceptionPrakrik.model.User;
import oop.exception.exceptionPrakrik.service.Service;

public class ServiceLmpl implements Service {
    User[] users;
    int indexN = 0;

    @Override
    public void serviceCreate(User user) {
        users[indexN++] = user;
    }

    @Override
    public User[] serviceGetAll() {
        return users;
    }

    @Override
    public User serviceGetById(long id) {
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void serviceUpdateGetById(long id, User user) {

    }

    @Override
    public void serviceDeleteGetById(long id) {

    }
}
