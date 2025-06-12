class Employee{
    private String Name;
    private int age;

    public getName()
    {
        return Name;
    }
    public setName(String Name)
    {
        this.Name=Name;
    }
    public getAge()
    {
        return Age;
    }
    public setAge(int Age)
    {
        this.Age=age;
    }
    
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}


public class Demo2
 {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setName("John");
        emp.setAge(30);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());

        
        Animal a;
        a = new Dog(); 
        a.makeSound(); 

        a = new Cat(); 
        a.makeSound(); 
    }
}
