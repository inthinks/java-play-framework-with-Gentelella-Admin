# java-play-framework-with-Gentelella-Admin
# dinamis template admin
# koneksi ke database mysql

repo ini menggunakan template Admin Gentellela, bisa di lihat di github resminya di [gentelella](https://github.com/puikinsh/gentelella) dan sudah di setting dinamis.

- clone atau download repo ini
- install [sbt](http://www.scala-sbt.org/download.html)
- di conf/application.conf hilangkan tanda pagar untuk mengaktifkan koneksi ke mysql
- db.default.url="jdbc:mysql://localhost/{nama_db} atau bisa lihat [dokumentasi](https://www.playframework.com/documentation/2.5.x/ScalaDatabase).
- buka console (cmd), masuk ke /direktori/project
- jalankan "sbt run"
- jalankan di browser http:localhost:9000.

[Dokumentasi resmi play framework](https://www.playframework.com/documentation/2.6.x/Home)
