-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 30, 2010 at 07:10 
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_pkl49_podes`
--

-- --------------------------------------------------------

--
-- Table structure for table `desa`
--

CREATE TABLE IF NOT EXISTS `desa` (
  `B1R4` varchar(3) DEFAULT NULL COMMENT 'kodedesa',
  `B1R1` varchar(2) DEFAULT NULL COMMENT 'kode kabupaten',
  `B1R3` varchar(3) DEFAULT NULL COMMENT 'kodekecamatan',
  `NAMADESA` varchar(50) DEFAULT NULL COMMENT 'nama desa',
  `NKD` varchar(8) NOT NULL DEFAULT '' COMMENT 'nomor kode desa',
  PRIMARY KEY (`NKD`),
  KEY `B1R1` (`B1R1`),
  KEY `B1R3` (`B1R3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `desa`
--

INSERT INTO `desa` (`B1R4`, `B1R1`, `B1R3`, `NAMADESA`, `NKD`) VALUES
('002', '02', '010', 'BUMI ARJO', '02010002'),
('008', '02', '010', 'CAHAYA MAJU', '02010008'),
('015', '02', '010', 'TUGU MULYO', '02010015'),
('002', '02', '011', 'MUKTI SARI', '02011002'),
('005', '02', '011', 'MUARA BURNAI II', '02011005'),
('011', '02', '011', 'SUKA JAYA', '02011011'),
('017', '02', '020', 'PEMATANG PANGGANG', '02020017'),
('029', '02', '020', 'SUKA MUKTI', '02020029'),
('002', '02', '021', 'SIDO MULYO', '02021002'),
('003', '02', '021', 'TALANG JAYA', '02021003'),
('004', '02', '021', 'SUNGAI MENANG', '02021004'),
('010', '02', '022', 'KARYA USAHA', '02022010'),
('016', '02', '022', 'CATUR TUNGGAL', '02022016'),
('001', '02', '023', 'BALIAN MAKMUR', '02023001'),
('010', '02', '023', 'GEDUNG REJO', '02023010'),
('011', '02', '030', 'TULUNG SELAPAN ILIR', '02030011'),
('013', '02', '030', 'PETALING', '02030013'),
('021', '02', '030', 'LEBUNG ITAM', '02030021'),
('007', '02', '031', 'PELIMBANGAN', '02031007'),
('008', '02', '031', 'CENGAL', '02031008'),
('006', '02', '040', 'PEDAMARAN IV', '02040006'),
('002', '02', '041', 'PULAU GERONGGANG', '02041002'),
('003', '02', '050', 'TANJUNG BARU', '02050003'),
('026', '02', '050', 'JAMBU ILIR', '02050026'),
('008', '02', '051', 'SERIGUNA', '02051008'),
('009', '02', '060', 'KOTA RAYA', '02060009'),
('016', '02', '060', 'TANJUNG SERANG', '02060016'),
('025', '02', '060', 'TANJUNG RANCING', '02060025'),
('006', '02', '120', 'TERUSAN MENANG', '02120006'),
('021', '02', '120', 'BERKAT', '02120021'),
('006', '02', '121', 'TALANG CEMPEDAK', '02121006'),
('016', '02', '121', 'TANJUNG ALI', '02121016'),
('017', '02', '130', 'PAMPANGAN', '02130017'),
('003', '02', '131', 'DARAT', '02131003'),
('006', '02', '131', 'PANGKALAN LAMPAM', '02131006'),
('010', '02', '140', 'JADI MULYA', '02140010'),
('002', '03', '011', 'CAHAYA ALAM', '03011002'),
('002', '03', '020', 'PADANG BINDU', '03020002'),
('018', '03', '020', 'TANJUNG AGUNG', '03020018'),
('004', '03', '031', 'SUGIH WARAS', '03031004'),
('006', '03', '032', 'PAGAR DEWA', '03032006'),
('013', '03', '032', 'KOTA BARU', '03032013'),
('003', '03', '040', 'TANJUNG ENIM SELATAN', '03040003'),
('005', '03', '040', 'PASAR TANJUNG ENIM', '03040005'),
('007', '03', '040', 'LINGGA', '03040007'),
('005', '03', '050', 'PASAR II', '03050005'),
('008', '03', '050', 'LUBUK EMPELAS', '03050008'),
('016', '03', '050', 'AIR LINTANG', '03050016'),
('001', '03', '060', 'BANGUN SARI', '03060001'),
('011', '03', '060', 'TANJUNG TERANG', '03060011'),
('020', '03', '060', 'DALAM', '03060020'),
('004', '03', '070', 'MANUNGGAL JAYA', '03070004'),
('015', '03', '070', 'MUARA NIRU', '03070015'),
('005', '03', '080', 'BENUANG', '03080005'),
('006', '03', '080', 'KARTADEWA', '03080006'),
('009', '03', '080', 'TALANG UBI TIMUR', '03080009'),
('004', '03', '081', 'AIR ITAM', '03081004'),
('003', '03', '082', 'TANAH ABANG UTARA', '03082003'),
('001', '03', '083', 'TEMPIRAI', '03083001'),
('003', '03', '084', 'PENGABUAN', '03084003'),
('003', '03', '090', 'TAMBANGAN KELEKAR', '03090003'),
('012', '03', '090', 'GELUMBANG', '03090012'),
('002', '03', '091', 'TALANG BALAI', '03091002'),
('013', '03', '091', 'ALAI', '03091013'),
('008', '03', '092', 'SUKAJADI', '03092008'),
('006', '03', '093', 'PATRA TANI', '03093006'),
('002', '06', '010', 'NGANTI', '06010002'),
('009', '06', '010', 'NGULAK I', '06010009'),
('013', '06', '010', 'TANJUNG RAYA', '06010013'),
('019', '06', '020', 'ULAK PACEH', '06020019'),
('026', '06', '020', 'KASMARAN', '06020026'),
('029', '06', '020', 'MANGUN JAYA', '06020029'),
('040', '06', '020', 'SIMPANG SARI', '06020040'),
('003', '06', '021', 'TANAH ABANG', '06021003'),
('004', '06', '021', 'TALANG LEBAN', '06021004'),
('004', '06', '022', 'SUKA DAMAI', '06022004'),
('009', '06', '022', 'AIR PUTIH ULU', '06022009'),
('007', '06', '030', 'KERTAYU', '06030007'),
('009', '06', '030', 'TEBING BULANG', '06030009'),
('010', '06', '030', 'GAJAH MATI', '06030010'),
('011', '06', '030', 'RANTAU SIALANG', '06030011'),
('001', '06', '040', 'RIMBA UKUR', '06040001'),
('005', '06', '040', 'SOAK BARU', '06040005'),
('006', '06', '040', 'BALAI AGUNG', '06040006'),
('007', '06', '040', 'SERASAN JAYA', '06040007'),
('008', '06', '040', 'KAYUARA', '06040008'),
('010', '06', '040', 'BAILANGU', '06040010'),
('024', '06', '040', 'LUMPATAN II', '06040024'),
('025', '06', '040', 'BAILANGU TIMUR', '06040025'),
('007', '06', '041', 'PURWOSARI', '06041007'),
('008', '06', '041', 'TELUK KIJING III', '06041008'),
('009', '06', '041', 'TELUK KIJING II', '06041009'),
('011', '06', '041', 'LAIS', '06041011'),
('012', '06', '041', 'TELUK', '06041012'),
('013', '06', '041', 'EPIL', '06041013'),
('002', '06', '090', 'TANJUNG KERANG', '06090002'),
('003', '06', '090', 'BABAT BANYUASIN', '06090003'),
('004', '06', '090', 'SUPAT', '06090004'),
('007', '06', '090', 'SUNGAI LILIN', '06090007'),
('021', '06', '090', 'BERLIAN MAKMUR', '06090021'),
('023', '06', '090', 'BUMI KENCANA', '06090023'),
('027', '06', '090', 'NUSA SERASAN', '06090027'),
('002', '06', '091', 'KELUANG', '06091002'),
('006', '06', '091', 'MEKAR JAYA', '06091006'),
('010', '06', '091', 'CIPTA PRAJA', '06091010'),
('028', '06', '100', 'MANGSANG', '06100028'),
('030', '06', '100', 'BEJI MULYO', '06100030'),
('033', '06', '100', 'SIMPANG TUNGKAL', '06100033'),
('039', '06', '100', 'SUMBER SARI', '06100039'),
('040', '06', '100', 'TAMPANG BARU', '06100040'),
('042', '06', '100', 'MUARA MEDAK', '06100042'),
('047', '06', '100', 'SINDANG MARGA', '06100047'),
('053', '06', '100', 'BAYAT ILIR', '06100053'),
('054', '06', '100', 'BAYUNG LENCIR', '06100054'),
('056', '06', '100', 'SUKA JAYA', '06100056'),
('059', '06', '100', 'KEPAYANG', '06100059'),
('009', '06', '101', 'KARANG TIRTA', '06101009'),
('015', '06', '101', 'KARANG MUKTI', '06101015'),
('021', '06', '101', 'MANDALASARI', '06101021'),
('002', '08', '010', 'TELUK AGUNG', '08010002'),
('003', '08', '010', 'TANJUNG BESAR', '08010003'),
('025', '08', '020', 'BANDAR AGUNG RANAU', '08020025'),
('039', '08', '020', 'PENANTIAN', '08020039'),
('007', '08', '021', 'GUNUNG RAYA', '08021007'),
('016', '08', '021', 'BEDENG TIGA', '08021016'),
('017', '08', '022', 'SIMPANG SENDER SELATAN', '08022017'),
('001', '08', '030', 'SIPIN', '08030001'),
('008', '08', '030', 'DURIAN SEMBILAN', '08030008'),
('014', '08', '030', 'SIDODADI', '08030014'),
('025', '08', '030', 'AIR KELIAN', '08030025'),
('020', '08', '040', 'SIMPANG AGUNG', '08040020'),
('006', '08', '041', 'SINAR DANAU', '08041006'),
('018', '08', '050', 'BATU BELANG JAYA', '08050018'),
('021', '08', '050', 'PASAR MUARADUA', '08050021'),
('023', '08', '050', 'GEDUNG LEPIHAN', '08050023'),
('005', '08', '051', 'RUOS', '08051005'),
('010', '08', '060', 'GUNUNG TERANG', '08060010'),
('017', '08', '060', 'KENALI', '08060017'),
('004', '08', '061', 'SUKARENA', '08061004'),
('001', '08', '070', 'SUGIH WARAS', '08070001'),
('016', '08', '070', 'KAGELANG BLAMBANGAN', '08070016'),
('007', '08', '071', 'MERPANG', '08071007'),
('005', '08', '080', 'DANAU RATA', '08080005'),
('008', '08', '080', 'GUNUNG MEGANG', '08080008'),
('022', '08', '090', 'MUARADUA KISAM', '08090022'),
('006', '08', '091', 'PIUS', '08091006'),
('005', '08', '100', 'TANJUNG KARI', '08100005'),
('029', '08', '100', 'PULAU BERINGIN UTARA', '08100029'),
('003', '08', '102', 'UJAN MAS', '08102003'),
('007', '10', '010', 'KUANG ANYAR', '10010007'),
('018', '10', '010', 'RAMA KASIH', '10010018'),
('010', '10', '011', 'TANJUNG BULAN', '10011010'),
('004', '10', '012', 'BETUNG I', '10012004'),
('009', '10', '012', 'PAYALINGKUNG', '10012009'),
('015', '10', '020', 'TANJUNG BARU PETAI', '10020015'),
('026', '10', '020', 'TANJUNG BATU', '10020026'),
('036', '10', '020', 'TANJUNG ATAP BARAT', '10020036'),
('007', '10', '021', 'SERI KEMBANG I', '10021007'),
('003', '10', '030', 'RANTAU ALAI', '10030003'),
('004', '10', '031', 'MUARA KUMBANG', '10031004'),
('030', '10', '040', 'TANJUNG RAJA', '10040030'),
('035', '10', '040', 'TANJUNG BALAI BARU I', '10040035'),
('049', '10', '040', 'TANJUNG RAJA TIMUR', '10040049'),
('002', '10', '041', 'JAGALANA', '10041002'),
('011', '10', '041', 'KETAPANG II', '10041011'),
('006', '10', '042', 'SERIJABO', '10042006'),
('013', '10', '042', 'SERIJABO BARU', '10042013'),
('024', '10', '050', 'PEMULUTAN ULU', '10050024'),
('030', '10', '050', 'IBUL BESAR III', '10050030'),
('039', '10', '050', 'SUNGAI BUAYA', '10050039'),
('007', '10', '051', 'KAPUK', '10051007'),
('003', '10', '052', 'KAMAL', '10052003'),
('006', '10', '060', 'TANJUNG GELAM', '10060006'),
('019', '10', '060', 'TANJUNG SETEKO', '10060019'),
('029', '10', '060', 'INDRALAYA RAYA', '10060029'),
('004', '10', '061', 'PURNAJAYA', '10061004'),
('010', '10', '061', 'TIMBANGAN', '10061010'),
('015', '10', '061', 'PALEM RAYA', '10061015'),
('008', '10', '062', 'MERANJAT II', '10062008'),
('006', '71', '010', '35 ILIR', '71010006'),
('007', '71', '010', '32 ILIR', '71010007'),
('008', '71', '010', '30 ILIR', '71010008'),
('010', '71', '010', '29 ILIR', '71010010'),
('001', '71', '011', 'PULO KERTO', '71011001'),
('003', '71', '011', 'KARANG JAYA', '71011003'),
('004', '71', '011', 'KARANG ANYAR', '71011004'),
('005', '71', '020', '15 ULU', '71020005'),
('008', '71', '020', '1 ULU', '71020008'),
('009', '71', '020', 'TUAN KENTANG', '71020009'),
('011', '71', '020', '3-4 ULU', '71020011'),
('012', '71', '020', '5 ULU', '71020012'),
('013', '71', '020', '7 ULU', '71020013'),
('015', '71', '020', 'SILABERANTI', '71020015'),
('016', '71', '020', '9-10 ULU', '71020016'),
('002', '71', '021', 'KERAMASAN', '71021002'),
('003', '71', '021', 'KEMANG AGUNG', '71021003'),
('004', '71', '021', 'KEMAS RINDO', '71021004'),
('005', '71', '021', 'OGAN BARU', '71021005'),
('006', '71', '021', 'KERTAPATI', '71021006'),
('008', '71', '030', '16 ULU', '71030008'),
('010', '71', '030', 'TANGGA TAKAT', '71030010'),
('012', '71', '030', '13 ULU', '71030012'),
('014', '71', '030', '11 ULU', '71030014'),
('002', '71', '031', 'TALANG PUTRI', '71031002'),
('004', '71', '031', 'PLAJU ILIR', '71031004'),
('006', '71', '031', 'PLAJU ULU', '71031006'),
('007', '71', '031', 'BAGUS KUNING', '71031007'),
('001', '71', '040', 'BUKIT LAMA', '71040001'),
('009', '71', '040', 'LOROK PAKJO', '71040009'),
('010', '71', '040', 'DEMANG LEBAR DAUN', '71040010'),
('011', '71', '040', 'BUKIT BARU', '71040011'),
('012', '71', '040', 'SIRING AGUNG', '71040012'),
('001', '71', '041', 'TALANG SEMUT', '71041001'),
('005', '71', '041', '26 ILIR', '71041005'),
('006', '71', '041', '24 ILIR', '71041006'),
('004', '71', '050', '14 ILIR', '71050004'),
('005', '71', '050', '15 ILIR', '71050005'),
('006', '71', '050', '17 ILIR', '71050006'),
('008', '71', '050', '20 ILIR I', '71050008'),
('009', '71', '050', 'SEI PANGERAN', '71050009'),
('017', '71', '050', '20 ILIR IV', '71050017'),
('001', '71', '051', 'SEKIP JAYA', '71051001'),
('002', '71', '051', 'PAHLAWAN', '71051002'),
('003', '71', '051', '20 ILIR II', '71051003'),
('004', '71', '051', 'PIPA REJA', '71051004'),
('006', '71', '051', 'ARIO KEMUNING', '71051006'),
('003', '71', '060', 'KUTO BATU', '71060003'),
('004', '71', '060', 'LAWANG KIDUL', '71060004'),
('005', '71', '060', '3 ILIR', '71060005'),
('007', '71', '060', 'SUNGAI BUAH', '71060007'),
('008', '71', '060', '2 ILIR', '71060008'),
('009', '71', '060', '5 ILIR', '71060009'),
('010', '71', '060', 'DUKU', '71060010'),
('011', '71', '060', '9 ILIR', '71060011'),
('012', '71', '060', '8 ILIR', '71060012'),
('001', '71', '061', 'SEI LAIS', '71061001'),
('002', '71', '061', 'SEI SELINCAH', '71061002'),
('003', '71', '061', 'SEI SELAYUR', '71061003'),
('004', '71', '061', 'KALIDONI', '71061004'),
('005', '71', '061', 'BUKIT SANGKAL', '71061005'),
('001', '71', '070', 'SUKAMAJU', '71070001'),
('002', '71', '070', 'SIALANG', '71070002'),
('003', '71', '070', 'SAKO', '71070003'),
('001', '71', '071', 'LEBONG GAJAH', '71071001'),
('002', '71', '080', 'SUKA BANGUN', '71080002'),
('003', '71', '080', 'SUKAJAYA', '71080003'),
('004', '71', '080', 'SUKARAMI', '71080004'),
('008', '71', '080', 'KEBUN BUNGA', '71080008'),
('009', '71', '080', 'TALANG BETUTU', '71080009'),
('011', '71', '080', 'TALANG JAMBE', '71080011'),
('001', '71', '081', 'SRIJAYA', '71081001'),
('002', '71', '081', 'KARYA BARU', '71081002'),
('003', '71', '081', 'TALANG KELAPA', '71081003');

