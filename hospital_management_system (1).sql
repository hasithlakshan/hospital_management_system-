-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2018 at 06:14 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital management system`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `IndexNo` int(255) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `NICNo` varchar(10) NOT NULL,
  `DateOfBirth` varchar(20) NOT NULL,
  `Age` int(3) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `DoctorType` varchar(15) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Discription` mediumtext NOT NULL,
  `MBBSNo` varchar(30) NOT NULL,
  `DoctorID` varchar(30) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`IndexNo`, `FirstName`, `LastName`, `NICNo`, `DateOfBirth`, `Age`, `ContactNo`, `Gender`, `DoctorType`, `Address`, `Discription`, `MBBSNo`, `DoctorID`, `Password`) VALUES
(6, 'sisira', 'jayawardana', '950422025v', '1995.02.30', 24, '0712345244', 'Male', 'Specialists', '\nnone\n\n', '\nnone\n\n', 'MBBS0001', 'DC0001', '950422025v'),
(7, 'tharidu', 'rukshan', '954033274V', '1993.03.23', 23, '0716342844', 'Male', 'Consultant', 'none\n\n\n', '\nnone\n\n', 'MBBS0002', 'DC0002', '954033274V'),
(8, 'sumeda', 'dissanayaka', '95034234v', '1993.02.23', 24, '0716348566', 'Male', 'Consultant', '\nnone\n\n', '\nnone\n\n', 'MBBS0003', 'DC0003', '95034234v');

-- --------------------------------------------------------

--
-- Table structure for table `maintainstaff`
--

CREATE TABLE `maintainstaff` (
  `IndexNo` int(255) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `NICNo` varchar(10) NOT NULL,
  `DateOfBirth` varchar(30) NOT NULL,
  `Age` int(3) NOT NULL,
  `ContactNo` varchar(30) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Discription` varchar(255) NOT NULL,
  `RegNO` varchar(30) NOT NULL,
  `MaintainID` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maintainstaff`
--

INSERT INTO `maintainstaff` (`IndexNo`, `FirstName`, `LastName`, `NICNo`, `DateOfBirth`, `Age`, `ContactNo`, `Gender`, `Address`, `Discription`, `RegNO`, `MaintainID`, `Password`) VALUES
(6, 'hasith', 'lakshan', '950422025v', '1995.02.11', 22, '0711939567', 'Male', '\nnone\n\n', '\nnone\n\n', 'MR0001', 'MS0001', '950422025v'),
(7, 'kasun', 'darmawardana', '950344562v', '1995.03.23', 23, '0723456762', 'Male', '\nnone\n\n', '\nnone\n\n', 'MR0002', 'MS0002', '950344562v'),
(8, 'pramod', 'dissanayaka', '940234253v', '1995.03.23', 23, '0715237456', 'Male', '\nnone\n\n', '\nnone\n\n', 'MR0003', 'MS0003', '940234253v');

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `IndexNo` int(255) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `NICNo` varchar(10) NOT NULL,
  `DateOfBirth` varchar(30) NOT NULL,
  `Age` int(3) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Discription` varchar(255) NOT NULL,
  `RegNo` varchar(30) NOT NULL,
  `NurseID` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`IndexNo`, `FirstName`, `LastName`, `NICNo`, `DateOfBirth`, `Age`, `ContactNo`, `Gender`, `Address`, `Discription`, `RegNo`, `NurseID`, `Password`) VALUES
(4, 'sadali', 'sadali', '950433245v', '1995.03.31', 23, '0713245677', 'Male', '\nnone\n\n', '\nnone\n\n', 'NR0001', 'NS0001', '950433245v'),
(5, 'kasun', 'krishantha', '950433274v', '1993.02.12', 23, '0715273654', 'Male', '\nnone\n\n', '\nnone\n\n', 'NR0002', 'NS0002', '950433274v'),
(6, 'amila', 'kirthi', '950722635v', '1995.03.23', 22, '0715374566', 'Male', '\nnone\n\n', 'none\n\n\n', 'NR0003', 'NS0003', '950722635v');

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `IndexNo` int(255) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `NICNo` varchar(10) NOT NULL,
  `DateOfBirth` varchar(20) NOT NULL,
  `Age` int(3) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `BloodGroup` varchar(3) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Discription` varchar(255) NOT NULL,
  `GuardianName` varchar(100) NOT NULL,
  `GContactNo` varchar(20) NOT NULL,
  `WardNO` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`IndexNo`, `FirstName`, `LastName`, `NICNo`, `DateOfBirth`, `Age`, `ContactNo`, `Gender`, `BloodGroup`, `Address`, `Discription`, `GuardianName`, `GContactNo`, `WardNO`) VALUES
(10, 'hasith', 'lakshan', '950422025v', '1995.02.11', 22, '0711939567', 'Male', 'A+', '\nnone\n\n', '\nnone\n\n', 'hasith', '0711939568', '1'),
(11, 'kavinda', 'gunasekara', '950422026v', '1995.02.12', 22, '0715238466', 'Male', 'A+', '\nnone\n\n', '\nnone\n\n', 'kavinda', '0715238466', '2'),
(12, 'anjana', 'sivan', '950422027v', '1995.02.13', 22, '0711939564', 'Male', 'A+', '\nnone\n\n', 'none\n\n\n', 'anjana', '07152384567', '2'),
(13, 'amila', 'kirthi', '950366983v', '1995.0312', 21, '0715237344', 'Male', 'A+', '\nnone\n\n', '\nnone\n\n', 'hasith', '0715234756', '2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`IndexNo`),
  ADD UNIQUE KEY `NICNo` (`NICNo`);

--
-- Indexes for table `maintainstaff`
--
ALTER TABLE `maintainstaff`
  ADD PRIMARY KEY (`IndexNo`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`IndexNo`);

--
-- Indexes for table `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`IndexNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `IndexNo` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `maintainstaff`
--
ALTER TABLE `maintainstaff`
  MODIFY `IndexNo` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `nurse`
--
ALTER TABLE `nurse`
  MODIFY `IndexNo` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `patients`
--
ALTER TABLE `patients`
  MODIFY `IndexNo` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
