/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import danhpv.util.MathUtility;

/**
 *
 * @author DELL
 */
public class MathUtil {
    
    public static void main(String[] args) {
        long expected = 120;
        //tao hi vọng 120 ói về 
        long actual = MathUtility.getFactorial(5);//nếu tao gọi hàm 5! tao hi vọng 120 trả về
        System.out.println("5! expected: " + expected + ", actual: " + actual);
        
        //expected = 720, t hi vọng trả về 720 nếu tạo gọi 
        expected = 720;
        actual = MathUtility.getFactorial(6);
        System.out.println("6! expected: " + expected + ", actual: " + actual);
        
        System.out.println("0! expected: 1, actual: " + MathUtility.getFactorial(0));
        
        //tao kì vọng nhận về ngoại lệ IllegalArgumentException 
        //nếu tao gọi -5!
        MathUtility.getFactorial(-5);
        //thấy ngoại lệ lại mừng vì hàm chạy như thiết kế
        
    }
}
//cất code lên GitHub
//cần:
//nhớ kho trên GitHub, url: https://github.com/Tiktokcity/math-util.git
//nhớ username và pass và email để vào trong git của mình
//cần tool để đồng bộ code lên server từ máy mình(GitHub, GitLab, GitBucket)
//tool có thể là: cmd, GUI(Git:Desktop, Source Tree), chính là IDE,(cmd, click)
//vì ta bro ta chơi cmd
//cài git scm đã nói download sẵn