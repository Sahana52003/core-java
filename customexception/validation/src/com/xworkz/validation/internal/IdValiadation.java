package com.xworkz.validation.internal;

import com.xworkz.validation.external.ProofException;

public class IdValiadation {
    static String name="NanduShree";
    public static void main(String[] args) {
        System.out.println("ID validation");
        try{
            validate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validate() throws ProofException{
        if(name.equals("NanduShree")){
            throw new ProofException("Yes,found");
        }
    }
}
