//  Jack Sheridan
//  G00326495
//  addStudent class
//  09-03-21

package ie.gmit;

import java.util.ArrayList;

public class Student {

    private String name;
    private String email;


    public Student(String name, String email) {
        setName(name);
        setEmail(email);
    }
//    public Student() {
//        super();
//        name = "";
//        email = "";
//    }

    public void toSting() {
    }

    public void setName(String name) {
        if (name == "") {
            throw new IllegalArgumentException("Invalid name");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        if (email == "") {
            throw new IllegalArgumentException("Invalid email");
        } else {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public void printDetails() {
        System.out.println("" + "" + getName() + getEmail());
    }

    @Override
//    public String toString() {
//        System.out.println(toString());
//        return super.toString();
//    }
}
//    public Student(String name, String email) throws Exception {
//
//            //int count = 0;
//            if (name == "" || email == "") {
//                throw new Exception("Please enter both your name and email");
//            } else {
//                this.name = name;
//                this.email = email;
//                ArrayList<Student> Contacts = new ArrayList<Student>();
//                Contacts.add(new Student(name, email));
//                System.out.println(Contacts);
//            }
//    }

