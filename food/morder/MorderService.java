package io.yenniii.food.morder;

import io.yenniii.conf.Conf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MorderService {

    // CREATE
    public static int insert(int orderID, Timestamp orderDateTime, String status, int totalAmount, String customerID) {
        String query = "INSERT INTO morder VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, orderID);
            ps.setTimestamp(2, orderDateTime);
            ps.setString(3, status);
            ps.setInt(4, totalAmount);
            ps.setString(5, customerID);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // READ ALL
    public static List<Morder> selectAll() {
        List<Morder> orders = new ArrayList<>();
        String query = "SELECT * FROM morder";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                orders.add(new Morder(
                        rs.getInt("orderID"),
                        rs.getTimestamp("orderDateTime"),
                        rs.getString("status"),
                        rs.getInt("totalAmount"),
                        rs.getString("customerID")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    // READ BY ID
    public static Morder selectById(int orderID) {
        String query = "SELECT * FROM morder WHERE orderID = ?";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, orderID);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Morder(
                            rs.getInt("orderID"),
                            rs.getTimestamp("orderDateTime"),
                            rs.getString("status"),
                            rs.getInt("totalAmount"),
                            rs.getString("customerID")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // DELETE
    public static int deleteById(int orderID) {
        String query = "DELETE FROM morder WHERE orderID = ?";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, orderID);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}