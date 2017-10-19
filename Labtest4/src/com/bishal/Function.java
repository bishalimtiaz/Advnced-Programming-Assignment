package com.bishal;

public class Function {

    //variadic Function used that accepts object
    public <T> void doSomething(T... t){
        for(int i=0;i<t.length;i++){
            boolean b;
            try{
                b=t[i] instanceof Oviparous;
                if (!b){
                    throw new Exception("Invalid");
                }
                System.out.println("valid");
            }catch (Exception e){
                System.out.println("Error... "+e);
            }
        }
    }
}
