-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 14, 2024 at 01:30 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Admin_id` int(11) NOT NULL,
  `Admin_First_Name` varchar(255) NOT NULL,
  `Admin_Last_Name` varchar(255) DEFAULT NULL,
  `Admin_Email` varchar(255) DEFAULT NULL,
  `Admin_Password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Admin_id`, `Admin_First_Name`, `Admin_Last_Name`, `Admin_Email`, `Admin_Password`) VALUES
(1, 'Admin', 'admin', 'admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `Attendance_id` int(11) NOT NULL,
  `Student_id` int(11) DEFAULT NULL,
  `Attendance_Date` date DEFAULT NULL,
  `Attendance_Subject` varchar(255) NOT NULL,
  `Attendance_Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`Attendance_id`, `Student_id`, `Attendance_Date`, `Attendance_Subject`, `Attendance_Status`) VALUES
(7, 1, '2024-12-10', 'Comp Prog 1', 'Absent '),
(9, 3, '2024-05-24', 'Data Structures', 'Absent ');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Student_id` int(11) NOT NULL,
  `Student_First_Name` varchar(255) NOT NULL,
  `Student_Last_Name` varchar(255) NOT NULL,
  `Student_Course` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Student_id`, `Student_First_Name`, `Student_Last_Name`, `Student_Course`) VALUES
(1, 'Keith', 'Peneda', 'BSCS'),
(2, 'Dabid', 'Wagan', 'BSCS'),
(3, 'jilo', 'Andam', 'BSCS');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `Name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`Name`) VALUES
('Comp Prog 1'),
('Data Structures'),
('OOP'),
('PE'),
('Solid Geometry');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `Teacher_id` int(11) NOT NULL,
  `Teacher_First_Name` varchar(255) NOT NULL,
  `Teacher_Last_Name` varchar(255) NOT NULL,
  `Teacher_Subject` varchar(255) DEFAULT NULL,
  `Teacher_Email` varchar(255) DEFAULT NULL,
  `Teacher_Password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`Teacher_id`, `Teacher_First_Name`, `Teacher_Last_Name`, `Teacher_Subject`, `Teacher_Email`, `Teacher_Password`) VALUES
(5, 'Juan', 'Pedro', 'Comp Prog 1', 'test', '12345'),
(6, 'tested', 'tested', 'Comp Prog 1', 'test 2', '23456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`Attendance_id`),
  ADD KEY `Student_id` (`Student_id`),
  ADD KEY `Attendance_Subject` (`Attendance_Subject`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Student_id`),
  ADD UNIQUE KEY `Student_Last_Name` (`Student_Last_Name`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`Teacher_id`),
  ADD KEY `Teacher_Subject` (`Teacher_Subject`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `Admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `Attendance_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `Student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `Teacher_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`Student_id`) REFERENCES `student` (`Student_id`),
  ADD CONSTRAINT `attendance_ibfk_2` FOREIGN KEY (`Attendance_Subject`) REFERENCES `subject` (`Name`);

--
-- Constraints for table `teacher`
--
ALTER TABLE `teacher`
  ADD CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`Teacher_Subject`) REFERENCES `subject` (`Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
