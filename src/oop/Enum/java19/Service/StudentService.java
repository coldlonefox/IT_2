package oop.Enum.java19.Service;

import oop.Enum.java19.models.Student;

public interface StudentService {
    //crud
    //todo create
    public void StudentCreate (Student student);
    //todo get all
    public Student[] StudentsGetAll ();
    //todo get by id
    Student StudentGetById (long id);
    //todo update
    void StudentUpdateGetById(long id, Student student);
    //todo delete
    void StudentDeleteGetById(long id);

}
