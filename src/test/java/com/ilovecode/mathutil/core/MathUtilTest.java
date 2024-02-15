/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ilovecode.mathutil.core;

import static com.ilovecode.mathutil.core.MathUtil.*;
//import static dành cho những hàm static,
// gọi hàm mà không có bỏ qua class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author Sau
 */
public class MathUtilTest {
    
    @Test
    public void TestGetFactorialRighWell()
    {
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }
    // bắt ngoại lệ khi đưa data không đúng
    @Test 
    public void TestGetFactorialWrongThrowException()
    {
        //xài biểu thức Lamda
        //hàm nhận tham số thứ 2 là 1 cái object/ có code implement 
        //cái functional interface tên là Excecutable - có 1 hàm duy nhất không có code tên là execute() chơi chậm
        // cách 1
//        Executable exObject =new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
        //cách 2 sử dụng biểu thức lamda
       // Executable exObject=()->{getFactorial(-5);};
        //cach 3 đưa biểu thức lamda vào trong hàm assert
        assertThrows(IllegalArgumentException.class, ()->getFactorial(-5));
    }
   
    
}
