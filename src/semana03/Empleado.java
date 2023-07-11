/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana03;

/**
 *
 * @author Estudiante
 */
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    
    private String name;
    private double salary;
    private Date hireDay;
    private double Sneto;
    
    public double getSneto() {
        return Sneto;
    }

    public void setSneto(double Sneto) {
        this.Sneto = Sneto;
    }
    
    public static final double IVA = 0.21444555225454589647;
    
    
    public Empleado (String n) {
        name= n;
    }
            
    public Empleado(String n, double s, int year, int month, int day){
        
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
        //GregorianCalendar uses 0 for January 
        hireDay = calendar.getTime();
        
    }
    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }
/* Procedimiento de Aumento de salario*/
   public void raiseSalary(double byPercent){
       double raise = salary * byPercent / 100;
       salary += raise; 
   }
    public void raiseSalary(double byPercent, double ccss)
       {
           double raise = salary * byPercent /100;
           double bruto = salary += raise;
           Sneto = bruto-((bruto*ccss/100));
       }
   }


           
/*Estos son ejemplos obvios de metodos de acceso.
Como simplemente devulven los valores de instancia 
campos, a veces se les llama accesores de campo.
¿No seria mas facil hacer publicos los campos de nombre,
salario y contratacion de dia, en lugar de tener metodos 
de acceso separados? Sin embargo, el campo de nombre 
es un campo de solo lectura.Una vez que lo configura en 
el constructor, no hay ningun metodo para cambiarlo
Por lo tanto, tenemos la garantia de que el campo de 
nombre nunca se corrompera.*/

/*El campo de salario no es de solo lectura, pero 
solo se puede cambiar mediante el metodo raiseSalary.
En particular, si el valor resultara incorrecto,
solo ese metodo debe ser depurado. Tenia el campo salarial
ha sido publico, el culpable de estropear el 
valor podria haber estado en cualquier lugar.
A veces, sucede que desea
obtener y establecer el valor de un campo de instancia. 
Entonces necesitas suministrar tres articulos:*/

/*Un campo de datos privados;
Un metodo de acceso de campo publico; y 
Un metodo de mutadores de campo publico.
Esto es mucho mas tedioso que proporcionar un solo 
campo de datos publicos, pero hay considerables
beneficios.*/

