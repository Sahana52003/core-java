package com.xworkz.enumarations.file;

public enum Cat {
    BOBTAIL("sleeping"),PETERBALD("eating"),PERSION("walking"),BENGAL("sound"),SIBERIAN("Dancing"),MAINECOON(""),RUSSIANBUE(""),SPHYNX(""),CYMRIC(""),TOOBY("");

    String behavior;

     Cat(String behavior){
        this.behavior=behavior;
    }
   public String getBehavior(){
         return behavior;
    }
}