-- --------------------------------------------------------

--
-- Table structure for table `kabupaten`
--

CREATE TABLE IF NOT EXISTS `kabupaten` (
  `B1R1` varchar(2) NOT NULL DEFAULT '' COMMENT 'kode kabupaten',
  `NAMAKAB` varchar(50) DEFAULT NULL COMMENT 'nama kabupaten',
  `STRATA` int(1) DEFAULT NULL COMMENT 'kode klasifikasi strata',
  PRIMARY KEY (`B1R1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kabupaten`
--

INSERT INTO `kabupaten` (`B1R1`, `NAMAKAB`, `STRATA`) VALUES
('02', 'OKI', 1),
('03', 'MUNIM', 2),
('06', 'MUBA', 1),
('08', 'OKUS', 2),
('10', 'OGAN ILIR', 2),
('71', 'PALEMBANG', 3);

-- --------------------------------------------------------

--
-- Table structure for table `kecamatan`
--

CREATE TABLE IF NOT EXISTS `kecamatan` (
  `B1R3` varchar(3) NOT NULL DEFAULT '' COMMENT 'kodekecamatan',
  `B1R1` varchar(2) NOT NULL DEFAULT '' COMMENT 'kode kabupaten',
  `NAMAKECA` varchar(50) DEFAULT NULL COMMENT 'nama kecamatan',
  PRIMARY KEY (`B1R3`,`B1R1`),
  KEY `B1R1` (`B1R1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kecamatan`
--

INSERT INTO `kecamatan` (`B1R3`, `B1R1`, `NAMAKECA`) VALUES
('010', '02', 'LEMPUING'),
('010', '06', 'SANGA DESA'),
('010', '08', 'MEKAKAU ILIR'),
('010', '10', 'MUARA KUANG'),
('010', '71', 'ILIR BARAT 2'),
('011', '02', 'LEMPUING JAYA'),
('011', '03', 'SEMENDO DARAT ULU'),
('011', '10', 'RAMBANG KUANG'),
('011', '71', 'GANDUS'),
('012', '10', 'LUBUK KELIAT'),
('020', '02', 'MESUJI'),
('020', '03', 'TANJUNG AGUNG'),
('020', '06', 'BABAT TOMAN'),
('020', '08', 'BANDING AGUNG'),
('020', '10', 'TANJUNG BATU'),
('020', '71', 'SEBERANG ULU 1'),
('021', '02', 'SUNGAI MENANG'),
('021', '06', 'BATANGHARI LEKO'),
('021', '08', 'WARKUK RANAU SELATAN'),
('021', '10', 'PAYARAMAN'),
('021', '71', 'KERTAPATI'),
('022', '02', 'MESUJI MAKMUR'),
('022', '06', 'PLAKAT TINGGI'),
('022', '08', 'BPR RANAU TENGAH'),
('023', '02', 'MESUJI RAYA'),
('030', '02', 'TULUNG SELAPAN'),
('030', '06', 'SUNGAI KERUH'),
('030', '08', 'BUAY PEMACA'),
('030', '10', 'RANTAU ALAI'),
('030', '71', 'SEBERANG ULU 2'),
('031', '02', 'CENGAL'),
('031', '03', 'RAMBANG'),
('031', '10', 'KANDIS'),
('031', '71', 'PLAJU'),
('032', '03', 'LUBAI'),
('040', '02', 'PEDAMARAN'),
('040', '03', 'LAWANG KIDUL'),
('040', '06', 'SEKAYU'),
('040', '08', 'SIMPANG'),
('040', '10', 'TANJUNG RAJA'),
('040', '71', 'ILIR BARAT 1'),
('041', '02', 'PEDAMARAN TIMUR'),
('041', '06', 'LAIS'),
('041', '08', 'BUANA PEMACA'),
('041', '10', 'RANTAU PANJANG'),
('041', '71', 'BUKIT KECIL'),
('042', '10', 'SUNGAI PINANG'),
('050', '02', 'TANJUNG LUBUK'),
('050', '03', 'MUARAENIM'),
('050', '08', 'MUARADUA'),
('050', '10', 'PEMULUTAN'),
('050', '71', 'ILIR TIMUR 1'),
('051', '02', 'TELUK GELAM'),
('051', '08', 'BUAY RAWAN'),
('051', '10', 'PEMULUTAN SELATAN'),
('051', '71', 'KEMUNING'),
('052', '10', 'PEMULUTAN BARAT'),
('060', '02', 'KOTA KAYU AGUNG'),
('060', '03', 'GUNUNG MEGANG'),
('060', '08', 'BUAY SANDANG AJI'),
('060', '10', 'INDRALAYA'),
('060', '71', 'ILIR TIMUR 2'),
('061', '08', 'TIGA DIHAJI'),
('061', '10', 'INDRALAYA UTARA'),
('061', '71', 'KALIDONI'),
('062', '10', 'INDRALAYA SELATAN'),
('070', '03', 'RAMBANG DANGKU'),
('070', '08', 'BUAY RUNJUNG'),
('070', '71', 'SAKO'),
('071', '08', 'RUNJUNG AGUNG'),
('071', '71', 'SEMATANG BORANG'),
('080', '03', 'TALANG UBI'),
('080', '08', 'KISAM TINGGI'),
('080', '71', 'SUKARAMI'),
('081', '03', 'PENUKAL'),
('081', '71', 'ALANG-ALANG LEBAR'),
('082', '03', 'TANAH ABANG'),
('083', '03', 'PANUKAL UTARA'),
('084', '03', 'ABAB'),
('090', '03', 'GELUMBANG'),
('090', '06', 'SUNGAI LILIN'),
('090', '08', 'MUARADUA KISAM'),
('091', '03', 'LEMBAK'),
('091', '06', 'KELUANG'),
('091', '08', 'KISAM ILIR'),
('092', '03', 'SUNGAI ROTAN'),
('093', '03', 'MUARA BELIDA'),
('100', '06', 'BAYUNG LENCIR'),
('100', '08', 'PULAU BERINGIN'),
('101', '06', 'LALAN'),
('102', '08', 'SUNGAI ARE'),
('120', '02', 'SIRAH PULAU PADANG'),
('121', '02', 'JEJAWI'),
('130', '02', 'PAMPANGAN'),
('131', '02', 'PANGKALAN LAMPAM'),
('140', '02', 'AIR SUGIHAN');

-- --------------------------------------------------------

--
-- Table structure for table `korwil`
--

CREATE TABLE IF NOT EXISTS `korwil` (
  `NIMKORWIL` varchar(7) DEFAULT NULL COMMENT 'nimKorwil',
  `NIMKORTIM` varchar(7) NOT NULL DEFAULT '' COMMENT 'nimKortim',
  PRIMARY KEY (`NIMKORTIM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `korwil`
--

INSERT INTO `korwil` (`NIMKORWIL`, `NIMKORTIM`) VALUES
('07.5339', '06.4974'),
('07.5271', '06.5055'),
('07.5276', '06.5060'),
('07.5272', '06.5070'),
('07.5466', '07.5210'),
('07.5339', '07.5266'),
('07.5356', '07.5268'),
('07.5272', '07.5269'),
('07.5272', '07.5270'),
('07.5271', '07.5277'),
('07.5466', '07.5280'),
('07.5339', '07.5281'),
('07.5272', '07.5290'),
('07.5276', '07.5296'),
('07.5466', '07.5300'),
('07.5276', '07.5302'),
('07.5276', '07.5303'),
('07.5271', '07.5304'),
('07.5356', '07.5306'),
('07.5356', '07.5318'),
('07.5276', '07.5321'),
('07.5276', '07.5326'),
('07.5339', '07.5328'),
('07.5276', '07.5330'),
('07.5356', '07.5333'),
('07.5276', '07.5334'),
('07.5271', '07.5336'),
('07.5272', '07.5338'),
('07.5276', '07.5341'),
('07.5339', '07.5345'),
('07.5356', '07.5346'),
('07.5276', '07.5348'),
('07.5276', '07.5349'),
('07.5466', '07.5350'),
('07.5276', '07.5351'),
('07.5276', '07.5353'),
('07.5466', '07.5364'),
('07.5272', '07.5373'),
('07.5466', '07.5377'),
('07.5339', '07.5380'),
('07.5466', '07.5382'),
('07.5466', '07.5383'),
('07.5356', '07.5387'),
('07.5356', '07.5389'),
('07.5276', '07.5392'),
('07.5339', '07.5394'),
('07.5271', '07.5395'),
('07.5276', '07.5397'),
('07.5466', '07.5403'),
('07.5466', '07.5404'),
('07.5276', '07.5411'),
('07.5466', '07.5413'),
('07.5466', '07.5416'),
('07.5272', '07.5419'),
('07.5272', '07.5420'),
('07.5272', '07.5423'),
('07.5466', '07.5425'),
('07.5276', '07.5428'),
('07.5466', '07.5430'),
('07.5276', '07.5435'),
('07.5276', '07.5436'),
('07.5276', '07.5442'),
('07.5276', '07.5444'),
('07.5466', '07.5445'),
('07.5339', '07.5446'),
('07.5272', '07.5456'),
('07.5466', '07.5458'),
('07.5271', '07.5462'),
('07.5276', '07.5464'),
('07.5276', '07.5481'),
('07.5271', '07.5484'),
('07.5466', '07.5486'),
('07.5276', '07.5493'),
('07.5276', '07.5497'),
('07.5276', '07.5499'),
('07.5339', '07.5501'),
('07.5276', '07.5502'),
('07.5271', '07.5505'),
('07.5271', '07.5508'),
('07.5271', '07.5520'),
('07.5272', '07.5522'),
('07.5356', '07.5525'),
('07.5356', '07.5526'),
('07.5466', '07.5533'),
('07.5276', '07.5534'),
('07.5356', '07.5536'),
('07.5339', '07.5542'),
('07.5272', '07.5544');

-- --------------------------------------------------------

--
-- Table structure for table `pengentri`
--

CREATE TABLE IF NOT EXISTS `pengentri` (
  `NIM` varchar(7) NOT NULL COMMENT 'namaPengentri',
  `NAMA` varchar(50) DEFAULT NULL COMMENT 'nimPengentri',
  UNIQUE KEY `NIM` (`NIM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengentri`
--

INSERT INTO `pengentri` (`NIM`, `NAMA`) VALUES
('06.5147', 'NASRUL SAPUTRA'),
('06.5219', 'SIZI LIA GINOGA'),
('07.5276', 'AHMAD NUR FAJRI'),
('07.5278', 'AISHA ADETIA'),
('07.5279', 'ALFIAN MAY PURBANY'),
('07.5280', 'ALFIAN ROSYADI'),
('07.5285', 'AMELIA RAHMAN'),
('07.5287', 'AMRIS ANTONIUS'),
('07.5301', 'ARIZKA SELVIANA'),
('07.5307', 'ASMAWI TRI PRABOWO'),
('07.5313', 'CHANDRA PRADHANA'),
('07.5315', 'CYNTHIA N.SAYA'),
('07.5317', 'DARMAWAN'),
('07.5322', 'DEWI NANDINI'),
('07.5329', 'DONNY ARDHI SAPUTRA'),
('07.5343', 'ELOK AGUSTINA'),
('07.5353', 'FAUZIAH LESTARI'),
('07.5354', 'FEBRI HAMDANI'),
('07.5357', 'FERRI ILFANA'),
('07.5364', 'HANDITA OKVIYANTO'),
('07.5365', 'HARDINI JULIARTI'),
('07.5366', 'HARUN ALRASYID'),
('07.5375', 'IKA KARTIKA SARI'),
('07.5377', 'ILHAM MAULUDIN'),
('07.5385', 'JOHANDRI DAMANIK'),
('07.5387', 'JUNEDI'),
('07.5390', 'KASMAN ABU'),
('07.5394', 'LINA YULIANA'),
('07.5399', 'LUTFI RAHMATUTI M.'),
('07.5405', 'MEDYA HERLIATI'),
('07.5410', 'MIFTAHUL KHAIR ANWAR'),
('07.5412', 'MOCHAMMAD WAHID ARIF HIDAYAH'),
('07.5415', 'MUHAMMAD FARID FADHLAN'),
('07.5418', 'MUHAMMAD MAFTUHIN'),
('07.5419', 'M. RAHMAT DARMAWAN'),
('07.5423', 'MUTAQIN'),
('07.5438', 'NOVI ALFITA'),
('07.5442', 'NUGROHONING GUSMASTUTI'),
('07.5460', 'RAHMAT D.K.'),
('07.5467', 'RESTU HAPSARI'),
('07.5471', 'RIA AGGREINI'),
('07.5483', 'RIZKIYO GUNAWAN'),
('07.5485', 'RUDI SETYAWAN'),
('07.5486', 'SABIT HURAIRA'),
('07.5487', 'SAKUNTALA DEVI AYU'),
('07.5493', 'SITI NURHIDAYAH H.B.'),
('07.5506', 'TITAH MAULIDYAH'),
('07.5512', 'TRIAS NUR YUNITA'),
('07.5515', 'UMI AYU FITRIANI'),
('07.5523', 'WAODE RAHMINA SARI'),
('07.5527', 'WILLY ANDHIKA'),
('07.5528', 'WILUYANINGTYAS W.'),
('07.5531', 'WINIDYA ROHIFISIEN'),
('07.5534', 'YEFIN AMANDRI MEIDIKA'),
('07.5537', 'YOGA ADINATA');

-- --------------------------------------------------------

--
-- Table structure for table `podes`
--

CREATE TABLE IF NOT EXISTS `podes` (
  `NKD` varchar(8) NOT NULL,
  `PENGENTRI` char(7) DEFAULT NULL COMMENT 'nim pengentri',
  `B1R5` varchar(50) DEFAULT NULL COMMENT 'namaKepalaDesa/Lurah',
  `B1R6` varchar(50) DEFAULT NULL COMMENT 'namaPemberiInformasi',
  `B1R7` varchar(50) DEFAULT NULL COMMENT 'jabatanPemberiInformasi',
  `B2R2` varchar(7) DEFAULT NULL COMMENT 'nimKortim',
  `B2R3` varchar(10) DEFAULT NULL COMMENT 'tanggalPencacahan',
  `B2R7` varchar(10) DEFAULT NULL COMMENT 'tanggalPemeriksaan',
  `B3R1A` int(1) DEFAULT NULL COMMENT 'lapanganSepakbola',
  `B3R1B` int(1) DEFAULT NULL COMMENT 'lapanganVoli',
  `B3R1C` int(1) DEFAULT NULL COMMENT 'lapanganBuluTangkis',
  `B3R1D` int(1) DEFAULT NULL COMMENT 'lapanganBasket',
  `B3R1E` int(1) DEFAULT NULL COMMENT 'lapanganTenis',
  `B3R1F` int(1) DEFAULT NULL COMMENT 'lapanganSepakTakraw',
  `B3R1G` int(1) DEFAULT NULL COMMENT 'kolamRenang',
  `B3R2A1` int(1) DEFAULT NULL COMMENT 'lapanganSepakbolaPemerintah?',
  `B3R2A2` int(1) DEFAULT NULL COMMENT 'lapanganSepakbolaNonPemerintah?',
  `B3R2B1` int(1) DEFAULT NULL COMMENT 'lapanganVoliPemerintah?',
  `B3R2B2` int(1) DEFAULT NULL COMMENT 'lapanganVoliNonPemerintah?',
  `B3R2C1` int(1) DEFAULT NULL COMMENT 'lapanganBuluTangkisPemerintah?',
  `B3R2C2` int(1) DEFAULT NULL COMMENT 'lapanganBuluTangkisNonPemerintah?',
  `B3R2D1` int(1) DEFAULT NULL COMMENT 'lapanganBasketPemerintah?',
  `B3R2D2` int(1) DEFAULT NULL COMMENT 'lapanganBasketNonPemerintah?',
  `B3R2E1` int(1) DEFAULT NULL COMMENT 'lapanganTenisPemerintah?',
  `B3R2E2` int(1) DEFAULT NULL COMMENT 'lapanganTenisNonPemerintah?',
  `B3R2F1` int(1) DEFAULT NULL COMMENT 'lapanganSepakTakrawPemerintah?',
  `B3R2F2` int(1) DEFAULT NULL COMMENT 'lapanganSepakTakrawNonPemerintah?',
  `B3R2G1` int(1) DEFAULT NULL COMMENT 'kolamRenangPemerintah?',
  `B3R2G2` int(1) DEFAULT NULL COMMENT 'kolamRenangNonPemerintah?',
  `B3R3A1` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakbolaPemerintahlayak',
  `B3R3A2` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakbolaPemerintahTidakLayak',
  `B3R3A3` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakbolaNonPemerintahLayak',
  `B3R3A4` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakbolaNonPemerintahTidakLayak',
  `B3R3B1` int(2) DEFAULT NULL COMMENT 'kondisiLapanganVoliPemerintahLayak',
  `B3R3B2` int(2) DEFAULT NULL COMMENT 'kondisiLapanganVoliPemerintahTidakLayak',
  `B3R3B3` int(2) DEFAULT NULL COMMENT 'kondisiLapanganVoliNonPemerintahLayak',
  `B3R3B4` int(2) DEFAULT NULL COMMENT 'kondisiLapanganVoliNonPemerintahTidakLayak',
  `B3R3C1` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBuluTangkisPemerintahLayak',
  `B3R3C2` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBuluTangkisPemerintahTidakLayak',
  `B3R3C3` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBuluTangkisNonPemerintahLayak',
  `B3R3C4` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBuluTangkisNonPemerintahTidakLayak',
  `B3R3D1` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBasketPemerintahLayak',
  `B3R3D2` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBasketPemerintahTidakLayak',
  `B3R3D3` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBasketNonPemerintahLayak',
  `B3R3D4` int(2) DEFAULT NULL COMMENT 'kondisiLapanganBasketNonPemerintahTidakLayak',
  `B3R3E1` int(2) DEFAULT NULL COMMENT 'kondisiLapanganTenisPemerintahLayak',
  `B3R3E2` int(2) DEFAULT NULL COMMENT 'kondisiLapanganTenisPemerintahTidakLayak',
  `B3R3E3` int(2) DEFAULT NULL COMMENT 'kondisiLapanganTenisNonPemerintahLayak',
  `B3R3E4` int(2) DEFAULT NULL COMMENT 'kondisiLapanganTenisNonPemerintahTidakLayak',
  `B3R3F1` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakTakrawPemerintahLayak',
  `B3R3F2` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakTakrawPemerintahTidakLayak',
  `B3R3F3` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakTakrawNonPemerintahLayak',
  `B3R3F4` int(2) DEFAULT NULL COMMENT 'kondisiLapanganSepakTakrawNonPemerintahTidakLayak',
  `B3R3G1` int(2) DEFAULT NULL COMMENT 'kondisiKolamRenangPemerintahLayak',
  `B3R3G2` int(2) DEFAULT NULL COMMENT 'kondisiKolamRenangPemerintahTidakLayak',
  `B3R3G3` int(2) DEFAULT NULL COMMENT 'kondisiKolamRenangNonPemerintahLayak',
  `B3R3G4` int(2) DEFAULT NULL COMMENT 'kondisiKolamRenangNonPemerintahTidakLayak',
  `B3R4A` int(1) DEFAULT NULL COMMENT 'pernahAdaKegiatanOlahraga?',
  `B3R4A_ALS` int(1) DEFAULT NULL COMMENT 'alasanTidakAdaKegiatanOlahraga?',
  `B3R4B` int(1) DEFAULT NULL COMMENT 'pernahAdaKompetisi?',
  `B3R4B_ALS` int(1) DEFAULT NULL COMMENT 'alasanTidakAdaKompetisi?',
  `B3R4C` int(1) DEFAULT NULL COMMENT 'adaSponsorKegiatanOlahraga?',
  `B3R4D1` int(1) DEFAULT NULL COMMENT 'sponsorDariPemerintah?',
  `B3R4D2` int(1) DEFAULT NULL COMMENT 'sponsorDariNonPemerintah?',
  `B3R4DLAIN` int(2) DEFAULT NULL COMMENT 'sponsorDariNonPemerintahLain?',
  PRIMARY KEY (`NKD`),
  KEY `B2R2` (`B2R2`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `podes`
--


--
-- Constraints for dumped tables
--

--
-- Constraints for table `desa`
--
ALTER TABLE `desa`
  ADD CONSTRAINT `desa_ibfk_1` FOREIGN KEY (`B1R1`) REFERENCES `kecamatan` (`B1R1`),
  ADD CONSTRAINT `desa_ibfk_2` FOREIGN KEY (`B1R3`) REFERENCES `kecamatan` (`B1R3`);

--
-- Constraints for table `kecamatan`
--
ALTER TABLE `kecamatan`
  ADD CONSTRAINT `kecamatan_ibfk_1` FOREIGN KEY (`B1R1`) REFERENCES `kabupaten` (`B1R1`);

--
-- Constraints for table `podes`
--
ALTER TABLE `podes`
  ADD CONSTRAINT `podes_ibfk_1` FOREIGN KEY (`NKD`) REFERENCES `desa` (`NKD`),
  ADD CONSTRAINT `podes_ibfk_2` FOREIGN KEY (`B2R2`) REFERENCES `korwil` (`NIMKORTIM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
