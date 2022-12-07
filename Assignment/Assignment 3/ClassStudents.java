import java.util.Scanner;

/**
 * Problem
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/11/28
 */

public class ClassStudents {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(input.nextLine());
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String in = input.nextLine();
            String[] in_array = in.split(", ");
            students[i] = new Student(in_array[0], in_array[1], Integer.parseInt(in_array[2]), in_array[3]);
        }
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            Boolean find = false;
            for (Student student: students) {
                if (student.name.equals(name)) {
                    System.out.println(student);
                    find = true;
                }
            }
            if(!find) System.out.println(name+": None");
        }
    }
}

class Student {
    String name;
    String gender;
    int birth_year;
    String phone;

    public Student(String _name, String _gender, int _birth_year, String _phone) {
        name = _name;
        gender = _gender;
        birth_year = _birth_year;
        phone = _phone;
    }

    public String toString() {
        return name + ": " + gender + ", " + birth_year + ", " + phone;
    }
}