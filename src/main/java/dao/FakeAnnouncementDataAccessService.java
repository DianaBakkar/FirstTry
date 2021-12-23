package dao;

import model.Announcement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("fakeAnnouncementDao")

public class FakeAnnouncementDataAccessService implements AnnouncementDao{
    private static List<Announcement> DB2=new ArrayList<>();
    @Override
    public int insertAnnouncement(String type, String location, double price, String creator, Announcement announcement) {
        DB2.add(new Announcement(announcement.getType(),announcement.getLocation(),announcement.getPrice(),announcement.getCreator()));
        return 1;
    }
}
