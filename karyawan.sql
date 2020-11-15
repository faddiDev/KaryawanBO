-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2020 at 02:05 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `t1_position`
--

CREATE TABLE `t1_position` (
  `ID` int(11) NOT NULL,
  `CODE` varchar(50) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `IS_DELETE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t1_position`
--

INSERT INTO `t1_position` (`ID`, `CODE`, `NAME`, `IS_DELETE`) VALUES
(1, 'SA', 'System Analyst', 0),
(2, 'BPS', 'BPS', 0),
(3, 'PRG', 'Programmer', 0),
(4, 'TST', 'Tester', 0),
(5, 'HELP', 'Helpdesk', 0);

-- --------------------------------------------------------

--
-- Table structure for table `t2_employee`
--

CREATE TABLE `t2_employee` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `BIRTH_DATE` date NOT NULL,
  `POSITION_ID` int(11) NOT NULL,
  `ID_NUMBER` int(11) NOT NULL,
  `GENDER` int(11) NOT NULL,
  `IS_DELETE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t2_employee`
--

INSERT INTO `t2_employee` (`ID`, `NAME`, `BIRTH_DATE`, `POSITION_ID`, `ID_NUMBER`, `GENDER`, `IS_DELETE`) VALUES
(1, 'Yogi Lestari', '1990-02-14', 5, 2019111301, 1, 0),
(2, 'Anggi Setiawan', '1991-05-10', 2, 2019111302, 1, 0),
(3, 'Rosiana', '1993-04-20', 4, 2019111303, 2, 0),
(4, 'Yudi Ismiaji', '1994-01-11', 5, 2019111304, 1, 0),
(5, 'Iyem Anastasia', '2020-11-15', 5, 2019111305, 2, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t1_position`
--
ALTER TABLE `t1_position`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `t2_employee`
--
ALTER TABLE `t2_employee`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t1_position`
--
ALTER TABLE `t1_position`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `t2_employee`
--
ALTER TABLE `t2_employee`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
