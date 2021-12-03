package com.degalabs.wonderfulgarut

object DestinationsData {
    private val destinationNames = arrayOf(
        "Candi Cangkuang",
        "Cipanas",
        "Curug Orok",
        "Karacak Valley",
        "Kawah Kamojang",
        "Kebun Mawar",
        "Gunung Papandayan",
        "Pantai Santolo",
        "Situ Bagendit",
        "Talaga Bodas",
    )

    private val destinationDetails = arrayOf(
        "Candi Cangkuang terletak di tengah situ (danau kecil). Untuk menuju lokasi anda harus menyeberang terlebih dahulu menggunakan rakit yang banyak tersedia disana. Selain itu juga terdapat kampung adat Kampung Pulo yang terletak persis di pinggir candi.",

        "Daerah wisata Cipanas Garut menawarkan wisata pemandian air panas alami. Disini anda bisa menikmati air panas yang bersumber langsung dari gunung api aktif, Gunung Guntur. Anda bisa menikmati berendam air panas, berenang, dan juga bermain water boom di berbagai pemandian yang tersedia disana. Terdapat banyak hotel yang bisa jadi pilihan menginap di Cipanas Garut.",

        "Curug Orok adalah kawasan wisata air terjun yang berada di sisi selatan kota Garut. Curug Orok merupakan satu dari beberapa air terjun di Garut yang paling mudah diakses. Dari pusat kota Garut, kita dapat melanjutkan perjalanan ke kawasan Cikajang, sekitar 25 kilometer ke arah selatan, melalui Jalan Raya Cimanuk, Jalan Raya Bayongbong, Jalan Raya Cisurupan, hingga tiba di Desa Cikandang, Kecamatan Cikajang.",

        "Karacak Valley ialah sebuah tempat wisata alam berupa gunung dan perbukitan yang berada di sekitar kawasan Gunung Karacak. Sebuah objek wisata alam dengan pemandangan yang indah. Karacak Valley ini masuk ke dalam kawasan Perhutani kemudian dikelola oleh Lembaga Masyarakat Desa Hutan (LMDH) Jayamandiri yang sekarang dijadikan sebagai objek wisata alam. Karacak Valley memiliki kawasan yang cukup luas yang banyak di tumbuhi pohon pinus. Pohon pinus inilah yang membuat Karacak Valley semakin Indah.",

        "Berada di perbatasan Garut – Bandung, kawah Kamojang bisa anda jadikan alternatif tujuan wisata. Meskipun namanya kawah, tapi di sini tidak terdapat kawah biasa, lebih berupa uap panas bumi yang keluar dari area-area tertentu. Disini kita bisa berkeliling area, berendam air panas, dan lain sebagainya.",

        "Located in Garut , Kebun Mawar Situhapa is a garden and has been blooming since 2012. Founded by a couple of flower collectors. The Garden is 1,100 meter above sea level and surrounded by mountains (Gunung Guntur, Gunung Cikuray, Gunung Papandayan, Gunung Talaga Bodas, etc). the garden has a diverse ecosystem with a unique selection of flora specimens. Plants are taken care with the help of our passionate and professional gardeners. Plan your visit, we look forward to meeting you.",

        "Kawah dan Gunung Papandayan merupakan salah satu destinasi wisata alam favorit di Garut. Tempatnya mudah dicapai, dengan keindahan alam yang keren banget. Disini anda bisa berwisata di kompleks kawah Papandayan, berpetualang sampai ke padang edelweiss Tegal Alun, berfoto ria di tebing atas, atau bahkan menjemput sunrise di tebing Sunrise Papandayan.",

        "Pantai Santolo merupakan salah satu pantai yang paling dikenal di kota Garut. Bentang pantainya yang panjang dengan pasir yang halus serta putih jadi daya tarik unik tempat ini.",

        "Situ Bagendit terletak cukup dekat dari terminal Garut, hanya sekitar 4-5 KM saja. lokasinya berada di kecamatan Banyuresmi, dan tepat berada dipinggir jalan raya sehingga ngga bakalan terlewat. Disini kita bisa berkeliking situ/danau dengan perahu kayuh (bebek-bebekan) ataupun menggunakan rakit. Di waktu weekend, ada juga warung yang buka di tengah situ.",

        "Terletak di Kecamatan Wanaraja, Kawah Talaga Bodas merupakan danau kecil yang terbentuk di atas kawah bekas letusan Gunung Talagabodas. Tempatnya mirip dengan Kawah Putih di Bandung, hanya saja relatif masih asli.",
    )

    private val destinationLocations = arrayOf(
        "Jalan Darajat Leuwigoong, Cangkuang, Kec. Leles, Kabupaten Garut, Jawa Barat 44119",

        "Jalan Raya Cipanas 122 Pananjung Tarogong Kaler, Pananjung, Cipanas, Kabupaten Garut, Jawa Barat 44151",

        "Jl. Curug Orok, Cikandang, Cikajang, Kabupaten Garut, Jawa Barat 44171",

        "Jalan Karacak Valley Margawati, Sukanegla, Kec. Garut Kota, Kabupaten Garut, Jawa Barat 44113",

        "Loa, Kec. Paseh, Bandung, Jawa Barat",

        "Jl. Raya Kamojang KM. 5 Samarang, Sukakarya, Garut, Kabupaten Garut, Jawa Barat 44161",

        "Karamat Wangi, Cisurupan, Kabupaten Garut, Jawa Barat",

        "Pamalayan, Cikelet, Kabupaten Garut, Jawa Barat 44177",

        "Sukamukti, Kec. Banyuresmi, Kabupaten Garut, Jawa Barat",

        "Jl. Talaga Bodas, Wanajaya, Wanaraja, Kabupaten Garut, Jawa Barat 44183"
    )

    private val destinationRatings = arrayOf(
        "4,4/5",
        "4,3/5",
        "4,1/5",
        "4,5/5",
        "4,4/5",
        "4,4/5",
        "4,6/5",
        "4,3/5",
        "4,3/5",
        "4,5/5"
    )

    private val destinationImages = intArrayOf(
        R.drawable.candi_cangkuang,
        R.drawable.cipanas,
        R.drawable.curug_orok,
        R.drawable.karacak_valley,
        R.drawable.kawah_kamojang,
        R.drawable.kebun_mawar,
        R.drawable.papandayan,
        R.drawable.santolo,
        R.drawable.situ_bagendit,
        R.drawable.talaga_bodas
    )

    val listData: ArrayList<Destination>
        get() {
            val list = arrayListOf<Destination>()
            for (position in destinationNames.indices) {
                val destination = Destination()
                destination.name = destinationNames[position]
                destination.detail = destinationDetails[position]
                destination.photo = destinationImages[position]
                destination.location = destinationLocations[position]
                destination.rating = destinationRatings[position]
                list.add(destination)
            }
            return list
        }
}