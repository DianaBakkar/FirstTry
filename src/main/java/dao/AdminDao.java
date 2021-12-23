package dao;

import model.Admin;


public interface AdminDao {
    int insertAdmin(String username, Admin admin);
}
