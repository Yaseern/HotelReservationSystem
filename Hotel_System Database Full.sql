-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2016 at 07:53 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hotelsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `customerId` char(5) NOT NULL DEFAULT '',
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  `gender` char(6) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(50) DEFAULT NULL,
  `NIC` char(10) NOT NULL,
  `phone` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`customerId`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `NIC` (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerId`, `firstName`, `lastName`, `age`, `status`, `gender`, `address`, `city`, `NIC`, `phone`, `email`) VALUES
('CS001', 'Karthik ', 'Raguvaran', 24, 'Single', 'Male', 'No, 11/d, Peradeniya Road, Kandy', 'Kandy', '852433223V', 771234567, 'Karthik12@gmail.com'),
('CS002', 'Susil', 'Jayarathne', 30, 'Married', 'Male', 'No,12/BC, Main Road, Sammanthura', 'Baticola', '852321133V', 712324234, 'susiljaya@gmail.com'),
('CS003', 'Huge', 'Jackman', 34, 'Married', 'Male', 'Katugasthota', 'Kandy', '803454522V', 773453345, 'huge.jack@gmail.com'),
('CS004', 'NIthusan', 'Francis', 22, 'Single', 'Male', 'Katugasthota', 'Kandy', '942324345V', 777442213, 'nithusan.fran@gmail.com'),
('CS005', 'abc', 'asss', 32, 'Married', 'Female', 'Colombo', '', '802324422V', 777224332, 'abvxcc@gmail.com'),
('CS006', 'abss', 'ssd', 29, 'Married', 'Female', 'Gampola', '', '883232222V', 775343455, 'abc@hotmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `eid` char(5) NOT NULL DEFAULT '',
  `eName` varchar(50) NOT NULL,
  `NIC` char(10) NOT NULL,
  `designation` varchar(30) NOT NULL,
  `bDay` int(11) NOT NULL,
  `bMonth` int(11) NOT NULL,
  `bYear` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`eid`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`eid`, `eName`, `NIC`, `designation`, `bDay`, `bMonth`, `bYear`, `email`, `address`, `phone`, `username`, `password`) VALUES
('HR0M1', 'Sajith Perera', '803222436V', 'Manager', 3, 5, 1980, 'sajith.p@hotmail.com', 'NO.12/B7, Kalubowila Road, Dehiwala', 772345121, 'sajith', 'hh'),
('HR0M2', 'Sundar Subramaniyam', '852111443V', 'Manager', 7, 8, 1985, 'sundarsubram@hotmail.com', 'sundar', 773243234, 'sundar', '@3c61486'),
('HR0R3', 'John Kane', '893234245V', 'Receptionist', 6, 4, 1989, 'johnrock@recep.com', 'john', 713343443, 'john', 'C@48f458d9'),
('HR1A3', 'Yaseer', '954345667V', 'Admin', 4, 8, 1995, 'yaseermohamed@gmail.com', 'yaseer', 773822333, 'yaseer', 'abc'),
('HR2R1', 'Dhivyaa S', '893224488V', 'Receptionist', 25, 10, 1989, 'dhivyaa232@gmail.com', 'NO.111, Peradeniya Road, Kandy', 772233123, 'dhivya', 'abc@');

-- --------------------------------------------------------

--
-- Table structure for table `reserve`
--

CREATE TABLE IF NOT EXISTS `reserve` (
  `RESERVATION_NUMBER` int(11) NOT NULL AUTO_INCREMENT,
  `CUSTOMER_ID` char(5) NOT NULL DEFAULT '',
  `CHECKIN_DATE` date NOT NULL,
  `CHECKOUT_DATE` date NOT NULL,
  `ROOM_TYPE` varchar(20) NOT NULL,
  `ROOM_ID` char(4) NOT NULL,
  `PRICE_PER_DAY` double NOT NULL DEFAULT '13000',
  `TOTAL_BILL` double NOT NULL,
  `status` varchar(10) NOT NULL DEFAULT 'free',
  PRIMARY KEY (`RESERVATION_NUMBER`),
  UNIQUE KEY `CUSTOMER_ID` (`CUSTOMER_ID`,`ROOM_ID`),
  UNIQUE KEY `RESERVATION_NUMBER` (`RESERVATION_NUMBER`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `reserve`
--

INSERT INTO `reserve` (`RESERVATION_NUMBER`, `CUSTOMER_ID`, `CHECKIN_DATE`, `CHECKOUT_DATE`, `ROOM_TYPE`, `ROOM_ID`, `PRICE_PER_DAY`, `TOTAL_BILL`, `status`) VALUES
(3, 'CS001', '2016-04-03', '2016-04-04', 'F2SU1', 'SU02', 15000, 30000, 'EXPIRED'),
(4, 'CS002', '2016-04-07', '2016-04-14', 'F4ST1', 'STA3', 8000, 64000, 'BOOKED'),
(5, 'CS003', '2016-04-15', '2016-04-18', 'F4ST2', 'STN1', 5000, 20000, 'BOOKED'),
(6, 'CS002', '2016-04-07', '2016-04-08', 'F5SI2', 'SA01', 3000, 6000, 'BOOKED'),
(8, 'CS004', '2016-04-07', '2016-04-09', 'F5SI2', 'SNA2', 1000, 3000, 'BOOKED'),
(10, 'CS002', '2016-04-07', '2016-04-09', 'F4TR2', 'TNA3', 3000, 9000, 'BOOKED'),
(11, 'CS005', '2016-03-07', '2016-03-09', 'F4TR2', 'TA02', 5000, 15000, 'EXPIRED'),
(12, 'CS006', '2016-03-14', '2016-03-14', 'F4TR1', 'TA04', 5000, 5000, 'EXPIRED'),
(13, 'CS006', '2016-04-28', '2016-04-30', 'F4ST1', 'STA3', 8000, 8000, 'BOOKED');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE IF NOT EXISTS `room` (
  `roomId` char(4) NOT NULL DEFAULT '',
  `roomNo` int(11) NOT NULL,
  `roomTypeId` char(5) DEFAULT NULL,
  `status` varchar(10) NOT NULL DEFAULT 'free',
  `checkinDate` date DEFAULT NULL,
  `checkoutDate` date NOT NULL,
  PRIMARY KEY (`roomId`),
  KEY `FK_room` (`roomTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomId`, `roomNo`, `roomTypeId`, `status`, `checkinDate`, `checkoutDate`) VALUES
('DA01', 1, 'F5DO1', 'booked', NULL, '0000-00-00'),
('DA02', 2, 'F5DO1', 'free', NULL, '0000-00-00'),
('DA03', 3, 'F5DO1', 'free', NULL, '0000-00-00'),
('DA04', 4, 'F5DO1', 'free', NULL, '0000-00-00'),
('DNA1', 1, 'F5DO2', 'free', NULL, '0000-00-00'),
('DNA2', 2, 'F5DO2', 'free', NULL, '0000-00-00'),
('DNA3', 3, 'F5DO2', 'free', NULL, '0000-00-00'),
('DNA4', 4, 'F5DO2', 'free', NULL, '0000-00-00'),
('LA01', 1, 'F3LA1', 'reserved', '2016-04-05', '0000-00-00'),
('LA02', 2, 'F3LA1', 'reserved', '2016-04-07', '0000-00-00'),
('LU01', 1, 'F1LU1', 'booked', NULL, '0000-00-00'),
('LU02', 2, 'F1LU1', 'reserved', '2016-04-01', '0000-00-00'),
('PE01', 1, 'F2PE1', 'booked', '2016-04-06', '0000-00-00'),
('PE02', 2, 'F2PE1', 'booked', '2016-04-21', '0000-00-00'),
('SA01', 1, 'F5SI1', 'reserved', '2016-04-14', '0000-00-00'),
('SA02', 2, 'F5SI1', 'free', NULL, '0000-00-00'),
('SA03', 3, 'F5SI1', 'free', NULL, '0000-00-00'),
('SA04', 4, 'F5SI1', 'free', NULL, '0000-00-00'),
('SA05', 5, 'F5SI1', 'free', NULL, '0000-00-00'),
('SA06', 6, 'F5SI1', 'free', NULL, '0000-00-00'),
('SNA1', 1, 'F5SI2', 'free', '2016-04-07', '0000-00-00'),
('SNA2', 2, 'F5SI2', 'reserved', '2016-04-07', '0000-00-00'),
('SNA3', 3, 'F5SI2', 'reserved', '2016-04-07', '0000-00-00'),
('SNA4', 4, 'F5SI2', 'free', '2016-04-08', '0000-00-00'),
('SNA5', 5, 'F5SI2', 'free', NULL, '0000-00-00'),
('SNA6', 6, 'F5SI2', 'free', NULL, '0000-00-00'),
('STA1', 1, 'F4ST1', 'reserved', '2016-04-07', '0000-00-00'),
('STA2', 2, 'F4ST1', 'reserved', '2016-04-06', '0000-00-00'),
('STA3', 3, 'F4ST1', 'BOOKED', '2016-04-28', '2016-04-30'),
('STN1', 1, 'F4ST2', 'BOOKED', '2016-04-15', '2016-04-22'),
('STN2', 2, 'F4ST2', 'reserved', '2016-04-07', '0000-00-00'),
('STN3', 3, 'F4ST2', 'reserved', '2016-04-07', '0000-00-00'),
('SU01', 1, 'F2SU1', 'reserved', '2016-04-01', '0000-00-00'),
('SU02', 2, 'F2SU1', 'BOOKED', '2016-04-03', '2016-04-14'),
('TA01', 1, 'F4TR1', 'reserved', '2016-04-07', '0000-00-00'),
('TA02', 2, 'F4TR1', 'reserved', '2016-04-15', '0000-00-00'),
('TA03', 3, 'F4TR1', 'reserved', '2016-04-14', '0000-00-00'),
('TA04', 4, 'F4TR1', 'free', '2016-04-14', '0000-00-00'),
('TNA1', 1, 'F4TR2', 'reserved', '2016-04-07', '0000-00-00'),
('TNA2', 2, 'F4TR2', 'free', '2016-04-07', '0000-00-00'),
('TNA3', 3, 'F4TR2', 'BOOKED', '2016-04-07', '2016-04-09'),
('TNA4', 4, 'F4TR2', 'free', NULL, '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `roomtype`
--

CREATE TABLE IF NOT EXISTS `roomtype` (
  `id` char(5) NOT NULL DEFAULT '',
  `rTypeName` varchar(20) NOT NULL,
  `PricePerDay` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `rTypeName` (`rTypeName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roomtype`
--

INSERT INTO `roomtype` (`id`, `rTypeName`, `PricePerDay`) VALUES
('F1LU1', 'Luxury', 25000),
('F2PE1', 'Pent', 18000),
('F2SU1', 'Suit', 15000),
('F3LA1', 'Lanai', 20000),
('F4ST1', 'Standard', 8000),
('F4ST2', 'Standard_Non_A/C', 6500),
('F4TR1', 'Trible_A/C', 5000),
('F4TR2', 'Trible_Non_A/C', 3000),
('F5DO1', 'Double_A/C', 4000),
('F5DO2', 'Double_Non_A/C', 2000),
('F5SI1', 'Single_A/C', 3000),
('F5SI2', 'Single_Non_A/C', 1000);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `FK_room` FOREIGN KEY (`roomTypeId`) REFERENCES `roomtype` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
