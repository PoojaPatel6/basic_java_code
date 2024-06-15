// write a program to demonstrate encapsulation & write a java print hello on screen and then print your name on a separate line.

class Student{
    
    public int rollno;
    String name;
    public int getRollno(){
        return rollno;

    }

    public void setRollno(int rollno){

        this.rollno = rollno;

    }
    public String getName(){
        return name;


    }
    public void setName(String name){
        this.name = name;
    }


    }

    class Encapsulation{
        public static void main(String[] args) {

            Student s1 = new Student();
            s1.setRollno(3);
            System.out.println(s1.getRollno());

            
        }

    }
