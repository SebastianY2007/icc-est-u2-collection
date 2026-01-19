package Models;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int cedula;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int cedula) {
        this.name = name;
        this.age = age;
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    @Override
    public String toString() {
        return "Person [Name:" + name + ", Age:" + age + "]";
    }
    
    
    @Override
    public int compareTo(Person o) {
        int compN = this.name.compareTo(o.getName());
        if (compN != 0) return compN;
    
        int compA = Integer.compare(this.age, o.getAge());
        
        return compA;
    }
}
