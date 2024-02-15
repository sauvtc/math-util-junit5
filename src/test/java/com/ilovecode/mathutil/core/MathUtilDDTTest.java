/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ilovecode.mathutil.core;

import static com.ilovecode.mathutil.core.MathUtil.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Sau
 */
public class MathUtilDDTTest {
    
    // muốn sử dụng các DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hoá data này
    // vào trong câu lệnh kiểm thử
    //Bước 1 chuẩn bị bộ data
    // hàm trả về bộ data
    public static Object[][] initData(){
        return new Integer [][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,720},
        };
        
    }
    //Tham số hoá test
    @ParameterizedTest
    @MethodSource(value="initData")//tên hàm cung cấp data ngầm định thứ tự
    // của các phần tử mảng, map vào tham số hàm
    public void TestGetFactorialGivenRightArgReturnWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    
    }
}
