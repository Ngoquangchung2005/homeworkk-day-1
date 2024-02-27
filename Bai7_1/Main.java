package Bai7_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Tạo một đối tượng Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date visitDate = null;
        try {
            visitDate = sdf.parse("20-02-2024");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Tạo một đối tượng Visit
        Visit visit = new Visit("Khách hàng A", visitDate);

        // Thiết lập chi phí dịch vụ và sản phẩm
        visit.setServiceExpense(100.0);
        visit.setProductExpense(50.0);

        
        visit.getName(); 
        System.out.println(visit.toString());
    }
}
