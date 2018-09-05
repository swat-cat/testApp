package com.company;

import java.util.Arrays;

public class Main {

    public int number = 0;

    public static void main(String[] args) {
        User me = new User(31,"Max");
        User kid = new User(6,"Some kid");

        int a,b;
        a= 31;
        b = a;

        if (kid.getAge() > 5 | me.incEndReturAge() > 30){
            log("Kid age: "+kid.getAge());
            log("My age: "+me.getAge());
        }

        log(""+a++);
        log(""+(++b));
        log(""+a);

        log("Could by beer: "+(me.getAge()>18?true:false));
        log("Could by beer: "+(kid.getAge()>18?true:false));
        byte smallValue = 3;
        short mediumValue = 300;
        int bigValue = 3;
        long hugeValue = 3;

        smallValue = (byte) mediumValue;
        log(String.valueOf(smallValue));


        /*Integer i = new Integer(3);
        Long.valueOf(i);

        for(int index = 0; index<=5;index++){
            log(String.valueOf(index));
        }*/

        int [] arr = {1,2,4,8};
        int [] arr2 = {1,2,4,8};
        log(String.valueOf(Arrays.equals(arr,arr2)));

        /*for (int k:arr){
            log(String.valueOf(arr[k]));
        }*/

        /*int i = 0;
        while (i<arr.length){
            i++;
            log("passing here"+i);
        }

        i=6;

        do {
            log("Not passing here");
        }while (i<5 );*/

        /*boolean isRunning = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (isRunning){
                    //do some heavy stuff
                    try {
                        Thread.sleep(1000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });*/

        int [][] mulArr = {
                {2,2,2},{3,3,3}
        };

        for (int i = 0; i < mulArr.length; i++) {
            for (int j = 0; j < mulArr[i].length; j++) {
                log(String.valueOf(mulArr[i][j]));
            }
        }

        for (int y:arr){
            log("inner");
            if (y==4){
                //continue;
                break;
            }
            log(String.valueOf(y));
        }


        log(User.class.getCanonicalName());

        String str = "abc";
        String str1 = "abc";
        String str3 = new String ("abc");

        log("equal: "+(str == str1));
        log("equal: "+(str == str3));
        log(""+User.maxAge);
        User.maxAge++;
        log(""+User.maxAge);

        boolean can = new Employee
                .Builder()
                .withAge(12)
                .withFirstName("Max")
                .withLastName("Ermakov")
                .withId(27058l)
                .build()
                .canBuyAlcahol();

        log(new VehicleFactory().getVehicle(VehicleType.CAR).getType());
    }

    private static void log(String log){
        System.out.println(Main.class.getSimpleName()+": "+log);
    }
}
