package Tasks.Lms.Exception_task_lms.service;

import Tasks.Lms.Exception_task_lms.models.Cylinder.Cylinder;
import Tasks.Lms.Exception_task_lms.models.Parallelepiped.Parallelepiped;

public interface Model {
    void getByParallelepiped(Parallelepiped parallelepiped);
    void getByCylinder(Cylinder cylinder);
}
