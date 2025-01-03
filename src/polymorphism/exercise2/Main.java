//package polymorphism.exercise2;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import static javax.management.openmbean.SimpleType.STRING;
//
//public class Main {
//    public static void main(String[] args) {
//        String excelFilePath = "path/to/your/file.xlsx"; // Đường dẫn đến file Excel
//        try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
//             Workbook workbook = new XSSFWorkbook(fis)) {
//
//            // Lấy sheet đầu tiên
//            Sheet sheet = workbook.getSheetAt(0);
//
//            // Duyệt qua từng hàng và cột
//            for (Row row : sheet) {
//                for (Cell cell : row) {
//                    switch (cell.getCellType()) {
//                        case STRING:
//                            System.out.print(cell.getStringCellValue() + "\t");
//                            break;
//                        case NUMERIC:
//                            System.out.print(cell.getNumericCellValue() + "\t");
//                            break;
//                        case BOOLEAN:
//                            System.out.print(cell.getBooleanCellValue() + "\t");
//                            break;
//                        default:
//                            System.out.print("Unknown Type\t");
//                            break;
//                    }
//                }
//                System.out.println();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
