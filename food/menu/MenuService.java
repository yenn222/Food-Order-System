package io.yenniii.food.menu;

import io.yenniii.conf.Conf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private static Menu setMenu(ResultSet rs) throws SQLException {
        int menuID = rs.getInt("menuID");
        String name = rs.getString("name");
        int price = rs.getInt("price");
        String restaurantID = rs.getString("restaurantID");

        return new Menu(menuID, name, price, restaurantID);
    }

    // CREATE
    public static int insertMenu(int menuID, String name, int price, String restaurantID) {
        String query = "INSERT INTO menu (menuID, name, price, restaurantID) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setInt(1, menuID);
            psmt.setString(2, name);
            psmt.setInt(3, price);
            psmt.setString(4, restaurantID);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // READ ALL
    public static List<Menu> selectAll() {
        List<Menu> menuList = new ArrayList<>();
        String query = "SELECT * FROM menu";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement psmt = conn.prepareStatement(query);
             ResultSet rs = psmt.executeQuery()) {
            while (rs.next()) {
                menuList.add(setMenu(rs));
            }
            return menuList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // READ BY ID
    public static Menu selectByID(int menuID) {
        String query = "SELECT * FROM menu WHERE menuID = ?";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setInt(1, menuID);
            try (ResultSet rs = psmt.executeQuery()) {
                if (rs.next()) {
                    return setMenu(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // UPDATE
    public static int updateMenu(int menuID, int price) {
        String query = "UPDATE menu SET price = ? WHERE menuID = ?";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setInt(1, price);
            psmt.setInt(2, menuID);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // DELETE
    public static int deleteMenu(int menuID) {
        String query = "DELETE FROM menu WHERE menuID = ?";
        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
             PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setInt(1, menuID);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}