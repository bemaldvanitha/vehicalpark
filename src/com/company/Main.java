package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
 public static ArrayList <vehicals> cur_vehi=new ArrayList<>();
 public static ArrayList <vehicals> past_vehi=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=0,catagory,type;
        while(a==0){
            System.out.println("enter 1 to add vehical 2 to remove vehical 3 to current park 4 to stat 5 to see vehicals in specified day 6 to exit");
            catagory=scanner.nextInt();
            switch (catagory){
                case 1:
                    addVehical();
                    break;
                case 2:
                    removeVehicals();
                    break;
                case 3:
                    current_park();
                    break;
                case 4:
                    statstic();
                    break;
                case 5:
                    break;
                case 6:
                    a=9;
                    break;
                default:
                    System.out.println("wrong input type");
                    break;
            }
        }
    }

    public static void addVehical(){
        int type,numdooors,enginesize;
        String idplatenum,brand,color;
        double volum;
        Scanner scanner1=new Scanner(System.in);
        if(cur_vehi.size() < 20) {
            System.out.println("enter vehical type 1 car, 2 van 3 moter bike");
            type = scanner1.nextInt();
            switch (type) {
                case 1:
                    System.out.println("enter numplate");
                    idplatenum = scanner1.next();
                    System.out.println("brand");
                    brand = scanner1.next();
                    System.out.println("no doors");
                    numdooors = scanner1.nextInt();
                    System.out.println("colors");
                    color = scanner1.next();
                    Date date = new Date();
                    car car1 = new car(idplatenum, brand, date, numdooors, color);
                    cur_vehi.add(car1);
                    break;
                case 2:
                    System.out.println("enter numplate");
                    idplatenum = scanner1.next();
                    System.out.println("brand");
                    brand = scanner1.next();
                    System.out.println("cargo volume");
                    volum = scanner1.nextDouble();
                    Date date1 = new Date();
                    van van1 = new van(idplatenum, brand, date1, volum);
                    cur_vehi.add(van1);
                    break;
                case 3:
                    System.out.println("enter numplate");
                    idplatenum = scanner1.next();
                    System.out.println("brand");
                    brand = scanner1.next();
                    System.out.println("engine size");
                    enginesize = scanner1.nextInt();
                    Date date2 = new Date();
                    motorbike motorbike1 = new motorbike(idplatenum, brand, date2, enginesize);
                    cur_vehi.add(motorbike1);
                    break;
                default:
                    System.out.println("wrong vehical type");
                    break;
            }
        }
        else {
            System.out.println("there are no space in park");
        }
    }

    public  static  void removeVehicals(){
        Scanner scanner2 = new Scanner(System.in);
        String idPlateNum;
        int check = -1;
        System.out.println("enter id Plate Number");
        idPlateNum = scanner2.next();
        for(int i = 0;i < cur_vehi.size();i++){
            if(cur_vehi.get(i).getIdPlateNum().equals(idPlateNum)){
                check = i;
                break;
            }
        }

        Date dateq=new Date();

        System.out.println("cur vehical number is "+cur_vehi.get(check).getIdPlateNum());
        System.out.println("cur vehical brand is "+cur_vehi.get(check).getBrand());
        System.out.println("cur vehical parked at "+dateq.toString());
        System.out.println("charge "+charge(cur_vehi.get(check).getEntryTimeDate()));

        if(check != -1){
            past_vehi.add(cur_vehi.get(check));
            cur_vehi.remove(check);
        }
    }

    public static double charge(Date date){
        double charge = 0,charge_time;
        long start_milli = date.getTime();
        Date date6=new Date();
        long now_milli = date6.getTime();
        long differ_time=now_milli-start_milli;
        charge_time = Math.ceil(differ_time/(1000*60*60));
        if(charge_time <= 3){
            charge = 3;
        }
        else{
            charge = 3+ (charge_time-3);
        }
        return charge;
    }

    public static void current_park(){
        for(int i = 0; i < cur_vehi.size(); i++ ){
            System.out.println(i);
            System.out.println(cur_vehi.get(i).getClass().getSimpleName());
            System.out.println(cur_vehi.get(i).getIdPlateNum());
            System.out.println(cur_vehi.get(i).getBrand());
            System.out.println(cur_vehi.get(i).getEntryTimeDate());
            System.out.println("----------------------------");
        }
    }

    public static void statstic(){

    }
}
