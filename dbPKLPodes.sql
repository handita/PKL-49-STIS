# Dump File
#
# Database is ported from MS Access
#--------------------------------------------------------
# Program Version 3.0.97

DROP DATABASE IF EXISTS `dbPKLPodes`;
CREATE DATABASE IF NOT EXISTS `dbPKLPodes`;
USE `dbPKLPodes`;

#
# Table structure for table 'DESA'
#

DROP TABLE IF EXISTS `DESA`;

CREATE TABLE `DESA` (
  `B1R4` VARCHAR(255), 
  `B1R1` VARCHAR(255), 
  `B1R3` VARCHAR(255), 
  `NAMADESA` VARCHAR(255), 
  `NKD` VARCHAR(255)
) TYPE=InnoDB;

#
# Dumping data for table 'DESA'
#

# 0 records

#
# Table structure for table 'kabupaten'
#

DROP TABLE IF EXISTS `kabupaten`;

CREATE TABLE `kabupaten` (
  `B1R1` VARCHAR(255), 
  `NAMAKAB` VARCHAR(255)
) TYPE=InnoDB;

#
# Dumping data for table 'kabupaten'
#

INSERT INTO `kabupaten` (`B1R1`, `NAMAKAB`) VALUES (NULL, NULL);
# 1 records

#
# Table structure for table 'kecamatan'
#

DROP TABLE IF EXISTS `kecamatan`;

CREATE TABLE `kecamatan` (
  `B1R3` VARCHAR(255), 
  `B1R1` VARCHAR(255), 
  `NAMAKECA` VARCHAR(255)
) TYPE=InnoDB;

#
# Dumping data for table 'kecamatan'
#

INSERT INTO `kecamatan` (`B1R3`, `B1R1`, `NAMAKECA`) VALUES (NULL, NULL, NULL);
# 1 records

#
# Table structure for table 'KORWIL'
#

DROP TABLE IF EXISTS `KORWIL`;

CREATE TABLE `KORWIL` (
  `NIMKORWIL` VARCHAR(255), 
  `NIMKORTIM` VARCHAR(255)
) TYPE=InnoDB;

#
# Dumping data for table 'KORWIL'
#

# 0 records

#
# Table structure for table 'PODES'
#

DROP TABLE IF EXISTS `PODES`;

CREATE TABLE `PODES` (
  `NKD` VARCHAR(255), 
  `B1R1` VARCHAR(255), 
  `B1R2` VARCHAR(255), 
  `B1R3` VARCHAR(255), 
  `B1R4` VARCHAR(255), 
  `B1R5` VARCHAR(255), 
  `B1R6A` VARCHAR(255), 
  `B1R6B` VARCHAR(255), 
  `B2R2` VARCHAR(255), 
  `B2R3` VARCHAR(255), 
  `B2R6` VARCHAR(255), 
  `B2R7` VARCHAR(255), 
  `B3R1A` INTEGER, 
  `B3R1B` INTEGER, 
  `B3R1C` INTEGER, 
  `B3R1D` INTEGER, 
  `B3R1E` INTEGER, 
  `B3R1F` INTEGER, 
  `B3R1G` INTEGER, 
  `B3R2A1` INTEGER, 
  `B3R2A2` INTEGER, 
  `B3R2B1` INTEGER, 
  `B3R2B2` INTEGER, 
  `B3R2C1` INTEGER, 
  `B3R2C2` INTEGER, 
  `B3R2D1` INTEGER, 
  `B3R2D2` INTEGER, 
  `B3R2E1` INTEGER, 
  `B3R2E2` INTEGER, 
  `B3R2F1` INTEGER, 
  `B3R2F2` INTEGER, 
  `B3R2G1` INTEGER, 
  `B3R2G2` INTEGER, 
  `B3R3A1` INTEGER, 
  `B3R3A2` INTEGER, 
  `B3R3A3` INTEGER, 
  `B3R3A4` INTEGER, 
  `B3R3B1` INTEGER, 
  `B3R3B2` INTEGER, 
  `B3R3B3` INTEGER, 
  `B3R3B4` INTEGER, 
  `B3R3C1` INTEGER, 
  `B3R3C2` INTEGER, 
  `B3R3C3` INTEGER, 
  `B3R3C4` INTEGER, 
  `B3R3D1` INTEGER, 
  `B3R3D2` INTEGER, 
  `B3R3D3` INTEGER, 
  `B3R3D4` INTEGER, 
  `B3R3E1` INTEGER, 
  `B3R3E2` INTEGER, 
  `B3R3E3` INTEGER, 
  `B3R3E4` INTEGER, 
  `B3R3F1` INTEGER, 
  `B3R3F2` INTEGER, 
  `B3R3F3` INTEGER, 
  `B3R3F4` INTEGER, 
  `B3R3G1` INTEGER, 
  `B3R3G2` INTEGER, 
  `B3R3G3` INTEGER, 
  `B3R3G4` INTEGER, 
  `B3R4A` INTEGER, 
  `B3R4B` INTEGER, 
  `B3R4C` INTEGER, 
  `B3R4D1` INTEGER, 
  `B3R4D2` INTEGER, 
  `B3R4DLain` VARCHAR(255)
) TYPE=InnoDB;

