public class Employee{
  private  double salary;
  private  String fName;
  private  String lName;
  private int age;
     
  public Employee(String fn, String ln, int age, double salary){
    this.salary = salary;
    this.age = age;
    fName = fn;
    lName = ln;
    
  }
  
    public double getSalary(){
     return salary;
  }  
  
  public String toString(){
     return fName + " " +lName + " " + age;
  }
  
  public static Employee getHighestSalary(Employee[] employeeArr){
  
     //declare and initialize a local variable for the highestSalary
	  
   
	  //declare and initialize a local variable of the employee with
     // highest salary
      
   
     //loop through the input array
      
 
      //check the salary
        	
           
  	   //update the highest employee    
        	
           
      //update the highest salary   
        
  	   //return local variable of type Student    
      return null;
  }
  
  public static void main(String[] params){
      Employee employee1 = new Employee("FN1", "LN1", 1, 55.5);
      Employee employee2 = new Employee("FN2", "LN2", 2, 62.1);
      Employee employee3 = new Employee("FN3", "LN3", 4, 42.3);
      Employee employee4 = new Employee("FN4", "LN4", 6, 78.6);
      Employee employee5 = new Employee("FN5", "LN5", 10, 48.6);
      
      Employee[] employeeArr = new Employee[5];
      employeeArr[0] = employee1;
      employeeArr[1] = employee2;
      employeeArr[2] = employee3;
      employeeArr[3] = employee4;
      employeeArr[4] = employee5;
      
      Employee highest = Employee.getHighestSalary(employeeArr);
      
      
      System.out.println(highest);
  
  
  }

}
