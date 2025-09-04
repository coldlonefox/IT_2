package oop.Enum.java19.Service.lmpl;

import oop.Enum.java19.Service.StudentService;
import oop.Enum.java19.models.Student;

public class StudentServiceLmpl implements StudentService{
    Student[] students;
    int numberIndex = 0;
    @Override
    public void StudentCreate(Student student) {
        students[numberIndex++] = student;
    }

    @Override
    public Student[] StudentsGetAll() {
        return students;
    }

    @Override
    public Student StudentGetById(long id) {
        boolean or = false;
        for (Student student : students){
            if (student.getId() == id){
                or = true;
                return student;
            }
        }
        if (or){
            System.out.println("null");
        }
        return null;
    }

    @Override
    public void StudentUpdateGetById(long id, Student student) {
        for (Student student1 : students){
            if (student1.getId() == id){
                student1.setLastName(student.getLastName());
                student1.setFirstName(student.getFirstName());
                student1.setLocalDate(student.getLocalDate());
                student1.setGander(student.getGander());
                student1.setLanguage(student.getLanguage());
            }
        }
    }
    Student[] newStudents = new Student[students.length - 1];
    @Override
    public void StudentDeleteGetById(long id) {

        int numberDeleteDate;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                numberDeleteDate = i;
                if (students[i] == students[numberDeleteDate]){
                    continue;
                }
                newStudents[i] = students[i];
            }
        }


    }
}
