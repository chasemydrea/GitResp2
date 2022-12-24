package com.msd;

import java.util.Arrays;
import java.util.Scanner;

public class CommodityManagementSystemTest {
       public static void main(String[]args){
           Scanner sc = new Scanner(System.in);

           CommodityManagementSystem c1 = new CommodityManagementSystem();
           c1.setIdentifier(1);
           c1.setName("手机");
            System.out.println("请输入商品的数量");
           int nameNumber1 =sc.nextInt();
            c1.setNamePrice(1500);

           CommodityManagementSystem c2 = new CommodityManagementSystem();
           c2.setIdentifier(2);
           c2.setName("电脑");
           System.out.println("请输入商品的数量");
           int nameNumber2 =sc.nextInt();
           c2.setNamePrice(10000);

           CommodityManagementSystem c3 = new CommodityManagementSystem();
           c3.setIdentifier(3);
           c3.setName("蓝牙耳机");
           System.out.println("请输入商品的数量");
           int nameNumber3 =sc.nextInt();
           c3.setNamePrice(88);

           CommodityManagementSystem c4 = new CommodityManagementSystem();
           c4.setIdentifier(4);
           c4.setName("充电器");
           System.out.println("请输入商品的数量");
           int nameNumber4 =sc.nextInt();
           c4.setNamePrice(50);

           CommodityManagementSystem c5 = new CommodityManagementSystem();
           c5.setIdentifier(5);
           c5.setName("充电线");
           System.out.println("请输入商品的数量");
           int nameNumber5 =sc.nextInt();
           c5.setNamePrice(20);


           //查看商品入库信息
           System.out.println("-------------查看商品信息-----------------");
           System.out.println("商品的编号是" + c1.getIdentifier());
           System.out.println("商品1的名称为；" + c1.getName());
           System.out.println("商品1的数量为；" + c1.getNameNumber());
           System.out.println("商品1的价格为；" + c1.getNamePrice());
           System.out.println("商品的编号是" + c2.getIdentifier());
           System.out.println("商品2的名称为；" + c2.getName());
           System.out.println("商品2的数量为；" + c2.getNameNumber());
           System.out.println("商品2的价格为；" + c2.getNamePrice());
           System.out.println("商品的编号是" + c3.getIdentifier());
           System.out.println("商品3的名称为；" + c3.getName());
           System.out.println("商品3的数量为；" + c3.getNameNumber());
           System.out.println("商品3的价格为；" + c3.getNamePrice());
           System.out.println("商品的编号是" + c4.getIdentifier());
           System.out.println("商品4的名称为；" + c4.getName());
           System.out.println("商品4的数量为；" + c4.getNameNumber());
           System.out.println("商品4的价格为；" + c4.getNamePrice());
           System.out.println("商品的编号是" + c5.getIdentifier());
           System.out.println("商品的名称为；" + c5.getName());
           System.out.println("商品的数量为；" + c5.getNameNumber());
           System.out.println("商品的价格为；" + c5.getNamePrice());
           System.out.println("-----------------------------------------------");
           getOrder();
           getMax();
           removeCommodity(""  , -1);
           System.out.println("退出系统");








       }
          public static int[] getOrder(){
          int[] price = {1500,10000,88,50,20};
          Arrays.sort(price);
              for (int i = 0; i < price.length; i++) {
                  System.out.println("商品的价格由低到高为；" +price[i] + " ");
              }
            return price;
       }

           public static int[] getMax(){

               int [] namePrice = {1500,10000,88,50,20};
               int max = namePrice[0];
               for (int i = 0; i < namePrice.length; i++) {
                  if(namePrice[i] > max){
                      max = namePrice[i];
                   System.out.println("商品的价格最高是" + max + "元");
                  }

               }
                return namePrice;
       }
             public static String removeCommodity(String name,int nameNumber){

            name = "手机";
             if(nameNumber < 0){
               remove(name);
             }

              System.out.println("将" + name + "删除");
              return name;
             }

    private static void remove(String name) {
    }


}
