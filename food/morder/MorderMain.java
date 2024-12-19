package io.yenniii.food.morder;

import io.yenniii.food.morder.MorderService;

import java.sql.Timestamp;
import java.util.List;

public class MorderMain {
    public static void main(String[] args) {
        System.out.println("=== Order Management ===");

//        // 고객 데이터 추가 (customerf 테이블에 삽입)
//        System.out.println("Adding customers...");
//        CustomerService.insert("C001", "Alice", "0101234", "서울시 강남구");
//        CustomerService.insert("C002", "Bob", "01056", "대전시 유성구");

        // CREATE
//        System.out.println("\nAdding new orders...");
//        MorderService.insert(1, new Timestamp(System.currentTimeMillis()), "Processing", 50000, "yenniii");
//        MorderService.insert(2, new Timestamp(System.currentTimeMillis()), "Completed", 30000, "seonhye");

        // READ ALL
//        System.out.println("\nAll Orders:");
//        List<Morder> orders = MorderService.selectAll();
//        for (Morder order : orders) {
//            System.out.println(order);
//        }

        // READ BY ID
//        System.out.println("\nFetching Order by ID (1):");
//        Morder order = MorderService.selectById(1);
//        if (order != null) {
//            System.out.println(order);
//        } else {
//            System.out.println("Order not found.");
//        }

        // DELETE
//        System.out.println("\nDeleting Order (2):");
//        MorderService.deleteById(2);
//        System.out.println("Order 2 deleted successfully.");

        // READ ALL AFTER DELETE
//        System.out.println("\nAll Orders After Deletion:");
//        List<Morder> orders = MorderService.selectAll();
//        for (Morder o : orders) {
//            System.out.println(o);
//        }
    }
}