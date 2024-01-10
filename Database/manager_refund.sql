-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2020 at 06:12 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `multiuserlogin`
--

-- --------------------------------------------------------

--
-- Table structure for table `manager_refund`
--

CREATE TABLE `manager_refund` (
  `ID` int(50) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Account_no` int(11) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Time` varchar(100) NOT NULL,
  `Refund money` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `manager_refund`
--

INSERT INTO `manager_refund` (`ID`, `Name`, `Account_no`, `Date`, `Time`, `Refund money`) VALUES
(1, 'Khalid Hasan Seum', 0, '10-05-2020', '2:52 pm', '90000'),
(2, 'Seum', 123456789, '10-05-2020', '2:57 pm', '90000'),
(3, 'Seum', 123456789, '10-05-2020', '3:00 pm', '50000'),
(4, 'Seum1', 123456789, '11-05-2020', '5:49', '50000'),
(5, 'Faizullah', 123456789, '04-06-2020', '8:41 pm', '200'),
(6, 'Faizullah', 123456789, '04-06-2020', '8:47 pm', '1600'),
(7, 'Faijullah', 123456789, '04-06-2020', '8:48 pm', '1600');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `manager_refund`
--
ALTER TABLE `manager_refund`
  ADD UNIQUE KEY `ID` (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `manager_refund`
--
ALTER TABLE `manager_refund`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
