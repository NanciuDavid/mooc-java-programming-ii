public class Person {
    private String name;
    private String addres;

    public Person(String name, String addres) {
        this.name = name ;
        this.addres = addres;
    }

    public Person(){
        this.name = " ";
        this.addres = " ";
    }

    public String toString() {
        return this.name+"\n  "+this.addres;
    }
}
