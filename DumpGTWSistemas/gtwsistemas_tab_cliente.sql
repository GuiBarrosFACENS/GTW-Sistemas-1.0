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
-- Table structure for table `tab_cliente`
--

DROP TABLE IF EXISTS `tab_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tab_cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `contato` varchar(255) DEFAULT NULL,
  `nascimento` varchar(255) DEFAULT NULL,
  `data_entrada` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `cnpj` varchar(255) DEFAULT NULL,
  `rg` varchar(255) DEFAULT NULL,
  `celular` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `municipio` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `uf` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `orgaoEmissor` varchar(255) DEFAULT NULL,
  `fantasia` varchar(255) DEFAULT NULL,
  `wpp` varchar(255) DEFAULT NULL,
  `limiteCredito` varchar(255) DEFAULT NULL,
  `facebook` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `ativo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_cliente`
--

LOCK TABLES `tab_cliente` WRITE;
/*!40000 ALTER TABLE `tab_cliente` DISABLE KEYS */;
INSERT INTO `tab_cliente` VALUES (1,'CPFL INDUSTRIAS LTDA','rua sao jorde','sorocabaa','enegia','  /  /  ','20/05/20','   .   .   -  ','87.060.494/0001-77','  .   .   - ','+55 (11) 9111-11111','+55 (11) 1111-1111',NULL,NULL,'BRASIL',' Acre - AC','DOM AGUIAR',NULL,'CPFL ENERGIAS','+55 (  )     -     ','R$     .   .   ','','cpfl@gmail.com','','1'),(3,'CPFL','rua sao jorde','sorocaba','enegia',NULL,'20/05/2021',NULL,'87.060.494/0001-77',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1'),(4,'ASISTEC EXCLUIR','','','TECNICO','  /  /  ','20/05/21','   .   .   -  ','  .   .   /    -  ','  .   .   - ','+55 (  )     -     ','+55 (  )     -    ',NULL,NULL,'',' Acre - AC','',NULL,'ASISTYEC','+55 (  )     -     ','R$     .   .   ','','','','1');
/*!40000 ALTER TABLE `tab_cliente` ENABLE KEYS */;
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
