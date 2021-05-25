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
-- Table structure for table `tab_ordem_servico`
--

DROP TABLE IF EXISTS `tab_ordem_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tab_ordem_servico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao_servico` varchar(255) NOT NULL,
  `descricao_detalhada` varchar(255) NOT NULL,
  `responsavel` varchar(255) NOT NULL,
  `data_ordem` varchar(255) NOT NULL,
  `preco_servico` varchar(255) NOT NULL,
  `ativo` varchar(20) DEFAULT NULL,
  `id_emitente` int DEFAULT NULL,
  `id_usuario` int DEFAULT NULL,
  `id_cliente` int DEFAULT NULL,
  `id_produto` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_Emitente` (`id_emitente`),
  KEY `fk_Usuario` (`id_usuario`),
  KEY `fk_Cliente` (`id_cliente`),
  KEY `fk_` (`id_produto`),
  CONSTRAINT `fk_` FOREIGN KEY (`id_produto`) REFERENCES `tab_produto` (`id`),
  CONSTRAINT `fk_Cliente` FOREIGN KEY (`id_cliente`) REFERENCES `tab_cliente` (`id`),
  CONSTRAINT `fk_Emitente` FOREIGN KEY (`id_emitente`) REFERENCES `tab_emitente` (`id`),
  CONSTRAINT `fk_Usuario` FOREIGN KEY (`id_usuario`) REFERENCES `tab_usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_ordem_servico`
--

LOCK TABLES `tab_ordem_servico` WRITE;
/*!40000 ALTER TABLE `tab_ordem_servico` DISABLE KEYS */;
INSERT INTO `tab_ordem_servico` VALUES (1,'Troca de tela','Troca de tela e display','tecnico guilherme','23/05/2021','R$ 250.00','1',1,1,1,1),(2,'Troca de tela','testando o salvamento','guilherme','24/05/21','R$ 250.000','1',1,1,1,1),(3,'Troca de pelicula','apenas troca simples','guilherme','24/05/21','R$ 250.000','1',1,2,1,1),(4,'troca de conector','conector do celular galaxy s21','jose','24/05/21','R$ 250.000','1',1,3,3,3);
/*!40000 ALTER TABLE `tab_ordem_servico` ENABLE KEYS */;
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
