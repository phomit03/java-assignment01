package seasion2;

import java.util.Scanner;

public class SinhVien { //khai báo 1 lớp sinh viên
    String name;
    int age;
    Classroom myClass;  //gọi lớp Classroom và gán tên biến


    public SinhVien(){  //hàm khởi tạo:
        // tên giống tên lớp,
        // không có dữ liệu trả về,
        // tự động chạy khi tạo đối tượng
        System.out.println("Nhập tên sinh viên: ");
        this.inputName();
    }

    void study(){
        System.out.println(this.name + " class: " + this.myClass.nameClass
                + " studying, in the room: " + this.myClass.room + " of school" + this.myClass.schoolName);
        //this.name: truyền tên vào chuỗi nằm trong hàm sv
        //this(sv): đối tượng ngầm định mặc định chung của class, khác nhau ở mỗi thời điểm
        //this.myClass.name: this.lớp cần truyền đến.tên biến
    }

    void inputName(){ //khởi tạo đối tượng (nhập vào từ bàn phím)
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }
}
