package io.yenniii.food.customer;

import io.yenniii.food.customer.Customer;

import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        System.out.println("\n전체 고객 정보 검색하기\n");
        List<Customer> customerList = CustomerService.selectAll();
        for(Customer customer: customerList) {
            System.out.println(customer);
        }

        //아이디로 검색하기
//        System.out.println("\n아이디로 검색하기 - yenniii\n-----------");
//        Customer yenniii = CustomerService.selectById("yenniii");
//        if(yenniii != null){
//            System.out.println(yenniii);
//        } else {
//            System.out.println("yenniii not exist !!");
//        }
//
//        System.out.println("\n아이디로 검색하기 - seonhye\n-----------");
//        Customer seonhye = CustomerService.selectById("seonhye");
//        if(seonhye != null){
//            System.out.println(seonhye);
//        } else {
//            System.out.println("seonhye not exist !!");
//        }

        //새로운 고객 추가하기 -> 추가 확인 검색
//        System.out.println("\n 새로운 고객 추가하기 - yenniii \n ----------------");
//        if(CustomerService.insert("yenniii", "임예은", "010-4733-3560", "대전광역시 유성구") > 0){
//            Customer yenniii = CustomerService.selectById("yenniii");
//            if (yenniii != null) {
//                System.out.println(yenniii);
//            } else {
//                System.out.println("yenniii not exist !!");
//            }
//        } else {
//            System.out.println("yenniii 고객 추가에 실패했습니다.");
//        }

//        System.out.println("\n 새로운 고객 추가하기 - seonhye \n ----------------");
//        if(CustomerService.insert("seonhye", "이선혜", "010-9350-2128", "세종특별시") > 0){
//            Customer seonhye = CustomerService.selectById("seonhye");
//            if (seonhye != null) {
//                System.out.println(seonhye);
//            } else {
//                System.out.println("seonhye not exist !!");
//            }
//        } else {
//            System.out.println("seonhye 고객 추가에 실패했습니다.");
//        }

        //고객 정보 수정하기 -> 추가 확인 검색
//        System.out.println("\n 고객 정보 수정하기 - yenniii \n ----------------");
//        if(CustomerService.update("yenniii", "010-4199-3560" , "대전광역시 대덕구") > 0){
//            Customer yenniii = CustomerService.selectById("yenniii");
//            if (yenniii != null) {
//                System.out.println(yenniii);
//            } else {
//                System.out.println("yenniii not exist !!");
//            }
//        } else {
//            System.out.println("yenniii 고객 수정에 실패했습니다.");
//        }
//
//        //고객 정보 삭제하기 -> 추가 확인 검색
//        System.out.println("\n 고객 정보 삭제하기 - yenniii \n ----------------");
//        if(CustomerService.deleteById("yenniii") > 0){
//            Customer yenniii = CustomerService.selectById("yenniii");
//            if (yenniii != null) {
//                System.out.println("yenniii 고객 삭제에 실패했습니다. ");
//            } else {
//                System.out.println("yenniii 정보 삭제에 성공했습니다 !!");
//            }
//        } else {
//            System.out.println("yenniii 고객 삭제에 실패했습니다.");
//        }
       }
    }