package io.yenniii.food.restaurant;

import io.yenniii.conf.Conf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static Restaurant setRestaurant(ResultSet rs) throws SQLException {
        String restaurantid = rs.getString("restaurantid");
        String name = rs.getString("name");

        String location = rs.getString("location");
        String contact = rs.getString("contact");

        return new Restaurant(restaurantid, name,location, contact);
    }


    public static List<Restaurant> selectAll() {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;

        List<Restaurant> restaurantList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {

            String query = "SELECT * FROM restaurant";

            psmtQuery = conn.prepareStatement(query);

            rs = psmtQuery.executeQuery();

            while (rs.next()) {
                Restaurant restaurant = setRestaurant(rs);
                restaurantList.add(restaurant);
            }
            return restaurantList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        } finally {
            if (psmtQuery != null) {
                try {
                    psmtQuery.close();
                } catch (SQLException ignored) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignored) {
                }
            }
        }
    }

    public static Restaurant selectById(final String restaurantid) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;

        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {

            String query = "SELECT * FROM restaurant WHERE restaurantid = ?";

            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, restaurantid);
            rs = psmtQuery.executeQuery();

            if (rs.next()) {
                Restaurant restaurant = setRestaurant(rs);
                return restaurant;
            }
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        } finally {
            if (psmtQuery != null) {
                try {
                    psmtQuery.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    public static int insert(String restaurantid, String name, String location, String contact) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;
        PreparedStatement psmtUpdate = null;


        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {
            String query = "SELECT * FROM restaurant WHERE restaurantid = ?";
            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, restaurantid);
            rs = psmtQuery.executeQuery();

            if (!rs.next()) {
                String insertStatement =
                        //두 줄로 구성 시, 줄 사이에 공백을 두어야함.
                        " INSERT INTO restaurant(restaurantid, name, location, contact) "
                                + "VALUES (?, ?, ?, ?)";
                psmtUpdate = conn.prepareStatement(insertStatement);
                psmtUpdate.setString(1, restaurantid);
                psmtUpdate.setString(2, name);
                psmtUpdate.setString(3, location);
                psmtUpdate.setString(4, contact);
                //결과 집합이 return되지 않는 executeUpdate()
                //영향받는 행의 개수가 return됨
                return psmtUpdate.executeUpdate();

            } else {
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        } finally {
            if (psmtQuery != null) {
                try {
                    psmtQuery.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    public static int update(String restaurantid, String name, String contact) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;
        PreparedStatement psmtUpdate = null;


        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {
            String query = "SELECT * FROM restaurant WHERE restaurantid = ?";
            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, restaurantid);
            rs = psmtQuery.executeQuery();

            if (rs.next()) {
                String updateStatement =
                        "UPDATE restaurant " +
                                "   SET name = ?, contact = ? "+
                                " WHERE restaurantid = ?";
                psmtUpdate = conn.prepareStatement(updateStatement);
                psmtUpdate.setString(1, name);
                psmtUpdate.setString(2, contact);
                psmtUpdate.setString(3, restaurantid);

                //결과 집합이 return되지 않는 executeUpdate()
                //영향받는 행의 개수가 return됨
                return psmtUpdate.executeUpdate();

            } else {
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        } finally {
            if (psmtQuery != null) {
                try {
                    psmtQuery.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    public static int deleteById(String restaurantid) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;
        PreparedStatement psmtUpdate = null;


        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {
            String query = "SELECT * FROM restaurant WHERE restaurantid = ?";
            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, restaurantid);
            rs = psmtQuery.executeQuery();

            if (rs.next()) {
                String deleteStatement =
                        "DELETE FROM restaurant WHERE restaurantid = ?";
                psmtUpdate = conn.prepareStatement(deleteStatement);
                psmtUpdate.setString(1, restaurantid);
                return psmtUpdate.executeUpdate();

            } else {
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        } finally {
            if (psmtQuery != null) {
                try {
                    psmtQuery.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}


