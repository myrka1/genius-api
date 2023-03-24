package com.stuff.GeniusApi.Model;

public class Song {
    private String songTitle;
    private String artistName;
    private String dateReleased;
    private String imageURL;
    private String artistId;

    public Song(String songTitle, String artistName) {
        this.songTitle = songTitle;
        this.artistName = artistName;
    }
    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", artistName='" + artistName + '\'' +
                ", dateReleased='" + dateReleased + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", artistId='" + artistId + '\'' +
                '}';
    }
}
