package com.example.mangadex;

public class MangaModel {
    public String getNamaManga() {
        return namaManga;
    }

    public void setNamaManga(String namaManga) {
        this.namaManga = namaManga;
    }

    public String getDetailManga() {
        return detailManga;
    }

    public void setDetailManga(String detailManga) {
        this.detailManga = detailManga;
    }

    public int getGambarManga() {
        return gambarManga;
    }

    public void setGambarManga(int gambarManga) {
        this.gambarManga = gambarManga;
    }

    public String getStatusManga() {
        return statusManga;
    }

    public void setStatusManga(String statusManga) {
        this.statusManga = statusManga;
    }

    public String statusManga;
    public String namaManga;
    public String detailManga;
    public int gambarManga;
}
