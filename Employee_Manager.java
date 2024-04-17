import java.util.Scanner;
class Employee
{ 
   protected int emp_id;
   protected String name;
   protected String department;
   protected double salary;
   protected String designation;
    public Employee(int emp_id,String name,String department,double salary,String designation)
    { 
        this.emp_id=emp_id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.designation=designation;
    }
    public int getid()
    { 
        return emp_id;
    }
    public String getname()
    { 
        return name;
    }
    public String getdepartment()
    { 
        return department;
    }
    public double getsalary()
    { 
        return salary;
    }
    public String getdesignation()
    { 
          return designation;
    }
    public boolean equals(Employee e1)
    { 
        return(e1.designation.equals(this.getdesignation()));
    }
    public void addBonus()
    { 
        salary+=200;
    }
    public void display()
    { 
        System.out.println("ID: "+getid());
        System.out.println("Name: "+getname());
        System.out.println("salary: "+getsalary());
        System.out.println("designation: "+getdesignation());
        System.out.println("Departemt: "+getdepartment());
    }
}
class Manager extends Employee
{ 
    public Manager(int id,String name,String department,double salary,String designation)
    { 
        super(id,name,department,salary,designation);
    }
    public  void addBonus()
    { 
        salary+=300;
    }
}
class clerk extends Employee
{ 
    public clerk(int id,String name,String department,double salary,String designation)
    { 
        super(id,name,department,salary,designation);
    }
    public void addBonus()
    { 
        salary+=100;
    }
}
public class Employee_Manager
{ 
    public static void main(String[] args)
    {   
        int id;
        String name,department,designation;
        double salary;
        Scanner s1=new Scanner(System.in);
        Employee [] e1=new Employee[3];
        for(int i=0;i<3;i++)
        { 
          System.out.println("Enter employee details");
          System.out.println("ID: ");
          id=s1.nextInt();
          System.out.println("Name: ");
          name=s1.next();
          System.out.println("Department: ");
          department=s1.next();
          System.out.println("Salary: ");
          salary=s1.nextDouble();
          System.out.println("Designation: ");
          designation=s1.next();
          designation=designation.toLowerCase();
          if (designation.equals("manager"))
          { 
              e1[i]=new Manager(id,name,department,salary,designation);
          }
          if (designation.equals("clerk"))
          { 
              e1[i]=new clerk(id,name,department,salary,designation);
          }
        }
        System.out.println("Does employee1 and employee2 are equal:  "+e1[0].equals(e1[1]));
        System.out.println("Does employee1 and employee3 are equal:  "+e1[0].equals(e1[2]));
        e1[0].addBonus();
        e1[1].addBonus();
        e1[2].addBonus();
        System.out.println(e1[0].getname()+"salary after adding bonus:  "+e1[0].getsalary());
        System.out.println(e1[1].getname()+"salary after adding bonus:  "+e1[1].getsalary());
        System.out.println(e1[2].getname()+"salary after adding bonus:  "+e1[2].getsalary());
}
}

