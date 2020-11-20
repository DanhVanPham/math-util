/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhpv.util.test;

import danhpv.util.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    @Test //biến hàm trong class này thành public static void main()
    //nhờ bộ thư viện JUnit
    //tại sao cần vậy, vì mặc định app từ main() chuẩn
    //trong khi đó mình chỏ cần test thử hàm thoy, ko can thiệp main()
    //vậy mình cần main() khác, @Test giúp điều đó
    //nhưng vì có nhiều main() CPU bị bối rối khi nhấn F6
    //F6 dang cho main()
    //Shift F6 dành cho bên này
    public void getFactorial_RunsWell_IfValidArgument() {
        //cú pháp đặt tên hàm dùng để test hàm khác cho dân QC
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //bắt ngoại lệ như thế nào
    //không thể bắt được, không phải là 1 value để so sánh
    //do đó dùng assertEquals là không được vì nó là exception
    //nên ta dùng kỹ thuật khác
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowException_IfInvalidArgument() {
        MathUtility.getFactorial(-5);
    }
//trước khi clean and build tạo ra file .jar cần sửa build-impl.xml dòng 1005
    //để chạy file test trước
    //nếu thành công tạo ra file .jar
    //nếu thất bại không tạo ra file
    //<target depends="init,compile,test,-pre-pre-jar,-pre-jar,-do-jar-create-manifest,-do-jar-copy-manifest,-do-jar-set-mainclass,-do-jar-set-profile,-do-jar-set-splashscreen" if="do.archive" name="-do-jar-jar" unless="do.mkdist">
}
