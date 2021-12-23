package service;

import dao.AdminDao;
import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminDao adminDao;
    @Autowired
    public AdminService(@Qualifier("fakeAdminDao") AdminDao adminDao) {
        this.adminDao = adminDao;
    }
    public int insertAdmin(Admin admin){
        return adminDao.insertAdmin(admin.getUsername(),admin);
    }


}
