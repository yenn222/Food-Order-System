package io.yenniii.food.restaurant;

import io.yenniii.food.restaurant.Restaurant;

import java.util.List;

public class RestaurantMain {
    public static void main(String[] args) {
        System.out.println("\n전체 음식점 정보 검색하기\n");
        List<Restaurant> restaurantList = RestaurantService.selectAll();
        for(Restaurant restaurant: restaurantList) {
            System.out.println(restaurant);
        }

        //아이디로 검색하기
//        System.out.println("\n아이디로 검색하기 - 맛있는 음식점\n-----------");
//        Restaurant taste = RestaurantService.selectById("taste");
//        if(taste != null){
//            System.out.println(taste);
//        } else {
//            System.out.println("맛있는 음식점 not exist !!");
//        }

        //새로운 음식점 추가하기 -> 추가 확인 검색
//        System.out.println("\n 새로운 음식점 추가하기 - 맛있는 음식점 \n ----------------");
//        if(RestaurantService.insert("taste", "맛있는 음식점", "대전광역시 유성구 봉명동", "042-111-1234") > 0){
//            Restaurant taste = RestaurantService.selectById("taste");
//            if (taste != null) {
//                System.out.println(taste);
//            } else {
//                System.out.println("맛있는 음식점 not exist !!");
//            }
//        } else {
//            System.out.println("맛있는 음식점 추가에 실패했습니다.");
//        }

        //음식점 정보 수정하기 -> 추가 확인 검색
//        System.out.println("\n 음식점 정보 수정하기 - 맛있는 음식점 \n ----------------");
//        if(RestaurantService.update("taste", "진짜맛있는음식점" , "042-123-4567") > 0){
//            Restaurant taste = RestaurantService.selectById("taste");
//            if (taste != null) {
//                System.out.println(taste);
//            } else {
//                System.out.println("맛있는 음식점 not exist !!");
//            }
//        } else {
//            System.out.println("음식점 수정에 실패했습니다.");
//        }
//
//        //음식점 정보 삭제하기 -> 추가 확인 검색
//        System.out.println("\n 음식점 정보 삭제하기 - 진짜맛있는음식점 \n ----------------");
//        if(RestaurantService.deleteById("taste") > 0){
//            Restaurant taste = RestaurantService.selectById("taste");
//            if (taste != null) {
//                System.out.println("taste 고객 삭제에 실패했습니다. ");
//            } else {
//                System.out.println("진짜맛있는음식점 정보 삭제에 성공했습니다 !!");
//            }
//        } else {
//            System.out.println("진짜맛있는음식점 삭제에 실패했습니다.");
//        }
    }
}