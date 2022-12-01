  /*
   * This class encapsulates the data that represents
   * a personal contact information.
   */ 
public class PersonalContact {
  
  private String name;
  private String email;
  private String phone;
  
  /*
   * Constructor that initializes all three instance variables 
   * to the parameters name, email, phone.
   */      
  public PersonalContact(String name, String phone, String email){
  //TODO 1: implement this method.



  }

  /*
   * Constructor that initializes instance variables 
   * name and phone to the parameters name and phone.
   * The instance variable email is initialized to the exact String "no email".
   */ 
  public PersonalContact(String name, String phone){
     //TODO 2: implement this method.



  }

  /*
   * This method returns the contact's name.
   */ 
  public String getName() {
     return name;
  }

  /*
   * This method returns the contact's email.
   */   
  public String getEmail() {
     return email;
  }
  
  /*
   * This method returns the contact's phone number.
   */  
  public String getPhone() {
     return phone;
  }
  
  /*
   * Returns a string representation of this object in the form:
   *       name, phone, email  
   */
  public String toString(){
     return name+", "+phone+", "+email;
  }
}