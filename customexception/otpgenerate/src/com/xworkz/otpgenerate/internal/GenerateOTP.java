package com.xworkz.otpgenerate.internal;

import com.xworkz.otpgenerate.external.FailedException;

public class GenerateOTP {
    static int otp=123;

    public static void main(String[] args) {
        try{
            generate();
        }catch (FailedException fe){
            System.out.println(fe.getMessage());
        }
    }
    public static void generate() throws FailedException{
        if(otp!=5678){
            throw new FailedException("Invalid OTP");
        }
    }
}
