package api;

import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AdminService;
@RequestMapping("api/v1/admin")
@RestController
public class AdminController {
    private final AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @PostMapping
    public void addAdmin(@RequestBody Admin admin){
        adminService.insertAdmin(admin);
    }
}
