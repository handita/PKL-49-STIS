-- phpMyAdmin SQL Dump
-- version 2.11.6
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 11, 2010 at 11:04 PM
-- Server version: 5.1.30
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pkl49`
--

-- --------------------------------------------------------

--
-- Table structure for table `blok1`
--

CREATE TABLE `blok1` (
  `B1R1` varchar(255) DEFAULT NULL,
  `B1R2` varchar(255) DEFAULT NULL,
  `B1R3` varchar(255) DEFAULT NULL,
  `B1R4` varchar(255) DEFAULT NULL,
  `B1R5` varchar(255) DEFAULT NULL,
  `B1R6` varchar(255) DEFAULT NULL,
  `B1R7` varchar(255) DEFAULT NULL,
  `B1R8` varchar(255) DEFAULT NULL,
  `B1R9` varchar(255) DEFAULT NULL,
  `NKS` varchar(255) DEFAULT NULL,
  `Pengentri` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok1`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok2`
--

CREATE TABLE `blok2` (
  `NKS` varchar(255) DEFAULT NULL,
  `B2R1` int(11) DEFAULT NULL,
  `B2R2` int(11) DEFAULT NULL,
  `B2R3` int(11) DEFAULT NULL,
  `B2R4` int(11) DEFAULT NULL,
  `B2R5` int(11) DEFAULT NULL,
  `B2R6` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok2`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok3`
--

CREATE TABLE `blok3` (
  `NKS` varchar(255) DEFAULT NULL,
  `B3R2` varchar(255) DEFAULT NULL,
  `B3R3` varchar(255) DEFAULT NULL,
  `B3R6` varchar(255) DEFAULT NULL,
  `B3R7` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok3`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok4`
--

CREATE TABLE `blok4` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` varchar(255) DEFAULT NULL,
  `B4K2` varchar(255) DEFAULT NULL,
  `B4K3` int(11) DEFAULT NULL,
  `B4K4` int(11) DEFAULT NULL,
  `B4K5` int(11) DEFAULT NULL,
  `B4K6` int(11) DEFAULT NULL,
  `B4K7` int(11) DEFAULT NULL,
  `B4K8` int(11) DEFAULT NULL,
  `B4K9` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok4`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok5a`
--

