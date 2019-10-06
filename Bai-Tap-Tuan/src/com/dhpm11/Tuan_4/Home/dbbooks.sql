-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 06, 2019 at 03:08 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbbooks`
--

-- --------------------------------------------------------

--
-- Table structure for table `booksuppliers`
--

CREATE TABLE `booksuppliers` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Books` tinyint(1) NOT NULL,
  `NewsPapers` tinyint(1) NOT NULL,
  `JournalsandMagazines` tinyint(1) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `ContactNo` varchar(255) NOT NULL,
  `EmailID` varchar(255) NOT NULL,
  `Remarks` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `booksuppliers`
--

INSERT INTO `booksuppliers` (`ID`, `Name`, `Books`, `NewsPapers`, `JournalsandMagazines`, `Address`, `ContactNo`, `EmailID`, `Remarks`) VALUES
(1, 'tên của con số 1', 0, 1, 0, 'quận 16', 'liên quan', 'khongcoemail@gmail.com', 'tào lao có thể lầy nha'),
(2, 'tên của 2', 0, 0, 1, 'quận 5 cập nhật nè', 'không có', 'email@gmail.com', 'có email rồi kìa'),
(3, 'không có tên', 1, 1, 0, 'quận 5', 'không có', 'email@gmail.com', 'cái gì đây');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booksuppliers`
--
ALTER TABLE `booksuppliers`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booksuppliers`
--
ALTER TABLE `booksuppliers`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
