import java.util.Scanner;

interface ClassTeacher{
     void showT();
}

class StudentDetails{

    String name =  new String();
    String adress = new String();
    String email = new String();
    int rollNum;
    long mobileNum;
      Scanner input=new Scanner(System.in);
     
      void NewStudent(){
      System.out.println("\nEnter the details of students:");
      System.out.print("student's Name: ");
      name=input.next();
      
      System.out.println("student's Roll Number: ");
      label:
      while(true){
        input.nextLine();
      try{
        rollNum=input.nextInt();
        break label;
      }
      catch(Exception e){
        System.out.println("Enter valid roll number ");
        continue label;
      }
      }

     System.out.println("student's Mobile Number: ");
      label1:
      while(true){
        input.nextLine();
      try{
        mobileNum=input.nextLong();
        break label1;
      }
      catch(Exception e){
        System.out.println("Enter valid mobile number");
        continue label1;
      }
      }
      
      System.out.println("student's home Address: ");
      input.nextLine();
      adress=input.nextLine();


      System.out.println("student's email Address: ");
      email=input.next();
      while(email.contains("@")!=true && email.contains(".")!=true){
        System.out.println("Enter the valid  email Address: ");
         email=input.next();
      }
      
   }
}

class A10 extends StudentDetails implements ClassTeacher{
     public void showT(){
      System.out.println("\nname is: Ajaysir Vyas");
      System.out.println("email id is: ajayvyas5771@yahoo.com");
    } 
}

class A12 extends StudentDetails implements ClassTeacher{
  
   public void showT(){
      System.out.println("\nname is: Nishant Vora");
       System.out.println("email id is: voranishant1234@gmail.com");
    } 
         
}

class SMS1{
  int n;
  static  void search(A12 ob[],int n){
    Scanner input=new Scanner(System.in);
    System.out.println("\nEnter roll number of student which details you want to search");
    int rs=input.nextInt(),j=0;
        for(int i=0;i<n;i++){
          if(rs == ob[i].rollNum){
              System.out.println("student's Name: "+ob[i].name);
              System.out.println("student's adress: "+ ob[i].adress);
              System.out.println("student's Mobile Number: "+ ob[i].mobileNum);
              System.out.println("student's email id : "+ ob[i].email);
              j=1;
              break;
          }
        }
        if(j!=1){
          System.out.println(rs + " roll number is not Found");
        }
   }

 
 static  void search(A10 ob[],int n){
    Scanner input=new Scanner(System.in);
     System.out.println("\nEnter roll number of student which details you want to search");
    int rs=input.nextInt(),j=0;
        for(int i=0;i<n;i++){
          if(rs == ob[i].rollNum){
              System.out.println("student's Name: "+ob[i].name);
              System.out.println("student's adress: "+ ob[i].adress);
              System.out.println("student's Mobile Number: "+ ob[i].mobileNum);
              System.out.println("student's email id : "+ ob[i].email);
              j=1;
              break;
          }
        }
        if(j!=1){
          System.out.println(rs + " roll number is not Found");
        }
 }

  static void change(A12 ob[],int n){

    Scanner input=new Scanner(System.in);
     System.out.println("\nEnter the roll number of student which details you want to change");
    int ro=input.nextInt();
    int j=0;
    for(int i=0;i<n;i++){
          if(ro == ob[i].rollNum){
              ob[i].NewStudent();
              j=1;
          }
        }
   if(j!=1){
           System.out.println(ro + " roll number is not Found");
        }

  }

  static void change(A10 ob[],int n){

    Scanner input=new Scanner(System.in);
     System.out.println("\nEnter the roll number of student which details you want to change");
    int ro=input.nextInt();
    int j=0;
    for(int i=0;i<n;i++){
          if(ro == ob[i].rollNum){
              ob[i].NewStudent();
              j=1;
          }
        }
   if(j!=1){ System.out.println(ro + " roll number is not Found"); }
   
  }

public static void main(String args[]){
    final String ST ="SCHOOL MANAGEMENT SYSTEM";
    System.out.println("OOP Concepts used--------\nINHERITANCE\nPOLYMORPHISM\nINTERFACE\nEXCEPTION HANDLING");
    System.out.println("\n\n  -------------------******* "+ST+" *******-------------------\n\n");
      
    Scanner input=new Scanner(System.in);
    int n12,n10;
     
    System.out.println("How many students in class A12?");
    n12=input.nextInt();

     System.out.println("Enter the students details (for class A12 )"); 
       A12 ob[] = new A12[n12];
       for(int i=0;i<n12;i++){
       ob[i]= new A12();
       ob[i].NewStudent();
      }  

      System.out.println("\nHow many students in class A10?");
      
       label:
      while(true){
        input.nextLine();
      try{
        n10 = input.nextInt();
        break label;
      }
      catch(Exception e){
        System.out.println("Enter valid input number ");
        continue label;
      }
      }

      System.out.println("Enter the all  students details (for class A10 )"); 
       A10 ob1[] = new A10[n10];
       for(int i=0;i<n10;i++){
       ob1[i]= new A10();
       ob1[i].NewStudent();
      }  

int a=0;
while(a!=4){
      System.out.println("\nEnter 1: for search students details");
      System.out.println("Enter 2: for change students details");
      System.out.println("Enter 3: for class teacher's details"); 
      System.out.println("Enter 4: for exit");     
      a=input.nextInt();
      int std;
        switch(a){
         case 1 : 
          System.out.println("Enter Standard from 10 or 12");
          std =input.nextInt();
          if(std==12){
             search(ob,n12);
          }
          else{
             search(ob1,n10);
          }
         break;
         case 2 : 

           System.out.println("Enter Standard from 10 or 12");
             std = input.nextInt();
           if(std==12){
             change(ob,n12);
           }
          else{
             change(ob1,n10);
          }
              
         break;
         
         case 3 : 
            
          System.out.println("Enter Standard from 10 or 12");
          std =input.nextInt();
          if(std==12){
              ob[0].showT();
          }
          else{
             ob1[0].showT();
          }

         break;

         case 4: a=4;
         break;

         default : System.out.println("please enter valid number( valid number are 1,2,3 )");
     }

}
      }    
}