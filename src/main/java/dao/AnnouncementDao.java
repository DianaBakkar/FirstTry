package dao;

import model.Announcement;

public interface AnnouncementDao {
    int insertAnnouncement(String type, String location, double price, String creator, Announcement announcement);
}
