package oop.exception.exceptionPrakrik.service;

import oop.exception.exceptionPrakrik.model.User;

public interface Service {
    void serviceCreate (User user);
    User[] serviceGetAll ();
    User serviceGetById (long id);
    void serviceUpdateGetById(long id, User user);
    void serviceDeleteGetById(long id);
}
