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
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `ID` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dateofbirth` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `signupas` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`ID`, `username`, `email`, `dateofbirth`, `gender`, `password`, `signupas`) VALUES
(5, 'seum', 'khalid.hasan.seum1@gmail.com', '21-07-1999', 'Male', '141414', 'Manager'),
(10, 'seum1', 'seum', 'dfghgnh', 'Male', '1414', 'Staff'),
(12, 'seum2', 'swer@gmail.com', '21-07-1999', 'Male', '1515', 'Staff'),
(21, 'seum5', 'seum5', '21-07-1999', 'Male', '1414', 'Customer'),
(22, 'dsfghjk', 'sfxdhgjk', 'dsfg', 'Female', 'sadfghkjl', 'Manager'),
(23, 'sdfghjkl', 'sdfghjkl;', 'szdxfhgjkl', 'Female', 'dsfghjkl;', 'Manager'),
(27, 'Faizullah', 'faizullah@gmail.com', '01-05-1995', 'Male', '1515', 'Manager'),
(31, 'Fuad1', 'fuad1@gmail.com', '02-05-1999', 'Male', '1414', 'Customer'),
(32, 'fuad2', 'fuad2@gmail.com', '04-06-2020', 'Male', '1414', 'Staff'),
(33, 'fuad4', 'fuad4@gmail.com', '05-02-1999', 'Male', '1414', 'Staff');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
