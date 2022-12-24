package com.msd;

import java.util.Scanner;

public class CommodityManagementSystem {
             private int identifier;
             private String name ;
             private int nameNumber;
             private int namePrice ;

             public void setIdentifier(int identifier){
              if (identifier >= 1 && identifier <= 4 ){
                  this.identifier = identifier;//1-4分别表示商品的编号
              }else{
              // System.out.println("您输入的的信息有误");
              }


          }
          public int getIdentifier(){return identifier;}

         public void setName(String name){
                this.name = name;
         }
         public String getName(){return name;}

         public void setNameNumber(int nameNumber){
              if(nameNumber >=1 && nameNumber <= 10){
                  this.nameNumber = nameNumber;
              }else{
              // System.out.println("您输入的数量有误");
              }
          }
         public int getNameNumber(){return nameNumber;}

         public void setNamePrice(int namePrice){
              this.namePrice = namePrice;
         }
         public int getNamePrice(){return namePrice;}

          /* public  static    Scanner sc = new Scanner(System.in);

           private static void add(){
           System.out.println("请输入商品的编号");
           int identfier = sc.nextInt();
           System.out.println("请输入商品的名称");
           String name = sc.next();
           System.out.println("请输入商品的价格");
           int namePrice =sc.nextInt();
           System.out.println("请输入商品的数量");
           int nameNumber =sc.nextInt();
           }    */













}