#
# Dumping data for table 'PODES'
#

INSERT INTO `PODES` (`NKD`, `B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5`, `B1R6A`, `B1R6B`, `B2R2`, `B2R3`, `B2R6`, `B2R7`, `B3R1A`, `B3R1B`, `B3R1C`, `B3R1D`, `B3R1E`, `B3R1F`, `B3R1G`, `B3R2A1`, `B3R2A2`, `B3R2B1`, `B3R2B2`, `B3R2C1`, `B3R2C2`, `B3R2D1`, `B3R2D2`, `B3R2E1`, `B3R2E2`, `B3R2F1`, `B3R2F2`, `B3R2G1`, `B3R2G2`, `B3R3A1`, `B3R3A2`, `B3R3A3`, `B3R3A4`, `B3R3B1`, `B3R3B2`, `B3R3B3`, `B3R3B4`, `B3R3C1`, `B3R3C2`, `B3R3C3`, `B3R3C4`, `B3R3D1`, `B3R3D2`, `B3R3D3`, `B3R3D4`, `B3R3E1`, `B3R3E2`, `B3R3E3`, `B3R3E4`, `B3R3F1`, `B3R3F2`, `B3R3F3`, `B3R3F4`, `B3R3G1`, `B3R3G2`, `B3R3G3`, `B3R3G4`, `B3R4A`, `B3R4B`, `B3R4C`, `B3R4D1`, `B3R4D2`, `B3R4DLain`) VALUES (NULL, '21', '2', '111', '111', 'FGSD', 'FSDFS', 'SDFS', '01.1111', '21/21/2010', 'FGSD', '11/11/2010', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'DFAS');
INSERT INTO `PODES` (`NKD`, `B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5`, `B1R6A`, `B1R6B`, `B2R2`, `B2R3`, `B2R6`, `B2R7`, `B3R1A`, `B3R1B`, `B3R1C`, `B3R1D`, `B3R1E`, `B3R1F`, `B3R1G`, `B3R2A1`, `B3R2A2`, `B3R2B1`, `B3R2B2`, `B3R2C1`, `B3R2C2`, `B3R2D1`, `B3R2D2`, `B3R2E1`, `B3R2E2`, `B3R2F1`, `B3R2F2`, `B3R2G1`, `B3R2G2`, `B3R3A1`, `B3R3A2`, `B3R3A3`, `B3R3A4`, `B3R3B1`, `B3R3B2`, `B3R3B3`, `B3R3B4`, `B3R3C1`, `B3R3C2`, `B3R3C3`, `B3R3C4`, `B3R3D1`, `B3R3D2`, `B3R3D3`, `B3R3D4`, `B3R3E1`, `B3R3E2`, `B3R3E3`, `B3R3E4`, `B3R3F1`, `B3R3F2`, `B3R3F3`, `B3R3F4`, `B3R3G1`, `B3R3G2`, `B3R3G3`, `B3R3G4`, `B3R4A`, `B3R4B`, `B3R4C`, `B3R4D1`, `B3R4D2`, `B3R4DLain`) VALUES (NULL, '21', '2', '111', '111', 'FGSD', 'FSDFS', 'SDFS', '01.1111', '21/21/2010', 'FGSD', '11/11/2010', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'DFAS');
INSERT INTO `PODES` (`NKD`, `B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5`, `B1R6A`, `B1R6B`, `B2R2`, `B2R3`, `B2R6`, `B2R7`, `B3R1A`, `B3R1B`, `B3R1C`, `B3R1D`, `B3R1E`, `B3R1F`, `B3R1G`, `B3R2A1`, `B3R2A2`, `B3R2B1`, `B3R2B2`, `B3R2C1`, `B3R2C2`, `B3R2D1`, `B3R2D2`, `B3R2E1`, `B3R2E2`, `B3R2F1`, `B3R2F2`, `B3R2G1`, `B3R2G2`, `B3R3A1`, `B3R3A2`, `B3R3A3`, `B3R3A4`, `B3R3B1`, `B3R3B2`, `B3R3B3`, `B3R3B4`, `B3R3C1`, `B3R3C2`, `B3R3C3`, `B3R3C4`, `B3R3D1`, `B3R3D2`, `B3R3D3`, `B3R3D4`, `B3R3E1`, `B3R3E2`, `B3R3E3`, `B3R3E4`, `B3R3F1`, `B3R3F2`, `B3R3F3`, `B3R3F4`, `B3R3G1`, `B3R3G2`, `B3R3G3`, `B3R3G4`, `B3R4A`, `B3R4B`, `B3R4C`, `B3R4D1`, `B3R4D2`, `B3R4DLain`) VALUES (NULL, '12', '2', '121', '121', 'KHKJH', 'JKGJKK', 'JKGKHKJ', '07.5423', '12/12/2010', 'KHKJH', '13/12/2010', 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, NULL, NULL, 2, 1, 2, 1, 2, 1, NULL, NULL, NULL, NULL, 2, 2, NULL, NULL, 2, 1, NULL, NULL, NULL, NULL, NULL, NULL, 1, 2, NULL, NULL, 1, 2, NULL, NULL, 2, 2, NULL, NULL, NULL, NULL, 1, 1, 2, NULL, NULL, '');
INSERT INTO `PODES` (`NKD`, `B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5`, `B1R6A`, `B1R6B`, `B2R2`, `B2R3`, `B2R6`, `B2R7`, `B3R1A`, `B3R1B`, `B3R1C`, `B3R1D`, `B3R1E`, `B3R1F`, `B3R1G`, `B3R2A1`, `B3R2A2`, `B3R2B1`, `B3R2B2`, `B3R2C1`, `B3R2C2`, `B3R2D1`, `B3R2D2`, `B3R2E1`, `B3R2E2`, `B3R2F1`, `B3R2F2`, `B3R2G1`, `B3R2G2`, `B3R3A1`, `B3R3A2`, `B3R3A3`, `B3R3A4`, `B3R3B1`, `B3R3B2`, `B3R3B3`, `B3R3B4`, `B3R3C1`, `B3R3C2`, `B3R3C3`, `B3R3C4`, `B3R3D1`, `B3R3D2`, `B3R3D3`, `B3R3D4`, `B3R3E1`, `B3R3E2`, `B3R3E3`, `B3R3E4`, `B3R3F1`, `B3R3F2`, `B3R3F3`, `B3R3F4`, `B3R3G1`, `B3R3G2`, `B3R3G3`, `B3R3G4`, `B3R4A`, `B3R4B`, `B3R4C`, `B3R4D1`, `B3R4D2`, `B3R4DLain`) VALUES ('1231333', '12', '1', '212', '121', 'LKL', 'LKL', 'HJHK', '07.5423', '02/02/2010', '07.5521', '02/03/2010', 1, 2, 1, 2, 2, 2, 2, 2, 1, NULL, NULL, 2, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, NULL, NULL, NULL, NULL, NULL, NULL, 2, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 2, NULL, NULL, '');
# 4 records
