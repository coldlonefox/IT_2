package Tasks.Lms.Java19_EducationCenter_Lms;

import Tasks.Lms.Java19_EducationCenter_Lms.Abstract.EducationCenter;
import Tasks.Lms.Java19_EducationCenter_Lms.Enum.Gander;
import Tasks.Lms.Java19_EducationCenter_Lms.Model.Collage;
import Tasks.Lms.Java19_EducationCenter_Lms.Model.School;
import Tasks.Lms.Java19_EducationCenter_Lms.Model.University;
import Tasks.Lms.Java19_EducationCenter_Lms.Model.person.Student;
import Tasks.Lms.Java19_EducationCenter_Lms.ServiceStudent.ServiceStudentLmpl.ServiceStudentLmpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter School1 = new School("Султан Нурманбетов №16","Жалал-Абад",LocalDate.now().withYear(1998));
        EducationCenter School2 = new School("Тоголок Молдо №12","Бишкек",LocalDate.now().withYear(2003));
        EducationCenter University1 = new University("Государственый Университет","Бишкек",LocalDate.now().withYear(2003));
        EducationCenter University2 = new University("Международный Университет","Бишкек",LocalDate.now().withYear(2009));
        EducationCenter University3 = new University("Исламский Университет","Бишкек",LocalDate.now().withYear(1993));
        EducationCenter University4 = new University("Национальный Университет","Бишкек",LocalDate.now().withYear(2013));
        EducationCenter Collage1 = new Collage("Технический Колледж","Талас",LocalDate.now().withYear(2016));
        EducationCenter Collage2 = new Collage("Иноновационый Колледж","Нарын",LocalDate.now().withYear(2019));
        EducationCenter Collage3 = new Collage("Медицинский Колледж","Ош",LocalDate.now().withYear(2017));
        EducationCenter Collage4 = new Collage("Колледж Архитектуры","Ысык-Кол",LocalDate.now().withYear(2012));

        Student[] students = {
                new Student("Абдували","Бакытбеков",Gander.Male,LocalDate.now().withYear(2012),School1),
                new Student("Салиха","Усанова",Gander.Female,LocalDate.now().withYear(2022),School2),
                new Student("Умар","Таласбек уулу",Gander.Male,LocalDate.now().withYear(2023),University1),
                new Student("Аиша","Атагелдиова",Gander.Female,LocalDate.now().withYear(2022),University2),
                new Student("Усман","Анарбеков",Gander.Male,LocalDate.now().withYear(2021),University3),
                new Student("Раяна","Курманбекова",Gander.Female,LocalDate.now().withYear(2020),University4),
                new Student("Нурислам","Кутубеков",Gander.Male,LocalDate.now().withYear(2020),Collage1),
                new Student("Аруузат","Касымалиева",Gander.Female,LocalDate.now().withYear(2021),Collage2),
                new Student("Элхан","Эржигит уулу",Gander.Male,LocalDate.now().withYear(2022),Collage3),
                new Student("Салиха","Муратбекова",Gander.Female,LocalDate.now().withYear(2023),Collage4),
        };

        ServiceStudentLmpl studentLmpl = new ServiceStudentLmpl();
        studentLmpl.setLocalDate(LocalDate.now().withYear(2025));
        studentLmpl.getStudentsEducationCenter(students);
        studentLmpl.getStudentsStudyingYear(students);
    }
}
