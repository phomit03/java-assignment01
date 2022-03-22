package seasion2;

import java.util.Scanner;

public class Classroom {
    String nameClass;    //tên lớp
    String room;    //tên phòng học
    String schoolName;  //tên trường

    public Classroom() {
        //yêu cầu nhập thông tin từ bàn phím:
        System.out.println("Nhập tên lớp: ");
        this.inputClassroom();
        System.out.println("Nhập tên phòng học: ");
        this.inputClassroom();
        System.out.println("Nhập tên trường: ");
        this.inputClassroom();
    }

    void inputClassroom(){ //khởi tạo đối tượng (nhập vào từ bàn phím)
        Scanner sc = new Scanner(System.in);
        this.nameClass = sc.nextLine();
        this.room = sc.nextLine();
        this.schoolName = sc.nextLine();
    }

    public void opening() {
        System.out.println("Opening...");
    }

    public void endOfCourse() {
        System.out.println("End of course...");
    }

    public void end() {
        System.out.println("End...");
    }

}
