package quanLyStudent.Controller;

import quanLyStudent.service.ServiceStudenInterface;
import quanLyStudent.model.SortListById;
import quanLyStudent.model.Studen;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ControllerStuden {

    ServiceStudenInterface service = new ServiceStudenInterface();
    Scanner scanner = new Scanner(System.in);
    List<Studen> listStuden = service.findAll();


    public void showlisst() {
        for (Studen studen : listStuden) {
            System.out.println(studen);
        }
        System.out.println("hiển thị mảng");
    }

    public void addList() {

            boolean isNumberId;
            int id = -1;
            do {
                System.out.println("nhập id");
                isNumberId = true;
                try {
                    id = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    isNumberId = false;
                    System.err.println("ID phải là số");
                }
            }while (!isNumberId);
            System.out.println("nhập name");
            String name = scanner.nextLine();
            int age = -1;
        do {
            System.out.println("nhập age");
            isNumberId = true;
            try {
                age = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                isNumberId = false;
                System.err.println("age phải là số");
            }
        }while (!isNumberId);
            System.out.println("nhập gender");
            String gender = scanner.nextLine();
            System.out.println("nhập workingDay");
            double workingday = Double.parseDouble(scanner.nextLine());
            Studen studen = new Studen(id, name, age, gender, workingday);
            service.save(studen);
            System.out.println("\n" + "đã thêm vào danh sách thành công");

    }

    public void editList() {
        while (true) {
            System.out.println("nhập id cần sửa");
            int id = Integer.parseInt(scanner.nextLine());
            int index = 0;
            for (int i = 0; i < listStuden.size(); i++) {
                if (id == listStuden.get(i).getId()) {
                    index = i;
                }
            }
            System.out.println("nhập name");
            String name = scanner.nextLine();
            System.out.println("nhập age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập gender");
            String gender = scanner.nextLine();
            System.out.println("nhập workingDay");
            double workingday = Double.parseDouble(scanner.nextLine());
            Studen studen = new Studen(id, name, age, gender, workingday);
            service.edit(index, studen);
        }
    }

    public void deleteById() {

            System.out.println("nhập id cần xóa");
            int id = scanner.nextInt();

            for (int i = 0; i < listStuden.size(); i++) {
                if (id == listStuden.get(i).getId()) {
                    service.delete(i);

            }
        }
    }

    public void searchById() {
        while (true) {
            System.out.println("nhập id cần tìm");
            int id = Integer.parseInt(scanner.nextLine());
            int index = 0;
            for (int i = 0; i < listStuden.size(); i++) {
                if (id == listStuden.get(i).getId()) {
                    index = i;
                }
            }
            for (Studen studen : listStuden) {
                if (id == studen.getId()) {
                    System.out.println(listStuden.get(index).toString());
                }
            }
        }
    }

    public void sortList() {
        SortListById sortListById = new SortListById();
        listStuden.sort(sortListById);
        for (Studen sp : listStuden) {
            System.out.println(sp);
        }
    }

    public void maxAge() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < listStuden.size(); i++) {
            if (max < listStuden.get(i).getAge()) {
                max = listStuden.get(i).getAge();
                index = i;
            }
        }
        System.out.println("người có tuổi cao nhất là: " + listStuden.get(index));
    }
    public void realdFile(){
        try {
            FileReader fileReader = new FileReader("studen.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null){
                String realdfile[] = line.split(" , ");

                int id = Integer.parseInt(realdfile[0]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("studen.txt");
            for (Studen st : listStuden) {
                fileWriter.write(st.toString() + " \n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
