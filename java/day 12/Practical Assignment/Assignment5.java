class Student {
    private String name;
    private int age;

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    
    void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

class Assignment5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("OM");
        s.setAge(18);
        s.display();  
    }
}