CREATE TABLE `blok5a` (
  `NKS` varchar(255) DEFAULT NULL,
  `B5R1A` int(11) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `B5R2` int(11) DEFAULT NULL,
  `B5R3` int(11) DEFAULT NULL,
  `B5R4A1` varchar(255) DEFAULT NULL,
  `B5R4A2` int(11) DEFAULT NULL,
  `B5R4B` int(11) DEFAULT NULL,
  `B5R4BLain` varchar(255) DEFAULT NULL,
  `B5R5` int(11) DEFAULT NULL,
  `B5AR6A` int(11) DEFAULT NULL,
  `B5AR6B` int(11) DEFAULT NULL,
  `B5AR6C` int(11) DEFAULT NULL,
  `B5AR6D` int(11) DEFAULT NULL,
  `B5AR6E` int(11) DEFAULT NULL,
  `B5AR6F` int(11) DEFAULT NULL,
  `B5AR6G` int(11) DEFAULT NULL,
  `B5AR6H` int(11) DEFAULT NULL,
  `B5AR6HLain` varchar(255) DEFAULT NULL,
  `B5AR7` int(11) DEFAULT NULL,
  `B5AR8` int(11) DEFAULT NULL,
  `B5AR9A` int(11) DEFAULT NULL,
  `B5AR9B1` int(11) DEFAULT NULL,
  `B5AR9B2` int(11) DEFAULT NULL,
  `B5AR9B3` int(11) DEFAULT NULL,
  `B5AR9B3Lain` varchar(255) DEFAULT NULL,
  `B5AR10` int(11) DEFAULT NULL,
  `B5AR11A` int(11) DEFAULT NULL,
  `B5AR11B` int(11) DEFAULT NULL,
  `B5AR11C` int(11) DEFAULT NULL,
  `B5AR11D` int(11) DEFAULT NULL,
  `B5AR11E` int(11) DEFAULT NULL,
  `B5AR11F` int(11) DEFAULT NULL,
  `B5AR11G` int(11) DEFAULT NULL,
  `B5AR11H` int(11) DEFAULT NULL,
  `B5AR11Lain` varchar(255) DEFAULT NULL,
  `B5AR12` int(11) DEFAULT NULL,
  `B5AR13A` int(11) DEFAULT NULL,
  `B5AR13B` int(11) DEFAULT NULL,
  `B5AR13C` int(11) DEFAULT NULL,
  `B5AR13D` int(11) DEFAULT NULL,
  `B5AR13E` int(11) DEFAULT NULL,
  `B5AR13F` int(11) DEFAULT NULL,
  `B5AR13Lain` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok5a`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok5b`
--

CREATE TABLE `blok5b` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `B5BR14A` varchar(255) DEFAULT NULL,
  `B5BR14B` varchar(255) DEFAULT NULL,
  `B5BR14C` varchar(255) DEFAULT NULL,
  `B5BR15A` int(11) DEFAULT NULL,
  `B5BR15B` int(11) DEFAULT NULL,
  `B5BR16` int(11) DEFAULT NULL,
  `B5BR16Lain` varchar(255) DEFAULT NULL,
  `B5BR17_1` int(11) DEFAULT NULL,
  `B5BR17_2` int(11) DEFAULT NULL,
  `B5BR17_3` int(11) DEFAULT NULL,
  `B5BR17_4` int(11) DEFAULT NULL,
  `B5BR17_5` int(11) DEFAULT NULL,
  `B5BR17_6` int(11) DEFAULT NULL,
  `B5BR17_6Lain` varchar(255) DEFAULT NULL,
  `B5BR18A` int(11) DEFAULT NULL,
  `B5BR18B1` int(11) DEFAULT NULL,
  `B5BR18B2` int(11) DEFAULT NULL,
  `B5BR18B3` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok5b`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok5c`
--

CREATE TABLE `blok5c` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` varchar(255) DEFAULT NULL,
  `B5CR19` int(11) DEFAULT NULL,
  `B5CR20` int(11) DEFAULT NULL,
  `B5CR21` int(11) DEFAULT NULL,
  `B5CR22A` int(11) DEFAULT NULL,
  `B5CR22B` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok5c`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok5de`
--

CREATE TABLE `blok5de` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `B5DR23_1` int(11) DEFAULT NULL,
  `B5DR23_2` int(11) DEFAULT NULL,
  `B5DR23_3` int(11) DEFAULT NULL,
  `B5DR23_4` int(11) DEFAULT NULL,
  `B5DR23_5` int(11) DEFAULT NULL,
  `B5DR23Lain` varchar(255) DEFAULT NULL,
  `B5DR24` int(11) DEFAULT NULL,
  `B5DR25` int(11) DEFAULT NULL,
  `B5DR25Lengkap` varchar(255) DEFAULT NULL,
  `B5DR26a` int(11) DEFAULT NULL,
  `B5DR26b` int(11) DEFAULT NULL,
  `B5DR26c` int(11) DEFAULT NULL,
  `B5DR26d` int(11) DEFAULT NULL,
  `B5DR27A` int(11) DEFAULT NULL,
  `B5DR27B` int(11) DEFAULT NULL,
  `B5DR27BLain` varchar(255) DEFAULT NULL,
  `B5DR27C` int(11) DEFAULT NULL,
  `B5DR27D` int(11) DEFAULT NULL,
  `B5DR27E1` int(11) DEFAULT NULL,
  `B5DR27E2` int(11) DEFAULT NULL,
  `B5DR27E3` int(11) DEFAULT NULL,
  `B5DR27E4` int(11) DEFAULT NULL,
  `B5DR27E5` int(11) DEFAULT NULL,
  `B5DR27E5Lain` varchar(255) DEFAULT NULL,
  `B5DR28` int(11) DEFAULT NULL,
  `B5DR28Lain` varchar(255) DEFAULT NULL,
  `B5DR29A` int(11) DEFAULT NULL,
  `B5DR29B1` int(11) DEFAULT NULL,
  `B5DR29B2` int(11) DEFAULT NULL,
  `B5DR29B3` int(11) DEFAULT NULL,
  `B5DR29B4` int(11) DEFAULT NULL,
  `B5DR29BLain` varchar(255) DEFAULT NULL,
  `B5ER30A` int(11) DEFAULT NULL,
  `B5ER30B` int(11) DEFAULT NULL,
  `B5ER30C1` varchar(255) DEFAULT NULL,
  `B5ER30C2` varchar(255) DEFAULT NULL,
  `B5ER30C3` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok5de`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok6`
--

CREATE TABLE `blok6` (
  `NKS` varchar(255) DEFAULT NULL,
  `B6R1` int(11) DEFAULT NULL,
  `B6R1BTanah` varchar(255) DEFAULT NULL,
  `B6R2` int(11) DEFAULT NULL,
  `B6R3A` int(11) DEFAULT NULL,
  `B6R3B` int(11) DEFAULT NULL,
  `B6R4` int(11) DEFAULT NULL,
  `B6R5` int(11) DEFAULT NULL,
  `B6R5Lain` varchar(255) DEFAULT NULL,
  `B6R6` int(11) DEFAULT NULL,
  `B6R6Lain` varchar(255) DEFAULT NULL,
  `B6R7` int(11) DEFAULT NULL,
  `B6R8` int(11) DEFAULT NULL,
  `B6R9` int(11) DEFAULT NULL,
  `B6R10` int(11) DEFAULT NULL,
  `B6R11` int(11) DEFAULT NULL,
  `B6R12` int(11) DEFAULT NULL,
  `B6R12Lain` varchar(255) DEFAULT NULL,
  `B6R13` int(11) DEFAULT NULL,
  `B6R14A` int(11) DEFAULT NULL,
  `B6R14B` int(11) DEFAULT NULL,
  `B6R14C1` int(11) DEFAULT NULL,
  `B6R14C2` int(11) DEFAULT NULL,
  `B6R14C3` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok6`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok7a`
--

CREATE TABLE `blok7a` (
  `NKS` varchar(255) DEFAULT NULL,
  `B7AR1A` varchar(255) DEFAULT NULL,
  `B7AR1B` int(11) DEFAULT NULL,
  `B7AR2` int(11) DEFAULT NULL,
  `B7AR3A` int(11) DEFAULT NULL,
  `B7AR3B` int(11) DEFAULT NULL,
  `B7AR4` int(11) DEFAULT NULL,
  `B7AR5A` int(11) DEFAULT NULL,
  `B7AR5B` int(11) DEFAULT NULL,
  `B7AR6` int(11) DEFAULT NULL,
  `B7AR7` int(11) DEFAULT NULL,
  `B7AR8` int(11) DEFAULT NULL,
  `B7AR9` int(11) DEFAULT NULL,
  `B7AR10` int(11) DEFAULT NULL,
  `B7AR11` int(11) DEFAULT NULL,
  `B7AR12A` int(11) DEFAULT NULL,
  `B7AR12B` int(11) DEFAULT NULL,
  `B7AR13A` int(11) DEFAULT NULL,
  `B7AR13B` int(11) DEFAULT NULL,
  `B7AR13C` int(11) DEFAULT NULL,
  `B7AR14A` int(11) DEFAULT NULL,
  `B7AR14B` int(11) DEFAULT NULL,
  `B7AR15` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok7a`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok7b`
--

CREATE TABLE `blok7b` (
  `NKS` varchar(255) DEFAULT NULL,
  `B7BR16A2` int(11) DEFAULT NULL,
  `B7BR16A3` int(11) DEFAULT NULL,
  `B7BR16B2` int(11) DEFAULT NULL,
  `B7BR16B3` int(11) DEFAULT NULL,
  `B7BR16C2` int(11) DEFAULT NULL,
  `B7BR16C3` int(11) DEFAULT NULL,
  `B7BR16D2` int(11) DEFAULT NULL,
  `B7BR16D3` int(11) DEFAULT NULL,
  `B7BR17A2` int(11) DEFAULT NULL,
  `B7BR17A3` int(11) DEFAULT NULL,
  `B7BR17B2` int(11) DEFAULT NULL,
  `B7BR17B3` int(11) DEFAULT NULL,
  `B7BR17C2` int(11) DEFAULT NULL,
  `B7BR17C3` int(11) DEFAULT NULL,
  `B7BR17D2` int(11) DEFAULT NULL,
  `B7BR17D3` int(11) DEFAULT NULL,
  `B7BR17E2` int(11) DEFAULT NULL,
  `B7BR17E3` int(11) DEFAULT NULL,
  `B7BR18_2` int(11) DEFAULT NULL,
  `B7BR18_3` int(11) DEFAULT NULL,
  `B7BR19_2` int(11) DEFAULT NULL,
  `B7BR19_3` int(11) DEFAULT NULL,
  `B7BR20A2` int(11) DEFAULT NULL,
  `B7BR20A3` int(11) DEFAULT NULL,
  `B7BR20B2` int(11) DEFAULT NULL,
  `B7BR20B3` int(11) DEFAULT NULL,
  `B7BR20C2` int(11) DEFAULT NULL,
  `B7BR20C3` int(11) DEFAULT NULL,
  `B7BR20D2` int(11) DEFAULT NULL,
  `B7BR20D3` int(11) DEFAULT NULL,
  `B7BR21_2` int(11) DEFAULT NULL,
  `B7BR21_3` int(11) DEFAULT NULL,
  `B7BR22_2` int(11) DEFAULT NULL,
  `B7BR22_3` int(11) DEFAULT NULL,
  `B7BR23` double DEFAULT NULL,
  `B7BR24` double DEFAULT NULL,
  `B7BR25` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok7b`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok8a1`
--

CREATE TABLE `blok8a1` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `B8AK2` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok8a1`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok8a2`
--

CREATE TABLE `blok8a2` (
  `NKS` varchar(255) DEFAULT NULL,
  `B8AK3` int(11) DEFAULT NULL,
  `B8AK3Lain` varchar(255) DEFAULT NULL,
  `B8AK4` int(11) DEFAULT NULL,
  `B8AK12` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok8a2`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok8a3`
--

CREATE TABLE `blok8a3` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `B8AK5` int(11) DEFAULT NULL,
  `B8AK5ALS` varchar(255) DEFAULT NULL,
  `B8AK6` int(11) DEFAULT NULL,
  `B8AK7` int(11) DEFAULT NULL,
  `B8AK8` int(11) DEFAULT NULL,
  `B8AK9` int(11) DEFAULT NULL,
  `B8AK10` int(11) DEFAULT NULL,
  `B8AK11` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok8a3`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok8a4`
--

CREATE TABLE `blok8a4` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `B8AK13` int(11) DEFAULT NULL,
  `B8AK13ALS` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok8a4`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok8b`
--

CREATE TABLE `blok8b` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `B8BR1` int(11) DEFAULT NULL,
  `B8BR2` int(11) DEFAULT NULL,
  `B8BR3` int(11) DEFAULT NULL,
  `B8BR4` int(11) DEFAULT NULL,
  `B8BR5` int(11) DEFAULT NULL,
  `B8BR6` int(11) DEFAULT NULL,
  `B8BR7` int(11) DEFAULT NULL,
  `B8BR8` int(11) DEFAULT NULL,
  `B8BR9` int(11) DEFAULT NULL,
  `B8BR10` int(11) DEFAULT NULL,
  `B8BR11` int(11) DEFAULT NULL,
  `B8BR12` int(11) DEFAULT NULL,
  `B8BR13` int(11) DEFAULT NULL,
  `B8BR14` int(11) DEFAULT NULL,
  `B8BR15` int(11) DEFAULT NULL,
  `B8BR16` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok8b`
--


-- --------------------------------------------------------

--
-- Table structure for table `blok8c`
--

CREATE TABLE `blok8c` (
  `NKS` varchar(255) DEFAULT NULL,
  `NO_URUT` int(11) DEFAULT NULL,
  `NO_URUTBAYI` varchar(255) DEFAULT NULL,
  `B8CR1` int(11) DEFAULT NULL,
  `B8CR2` int(11) DEFAULT NULL,
  `B8CR3` int(11) DEFAULT NULL,
  `B8CR4` int(11) DEFAULT NULL,
  `B8CR5` int(11) DEFAULT NULL,
  `B8CR6` int(11) DEFAULT NULL,
  `B8CR7` int(11) DEFAULT NULL,
  `B8CR8` int(11) DEFAULT NULL,
  `B8CR9` int(11) DEFAULT NULL,
  `B8CR10` int(11) DEFAULT NULL,
  `B8CR11` int(11) DEFAULT NULL,
  `B8CR12` int(11) DEFAULT NULL,
  `B8CR13` int(11) DEFAULT NULL,
  `B8CR14` int(11) DEFAULT NULL,
  `B8CR15` int(11) DEFAULT NULL,
  `B8CR16` int(11) DEFAULT NULL,
  `B8CR17` int(11) DEFAULT NULL,
  `B8CR18` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blok8c`
--


-- --------------------------------------------------------

--
-- Table structure for table `desa`
--

CREATE TABLE `desa` (
  `B1R4` varchar(255) DEFAULT NULL,
  `B1R1` varchar(255) DEFAULT NULL,
  `B1R3` varchar(255) DEFAULT NULL,
  `NAMADESA` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `desa`
--


-- --------------------------------------------------------

--
-- Table structure for table `ibuwali`
--

CREATE TABLE `ibuwali` (
  `NO_URUT` varchar(255) DEFAULT NULL,
  `IBUWALI` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ibuwali`
--


-- --------------------------------------------------------

--
-- Table structure for table `kabupaten`
--

CREATE TABLE `kabupaten` (
  `B1R1` varchar(255) DEFAULT NULL,
  `NAMAKAB` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kabupaten`
--

INSERT INTO `kabupaten` (`B1R1`, `NAMAKAB`) VALUES
(NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `kecamatan`
--

CREATE TABLE `kecamatan` (
  `B1R3` varchar(255) DEFAULT NULL,
  `B1R1` varchar(255) DEFAULT NULL,
  `NAMAKECA` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kecamatan`
--

INSERT INTO `kecamatan` (`B1R3`, `B1R1`, `NAMAKECA`) VALUES
(NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `kortim`
--

CREATE TABLE `kortim` (
  `NIMKORTIM` varchar(255) DEFAULT NULL,
  `NIMPENCACAH` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kortim`
--

INSERT INTO `kortim` (`NIMKORTIM`, `NIMPENCACAH`) VALUES
(NULL, NULL);
