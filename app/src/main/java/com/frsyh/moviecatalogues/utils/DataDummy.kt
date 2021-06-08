package com.frsyh.moviecatalogues.utils

import com.frsyh.moviecatalogues.data.MovieEntity
import com.frsyh.moviecatalogues.data.TvShowEntity

object DataDummy {
    fun generateDummyMovie(): List<MovieEntity> {
        val movie = ArrayList<MovieEntity>()
        movie.add(
            MovieEntity(
                1,
                "Fight Club",
                "A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \\\"fight clubs\\\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.",
                "1999-10-12",
                "https://images.moviesanywhere.com/46107eaa3f3912a1b0b6e181d8967257/15551ffc-4a96-4e6c-a024-511417656c7e.jpg?h=375&resize=fit&w=1000"
            ))
        movie.add(
            MovieEntity(
                2,
                "Legacies",
                "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                "2018-10-13",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qTZIgXrBKURBK1KrsT7fe3qwtl9.jpg"
            ))
        movie.add(
            MovieEntity(
                3,
                "Anun's Curse",
                "A group of travelers are forced to seek shelter inside an abandoned jail where a notorious nun named Sister Monday had once been assigned and was suspected of murdering prisoners.",
                "2020-12-05",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eutNRwSguV0NCx7BNAXOibWzjP6.jpg"
            ))
        movie.add(
            MovieEntity(
                4,
                "The Viking War",
                "Ingrid and her siblings are on the run from the Beserkers who have begun invading the villages, taking over, savagely using the residents on a game where they vs a Beserker, and if they win, they get to survive - only, no one ever wins. The siblings are trying to escape the Beserkers after they violently murdered and took over their town. However, the Beserkers are on their trail, and want to put them in the game.",
                "2019-10-15",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7BEY3dAb6ZVHzND1Ewmw2PTAl76.jpg"
            ))
        movie.add(
            MovieEntity(
                5,
                "Assasin 33 AD",
                "When a billionaire gives a group of young scientists unlimited resources to study the science of matter transfer, the scientists unlock the secrets of time travel. But they soon find out that the project is backed by a militant extremist group, and the billionaire plans to go back in time and prove that Jesus never rose from the dead.",
                "2020-04-10",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8jDvtdH327I8TgX3UPdkAsZF1dA.jpg"
            ))
        movie.add(
            MovieEntity(
                6,
                "Butchers",
                "A family of sadistic butchers lives deep inside the backcountry. From the dead of winter to the dog days of summer, anyone who crosses their path is dead meat.",
                "2021-12-01",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xLbuMxKORru3oTlItLBWpI5WJxR.jpg"
            ))
        movie.add(
            MovieEntity(
                7,
                "Harry Potter and Sorcerer's Stone",
                "Harry Potter telah tinggal di bawah tangga di rumah bibinya dan rumah pamannya sepanjang hidupnya. Tetapi pada ulang tahunnya yang ke-11, ia mengetahui bahwa ia adalah penyihir yang kuat - dengan tempat yang menunggunya di Sekolah Sihir dan Penyihir Hogwarts. Ketika dia belajar untuk memanfaatkan kekuatan yang baru ditemukannya dengan bantuan kepala sekolah yang ramah, Harry mengungkap kebenaran tentang kematian orangtuanya - dan tentang penjahat yang harus disalahkan.",
                "2001-11-16",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lz1qjw1wDbE2Kj76iTXpGKQSPKD.jpg"
            ))
        movie.add(
            MovieEntity(
                8,
                "Sacrifice",
                "Isaac and his pregnant wife visit a remote Norwegian village to claim an unexpected inheritance. The couple finds themselves caught in a nightmare when they encounter a sinister cult that worships a sea-dwelling deity.",
                "2021-02-09",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xXI5Lg6mJLEesTggRJBrq50vrqU.jpg"
            ))
        movie.add(
            MovieEntity(
                9,
                "Haunting of the Mary Celeste",
                "Rachel, a concerned researcher, and her team have set out to sea to prove that the disappearance of a family and crew from a merchant ship was for reasons having to do with the supernatural. Her theory that those on the Mary Celeste vanished into a \"rift\" between dimensions proves true as the boat breaks down and her crew begins to vanish one by one.",
                "2020-10-23",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gk179gfqaW3TV191VN7xU0dLAi.jpg"
            ))
        movie.add(
            MovieEntity(
                10,
                "Shadow in the Cloud",
                "A WWII pilot traveling with top secret documents on a B-17 Flying Fortress encounters an evil presence on board the flight.",
                "2021-01-14",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/t7EUMSlfUN3jUSZUJOLURAzJzZs.jpg"
            ))
        movie.add(
            MovieEntity(
                11,
                "The Kill Team",
                "When Andrew Briggman—a young soldier in the US invasion of Afghanistan—witnesses other recruits killing innocent civilians under the direction of a sadistic Sergeant, he considers reporting them to higher-ups. However, the heavily-armed and increasingly-violent platoon becomes suspicious that someone in their ranks has turned on them, and Andrew begins to fear that he'll be the next target.",
                "2019-10-17",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wLRZbtrbV51oQuvqNeK6vhb6btV.jpg"
            ))
        movie.add(
            MovieEntity(
                12,
                "Black Water: Abyss",
                "An adventure-loving couple convince their friends to explore a remote, uncharted cave system in the forests of Northern Australia. With a tropical storm approaching, they abseil into the mouth of the cave, but when the caves start to flood, tensions rise as oxygen levels fall and the friends find themselves trapped. Unknown to them, the storm has also brought in a pack of dangerous and hungry crocodiles.",
                "2020-08-07",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/17QGRfO7gTLtFkKv05NHEDsWLEZ.jpg"
            ))
        return movie
    }


