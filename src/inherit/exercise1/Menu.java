package inherit.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
//    static ArrayList<Phone> phones = new ArrayList<>();

    static {
        oldPhones.add(new OldPhone("Iphone 16 prm", 1000, 6, "Apple", 99, "Còn ngon ken"));
        oldPhones.add(new OldPhone("Iphone 15 prm", 850, 6, "Apple", 99, "Còn ngon lẽm"));

        newPhones.add(new NewPhone("SS Galaxy S24 Ultra", 870, 12, "SamSung", 5));
        newPhones.add(new NewPhone("SS Galaxy S23 Ultra", 750, 12, "SamSung", 5));
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("\n--- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI ---");
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm điện thoại mới");
            System.out.println("3. Cập nhật điện thoại");
            System.out.println("4. Xóa điện thoại");
            System.out.println("5. Sắp xếp điện thoại theo giá");
            System.out.println("6. Tìm kiếm điện thoại");
            System.out.println("7. Tính tổng tiền");
            System.out.println("8. Giảm giá cho điện thoại cũ");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        showMenuList();
                        break;
                    case 2:
                        menuAdd();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        System.out.println("Sắp xếp điện thoại theo giá:");
                        break;
                    case 6:
                        System.out.println("Tìm kiếm điện thoại:");
                        break;
                    case 7:
                        System.out.println("Tính tổng tiền:");
                        break;
                    case 8:
                        System.out.println("Giảm giá cho điện thoại cũ:");
                        break;
                    case 9:
                        System.out.println("Thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                choice = -1; // Đảm bảo vòng lặp không bị thoát
            }
        } while (choice != 9);
    }

    private static void showMenuList() {
        int choice;
        while (true) {
            System.out.println("\n--- DANH SÁCH ĐIỆN THOẠI ---");
            System.out.println("1. Xem tất cả");
            System.out.println("2. Xem điện thoại cũ");
            System.out.println("3. Xem điện thoại mới");
            System.out.println("4. Trở về Menu");
            System.out.print("Nhập lựa chọn: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("---------------------------");
                        System.out.println("Danh sách tất cả điện thoại");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1 + oldPhones.size()));
                            newPhones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("---------------------------");
                        System.out.println("Danh sách điện thoại cũ");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("---------------------------");
                        System.out.println("Danh sách điện thoại mới");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;
                    case 4:
                        System.out.println("Trở về menu chính...");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }
    }

    private static void menuAdd() {
        int choice;
        while (true) {
            System.out.println("\n--- THÊM MỚI ĐIỆN THOẠI ---");
            System.out.println("1. Thêm điện thoại cũ");
            System.out.println("2. Thêm điện thoại mới");
            System.out.println("3. Trở về Menu");
            System.out.print("Nhập lựa chọn: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(addOldPhone());
                        oldPhones.add(oldPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(addNewPhone());
                        newPhones.add(newPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        System.out.println("Trở về menu chính...");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }
    }

    private static String addOldPhone() {
        if (oldPhones.isEmpty()) {
            return "DTC001";
        }
        int maxId = Integer.parseInt(oldPhones.getFirst().getId().substring(3));
        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (id > maxId) {
                maxId = id;
            }
        }
        return String.format("DTC%03d", maxId + 1).replace(" ", "0");
    }

    private static String addNewPhone() {
        if (newPhones.isEmpty()) {
            return "DTC001";
        }
        int maxId = Integer.parseInt(newPhones.getFirst().getId().substring(3));
        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (id > maxId) {
                maxId = id;
            }
        }
        return String.format("DTM%03d", maxId + 1).replace(" ", "0");
    }

    private static void update() {
        while (true) {

            System.out.println("Nhập vào ID điện thoại muốn cập nhật:");
            String id = sc.nextLine();

            if (id.startsWith("DTC")) {
                boolean isExist = false;
                for (OldPhone oldPhone : oldPhones) {
                    if (oldPhone.getId().equals(id)) {
                        isExist = true;
                        System.out.println("Nhập thông tin mới cho điện thoại cũ:");
                        oldPhone.input();
                        System.out.println("Cập nhật thành công!");
                        break;
                    }
                }
                if (!isExist) {
                    System.out.println("Không tìm thấy ID điện thoại cũ muốn cập nhật!");
                }
            } else if (id.startsWith("DTM")) {
                boolean isExist = false;
                for (NewPhone newPhone : newPhones) {
                    if (newPhone.getId().equals(id)) {
                        isExist = true;
                        System.out.println("Nhập thông tin mới cho điện thoại mới:");
                        newPhone.input();
                        System.out.println("Cập nhật thành công!");
                        break;
                    }
                }
                if (!isExist) {
                    System.out.println("Không tìm thấy ID điện thoại mới muốn cập nhật!");
                }
            } else {
                System.out.println("ID không hợp lệ! Vui lòng nhập lại (định dạng: DTCXXX hoặc DTMXXX).");
            }
        }
    }

    private static void delete() {
        while (true) {

            System.out.println("Nhập vào Id điện thoại muốn xóa:");
            String id = sc.nextLine();

            if (id.startsWith("DTC")) {
                boolean isExist = false;
                for (OldPhone oldPhone : oldPhones) {
                    if (oldPhone.getId().equals(id)) {
                        isExist = true;
                        System.out.printf("Bạn có muốn xóa điện thoại có mã %s không?\n", id);
                        System.out.println("Chọn YES để xóa, NO để hủy.");
                        if ("yes".equalsIgnoreCase(sc.nextLine())) {
                            oldPhones.remove(oldPhone);
                            System.out.println("Xóa điện thoại cũ thành công!");
                        } else {
                            System.out.println("Hủy.");
                        }
                        break;
                    }
                }
                if (!isExist) {
                    System.out.println("Không tìm thấy ID điện thoại cũ muốn xóa!");
                }
            } else if (id.startsWith("DTM")) {
                boolean isExist = false;
                for (NewPhone newPhone : newPhones) {
                    if (newPhone.getId().equals(id)) {
                        isExist = true;
                        System.out.printf("Bạn có muốn xóa điện thoại có mã %s không?\n", id);
                        System.out.println("Chọn YES để xóa, NO để hủy.");
                        if ("yes".equalsIgnoreCase(sc.nextLine())) {
                            newPhones.remove(newPhone);
                            System.out.println("Xóa điện thoại cũ thành công!");
                        } else {
                            System.out.println("Hủy.");
                        }
                        break;
                    }
                }
                if (!isExist) {
                    System.out.println("Không tìm thấy ID điện thoại mới muốn xóa!");
                }
            } else {
                System.out.println("ID không hợp lệ! Vui lòng nhập lại (định dạng: DTCXXX hoặc DTMXXX).");
            }
        }
    }
}