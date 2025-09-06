package Tasks.Lms.Exception_task_lms.service.serviceImpl;

import Tasks.Lms.Exception_task_lms.models.Cylinder.Cylinder;
import Tasks.Lms.Exception_task_lms.models.Parallelepiped.Parallelepiped;
import Tasks.Lms.Exception_task_lms.service.Model;

public class ModelImpl implements Model {

//- Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
//
//- Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
//
//-Формулалар Cylinder классында жазылуусу керек

    @Override
    public void getByParallelepiped(Parallelepiped parallelepiped) {
        System.out.println("Parallelepiped аянты :   "+2*Math.PI*parallelepiped.getRadius()*(parallelepiped.getHeight()+ parallelepiped.getRadius()));
        System.out.println("Parallelepiped колому :   "+(Math.PI* parallelepiped.getRadius()* parallelepiped.getRadius()* parallelepiped.getHeight()));
    }

//- Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
//
//- Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
//
//-Формулалар Cylinder классында жазылуусу керек

    @Override
    public void getByCylinder(Cylinder cylinder) {
        System.out.println("Cylinder аянты :   "+2*Math.PI*cylinder.getRadius()*(cylinder.getHeight()+cylinder.getRadius()));
        System.out.println("Cylinder колому :   "+(Math.PI* cylinder.getRadius()*cylinder.getRadius()*cylinder.getHeight()));
    }
}
