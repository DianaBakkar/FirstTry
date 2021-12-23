package dao;

import model.Admin;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeAdminDao")
public class FakeAdminDataAccessService implements AdminDao{
    private static List<Admin> DB1=new ArrayList<>();
    @Override
    public int insertAdmin(String username, Admin admin) {
        DB1.add(new Admin(admin.getUsername()));
        return 1;
    }
}
