public class Teacher extends Person {
        private int salary = 0 ; 


        public Teacher(String name, String addres, int salary) {
            super(name, addres);
            this.salary = salary;
        }



        public String toString() {
            return super.toString() + "\n  salary "+this.salary+" euro/month";
        }

}
