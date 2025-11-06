**PC Builder Tycoon - Core Engine v1.0**
**Tim**
`Fitdafa Cahya Novaldan - 3124600108`
`Fadhil Muhammad Daffa - 3124600118`

**Deskripsi Proyek**
PC Builder Tycoon adalah sistem simulasi perakitan PC yang dibangun menggunakan prinsip Object-Oriented Programming (OOP). Proyek ini memungkinkan pengguna untuk merakit PC virtual dengan memilih berbagai komponen inti dan periferal, kemudian menghitung total harga dan menghasilkan laporan build.

**Arsitektur & Keputusan Desain**
Arsitektur ini menggunakan interface Priceable sebagai kontrak untuk semua komponen yang memiliki harga, memastikan konsistensi dalam perhitungan biaya. Kita menerapkan abstract class untuk setiap kategori komponen (Inti, Penyimpanan, Periferal) yang mengimplementasikan Priceable, sehingga memudahkan penambahan komponen baru di masa depan tanpa mengubah class PC. Struktur package yang terpisah (inti, penyimpanan, periferal, core) memastikan separation of concerns dan meningkatkan maintainability kode.