    fun generateDummyTvShow(): List<TvShowEntity> {
        val movie = ArrayList<TvShowEntity>()
        movie.add(
            TvShowEntity(
                1,
                "The Shannara Chronicles",
                "A young Healer armed with an unpredictable magic guides a runaway Elf in her perilous quest to save the peoples of the Four Lands from an age-old Demon scourge.",
                "2016",
                "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQpqkIYy9Jcs8pcz7-8kk-DMiV_ix6LQ8DFpH5S-RkTQYVLbOSV"
            )
        )
        movie.add(
            TvShowEntity(
                2,
                "The Balcklist",
                "Raymond \"Red\" Reddington, one of the FBI's most wanted fugitives, surrenders in person at FBI Headquarters in Washington, D.C. He claims that he and the FBI have the same interests: bringing down dangerous criminals and terrorists. In the last two decades, he's made a list of criminals and terrorists that matter the most but the FBI cannot find because it does not know they exist. Reddington calls this \"The Blacklist\". Reddington will co-operate, but insists that he will speak only to Elizabeth Keen, a rookie FBI profiler.",
                "2013",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bgbQCW4fE9b6wSOSC6Fb4FfVzsW.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                3,
                "Your Honor",
                "New Orleans judge Michael Desiato is forced to confront his own deepest convictions when his son is involved in a hit and run that embroils an organized crime family.",
                "2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xWJZjIKPeEZhK3JRYKOe06yW6IU.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                4,
                "Naruto ナルト 疾風伝 ",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                "2007",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/cIGqCdclILvuexM04PnRaFbtAWq.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                5,
                "Jujutsu Kaisen",
                "Dengan hari-harinya yang sudah terhitung, Yuji memutuskan untuk memburu dan mengkonsumsi 19 jari yang tersisa dari kutukan maut agar bisa mati bersamanya",
                "2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ipKRfX37GyXhR3RA3pm4FYDu1Rc.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                6,
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                "2018",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z1K4mJwISETia59rrnMdXxzoSrZ.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                7,
                "Law & Order Special Victim Unit",
                "Dalam sistem peradilan pidana, pelanggaran berbasis seksual dianggap sangat kejam. Di New York City, detektif yang berdedikasi yang menyelidiki kejahatan keji ini adalah anggota pasukan elit yang dikenal sebagai Unit Korban Khusus. Ini adalah kisah mereka.",
                "1999",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ydSvHgksuB8Ix0V05QEZBKrnIcg.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                8,
                "Exclusive",
                "Ketika tiga anak kelas pekerja mendaftar di sekolah paling eksklusif di Spanyol, bentrokan antara siswa kaya dan miskin menyebabkan tragedi",
                "2018",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8fcYtdB6HLP7gsj46OKZ24PjC1g.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                9,
                "Dragon Ball",
                "After learning that he is from another planet, a warrior named Goku and his friends are prompted to defend it from an onslaught of extraterrestrial enemies.",
                "1989",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/f2zhRLqwRLrKhEMeIM7Z5buJFo3.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                10,
                "Flash",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                "2014",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                11,
                "Riverdale",
                "Ditetapkan di masa sekarang, seri ini menawarkan pandangan subversif yang berani pada Archie, Betty, Veronica dan teman-teman mereka, menjelajahi surealitas kehidupan kota kecil, kegelapan dan keanehan yang menggelegak di bawah fasad Riverdale yang sehat.",
                "2017",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6zBWSuYW3Ps1nTfeMS8siS4KUaA.jpg"
            )
        )
        movie.add(
            TvShowEntity(
                12,
                "Fear Walking Dead",
                "Seperti apa dunia saat berubah menjadi kiamat mengerikan yang digambarkan dalam \"The Walking Dead\"? Spin-off ini ditetapkan di Los Angeles, mengikuti karakter baru saat mereka menghadapi awal akhir dunia, akan menjawab pertanyaan itu.",
                "2015",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aOdTWn8dXlS0tA5xl0ZBr8Ws15R.jpg"
            )
        )
        return movie
    }
}