import java.util.*;

public class StudentManagement{

    static class Student{

        int id;
        String name;
        double marks;

        Student(int id,String name,double marks){
            this.id=id;
            this.name=name;
            this.marks=marks;
        }

        public String toString(){
            return id+"|"+name+"|"+marks;
        }
    }

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Update Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");

            System.out.print("\nEnter Choice:");
            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addStudent(){
        System.out.print("\nEnter Id:");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name:");
        String name=sc.nextLine();

        System.out.print("Enter Marks:");
        double marks=sc.nextDouble();

        list.add(new Student(id,name,marks));

        System.out.println("Student Added SuccessFully!");
        System.out.println();
    }

    static void viewStudent(){
        if(list.isEmpty()){
            System.out.println("\nRecord not Found");
            return;
        }
        for(Student s:list){
            System.out.println("\n"+s);
        }
        System.out.println();
    }

    static void updateStudent(){
        System.out.print("\nEnter Id:");
        int id=sc.nextInt();
        sc.nextLine();

        for(Student s:list){
            if(s.id==id){
                System.out.print("Enter New Name:");
                String name = sc.nextLine();

                System.out.print("Enter New Marks:");
                double marks=sc.nextDouble();

                list.add(new Student(id,name,marks));

                System.out.println("Updated Successfully!");
                return;
            }
            System.out.println("Student not Found!");
        }
        System.out.println();
    }

    static void deleteStudent(){
        System.out.print("\nEnter Id:");
        int id=sc.nextInt();
        sc.nextLine();

        Iterator<Student> it=list.iterator();
        while(it.hasNext()){
            if(it.next().id==id){
                it.remove();

                System.out.println("Student Deleted SuccessFully!");
                return;
            }
        }
        System.out.println("Student not Found!");
        System.out.println();
    }
}
