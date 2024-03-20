public class Student extends Person{
    private int studyCredits = 0 ; 

    public Student(String name, String addres){
        super(name, addres);
        this.studyCredits = 0;
    }


    public void study() {
        this.studyCredits++;
    }

    public int credits(){
            return this.studyCredits;
    }


    public String toString() {
        return super.toString()+"\n  Study credits "+this.credits();
    }
}
