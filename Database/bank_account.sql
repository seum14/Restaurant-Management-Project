-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2020 at 06:11 PM
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
-- Table structure for table `bank_account`
--

CREATE TABLE `bank_account` (
  `ID` int(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Account_no` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `Mobile_Number` int(100) NOT NULL,
  `Time` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Refund_Money` int(100) DEFAULT NULL,
  `Debit_Money` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bank_account`
--

INSERT INTO `bank_account` (`ID`, `Name`, `Account_no`, `Email`, `password`, `Mobile_Number`, `Time`, `Date`, `Refund_Money`, `Debit_Money`) VALUES
(8, 'Khalid Hasan Seum', '123456789', 'khalid.hasan.seum1@gmail.com', '141414', 1773331040, '1:41 am', '05-09-2020', 1600, 6000),
(12, 'Khalid Hasan Seum', '987456321', 'khalid.hasan@gmail.com', '1414', 1920042795, '1:41 am', '05-09-2020', 100000, 0),
(38, 'dfvgh', '4865132', 'sdfg', 'sdfdg', 2345, 'dsfg', 'sdfgf', NULL, NULL),
(40, 'seum1', '123', 'seum', '1414', 17, '5:45 pm', '11-05-2020', NULL, NULL),
(41, 'Faizullah', '12345', 'fuad@gmail.com', '123456', 177889910, '8:43 pm', '04-06-2020', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bank_account`
--
ALTER TABLE `bank_account`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Account_no` (`Account_no`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `Mobile_Number` (`Mobile_Number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bank_account`
--
ALTER TABLE `bank_account`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
