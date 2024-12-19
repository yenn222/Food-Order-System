package io.yenniii.food.menu;

import java.util.List;

public class MenuMain {
    public static void main(String[] args) {
        System.out.println("=== Menu Management ===");

        // READ ALL - 초기 데이터 출력
//        List<Menu> menuList = MenuService.selectAll();
//        for (Menu menu : menuList) {
//            System.out.println(menu);
//        }

        // READ BY ID - 특정 메뉴 확인
//        System.out.println("메뉴를 검색합니다...");
//        Menu menu = MenuService.selectByID(3);
//        if (menu == null) {
//            System.out.println("해당 메뉴가 존재하지 않습니다.");
//        } else {
//            System.out.println(menu);
//        }

        // CREATE - 메뉴 추가
//        System.out.println("새로운 메뉴를 추가합니다...");
//        MenuService.insertMenu(3, "Pasta", 12000, "taste");
//        Menu menu = MenuService.selectByID(3);
//        if (menu == null) {
//            System.out.println("메뉴 추가에 실패했습니다.");
//        } else {
//            System.out.println(menu);
//        }

        // UPDATE - 메뉴 가격 수정
//        System.out.println("메뉴 가격을 수정합니다...");
//        MenuService.updateMenu(3, 13000);
//        Menu menu = MenuService.selectByID(3);
//        if (menu != null) {
//            System.out.println(menu);
//        }

        // DELETE - 메뉴 삭제
//        System.out.println("메뉴를 삭제합니다...");
//        MenuService.deleteMenu(3);
//        Menu menu = MenuService.selectByID(3);
//        if (menu != null) {
//            System.out.println("메뉴 삭제에 실패했습니다.");
//        } else {
//            System.out.println("메뉴가 성공적으로 삭제되었습니다.");
//        }
    }
}