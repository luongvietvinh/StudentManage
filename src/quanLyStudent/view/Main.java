package quanLyStudent.view;







import quanLyStudent.Controller.ControllerStuden;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
  ControllerStuden controllerStuden = new ControllerStuden();
    public Main() {

        while (true) {
            Input();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    controllerStuden.showlisst();
                    qtoBackMenu();
                case 2:
                    controllerStuden.addList();
                    qtoBackMenu();
                case 3:
                    controllerStuden.editList();
                    qtoBackMenu();
                    break;
                case 4:
                    controllerStuden.deleteById();
                    qtoBackMenu();
                    break;
                case 5:
                    controllerStuden.sortList();
                    qtoBackMenu();
                    break;
                case 6:
                    controllerStuden.realdFile();
                    qtoBackMenu();
                    break;
                case 7:
                    controllerStuden.writeToFile();
                    System.out.println(" ghi vào file thành công" + "\n");
                    qtoBackMenu();
                    break;
                case 8:
                    controllerStuden.maxAge();
                    qtoBackMenu();
                    break;
                case 9:
                    controllerStuden.searchById();
                    qtoBackMenu();
                    break;
            }
        }
    }

    private void Input() {
        System.out.println("menu chọn");
        System.out.println("1 - hiển thị tất cả người");
        System.out.println("2 - thêm 1 người vào danh sách");
        System.out.println("3 - sửa thông tin 1 người theo ID");
        System.out.println("4 - xóa 1 người trong dánh sách theo id");
        System.out.println("5 -sắp xếp danh sách Theo ID");
        System.out.println("6 -đọc file ");
        System.out.println("7 -ghi file ");
        System.out.println("8 - người có tuôi cao nhất ");
        System.out.println("9 -tìm sản phẩm theo id ");
        System.out.println("10 -ghi file Sản Phảm ");
        System.out.println("11 -EXIT");
        System.out.println("-------------------------------------------");
        System.out.println("nhập số =>>>");
    }

    private void qtoBackMenu() {
        System.out.println("nhập phím Q  quay lại menu");
        String q2 = scanner.nextLine();
        if (q2.equalsIgnoreCase("q")) {
            new Main();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
