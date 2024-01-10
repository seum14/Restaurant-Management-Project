-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2020 at 06:06 PM
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
-- Table structure for table `announcements`
--

CREATE TABLE `announcements` (
  `price` int(11) DEFAULT NULL,
  `message` varchar(45) NOT NULL,
  `menuItems` varchar(500) DEFAULT NULL,
  `managerName` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `ID` int(11) NOT NULL,
  `Sold` int(11) NOT NULL,
  `Available` int(11) NOT NULL,
  `Rating` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`ID`, `Sold`, `Available`, `Rating`) VALUES
(589, 0, 5, 0),
(45, 0, 5, 0),
(5421, 0, 5, 0),
(421, 0, 23, 0),
(23, 0, 5, 0),
(344, 0, 3, 0),
(645, 0, 5, 0),
(65, 0, 5, 0),
(34, 0, 654, 0),
(45, 0, 6, 0),
(4353, 0, 3, 0),
(777, 0, 5, 0),
(51, 0, 5, 0);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `SignUpAs` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Name`, `Email`, `Gender`, `SignUpAs`) VALUES
(5, 'Faizullah', 'faizullah@gmail.com', 'Male', 'Manager'),
(9, 'Fuad1', 'fuad1@gmail.com', 'Male', 'Customer'),
(10, 'fuad2', 'fuad2@gmail.com', 'Male', 'Staff'),
(11, 'fuad4', 'fuad4@gmail.com', 'Male', 'Staff');

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

-- --------------------------------------------------------

--
-- Table structure for table `menu_item`
--

CREATE TABLE `menu_item` (
  `ID` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Rank` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  `Category` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu_item`
--

INSERT INTO `menu_item` (`ID`, `Name`, `Rank`, `Price`, `Category`) VALUES
(6, 'Cheese Burger ', 0, 600, 'Burger'),
(7, 'Cheese Pizza', 2, 400, 'Pizza'),
(258, 'Xoss Pasta', 0, 500, 'Pasta'),
(596, 'Misti', 1, 900, 'Appetizers');

-- --------------------------------------------------------

--
-- Table structure for table `offer`
--

CREATE TABLE `offer` (
  `ID` int(50) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Rank` int(100) NOT NULL,
  `Price` int(50) NOT NULL,
  `Category` varchar(100) NOT NULL,
  `Announcement` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `offer`
--

INSERT INTO `offer` (`ID`, `Name`, `Rank`, `Price`, `Category`, `Announcement`) VALUES
(895, 'xoss Burger', 0, 500, 'Burger', 'Offer'),
(800, 'Lemon drinks', 0, 900, 'Drinks', 'Offer');

-- --------------------------------------------------------

--
-- Table structure for table `order_info`
--

CREATE TABLE `order_info` (
  `order_id` int(11) NOT NULL,
  `order_cutomerName` varchar(45) NOT NULL,
  `order_deliveryTime` varchar(45) DEFAULT NULL,
  `order_deliveryBoy` varchar(45) NOT NULL,
  `order_receivedStatus` varchar(45) NOT NULL,
  `order_complainMessage` varchar(45) DEFAULT NULL,
  `order_menuItemList` varchar(200) NOT NULL,
  `order_StartTime` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
-- Indexes for table `announcements`
--
ALTER TABLE `announcements`
  ADD PRIMARY KEY (`message`);

--
-- Indexes for table `bank_account`
--
ALTER TABLE `bank_account`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Account_no` (`Account_no`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `Mobile_Number` (`Mobile_Number`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Name` (`Name`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- Indexes for table `manager_refund`
--
ALTER TABLE `manager_refund`
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `order_info`
--
ALTER TABLE `order_info`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD UNIQUE KEY `User_ID` (`User_ID`);

--
-- Indexes for table `review`
--
ALTER TABLE `review`
  ADD UNIQUE KEY `ID` (`ID`);

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
-- AUTO_INCREMENT for table `bank_account`
--
ALTER TABLE `bank_account`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `manager_refund`
--
ALTER TABLE `manager_refund`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `User_ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `review`
--
ALTER TABLE `review`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
