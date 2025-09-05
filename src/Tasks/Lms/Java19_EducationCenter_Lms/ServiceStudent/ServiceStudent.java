package Tasks.Lms.Java19_EducationCenter_Lms.ServiceStudent;

import Tasks.Lms.Java19_EducationCenter_Lms.Model.person.Student;

public interface ServiceStudent {
    void getStudentsEducationCenter(Student ... students);
    void getStudentsStudyingYear(Student ... students);
}
