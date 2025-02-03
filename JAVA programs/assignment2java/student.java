class employee
{
  int id;
  double salary;
  static int cnt;
  String name;
  public employee()
  {
    cnt++;
  }
   public employee(int id,String name,double salary)
   {
    cnt++;
    this.id=id;
    this.name=name;
    this.salary=salary;
    
   }
   public static void showCount()
   {
    System.out.println("Employee id count");
    System.out.println(cnt);
   }
    public void display()
    {
    System.out.println("Employee in information");
      System.out.println(id);
      System.out.println(name);
      System.out.println(salary);
    }
    }
    class MainDemo
    {
      public static void main(String args[])
      {
        employee s1=new employee(11,"abc",80.0);
        employee.showCount();
         employee s2=new employee(12,"abc",70.0);
        employee.showCount();
        s1.display();
        s2.display();
        
        
      }
    }

