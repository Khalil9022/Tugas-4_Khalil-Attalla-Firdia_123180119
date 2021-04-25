package com.example.mangadex;

import java.util.ArrayList;

public class MangaData {
    private static String[] title = new String[]{
            "Hero? I Quit A Long Time Ago",
            "Spirit Sword Sovereign",
            "Peerless Dad",
            "My Harem Grew So Large, I Was Forced to Ascend",
            "The Constellation that Returned from Hell (Adapted)",
            "Isekai Nonbiri Nouka",
            "Limit Breaker",
            "Tale of a Scribe Who Retires to the Countryside",
            "Strongest Anti M.E.T.A",
            "Mudang Association (Path of the Shaman)"};

    private static String[] status = new String[]{
            "On Going",
            "On Going",
            "Completed",
            "On Going",
            "Completed",
            "On Going",
            "On Going",
            "Completed",
            "On Going",
            "On Going"
    };

    private static int[] thumbnail = new
            int[]{R.drawable.gambar1,R.drawable.gambar2,R.drawable.gambar3, R.drawable.gambar4,R.drawable.gambar5,R.drawable.gambar6,R.drawable.gambar7,R.drawable.gambar8,R.drawable.gambar9,R.drawable.gambar10};

    private static String[] keterangan = new String[]{
            "Zero was mankind’s first real superhero. Under his watch, countless other superheros appeared and followed in his footsteps. However, after 5 years of war, Zero disappeared without a trace.",
            "Once the spirit sword roars, within heaven, earth and the three worlds, I shall reign as the sovereign! Those who do not submit shall die!",
            "Its an amazing story about one martial arts journey through marriage, fatherhood, and battles.",
            "Ye Gulou merupakan orang pertama yang dapat melakukan kultivasi abadi lewat jalan tersulit, yakni Yang murni tak terikat. Ia menjadi salah satu dari 6 orang terkuat di muka bumi. Tapi, melakukan kultivasi lewat Yang murni tak terikat artinya ia tak bisa berhubungan dengan wanita, jika dilanggar, maka dia akan mati?! Lalu bagaimana dengan haremnya yang sudah tumbuh hingga sekarang? yang diisi oleh 5 gadis terkuat di muka bumi?! dikejar kelima gadis yang mencari kepastian akan cinta Ye Gulou pada mereka, bagaimanakah nasib yang akan Ye Gulou hadapi?",
            "Chen Fanyu meninggal di tengah kesengsaraan ilahi, setelah mencapai puncak dunia kultivasi dalam waktu kurang dari 500 tahun. Entah bagaimana, terlepas dari kehilangan basis kultivasinya, ia dapat kembali ke masa mudanya sebagai mahasiswa yang tinggal di Bumi. Dia memutuskan untuk sekali lagi menapaki jalan menuju keabadian, dipersenjatai dengan pengetahuan yang telah dia kumpulkan di kehidupan masa lalunya, untuk menimpa kesalahan masa lalunya, menghilangkan penyesalannya yang tersisa, dan menetapkan fondasi spiritual yang kuat yang akan menjamin keberhasilan dalam upayanya yang tak terelakkan untuk sekali lagi naik ke bidang keberadaan lain.",
            "Setelah meninggal karena sakit pada usia 39, Machio Hiraku diberi kesempatan untuk pergi ke dunia lain. Ketika ditanya apa keinginannya oleh Tuhan yang ingin memberinya kekuatan, dia meminta untuk memiliki tubuh yang sehat, menawarkan keinginan kedua, dia memilih untuk hidup damai, keinginan ketiga untuk dapat mengetahui bahasa daerahnya, dan untuk harapan terakhir , untuk bisa menjadi petani.",
            "Karena kesalahan yang tidak diketahui, Kim Kibong terjebak dalam Tes Kebangkitan selama 3000 tahun. Di dunia nyata, 10 tahun telah berlalu, dan itu dikuasai oleh monster dan ruang bawah tanah.\n" +
                    "Pertempuran sekarang dimulai untuk Kim Kibong, yang kembali dengan level maksimal, untuk memulihkan dunia kembali ke keadaan semula!",
            "Seorang penulis yang gagal dalam ujian nasional direkrut oleh seorang ahli seni bela diri dan suruh untuk mencatat perjalanan hidupnya dalam sebuah buku. Melalui perjalanan mereka, Son Bin bertemu banyak orang hebat dan dia menemukan jati dirinya ternyata ada di jalan yang sama dengan tuannya, untuk menjadi raja seni bela diri.",
            "Menipu sepanjang hari, setiap hari, sering berkeliaran sendirian. Dia menipu untuk mendapatkan kekuatan tertinggi di dunia kultivasi ini ?! penjelajah dunia Xue Que tidak selalu menipu, tetapi dia harus menipu.",
            "Malaikat kematian telah memanggil namanya 3 kali karena dia sebentar lagi akan dibawa ke akhirat,\n" +
                    "“Hyeokyeon Mugang.”\n" +
                    "“Hyeokyeon Mugang.”\n" +
                    "“Hyeokyeon Mu…”\n" +
                    "\n" +
                    "ba**ngan! aku ingin hidup lebih lama lagi, jadi pergi sana sialan!!!!! aku langsung menelan bullochos dalam keadaan putus asa, dan walaupun aku tidak mempercayai obat ini, entah bagaimana aku bisa selamat. ketika aku membuka mataku sambil berpikir kalau ini bukan mimpi semata, “Tetua macam apa ini yang mengelilingiku?!” “dimana ini?” “gunung shaman, asosiasi shaman?!!!!!”\n" +
                    "\n" +
                    "Selain itu, aku telah merasuki seorang anak laki-laki yang setia menjalankan tugasnya di sini. …bukankah ini gila?! aku kan.. aku kan.. orang yang terkuat di dunia, aku, sang penguasa yang bernama hyokryeon mugang!!! dasar bajinganㅠㅠㅠ apa-apaan ini!! yah, karena sudah terlanjur begini mari menjadi murid hebat dari faksi Wudang dan mari coba untuk tenang. kalau begitu, mari kita memulai lagi dengan bajingan ini. hahaha. kekejaman dari seorang master yang mempunyai sifat bajingan, tanpa rasa toleransi, kebijaksanaan dan kehidupan tanpa batas. Kisah Heroik <Mudang Association>"};

    public static ArrayList<MangaModel> getListData(){
        MangaModel mangaModel = null;
        ArrayList<MangaModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            mangaModel = new MangaModel();
            mangaModel.setNamaManga(title[i]);
            mangaModel.setGambarManga(thumbnail[i]);
            mangaModel.setStatusManga(status[i]);
            mangaModel.setDetailManga(keterangan[i]);
            list.add(mangaModel);
        }
        return list;
    }
}

