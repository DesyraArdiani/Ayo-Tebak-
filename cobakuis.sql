-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 14 Des 2020 pada 22.59
-- Versi Server: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cobakuis`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `gambar`
--

CREATE TABLE `gambar` (
  `id_gambar` int(11) NOT NULL,
  `nama_gambar` varchar(100) NOT NULL,
  `optionA` varchar(50) NOT NULL,
  `optionB` varchar(50) NOT NULL,
  `optionC` varchar(50) NOT NULL,
  `optionD` varchar(50) NOT NULL,
  `jawaban_gambar` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `gambar`
--

INSERT INTO `gambar` (`id_gambar`, `nama_gambar`, `optionA`, `optionB`, `optionC`, `optionD`, `jawaban_gambar`, `created_at`) VALUES
(1, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\soal1.jpg', 'Scanner', 'Keyboard', 'Mouse', 'Monitor', 'Scanner', '2020-11-25 13:28:24'),
(2, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\soal2.jpg', 'Output', 'Printer', 'Input', 'Prosesing', 'Printer', '2020-12-13 02:19:04'),
(3, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\soal3.jpg', 'Keyboard', 'Speaker', 'Mouse', 'Kursor', 'Mouse', '2020-11-25 13:41:33'),
(4, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\soal4.jpg', 'Processor', 'Motherboard', 'CPU', 'Power Supply', 'Motherboard', '2020-11-25 14:17:24'),
(5, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\soal5.jpg', 'RAM', 'Hardisk', 'Processor', 'Floppydisk', 'Processor', '2020-11-25 14:17:24'),
(6, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\soal6.jpg', 'Mendistribusikan arus listrik', 'Mengelola data grafis komputer', 'Mendingin suhu processor', 'Mengelola data audio', 'Mendistribusikan arus listrik', '2020-11-25 14:22:21'),
(7, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\soal7.jpg', 'Linux', 'Android', 'Windows', 'Unix', 'Windows', '2020-11-25 14:22:21'),
(8, 'D:\\TUBESPBOBISMILLAHJADI\\src\\codingan\\champion.png', '-', '-', '-', '-', 'i', '2020-12-14 10:46:19');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemain`
--

