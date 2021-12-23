package api;

import model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AnnouncementService;
@RequestMapping("api/v1/announcement")
@RestController
public class AnnouncementController {
    private final AnnouncementService announcementService;
    @Autowired
    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }
    @PostMapping
    public void addAnnouncement(@RequestBody Announcement announcement){
        announcementService.insertAnnouncement(announcement);
    }
}
