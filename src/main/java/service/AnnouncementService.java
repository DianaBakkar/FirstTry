package service;

import dao.AnnouncementDao;
import model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementService {
    private final AnnouncementDao announcementDao;
    @Autowired

    public AnnouncementService(@Qualifier("fakeAnnouncementDao")AnnouncementDao announcementDao) {
        this.announcementDao = announcementDao;
    }
    public int insertAnnouncement(Announcement announcement){
        return announcementDao.insertAnnouncement(announcement.getType(), announcement.getLocation(),announcement.getPrice(),announcement.getCreator(), announcement);
    }
}
