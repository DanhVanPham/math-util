/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhpv.util;

/**
 *
 * @author DELL
 */
public class MathUtility {
    
    //class này chứa các hàm tiện ích dùng chung cho mọi nơi do nó nên là static
    public static final double PI = 3.1415;
    //hàm tính n!
    //n >= 0 && n <= 20
    //vì nếu lớn hơn 20 tràn kiểu long
    //0!= 1, 1! = 1; n!= 1*2*3*4*...
    //đưa vào n âm hoặc n > 20 ta không thèm tính gì cả, chửi Exception 
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 .. 20");
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        //chỗ này thàng xài else trừ điểm
        //ngay chỗ này chính là n = 2..20;
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}
//ta tự tin hàm ta chạy ngon, chạy đúng
//nhưng: team thì cần chứng minh điều đó, đảm bảo chất lượng code
//muốn chứng minh hàm chạy đúng hay không ta cần test thử
//ví dụ gọi hàm getFactorial(với các tham số khác nhay đưa vào)
//getF(-5), getF(-1), getF(8),...
//các giá trị đầu vào đại diện cho việc xài hàm
//ta còn gọi là test case, các tình huống cần test, các tình huống xài hàm
//khi ta test hàm ,ta cần quan tâm 2 việc
//1. dự kiến hàm trả về giá trị khi hàm chạy với 1 đầu vfo nào đó
//dự kiến hàm trả về giá trị, ta gọi là EXPECTED VALUE
//ví dụ: hàm sẽ trả về 120 khi getF(5)
//2.hàm khi chạy với 1 đầu vào nào đó, thì đó sẽ ói/return về 1 value
//cái value trả về của hàm khi chạy được gọi là ACTUAL VALUE

//NGHỀ TEST CHÍNH LÀ: SO SÁNH COI EXPECTED VALUE CÓ BẰNG ACTUAL VALUE
//NẾU CÓ BẰNG, HÀM ĐÚNG CHO TEST CASE/ TÌNH HUỐNG NÀY
//NẾU KHÔNG BẰNG, HÀM TÍNH TOÁN SAI, HOẶC KÌ VỌNG SAI

//HÀM MÀ TỐT THÌ PHẢU LÀ EXPECTED == ACTUAL MỌI TÌNH HUỐNG
//NẾU TỐT TA MỚI ĐEM RA XÀI, BÁN, PUBLIC CỘNG ĐỒNG XÀI

//LÀM SAO ĐỂ TEST COI CÓ TỐT KHÔNG, EXPECTED == VALUE
//HAI KĨ THUẬT ĐƯỢC ÁP DỤNG 
//KĨ THUẬT 1: NHÌN Bawnfg mắt và so sánh từng cặp expected vs actual
//              Chính là kĩ thuật sout(expected), sout(actual-hàm ói về gì khi chạy)
//          Kĩ thuật này đơn giản dễ làm nhưng dễ sai sót do có quá nhiều
//Expected actual cần so sánh
//KĨ THUẬT 2: Nhìn bằng mắt , ko cần so sasnnh từng cặp, để máy so sánh giùm luôn
//      mắt chỉ nhìn 2 màu XANH-ĐỎ DUY NHẤT
//nếu tất cả các cặp actual vs expected đều thỏa, MÀY XANH CHo TẤT CẢ
//nếu hầu hết các cặp actual cs expected đều thỏa, có 1 vài cái không thỏa marn
//điều này giải thích rằng đúng thì phải đúng cho tất cả cho mọi tình huống hàm chạy
//chỉ cầ 1 thằng sai, sai hết

//tương đương câu: hàm tui chjay ngon lắm, đúng 99.99%, lâu lâu sai tí
//nous cấu đó: hàm éo tin cậy để xài
//KĨ THUẬT 2 NÀY DUGNH MÀU SẮC, MUỐN LÀM VẬY THÌ PHẢI XÀI THƯ VIỆN BỔ SUNG THÊM
//CHÍNH LÀ FILE .JAR, .DLL ĐƯỢC CUNG CẤP THÊM JDK
//CÁC THư viện này tùy thuốc ngôn ngữ lập trình, được gọi chung là
//Unit test framework
//C#: thư viện NUNit, MSUnit, xUnit
//Java: thư viện JUnit, TestNG, xUnit
//...

