package com.xworkz.customexception.external;


public class Person extends RuntimeException {
public Person(){
    super();
}
public Person(String message){
    super(message);
}
}