CREATE TABLE `pemain` (
  `id_pemain` int(11) NOT NULL,
  `namapemain` varchar(30) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemain`
--

INSERT INTO `pemain` (`id_pemain`, `namapemain`, `created_at`) VALUES
(15, 'a', '2020-12-13 14:57:44'),
(16, 'icak', '2020-12-14 07:40:29'),
(17, 'juan', '2020-12-14 07:41:24'),
(18, 'juan', '2020-12-14 07:42:38'),
(19, 'juan', '2020-12-14 07:46:00'),
(20, 'juan', '2020-12-14 07:51:32'),
(21, 'k', '2020-12-14 07:57:43'),
(22, 'b', '2020-12-14 07:58:43'),
(23, 'k', '2020-12-14 07:59:59'),
(24, 'juan', '2020-12-14 08:17:06'),
(25, 'juan', '2020-12-14 08:23:24'),
(26, '', '2020-12-14 09:49:04'),
(27, '', '2020-12-14 09:50:25'),
(28, 'gile', '2020-12-14 10:02:47'),
(29, 'gpgpgp', '2020-12-14 10:05:02'),
(30, 'POY', '2020-12-14 10:08:57'),
(31, 'POY', '2020-12-14 10:09:42'),
(32, 'n', '2020-12-14 10:41:55'),
(33, 'a', '2020-12-14 10:43:08'),
(34, 'a', '2020-12-14 10:44:27'),
(35, 'a', '2020-12-14 10:46:40'),
(36, 'k', '2020-12-14 10:51:55'),
(37, 'a', '2020-12-14 10:52:39'),
(38, 'd', '2020-12-14 10:52:55'),
(39, 'd', '2020-12-14 10:53:16'),
(40, 'a', '2020-12-14 10:54:17'),
(41, 'a', '2020-12-14 10:56:05'),
(42, 'b', '2020-12-14 10:59:35'),
(43, 'a', '2020-12-14 11:05:43');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pertanyaan`
--

CREATE TABLE `pertanyaan` (
  `id_pertanyaan` int(11) NOT NULL,
  `jenis_pertanyaan` varchar(500) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `optiA` varchar(50) NOT NULL,
  `optiB` varchar(50) NOT NULL,
  `optiC` varchar(50) NOT NULL,
  `optiD` varchar(50) NOT NULL,
  `jawaban_teknologi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pertanyaan`
--

INSERT INTO `pertanyaan` (`id_pertanyaan`, `jenis_pertanyaan`, `created_at`, `optiA`, `optiB`, `optiC`, `optiD`, `jawaban_teknologi`) VALUES
(1, 'Format extensi dari Office word adalah', '2020-11-24 04:06:00', '.xlsx', '.acssx', 'semua salah', '.docx', '.docx'),
(2, 'Jika kita ingin mencetak dokumen, maka kita harus menekan tombol...pada keyboard', '2020-11-24 04:09:08', 'ctrl+J', 'ctrl+H', 'ctrl+S', 'ctrl+P', 'ctrl+P'),
(3, 'Di bawah ini yang merupakan alat hitung zaman kuno adalah ', '2020-11-24 04:10:50', 'ipad', 'sempoa', 'kalkulator', 'handphone', 'sempoa'),
(4, 'Tombol pada keyboard yang kegunaannya untuk mengubah semua huruf yang diketik menjadi huruf besar adalah ', '2020-11-24 04:11:39', 'tombol pause', 'tombol enter', 'tombol escape', 'tombol caps lock', 'tombol caps lock'),
(5, 'Berikut ini yang termasuk Hardware adalah', '2020-11-24 04:12:51', 'google chrome', 'microsoft office', 'motherboard', 'adobe photoshop', 'motherboard'),
(6, 'komersialisasi dari jaringan international (internet) terjadi pada tahun', '2020-11-24 04:23:13', '1993', '1992 ', '1991', '1990 ', '1992'),
(7, 'Komponen utama dari sebuah perangkat komputer adalah', '2020-11-24 04:24:10', 'slot bus', 'port bus ', 'vga card', 'processor', 'processor'),
(8, 'Unsur pesan yang dibawa dalam media perangkat pembelajaran komputasi dapat dikategorikan sebagai', '2020-11-24 04:25:04', 'software', 'hardware', 'groupware', 'braiware', 'groupware'),
(9, 'Jenis keyboard yang biasa digunakan adalah', '2020-11-24 04:26:05', 'maltron', 'DVORAK', 'QWERTY', 'numeric', 'QWERTY'),
(10, 'Yang tidak termasuk varian jenis dari microsoft office adalah', '2020-11-24 04:13:53', 'visio', 'hangout', 'word', 'adobe publisher', 'hangout');

-- --------------------------------------------------------

--
-- Struktur dari tabel `score`
--

CREATE TABLE `score` (
  `id_score` int(11) NOT NULL,
  `nilai` int(11) NOT NULL,
  `id_pemain` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `score`
--

INSERT INTO `score` (`id_score`, `nilai`, `id_pemain`) VALUES
(1, 30, 15),
(2, 60, 23),
(3, 20, 24),
(4, 30, 25),
(5, 60, 26),
(6, 50, 27),
(7, 60, 28),
(8, 70, 29),
(9, 20, 31),
(10, 0, 37),
(11, 0, 38),
(12, 80, 39),
(13, 70, 40),
(14, 80, 41);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gambar`
--
ALTER TABLE `gambar`
  ADD PRIMARY KEY (`id_gambar`);

--
-- Indexes for table `pemain`
--
ALTER TABLE `pemain`
  ADD PRIMARY KEY (`id_pemain`);

--
-- Indexes for table `pertanyaan`
--
ALTER TABLE `pertanyaan`
  ADD PRIMARY KEY (`id_pertanyaan`);

--
-- Indexes for table `score`
--
ALTER TABLE `score`
  ADD PRIMARY KEY (`id_score`),
  ADD KEY `skor_pemain` (`id_pemain`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gambar`
--
ALTER TABLE `gambar`
  MODIFY `id_gambar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `pemain`
--
ALTER TABLE `pemain`
  MODIFY `id_pemain` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `pertanyaan`
--
ALTER TABLE `pertanyaan`
  MODIFY `id_pertanyaan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `score`
--
ALTER TABLE `score`
  MODIFY `id_score` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `score`
--
ALTER TABLE `score`
  ADD CONSTRAINT `skor_pemain` FOREIGN KEY (`id_pemain`) REFERENCES `pemain` (`id_pemain`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
