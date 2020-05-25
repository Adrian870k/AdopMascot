CREATE DATABASE  IF NOT EXISTS `soulmate` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `soulmate`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: soulmate
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `mascota`
--

DROP TABLE IF EXISTS `mascota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mascota` (
  `idMascota` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `id_especie` varchar(45) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  `foto` varchar(200) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `vacuna` varchar(45) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `id_persona` int NOT NULL,
  PRIMARY KEY (`idMascota`),
  UNIQUE KEY `idMascota_UNIQUE` (`idMascota`)
) ENGINE=InnoDB AUTO_INCREMENT=179 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mascota`
--

LOCK TABLES `mascota` WRITE;
/*!40000 ALTER TABLE `mascota` DISABLE KEYS */;
INSERT INTO `mascota` VALUES (165,'Rogger','2',3,'NV200509221853.png','es muy activo','algunas',30076534,'juan@juan',13),(166,'Doggi','1',1,'NV200509222237.png','es tierno','todas',13511105,'pablo@correo',13),(167,'Pacho','1',3,'NV200510081930.png','es muy divertido','algunas',3008,'carlos@correo',10),(168,'Samanta','2',3,'NV200510082421.png','es grande','todas',30076534,'eider@correo',10),(169,'Paco','1',4,'NV200510082908.45','es tierno','algunas',30076534,'pablo@correo',10),(170,'Jhon','2',3,'NV200510083107.png','es grande','todas',3008,'juan@juan',10),(171,'Cat','2',3,'NV200510083329.jpeg','es tierno','algunas',30076534,'carlos@correo',10),(172,'carlos','2',3,'NV200510083937.jpeg','es muy activo','todas',30076534,'juan@juan',10),(173,'pablo','1',18,'NV200510084250.png','es muy divertido','algunas',23,'pan@correo',10),(174,'carlos','1',18,'NV200510084346.png','feroz','todas',12312,'juan@juan',10),(175,'beto','2',2,'NV200510084738.jpg','Es una mascota muy adorable','Todas',1111,'juan@juan',10),(176,'beto','2',2,'NV200510085331.jpg','Es una mascota muy adorable','Todas',1111,'juan@juan',10),(177,'beto','2',2,'NV200510085520.jpg','Es una mascota muy adorable','Todas',1111,'juan@juan',10),(178,'beto','2',2,'NV200510085613.jpg','Es una mascota muy adorable','Todas',1111,'juan@juan',10);
/*!40000 ALTER TABLE `mascota` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-25  9:04:12
