/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Bank {
    int id;
    String name;
    
    Scanner in = new Scanner(System.in);
    
    Bank()
    {
        this.id=1;
        this.name="Scotia";
        
    }
    Bank(String name, int id) {
        this.name = name;
        this.id = id;
        
    }
    int setId() {
        System.out.println();
        id = in.nextLine();
    
    int getId() {
        return id;
    }
        
        void setName() {
     System.out.println("Enter bank name ");
    }
        String getName() {
        return name;
    }
        
        
    }
    @Override
    public String toString() {
        String data="id :" +this.id+ "\n" +"name:"+ this.name;
       return data;
    }
    

