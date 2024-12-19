package io.yenniii.food.customer;

import io.yenniii.conf.Conf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static Customer setCustomer(ResultSet rs) throws SQLException {
        String customerid = rs.getString("customerid");
        String name = rs.getString("name");
        String contact = rs.getString("contact");
        String address = rs.getString("address");

        return new Customer(customerid, name,contact, address);
    }


    public static List<Customer> selectAll() {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;

        List<Customer> customerList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {

            String query = "SELECT * FROM customerf";

            psmtQuery = conn.prepareStatement(query);

            rs = psmtQuery.executeQuery();

            while (rs.next()) {
                Customer customer = setCustomer(rs);
                customerList.add(customer);
            }
            return customerList;

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

    public static Customer selectById(final String customerid) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;

        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {

            String query = "SELECT * FROM customerf WHERE customerid = ?";

            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, customerid);
            rs = psmtQuery.executeQuery();

            if (rs.next()) {
                Customer customer = setCustomer(rs);
                return customer;
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
    public static int insert(String customerid, String name, String contact, String address) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;
        PreparedStatement psmtUpdate = null;


        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {
            String query = "SELECT * FROM customerf WHERE customerid = ?";
            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, customerid);
            rs = psmtQuery.executeQuery();

            if (!rs.next()) {
                String insertStatement =
                        //두 줄로 구성 시, 줄 사이에 공백을 두어야함.
                        " INSERT INTO customerf(customerid, name, contact, address) "
                                + "VALUES (?, ?, ?, ?)";
                psmtUpdate = conn.prepareStatement(insertStatement);
                psmtUpdate.setString(1, customerid);
                psmtUpdate.setString(2, name);
                psmtUpdate.setString(3, contact);
                psmtUpdate.setString(4, address);
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
    public static int update(String customerid, String contact, String address) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;
        PreparedStatement psmtUpdate = null;


        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {
            String query = "SELECT * FROM customerf WHERE customerid = ?";
            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, customerid);
            rs = psmtQuery.executeQuery();

            if (rs.next()) {
                String updateStatement =
                        "UPDATE customerf " +
                                "   SET contact = ?, address = ? "+
                                " WHERE customerid = ?";
                psmtUpdate = conn.prepareStatement(updateStatement);
                psmtUpdate.setString(1, contact);
                psmtUpdate.setString(2, address);
                psmtUpdate.setString(3, customerid);

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
    public static int deleteById(String customerId) {
        ResultSet rs = null;
        PreparedStatement psmtQuery = null;
        PreparedStatement psmtUpdate = null;


        try (Connection conn = DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD)) {
            String query = "SELECT * FROM customerf WHERE customerid = ?";
            psmtQuery = conn.prepareStatement(query);
            psmtQuery.setString(1, customerId);
            rs = psmtQuery.executeQuery();

            if (rs.next()) {
                String deleteStatement =
                        "DELETE FROM customerf WHERE customerid = ?";
                psmtUpdate = conn.prepareStatement(deleteStatement);
                psmtUpdate.setString(1, customerId);
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


