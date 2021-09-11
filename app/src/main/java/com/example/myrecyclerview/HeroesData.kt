package com.example.myrecyclerview

// Koleksi data yang ingin ditampilkan
object HeroesData {

    private val heroNames = arrayOf(
        "Monkey D. Luffy",
        "Roronoa Zoro",
        "Nami",
        "Usopp",
        "Sanji",
        "Tony Tony Chopper",
        "Nico Robin",
        "Franky",
        "Brook",
        "Jinbe",
    )


    private val heroDetails = arrayOf(
        "Monkey D. Luffy, juga dikenal sebagai \"Topi Jerami Luffy\" dan umumnya sebagai \"Topi Jerami\", adalah protagonis utama dari manga dan anime, One Piece. Dia adalah pendiri dan kapten Bajak Laut Topi Jerami yang semakin terkenal dan kuat, serta salah satu dari empat petarung top. Impian seumur hidupnya adalah menjadi Raja Bajak Laut dengan menemukan harta karun legendaris yang ditinggalkan oleh Raja Bajak Laut yang terlambat, Gol D. Roger. Dia percaya bahwa menjadi Raja Bajak Laut berarti memiliki kebebasan terbanyak di dunia. Setelah invasi Totto Land dan tindakannya melawan Yonko Big Mom, dia saat ini dianggap oleh pers global untuk menjadi Kaisar Kelima. \n\nDia adalah putra dari pemimpin Revolusioner Monkey D. Dragon, cucu dari panglima marinir Monkey D. Garp, saudara angkat dari \"Tinju Api\" Portgas D. Ace dan Kepala Staf Revolusioner Sabo , dan putra angkat dari Curly Dadan.",
        "Roronoa Zoro juga dikenal sebagai \"Pemburu Bajak Laut\" Zoro adalah seorang bajak laut dan ahli pedang dari kelompok Bajak Laut Topi Jerami dan merupakan salah satu karakter utama dalam cerita One Piece. Ia adalah orang pertama yang ditawari Monkey D. Luffy untuk bergabung dengannya. Impiannya adalah menjadi pendekar pedang nomor satu di dunia dengan mengalahkan Shichibukai Dracule Mihawk. Zoro termasuk ke dalam generasi bajak laut yang dilabeli sebagai \"Sebelas Supernova\", sebelas bajak laut rookie yang memiliki nilai bounty di atas 100.000.000 Berry saat mencapai Red Line, dengan bounty sebesar 120.000.000 Berry. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote di Dressrosa, Zoro mendapat kenaikan bounty menjadi 320.000.000 Berry.",
        "Nami si \"Kucing Pencuri\" (ナミ Nami) adalah seorang bajak laut dan navigator dari kelompok Bajak Laut Topi Jerami. Dia di besarkan di Desa Cocoyasi di East Blue dan menjadi anggota ketiga kru topi jerami setelah kekalahan Arlong. Sebelum bergabung, Nami dikenal sebagai pencuri yang ulung. Impiannya adalah untuk dapat memetakan seluruh dunia. Dia memiliki nilai bounty sebesar 16.000.000 Berry setelah peristiwa di Enies Lobby. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote, Nami mendapat kenaikan bounty menjadi 66.000.000 Berry.",
        "'\"God\" Usopp' adalah penembak jitu dari Bajak Laut Topi Jerami dan mantan Kapten dari Bajak Laut Usopp. Ia dilahirkan di Desa Syrup dan pertama kali disebutkan oleh Yasopp, ayahnya. Meskipun pengecut yang normal, Usopp bermimpi menjadi seorang pejuang pemberani laut seperti ayahnya dan hidup setiap hari dalam mengejar hidup sampai mimpi ini. \n\nDia secara resmi anggota ketiga (tidak resmi keempat) dari kru, dan yang ketiga untuk bergabung, dan, termasuk Nami dan Robin, juga yang ketiga untuk bergabung kembali, melakukannya pada akhir Enies Lobby. Bounty aslinya sebesar 30.000.000 Berry dikreditkan ke alias dan alter-ego \" 'Sogeking' \".",
        "\"Kaki Hitam\" Sanji (黒脚・サンジ Kuro ashi no Sanji?) adalah seorang bajak laut merangkap koki dari kelompok Bajak Laut Topi Jerami. Ia merupakan anggota kelima yang bergabung menjadi anggota kru saat kru topi jerami berlabuh di restoran terapung Baratie. Meski bergabung dan dibesarkan di East Blue, Sanji aslinya dilahirkan di North Blue sehingga ia adalah anggota kru topi jerami pertama yang tidak berasal dari East Blue. Impian Sanji adalah untuk dapat menemukan \"All Blue\", sebuah lautan dimana East Blue, West Blue, North Blue dan South Blue saling bertemu dan menghasilkan bahan-bahan masakan terbaik yang merupakan surga bagi para koki. Setelah insiden di Dressrosa, ia memiliki nilai bounty sebesar 177.000.000 Berry. Setelah insiden di Whole Cake Island, ia memiliki nilai bounty sebesar 330.000.000 Berry.",
        "Tony Tony Chopper adalah seorang dokter bajak laut dari kelompok Bajak Laut Topi Jerami. Ia aslinya seekor rusa yang dapat bertransformasi menjadi manusia setelah tanpa sengaja memakan Buah Iblis \"Hito Hito no Mi\". Oleh Pemerintah Dunia, ia disalahtafsirkan sebagai hewan peliharaan kru topi jerami dan hanya dikaruniai nilai bounty sebesar 50 Berry setelah peristiwa di Enies Lobby. Mimpinya bersama kru topi jerami yaitu dapat menyembuhkan segala penyakit di dunia termasuk dapat melihat luasnya dunia sesuai pesan Dr. Hiluluk.",
        "Nico Robin (ニコ・ロビン Niko Robin?) adalah mantan Baroque Works yang bergabung menjadi anggota kru ketujuh kelompok Bajak Laut Topi Jerami. Ia seorang arkeolog dari pulau Ohara, dan menjadi buronan pemerintah sejak berumur 8 tahun berkat kemampuannya membaca poneglyph dengan bounty sebesar 79.000.000 Berry. Impian terbesar dalam hidup Robin yakni menemukan Rio Poneglyph yang mencatat \"Sejarah Sebenarnya\" dari masa yang hilang. Setelah insiden di enies lobby, bountynya meningkat menjadi 80.000.000 Berry. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote, Robin mendapat kenaikan bounty menjadi 130.000.000 Berry. Ia memiliki kekuatan Buah Iblis \"Hana Hana no Mi\", yang memberinya kemampuan menggandakan bagian tubuh ditempat lain. Setelah aksi Bartholomew Kuma memisahkan kru topi jerami di Sabaody, Robin diketahui tiba di Tequila Wolf di East Blue dan ditangkap pihak pemerintah. Tentara Revolusioner kemudian muncul membebaskan Robin dan mengajaknya pergi menemui pimpinan revolusioner; Monkey D. Dragon di Baltigo.",
        "\"Cyborg\" Franky (\"鉄人\"フランキー \"Saibōgu\"\" Furankī?) adalah anggota kru Bajak Laut Topi Jerami yang bertugas sebagai mekanik kapal Thousand Sunny. Pertama kali muncul sebagai pemimpin Keluarga Franky, sebuah genk bawah tanah yang menguasai jalanan Water 7. Ia bernama asli \"Cutty Flam\" namun kemudian diganti karena permintaan Iceburg. Ia awalnya menjadi musuh kru topi jerami, namun berubah menjadi teman setelah perkembangan situasi memaksa mereka berbalik mendukung kru topi jerami. Setelah Franky mendapat bounty pertama, Keluarga Franky mendatangi kru topi jerami dan memohon agar merekrutnya. Ia menjadi anggota ke-8 kru topi jerami dan memiliki bounty sebesar 44.000.000 Berry setelah insiden di Enies Lobby. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote di Dressrosa, Franky mendapat kenaikan bounty menjadi 94.000.000 Berry. Mimpinya adalah membuat sebuah kapal yang mampu mengarungi segala jenis lautan.",
        "Brook (ブルック Burukku) adalah seorang bajak laut dan musisi dari kelompok Bajak Laut Topi Jerami. Ia menjadi kru kesembilan yang bergabung setelah ditemukan tanpa sengaja di atas kapalnya yang karam di lautan misterius \"Segitiga Florian\". Impiannya adalah dapat bertemu Laboon kembali saat kru topi jerami selesai berlayar mengelilingi Grand Line. Ia berwujud seorang tengkorak yang hidup kembali berkat kekuasaan Buah Iblis miliknya \"Yomi Yomi no Mi\". Di atas kapal, Brook termasuk satu dari dua orang pendekar pedang selain Roronoa Zoro, dan memiliki nilai bounty sebesar 33.000.000 Berry saat baru bergabung. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote, Brook mendapat kenaikan bounty menjadi 83.000.000 Berry.",
        "Jinbe ( ジンベエ Jinbē? ) adalah seorang mermen spesies hiu paus, mantan Shichibukai dan kapten kedua kelompok Bajak Laut Matahari setelah Fisher Tiger. Gelar Shichibukainya dicabut karena menolak ikut serta dalam perang melawan Shirohige, serta secara terang-terangan membantu Monkey D. Luffy dan Bajak Laut Whitebeard. Namanya disebutkan pertama kali oleh Yosaku setelah Cerita Baratie Chapter 69 sebagai seorang Shichibukai, namun penampakannya baru muncul dalam Cerita Impel Down Chapter 528 sebagai Shichibukai terakhir yang diperkenalkan. \n\n Ia kemudian bersekutu dengan Luffy dan kru topi jerami melawan pemberontakan Bajak Laut Manusia Ikan Baru dan Vander Decken IX terhadap Kerajaan Ryugu. Jinbe bahkan ditawari bergabung dengan kru topi jerami, namun menolak karena masih memiliki urusan yang belum selesai dengan Yonko Big Mam. Menurut anggota kru Bajak Laut Manusia Ikan Baru, ia memiliki nilai bounty lebih dari 400.000.000 Berry."
    )


    private val heroesImages = intArrayOf(
        R.drawable.luffy,
        R.drawable.zoro,
        R.drawable.nami,
        R.drawable.usop,
        R.drawable.sanji,
        R.drawable.chopper,
        R.drawable.robin,
        R.drawable.franky,
        R.drawable.brook,
        R.drawable.jinbei
    )


    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }

}