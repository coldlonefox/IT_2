package Tasks.Lms.Java19_EducationCenter_Lms.ServiceStudent.ServiceStudentLmpl;

import Tasks.Lms.Java19_EducationCenter_Lms.Model.person.Student;
import Tasks.Lms.Java19_EducationCenter_Lms.ServiceStudent.ServiceStudent;

import java.time.LocalDate;

public class ServiceStudentLmpl implements ServiceStudent {
    private LocalDate localDate;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public void getStudentsStudyingYear(Student ... students) {
        for (Student student : students){
            System.out.println(student.toString());
            System.out.println((student.getLocalDate().minusYears(2025))+" жыл болгон\n");
        }
    }

    @Override
    public void getStudentsEducationCenter( Student ... students) {

    }
}
