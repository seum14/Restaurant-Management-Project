-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2020 at 06:13 PM
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
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `User_ID` int(50) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Account` varchar(100) NOT NULL,
  `Time` varchar(50) NOT NULL,
  `Date` varchar(50) NOT NULL,
  `Total_Bill` varchar(100) NOT NULL,
  `Pay_Money` varchar(100) NOT NULL,
  `Balance_Money` varchar(100) NOT NULL,
  `Refund_Money` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`User_ID`, `Name`, `Email`, `Account`, `Time`, `Date`, `Total_Bill`, `Pay_Money`, `Balance_Money`, `Refund_Money`) VALUES
(5, 'Cheese Burger', 'khalid.hasan.seum1@gmail.com', '123456789', '2:59 am', '10-05-2020', '1200', '1500', '300', '50000'),
(6, 'sdfg', 'dfg', '123456789', '11:08 pm', '10-05-2020', '1800', '2000', '200', NULL),
(7, 'Seum', 'khalid.hasan.seum1@gmail.com', '123456789', '4:29 pm', '11-05-2020', '1200', '1400', '200', '1600'),
(8, 'Seum', 'kghjfgdfsaS', '123456789', 'XCVB', 'XDFCGHV', '1600', '1600', '0', '50000'),
(9, 'Seum', 'seum@gmail.com', '123456789', '8:29 PM', '04-06-2020', '3800', '4000', '200', '200'),
(10, 'Khalid', 'kh@gmail.com', '', '8:31 PM', '04-06-2020', '5800', '6000', '200', NULL),
(11, 'Hasan', 'hasan@gmail.com', '123456789', '9:04 pm', '04-06-2020', '4800', '5000', '200', NULL),
(12, 'gash', 'gash@gmail.com', '123456789', '9:06 pm', '04-06-2020', '6000', '6000', '0', NULL),
(13, 'Enayet', 'an@gmail.com', '', '9:38 PM', '04-06-2020', '3000', '3000', '0', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD UNIQUE KEY `User_ID` (`User_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `User_ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
