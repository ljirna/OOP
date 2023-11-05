package Week5.lecture;

class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        return this.name + "\n" + this.address;
    }
}

class Student extends Person{
    private int credits = 0;

    public Student(int credits, String name, String address){
        super(name, address);
        this.credits = credits;
    }

    public int getCredits(){
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void study(){
        credits++;
    }
}