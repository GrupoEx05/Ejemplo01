/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana03;

/**
 *
 * @author Estudiante
 */
public class PrincipalEmpleado {
    
    public static void main(String[] args)
    {
        Empleado emple= new Empleado("HUBERTH");
        emple.getName();
        //fill the staff array with three Employee objetcs
        Empleado[] staff = new Empleado[3];
        staff[0] = new Empleado("Keitlyn Fallas", 75000,
        2012, 05, 12);
        staff[1] = new Empleado("Arianna Fallas", 50000,
        2014, 12, 9);
        staff[2] = new Empleado("Silvia Lopez", 40000,
        1983, 5, 25);
        
        //raise everyone's salary by 5%
      //  for (Empleado e : staff) e.raiseSalary(5);
        
        for (Empleado f : staff) f.raiseSalary(5, 9.5);
        
        // print out information about all Employee objects
        for (Empleado e : staff)
        System.out.println("nombre=" + e.getName() + 
                ",salario=" +e.getSalary() +
                ",Dia de Alquiler=" +e.getHireDay());
        
      System.out.println("--------------------------------------------");
        
        for (Empleado f : staff)
        System.out.println("nombre=" + f.getName() +
                ",salario=" + f.getSalary() +
                ",Dia de Alquiler=" + f.getHireDay()+
                "Salario Neto=" + f.getSneto());
        
    }
    
}
