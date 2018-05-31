/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    String name;
String address;
String phoneNo;
int age;
char gender;

Scanner in = new Scanner(System.in);

void setName(){
    
    System.out.println("Enter name :");
    name = in.nextLine();
}
String getName(){
    return name;
}


void setaddress() {
    System.out.println("Enter address :");
    address = in.nextLine();
    
}
    String getaddress(){
    return address;
}
char setGender(){
    return gender;
      
    
}

 

void setAge(){
    System.out.println("Enter age :");
    age = in.nextInt();
    
}
int getAge(){
    return age;  
}

void setphoneNo(){
    System.out.println("Enter phoneNo :");
    phoneNo = in.nextLine();
    
}
void setgender(){
    System.out.println("Enter gender :");
    gender = (char) in.nextInt();
    //in.nextLine();
    
}
char getgender(){
    return gender;  
}
    String getphoneNo(){
    return phoneNo; 
}
   
    
    @Override
public String toString(){
    String data = "Name : " + name  + "\n" +
            "Address : " + address + "\n" +
            "phoneNo : " + phoneNo + "\n" +
            "gender : " + gender + "\n" +
            "age : " + age + "\n";
    
            return data;
            
            
}
void setData(){
    setName();
    setaddress();
    setphoneNo();
    setgender();
    setAge();
}
}


