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
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `ID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Account` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Mobile_Number` varchar(100) NOT NULL,
  `Food_ID` varchar(100) NOT NULL,
  `Rank` varchar(100) NOT NULL,
  `Comment` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`ID`, `Name`, `Account`, `Email`, `Mobile_Number`, `Food_ID`, `Rank`, `Comment`) VALUES
(2, 'Seum', '123456789', 'khalid.hasan.seum1@gmail.com', '01773331040', '8', '2', 'Give my money back.Too much bad food.'),
(3, 'Seum', '123456789', 'khalid.hasan.seum1@gmail.com', '01773331040', '8', '2', 'Give my money back.Too much bad food.'),
(4, 'asdfghj', 'adsfgh', 'dfghj', 'zfdsgh', 'zdsfgh', 'Zxcsvbn', 'Zxdcfvgb'),
(5, 'asdfghj', 'adsfgh', 'dfghj', 'zfdsgh', '8', '2', 'Zxdcfvgb'),
(6, 'asdfghj', 'adsfgh', 'dfghj', 'zfdsgh', '7', '2', 'Zxdcfvgb'),
(7, 'Hasan', '123456789', 'hasan@gmail.com', '01785654635', '596', '01', 'The food is not good. I want to my money back');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `review`
--
ALTER TABLE `review`
  ADD UNIQUE KEY `ID` (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `review`
--
ALTER TABLE `review`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
