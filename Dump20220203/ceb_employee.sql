CREATE DATABASE  IF NOT EXISTS `ceb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ceb`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: ceb
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `user_epf_no` int NOT NULL,
  `name_with_initial` varchar(45) DEFAULT NULL,
  `unit` varchar(40) DEFAULT NULL,
  `designation` varchar(40) DEFAULT NULL,
  `grade` varchar(10) DEFAULT NULL,
  `unit_id` int DEFAULT NULL,
  `designation_id` int DEFAULT NULL,
  `grade_id` int DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `appointment_date` date DEFAULT NULL,
  `present_promoted_date` date DEFAULT NULL,
  PRIMARY KEY (`user_epf_no`),
  KEY `fk_employee` (`grade_id`),
  KEY `fk_employee1` (`designation_id`),
  KEY `fk_employee2` (`unit_id`),
  CONSTRAINT `fk_employee` FOREIGN KEY (`grade_id`) REFERENCES `gradereg` (`grade_id`),
  CONSTRAINT `fk_employee1` FOREIGN KEY (`designation_id`) REFERENCES `designationreg` (`designation_id`),
  CONSTRAINT `fk_employee2` FOREIGN KEY (`unit_id`) REFERENCES `unitreg` (`unit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (35555,'Y G S M Gunathilaka','CE ( Con ) CP – 1','Supply Assistant Officer','II',NULL,NULL,NULL,'2000-01-31','2019-12-12','2020-12-11'),(942780,'T.A.G.L.T. Arachchi','DGM ( CP – 1 ) Office','Human Resources Officer','II',NULL,NULL,NULL,'1994-10-04','2018-03-14','2020-01-01'),(960490,'M.M.I.A. Muruddeniya','CE ( Com ) CP – 1','I.T.O. Assistant / Officer','II',NULL,NULL,NULL,'1996-02-18','2018-01-01','2020-03-09');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-03 15:24:02
