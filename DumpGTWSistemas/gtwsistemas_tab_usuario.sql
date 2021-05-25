-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: gtwsistemas
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `tab_usuario`
--

DROP TABLE IF EXISTS `tab_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tab_usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `rg` varchar(255) DEFAULT NULL,
  `celular` varchar(255) NOT NULL,
  `rua` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `cep` varchar(12) DEFAULT NULL,
  `ativo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_usuario`
--

LOCK TABLES `tab_usuario` WRITE;
/*!40000 ALTER TABLE `tab_usuario` DISABLE KEYS */;
INSERT INTO `tab_usuario` VALUES (1,'admin','123','guilherme','50.419.813-0','+55 11 9729-69403','avenida reneville','reneville','(11) 4708-4425','mairinque','sp','guibarrros@gmail.com','310','nenhuma','18120-000','1'),(2,'gui','123','joao','50.419.813-0','+55 11 9729-69513','jacare',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18120-000','1'),(3,'thiago','thiago','thiago','thiago','+55 (11) 9729-69403','thiago','thiago','thiago','thiago','thiago','thiago','thiago','thiago','thiago','1'),(4,'guizao','123','Guilherme Barros','50.419.813-0','+55 (11) 9729-69403','Rua augusta','Augusta','11 4708-4425','Sao paulo',' São Paulo - SP','guilherme@gmail.com','695','nenhuma','18135-631','0'),(5,'will','admin','willzao','','+55 (11) 9729-69403','','','','',' Acre - AC','','','','','0'),(6,'roberto','123','Roberto','50.419.813-0','+55 (11) 9729-69555','marechal','campolim','+55 (11) 4708-4425','de deus',' Acre - AC','roberto@gmail.com.br','310','roberto é mt legal mesmo','18123-655','1'),(7,'jean','123','jeanzinho','  .   .   - ','+55 (11) 9729-69403         ','','','+55 (  )     -    ','',' Acre - AC','','','','     -   ','1'),(8,'kauan','123','kauazins2','  .   .   - ','+55 (11) 9729-69403','','','+55 (  )     -    ','',' Acre - AC','','','','     -   ','0'),(9,'aaaaa','123','gui','  .   .   - ','+55 (44) 4444-44444','','','+55 (55) 5555-5555','',' Acre - AC','','','','     -   ','0'),(10,'admin2','123','adminzao','66.666.666-6','+55 (11) 1111-11111','','','+55 (55) 5555-5555','',' Ceará - CE','','','','     -   ','0'),(11,'roberto','123','Roberto','50.419.813-0','+55 (11) 9729-69555','marechal','campolim','+55 (11) 4708-4425','de deus',' Acre - AC','roberto@gmail.com.br','310','roberto é mt legal mesmo willzao','18123-655','1');
/*!40000 ALTER TABLE `tab_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-25  0:02:23
