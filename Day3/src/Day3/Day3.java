/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author macstudent
 */
public class Day3 {
    public static void main(String args[]) {
    Person hitesh = new Person();
    hitesh.name = "Hiteshwar";
    hitesh.address = "Mississauga";
    hitesh.gender = 'M';
    hitesh.age = 22;
    hitesh.phoneNo = "416-828-0869";
    
    
    System.out.println("Name : " + hitesh.name);
    System.out.println("address : " + hitesh.address);
    System.out.println("Gender : " + hitesh.gender);
    System.out.println("Age : " + hitesh.age);
    System.out.println("phoneNo : " + hitesh.phoneNo);
        
        Person shashank = new Person();
        shashank.setName();
    System.out.println("Name :" + shashank.getName());
        shashank.setaddress();
    System.out.println("address :" + shashank.getaddress());
             shashank.setGender();

    System.out.println("Gender :" + shashank.getgender());
       shashank.setphoneNo();
    System.out.println("phoneNo :" + shashank.getphoneNo());
          shashank.setAge();
    System.out.println("Age :" + shashank.getAge());
    System.out.println(shashank.toString());
    Person saloni = new Person();
    saloni.setData();
    System.out.println(saloni.toString());
    
       
       
        
        
    
    
}
}
