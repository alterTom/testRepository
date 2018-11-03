package com.test;

/**
 * @Author ：chenguojun
 * @Date ：Created in 19:54 2018/10/18
 * @Description：
 * @Modified By：
 */
public class Single {

/*
    private Single(){}

    private static final Single inStance = new Single();

    public static Single getInStance(){
        return inStance;
    }*/



   /* private  Single(){}

    private static  Single instance;

    static {
        instance = new Single();
    }

    public static Single getInstance(){
        return instance;
    }*/


   /*private Single(){}

   private static Single instance = null;

   public static  Single getInstance(){
       if (instance == null){
           synchronized (Single.class){
               if (instance == null){
                   instance = new Single();
               }
           }
       }
       return instance;
   }
*/

   private Single(){}


   private static class SingleInstance{
        private static final Single instance  = new Single();
    }

    public static Single getInstance(){
       return SingleInstance.instance;
    }
























}
