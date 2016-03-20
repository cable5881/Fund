/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.24-log : Database - fund
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fund` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fund`;

/*Table structure for table `benificiary_unit` */

DROP TABLE IF EXISTS `benificiary_unit`;

CREATE TABLE `benificiary_unit` (
  `BUnit_Id` int(11) NOT NULL AUTO_INCREMENT,
  `BUnit_Name` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`BUnit_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `benificiary_unit` */

insert  into `benificiary_unit`(`BUnit_Id`,`BUnit_Name`,`State`) values (1,'管理学院',1),(2,'计算机科学与技术学院',1),(3,'文法学院',1),(4,'自动化学院',1),(5,'机电工程学院',1),(6,'汽车工程学院',1),(7,'航运学院',1),(8,'理学院',1),(9,'信息工程学院',1),(10,'材料科学与工程学院',1),(11,'交通学院',1),(12,'能源与动力工程学院',1),(13,'土木工程与建筑学院',1),(14,'资源与环境工程学院',1),(15,'物流工程学院',1),(16,'化学化工与生命科学学院',1),(17,'经济学院',1),(18,'艺术与设计学院',1),(19,'外国语学院',1),(20,'政治与行政学院',1),(21,'马克思主义学院',1),(22,'国际教育学院',1),(23,'体育部',1),(24,'网络教育学院',1),(25,'职业技术学院',1),(26,'其他',1);

/*Table structure for table `benificiarycontact` */

DROP TABLE IF EXISTS `benificiarycontact`;

CREATE TABLE `benificiarycontact` (
  `BenificiaryContact_Id` int(11) NOT NULL AUTO_INCREMENT,
  `BC_Name` varchar(50) DEFAULT NULL,
  `OfficePhone` varchar(15) DEFAULT NULL,
  `MobilePhone` varchar(15) DEFAULT NULL,
  `Fax` varchar(15) DEFAULT NULL,
  `BC_Email` varchar(50) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`BenificiaryContact_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=133 DEFAULT CHARSET=utf8;

/*Data for the table `benificiarycontact` */

insert  into `benificiarycontact`(`BenificiaryContact_Id`,`BC_Name`,`OfficePhone`,`MobilePhone`,`Fax`,`BC_Email`,`Notes`,`State`) values (49,'','','','','',NULL,1),(50,'周润发','5534543','123456','5435345','123456@qq.com',NULL,1),(56,'葛嘉辉','5534543','53453453','123456','53454@ww.com',NULL,1),(57,'黄文','8888888888','88888888888','88888888888','8888888888888',NULL,1),(58,'梁朝伟','5534543','13556789345','5435345','53454@ww.com',NULL,1),(65,'周润发','','13556789345','','53454@ww.com',NULL,1),(66,'罗琛','','13026194611','','1302619461@qq.com',NULL,1),(67,'小明','','13026194611','','13026194611@sina.com',NULL,1),(68,'杨坤','','13026194611','','13026194611@sina.com',NULL,1),(69,'汪老师','','13026194611','','44@qq.com',NULL,1),(70,'汪老师','','13026194611','','44@qq.com',NULL,1),(71,'汪老师','','13026194611','','44@qq.com',NULL,1),(79,'李奇波','','13026194611','','44@qq.com',NULL,1),(80,'李奇波','','13026194611','','412@qq.com',NULL,1),(81,'李奇波','','13026194611','','412@qq.com',NULL,1),(82,'汪老师','','13026194611','','44@qq.com',NULL,1),(83,'奥尼尔','','13026194611','','44@qq.com',NULL,1),(84,'汪老师','','13026194611','','44@qq.com',NULL,1),(85,'汪老师','',NULL,'',NULL,NULL,1),(86,'汪老师','',NULL,'',NULL,NULL,1),(88,'李奇波','',NULL,'',NULL,NULL,1),(89,'汪老师','',NULL,'',NULL,NULL,1),(90,'李奇波','',NULL,'',NULL,NULL,1),(91,'汪老师','','13026194611','',NULL,NULL,1),(92,'汪老师','','13026194611','','44@qq.com',NULL,1),(93,'李奇波','','13026194611','','44@qq.com',NULL,1),(94,'汪老师','','13026194611','','44@qq.com',NULL,1),(95,'奥尼尔','28635881','13026194611','28635881','412@qq.com',NULL,1),(96,'汪老师','21312','3123123','312312','31231231232',NULL,1),(97,'李奇波','23213','123123','213123','12312312312',NULL,1),(98,'李奇波','23213','123123','213123','12312312312',NULL,1),(99,'李奇波','2132132','312312','1312312','312312312',NULL,1),(100,'言承旭','0755-28635881','13026194611','0755-28636881','44@qq.com',NULL,1),(101,'泰勒斯威夫特3','0987-12345678','13026194611','0987-12345678','412@qq.com',NULL,1),(102,'李奇波','日3543','13026194611','543543534','44@qq.com',NULL,1),(103,'李奇波','','13026194611','','44@qq.com',NULL,1),(104,'汪老师','','13026194611','','44@qq.com',NULL,1),(105,'李奇波','','13026194611','','44@qq.com',NULL,1),(106,'黄俊郎','',NULL,'',NULL,NULL,1),(107,'班尼路','','','','',NULL,1),(108,'葛嘉辉','',NULL,'',NULL,NULL,1),(109,'葛嘉辉','','13026194611','','44@qq.com',NULL,1),(110,'李奇波','','13026194611','','44@qq.com',NULL,1),(111,'奥尼尔','','13026194611','','44@qq.com',NULL,1),(112,'汪老师','123123','13026194611','213213213123123','44@qq.com',NULL,1),(113,'汪老师','','13026194611','','44@qq.com',NULL,1),(114,'嗨嗨嗨','','13026194611','','44@qq.com',NULL,1),(115,'李奇波','','13026194611','','44@qq.com',NULL,1),(116,'李奇波','','13026194611','','44@qq.com',NULL,1),(117,'李奇波','','13026194611','','44@qq.com',NULL,1),(118,'汪老师','','13026194611','','44@qq.com',NULL,1),(119,'周杰伦','','13026194611','','13026194611@qq.com',NULL,1),(120,'姜磊','','13026194611','','13026194611@qq.com',NULL,1),(121,'李奇波','','13026194611','','13026194611@qq.com',NULL,1),(122,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(123,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(124,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(125,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(126,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(127,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(128,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(129,'dfdsfds','','13798343081','','13798343081@qq.com',NULL,1),(130,'dfsdfd','','13502878373','','13502878373@qq.com',NULL,1),(131,'dfds','','13502878373','','13502878373@qq.com',NULL,1),(132,'dsfds','','13502878373','','13502878373@qq.com',NULL,1);

/*Table structure for table `bonusnotice` */

DROP TABLE IF EXISTS `bonusnotice`;

CREATE TABLE `bonusnotice` (
  `BonusNotice_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Project_Id` int(11) DEFAULT NULL,
  `Start_Date` timestamp NULL DEFAULT NULL,
  `End_Date` timestamp NULL DEFAULT NULL,
  `Judge_Way` tinyint(4) DEFAULT '1',
  `Judge_State` tinyint(4) DEFAULT '-1',
  `State` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`BonusNotice_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `bonusnotice` */

insert  into `bonusnotice`(`BonusNotice_Id`,`Project_Id`,`Start_Date`,`End_Date`,`Judge_Way`,`Judge_State`,`State`) values (1,44,'2015-08-28 14:57:36',NULL,1,0,1),(2,43,'2015-08-27 15:52:20',NULL,1,1,1),(3,41,'2015-08-29 21:25:06','2015-08-29 21:38:02',1,1,1),(5,53,'2015-09-09 11:08:43','2015-09-11 07:01:17',1,2,1),(6,55,'2015-09-11 07:03:20','2015-09-11 07:03:50',NULL,2,NULL),(7,56,'2015-09-11 10:20:41',NULL,1,1,1),(8,54,'2015-10-16 08:36:57','2015-10-16 08:41:52',1,2,1),(9,54,'2015-10-16 08:54:34',NULL,1,1,1),(10,54,'2015-10-16 08:56:34','2015-10-16 08:56:51',NULL,2,NULL),(11,54,'2015-10-16 08:57:57',NULL,1,1,1),(12,54,'2015-10-16 09:01:18',NULL,1,1,1),(13,54,'2015-10-16 09:02:54','2015-10-16 09:03:20',NULL,2,NULL),(14,54,'2015-10-16 09:04:51',NULL,1,1,1),(15,54,'2015-10-16 09:07:41',NULL,1,1,1),(16,54,'2015-10-16 09:08:25','2015-10-16 09:09:12',1,2,1),(17,54,'2015-10-16 09:10:32','2015-10-16 09:37:34',1,2,1),(18,54,'2015-10-16 09:37:42','2015-10-16 09:39:42',1,2,1),(19,54,'2015-10-16 09:48:27','2015-10-16 09:48:54',1,2,1),(20,54,'2015-10-16 09:53:05','2015-10-23 14:35:15',1,2,1),(21,54,'2015-10-23 14:35:19','2015-10-23 14:35:22',1,2,1),(22,106,'2015-11-16 16:17:19','2015-11-16 16:17:27',1,2,1);

/*Table structure for table `currency_type` */

DROP TABLE IF EXISTS `currency_type`;

CREATE TABLE `currency_type` (
  `CurrencyType_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Currency_Name` varchar(50) DEFAULT NULL,
  `Symbol` varchar(10) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`CurrencyType_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `currency_type` */

insert  into `currency_type`(`CurrencyType_Id`,`Currency_Name`,`Symbol`,`State`) values (1,'人民币','CNY',1),(2,'美元','USD',1),(3,'日元','JPY',1),(4,'英镑','GBP',1),(5,'港币','HKD',1),(6,'欧元','EUR',1),(7,'台币','TWD ',1);

/*Table structure for table `donationcontact` */

DROP TABLE IF EXISTS `donationcontact`;

CREATE TABLE `donationcontact` (
  `DonationContact_Id` int(11) NOT NULL AUTO_INCREMENT,
  `DC_Name` varchar(50) DEFAULT NULL,
  `Job` varchar(50) DEFAULT NULL,
  `OfficePhone` varchar(15) DEFAULT NULL,
  `MobilePhone` varchar(15) DEFAULT NULL,
  `DC_Email` varchar(50) DEFAULT NULL,
  `Fax` varchar(15) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `Is_Alumni` tinyint(3) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`DonationContact_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=131 DEFAULT CHARSET=utf8;

/*Data for the table `donationcontact` */

insert  into `donationcontact`(`DonationContact_Id`,`DC_Name`,`Job`,`OfficePhone`,`MobilePhone`,`DC_Email`,`Fax`,`Notes`,`Is_Alumni`,`State`) values (47,'','','','','','',NULL,0,1),(48,'潘达辉','武当派掌门人','5643535','123456','123456@qq.com','123456',NULL,0,1),(54,'傻逼','武当派掌门人','123456','23423423','42342343@ee.com','1312',NULL,0,1),(55,'程杰','丐帮帮主','8888888888','13026194611','13026194611@qq.com','13026194611',NULL,0,1),(56,'李奇波','武当派掌门人','123456','13026194611','123456@qq.com','1312',NULL,0,1),(63,'潘达辉','','','13026194611','123456@qq.com','',NULL,0,1),(64,'小黄','','','13026194611','1302619461@sian.com','',NULL,0,1),(65,'小红','','','13026194611','13026194611@163.com','',NULL,0,1),(66,'小红','','','13026194612','13026194611@163.com','',NULL,0,1),(67,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(68,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(69,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(77,'麦迪','','','13026194611','4444@qq.com','',NULL,0,1),(78,'麦迪','','','13026194611','4444@qq.com','',NULL,0,1),(79,'麦迪','','','13026194611','4444@qq.com','',NULL,0,1),(80,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(81,'小奥尼尔','','','13026194611','4444@qq.com','',NULL,0,1),(82,'小奥尼尔','','','13026194611','ff@qq.com','',NULL,0,1),(83,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(84,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(86,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(87,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(88,'麦迪','','','13026194611','4444@qq.com','',NULL,0,1),(89,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(90,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(91,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(92,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(93,'小奥尼尔','傻逼','28635881','13026194611','ff@qq.com','23423423',NULL,0,1),(94,'小白','3123123','123123','123213123','12312312312','123123123',NULL,0,1),(95,'小白','3123123','12312312312','3123123','312312312','312312312',NULL,0,1),(96,'小白','3123123','12312312312','3123123','312312312','312312312',NULL,0,1),(97,'小奥尼尔','312321','321312','312321','3123123123','312312',NULL,0,1),(98,'大小S','逗比主持人','0744-29780456','13026194613','412222@qq.com','0744-29780456',NULL,0,1),(99,'日日Rihanna3','打酱油的角色','0987-1232133213','321321321321312','45555@ee.com','0987-1232133213',NULL,0,1),(100,'大奥尼尔','','','13026194611','ff@qq.com','',NULL,0,1),(101,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(102,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(103,'小奥尼尔','','','13026194611','ff@qq.com','',NULL,0,1),(104,'麦迪','','','13026194611','4444@qq.com','',NULL,0,1),(105,'珍妮花','','','13026194611','ff@qq.com','',NULL,0,1),(106,'黄伟','','','13026194611','ff@qq.com','',NULL,0,1),(107,'罗琛','','','13026194611','ff@qq.com','',NULL,0,1),(108,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(109,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(110,'小奥尼尔','第三方斯蒂芬都上升到','231221312','13026194611','ff@qq.com','43243242343',NULL,0,1),(111,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(112,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(113,'小奥尼尔','','','13026194611','ff@qq.com','',NULL,0,1),(114,'小白','','','13026194611','ff@qq.com','',NULL,0,1),(115,'麦迪','','','13026194611','ff@qq.com','',NULL,0,1),(116,'小红','','','13026194611','4444@qq.com','',NULL,0,1),(117,'小白','','','13026194611','13026194611@163.com','',NULL,0,1),(118,'盛文奇','','','13026194611','13026194611@qq.com','',NULL,0,1),(119,'周杰伦','','','13026194611','13026194611@qq.com','',NULL,0,1),(120,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(121,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(122,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(123,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(124,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(125,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(126,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(127,'dsadsadsa','','','13798343081','13798343081@qq.com','',NULL,0,1),(128,'dsfdsf','','','13502878373','13502878373@qq.com','',NULL,0,1),(129,'cdsdsfds','','','13502878373','13502878373@qq.com','',NULL,0,1),(130,'dfgdfg','','','13502878373','13502878373@qq.com','',NULL,0,1);

/*Table structure for table `donationmode` */

DROP TABLE IF EXISTS `donationmode`;

CREATE TABLE `donationmode` (
  `DonationMode_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Real_Estate` tinyint(3) DEFAULT '1',
  `Is_OneTime` tinyint(3) DEFAULT '1',
  `Amount` double DEFAULT '0',
  `CurrencyType_Id` int(11) DEFAULT '1',
  `Form` tinyint(3) DEFAULT '1',
  `Fund_Principal` varchar(50) DEFAULT NULL,
  `Execute_Time` timestamp NULL DEFAULT NULL,
  `Span` int(11) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`DonationMode_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=138 DEFAULT CHARSET=utf8;

/*Data for the table `donationmode` */

insert  into `donationmode`(`DonationMode_Id`,`Real_Estate`,`Is_OneTime`,`Amount`,`CurrencyType_Id`,`Form`,`Fund_Principal`,`Execute_Time`,`Span`,`State`) values (52,1,0,399996,NULL,1,NULL,'2015-08-25 00:00:00',6,1),(53,1,0,14399856,NULL,1,NULL,'2015-08-25 00:00:00',6,1),(59,1,0,2222222,NULL,1,NULL,'2015-08-27 00:00:00',7,1),(60,1,0,100000,NULL,2,NULL,'2015-08-31 00:00:00',5,1),(61,1,0,1000000,NULL,1,NULL,'2015-09-17 00:00:00',10,1),(68,1,0,2222222,NULL,1,NULL,'2015-08-30 00:00:00',8,1),(69,1,1,5000,NULL,1,NULL,'2015-09-09 00:00:00',0,1),(70,1,0,500000,NULL,1,NULL,'2015-09-26 00:00:00',5,1),(71,1,1,50000,NULL,1,NULL,'2015-09-10 00:00:00',0,1),(72,1,1,500000,NULL,1,NULL,'2015-09-11 00:00:00',6,1),(73,0,1,500000,NULL,1,NULL,'2015-10-12 00:00:00',0,1),(74,1,0,500000,NULL,1,NULL,'2015-10-12 00:00:00',5,1),(82,1,1,66666666,NULL,1,NULL,'2015-10-14 00:00:00',0,1),(83,1,1,66666666,NULL,1,NULL,'2015-10-14 00:00:00',0,1),(84,1,1,66666666,NULL,1,NULL,'2015-10-14 00:00:00',0,1),(85,1,1,66666666,NULL,1,NULL,'2015-10-14 00:00:00',0,1),(86,1,1,66666666,NULL,2,NULL,'2015-10-14 00:00:00',0,1),(87,1,1,66666666,NULL,1,NULL,'2015-10-14 00:00:00',0,1),(88,1,1,0,NULL,1,NULL,NULL,0,1),(89,1,1,0,NULL,1,NULL,NULL,0,1),(90,1,1,66666666,NULL,1,NULL,'2015-10-24 00:00:00',0,1),(91,1,1,66666666,NULL,1,NULL,'2015-10-24 00:00:00',0,1),(93,1,1,66666666,NULL,1,NULL,'2015-10-24 00:00:00',0,1),(94,1,1,66666666,NULL,1,NULL,'2015-10-24 00:00:00',0,1),(95,1,1,66666666,NULL,1,NULL,'2015-10-24 00:00:00',0,1),(96,1,1,66666666,NULL,1,NULL,'2015-10-24 00:00:00',0,1),(97,1,1,66666666,NULL,1,NULL,'2015-10-24 00:00:00',0,1),(98,1,1,66666666,NULL,1,NULL,'2015-10-25 00:00:00',0,1),(99,1,1,66666666,NULL,1,NULL,'2015-10-25 00:00:00',0,1),(100,1,1,123456,NULL,2,NULL,'2015-10-25 00:00:00',0,1),(101,1,1,2333333,NULL,1,NULL,'2015-10-25 00:00:00',0,1),(102,1,1,2333333,NULL,1,NULL,'2015-10-25 00:00:00',0,1),(103,1,1,2333333,NULL,1,NULL,'2015-10-25 00:00:00',0,1),(104,1,1,2333333,NULL,1,NULL,'2015-10-25 00:00:00',0,1),(105,0,0,1000000,NULL,3,NULL,'2015-10-30 00:00:00',5,1),(106,1,1,66666666,NULL,2,NULL,'2015-10-25 00:00:00',0,1),(107,1,0,555555,NULL,1,NULL,'2015-10-29 00:00:00',5,1),(108,1,0,4444444,NULL,1,NULL,'2015-10-25 00:00:00',5,1),(109,1,0,4444444,NULL,1,NULL,'2015-10-25 00:00:00',6,1),(110,1,1,66666666,NULL,2,NULL,'2015-10-25 00:00:00',0,1),(111,1,1,66666666,NULL,1,NULL,'2015-10-27 00:00:00',0,1),(112,1,0,1234567,NULL,3,NULL,'2015-10-29 00:00:00',4,1),(113,1,1,1000000,1,2,'李奇波','2015-11-29 00:00:00',0,1),(114,1,1,66666666,2,1,'李奇波','2015-10-31 00:00:00',0,1),(115,1,1,2333333,1,1,'凤飞飞','2015-10-29 00:00:00',0,1),(116,1,1,66666666,5,1,'烦烦烦','2015-10-29 00:00:00',0,1),(117,1,1,66666666,6,1,'烦烦烦','2015-10-29 00:00:00',0,1),(118,1,1,66666666,1,1,'辅导费','2015-10-29 00:00:00',0,1),(119,1,1,66666666,1,1,'霍华德','2015-10-29 00:00:00',0,1),(120,1,1,66666666,5,1,'过过过','2015-10-29 00:00:00',0,1),(121,1,1,66666666,1,1,'凤飞飞','2015-10-30 00:00:00',0,1),(122,1,1,66666666,1,1,'ggtgtg',NULL,0,1),(123,1,1,100000,1,1,'小明',NULL,0,1),(124,1,1,1000000,1,1,'小明',NULL,0,1),(125,1,1,100000,2,1,'汪老师',NULL,0,1),(126,1,1,100000,1,1,'柯创','2015-11-27 00:00:00',0,1),(127,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(128,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(129,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(130,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(131,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(132,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(133,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(134,1,1,500000,1,1,'dsfsdf','2015-11-22 00:00:00',0,1),(135,1,1,4000000,1,1,'dasdsa','2015-11-22 00:00:00',0,1),(136,1,1,450000,1,1,'dfdsf','2015-11-22 00:00:00',0,1),(137,1,1,345678,1,1,'sdfdsfd','2015-11-22 00:00:00',0,1);

/*Table structure for table `donationunit` */

DROP TABLE IF EXISTS `donationunit`;

CREATE TABLE `donationunit` (
  `DonationUnit_Id` int(11) NOT NULL AUTO_INCREMENT,
  `DU_Name` varchar(50) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Zip_Code` varchar(10) DEFAULT NULL,
  `OfficePhone` varchar(15) DEFAULT NULL,
  `MobilePhone` varchar(15) DEFAULT NULL,
  `WebsiteURL` varchar(100) DEFAULT NULL,
  `Fax` varchar(15) DEFAULT NULL,
  `DU_Email` varchar(50) DEFAULT NULL,
  `DonationContact_Id` int(11) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`DonationUnit_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `donationunit` */

insert  into `donationunit`(`DonationUnit_Id`,`DU_Name`,`Address`,`Zip_Code`,`OfficePhone`,`MobilePhone`,`WebsiteURL`,`Fax`,`DU_Email`,`DonationContact_Id`,`Notes`,`State`) values (1,'南湖热干面公司','南湖','32423432','435435','13023456789',NULL,'435435','23423423@ee.com',NULL,NULL,1),(2,'武汉周黑鸭公司','','518115','','13026194611',NULL,'','13026194611@qq.com',NULL,NULL,1),(3,'周杰伦单位','','518115','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(4,'周杰伦单位','','518115','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(5,'周杰伦单位','','5181155','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(6,'周杰伦单位','','518115','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(7,'周杰伦单位','','518115','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(8,'科比单位','','5181155','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(9,'科比单位','武汉理工大学','518115','28635881','13026194611',NULL,'28635881','ee@qq.com',NULL,NULL,1),(10,'321312312','312312312312','31232','1321321','12312312',NULL,'3213','312312312312312',NULL,NULL,1),(11,'科比单位','3123123123123','312312312','312312312','3123123123',NULL,'312312','31231231232',NULL,NULL,1),(12,'科比单位','3123123123123','312312312','312312312','3123123123',NULL,'312312','31231231232',NULL,NULL,1),(13,'科比单位','312312312','312312','3123','3123123',NULL,'12321','123123123',NULL,NULL,1),(14,'流星花园单位','那美克星球','618117','0755-28672991','13026194612',NULL,'0755-28672991','ee@qq.com',NULL,NULL,1),(15,'周杰伦单位','','518115','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(16,'信息管理协会','南湖食堂','518115','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(17,'华为公司','','518115','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(18,'杰威尔公司','','5181155','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(19,'周杰伦单位','','5181155','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(20,'周杰伦单位','是否撒是否山东省的','5181155','4324234','13026194611',NULL,'32423423','ee@qq.com',NULL,NULL,1),(21,'周杰伦单位','','','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(22,'经纬网单位','','','','13026194611',NULL,'','ee@qq.com',NULL,NULL,1),(23,'热干面单位','','','','13026194611',NULL,'','13026194611@si.com',NULL,NULL,1);

/*Table structure for table `donor` */

DROP TABLE IF EXISTS `donor`;

CREATE TABLE `donor` (
  `Donor_Id` int(11) NOT NULL AUTO_INCREMENT,
  `D_Name` varchar(50) DEFAULT NULL,
  `D_Sex` varchar(10) DEFAULT NULL,
  `D_Birthday` timestamp NULL DEFAULT NULL,
  `D_Unit` varchar(50) DEFAULT NULL,
  `D_Job` varchar(50) DEFAULT NULL,
  `Hobbits` varchar(50) DEFAULT NULL,
  `DegreeInfo` varchar(50) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `Is_Alumni` tinyint(3) DEFAULT '0',
  `MobilePhone` varchar(50) DEFAULT NULL,
  `D_Email` varchar(50) DEFAULT NULL,
  `DonationContact_Id` int(11) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`Donor_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;

/*Data for the table `donor` */

insert  into `donor`(`Donor_Id`,`D_Name`,`D_Sex`,`D_Birthday`,`D_Unit`,`D_Job`,`Hobbits`,`DegreeInfo`,`Notes`,`Is_Alumni`,`MobilePhone`,`D_Email`,`DonationContact_Id`,`State`) values (33,'',NULL,NULL,'','','','',NULL,0,NULL,NULL,NULL,1),(34,'陈一达','男','2015-08-19 00:00:00','汕头大学','无','','',NULL,0,NULL,NULL,NULL,1),(35,'陈一达','女','2015-08-19 00:00:00','汕头大学','无','','',NULL,0,NULL,NULL,NULL,1),(37,'柯创','男','2015-08-27 00:00:00','比基尼有限公司','','','',NULL,0,NULL,NULL,NULL,1),(38,'柯创','女','2015-08-27 00:00:00','比基尼有限公司','','','',NULL,0,NULL,NULL,NULL,1),(39,'黄伟','女','2015-08-31 00:00:00','比基尼有限公司','脱衣舞娘','射鸡','',NULL,1,NULL,NULL,NULL,1),(46,'陈一达','女','2015-08-18 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(47,'詹吉巴','男','2015-09-23 00:00:00','武汉鸡巴公司','刽子手','','',NULL,0,NULL,NULL,NULL,1),(48,'刘玉博','女','2015-09-16 00:00:00','','','','',NULL,1,NULL,NULL,NULL,1),(49,'刘玉博','女','2015-09-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(50,'刘玉博','女','2015-09-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(51,'刘玉博','女','2015-09-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(52,'刘玉博','女','2015-09-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(53,'小红','男','2015-09-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(54,'小红','女','2015-09-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(62,'李荣浩','女','2015-10-20 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(63,'李荣浩','女','2015-10-27 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(64,'李荣浩','女','2015-10-27 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(65,'李荣浩','男','2015-10-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(66,'李荣浩','男','2015-10-15 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(67,'李荣浩','女','2015-10-22 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(68,'李荣浩','男','2015-10-21 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(70,'李荣浩','男','2015-10-29 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(71,'李荣浩','男','2015-10-28 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(72,'李荣浩','男','2015-10-21 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(73,'李荣浩','女','2015-10-14 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(74,'李荣浩','女','2015-10-21 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(75,'李荣浩','男','2015-10-15 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(76,'李荣浩','女','2015-10-17 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(77,'阿呆','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(78,'阿呆','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(79,'阿呆','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(80,'阿呆2','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(81,'阿呆3','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(82,'李荣浩','女','2015-10-28 00:00:00','3424','423','4324234234','',NULL,0,NULL,NULL,NULL,1),(83,'阿呆3','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(84,'阿呆3','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(85,'阿呆3','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(86,'阿呆3','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(87,'阿呆3','女','2015-10-22 00:00:00','RollingStone','音乐制作人','称霸格莱美','格莱美音乐学院',NULL,1,NULL,NULL,NULL,1),(88,'李荣浩','女','2015-10-03 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(89,'李荣浩','女','2015-10-03 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(90,'李荣浩','女','2015-10-03 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(91,'李荣浩','女','2015-10-03 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(92,'李荣浩','女','2015-10-15 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(93,'李荣浩','女','2015-10-16 00:00:00','','','','',NULL,0,NULL,NULL,NULL,1),(94,'李荣浩','男','2015-10-29 00:00:00','','','','',NULL,0,'44455566','412777777777',NULL,1),(95,'李荣浩','男','2015-10-16 00:00:00','','','','',NULL,0,'','',NULL,1),(96,'李荣浩','女','2015-10-30 00:00:00','','','','',NULL,0,'','',NULL,1),(97,'李荣浩','男','2015-10-22 00:00:00','1231231231231232','3213123','','方法方法·',NULL,1,'21312312','4213',NULL,1),(98,'李荣浩','男','2015-10-29 00:00:00','','','','',NULL,0,'','',NULL,1),(99,'柯创','女',NULL,'','','','',NULL,0,'','',NULL,1),(100,'汪老师','女','2015-11-18 00:00:00','','','','',NULL,0,'','',NULL,1),(101,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(102,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(103,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(104,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(105,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(106,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(107,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(108,'dsfdsfd','男','2015-11-22 00:00:00','','','','',NULL,0,'','',NULL,1),(109,'afsdfds','男','2015-11-12 00:00:00','','','','',NULL,0,'','',NULL,1),(110,'sfdsfds','男','2015-11-27 00:00:00','','','','',NULL,0,'','',NULL,1),(111,'sfsdsd','男','2015-11-29 00:00:00','','','','',NULL,0,'','',NULL,1);

/*Table structure for table `files` */

DROP TABLE IF EXISTS `files`;

CREATE TABLE `files` (
  `File_Id` int(11) NOT NULL AUTO_INCREMENT,
  `File_Title` varchar(255) DEFAULT NULL,
  `Source` varchar(255) DEFAULT NULL,
  `FileType_Id` int(11) DEFAULT NULL,
  `Project_Id` int(11) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`File_Id`),
  KEY `FileType_Id` (`FileType_Id`),
  KEY `Project_Id` (`Project_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8;

/*Data for the table `files` */

insert  into `files`(`File_Id`,`File_Title`,`Source`,`FileType_Id`,`Project_Id`,`Notes`,`State`) values (51,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\2015091074634d3676804f4eac0250dae42f0f6f.doc',1,54,'捐赠协议',1),(63,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\20150910c56bf99c66244bb089db374ba38223df.doc',1,55,'捐赠协议',1),(64,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\201509103aa8909c81924c709b6a13af9cbb61d4.doc',1,55,'捐赠协议',1),(65,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\20150910fe4723bef8294ecf8dc9e37abdc7196f.doc',1,55,'捐赠协议',1),(66,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\201509101151b9cfe567496e9e502a5483ba083a.doc',1,55,'捐赠协议',1),(67,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\920150910afbc3c3506d64c2f863f85141f5ad660.docx',1,55,'',1),(68,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9201509106f301e545b3544c98f8cee9f223b69e7.docx',1,55,'',1),(69,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9201509102a2d421f0ef74f1eb831f855cbe571da.docx',1,55,'',1),(70,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9201509101e71488f0c8c4df7a3de144ef266be30.docx',1,55,'',1),(71,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\2015091044f4d4119e1e48a1a6381175857785a2.docx',1,55,'',1),(72,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\201509100af4b92a425c44c09634ef0b55f16412.docx',1,55,'',1),(73,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\20150911d19886d0c5264837aa987052dcc979b7.docx',1,53,'',1),(74,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\201509111ee999492e83482e90e7c10f4b528fa7.doc',1,56,'捐赠协议',1),(75,NULL,'G:\\Eclipse_Projects\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Fund\\WEB-INF\\temp\\2015\\9\\20150911803e94b37e754fa38d788312dcb5c586.docx',1,56,'',1),(76,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\9\\201509175246eeef07bf490ab06f1ccdf6be9bd3.doc',1,57,'捐赠协议',1),(77,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\9\\201509177d27b6bf2a7a4bada6a2b09ca966b95f.doc',1,58,'捐赠协议',1),(78,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151012de6e0facd4754fc1b90a6c93d492c3ba.doc',1,58,'捐赠协议',1),(79,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151012ea30f04301974efea2742194c71ef4b8.doc',1,58,'捐赠协议',1),(80,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151012007b1e5f1ba64ab1a23b7b7eb909fd91.doc',1,58,'捐赠协议',1),(81,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151014790d212cd4484927bf5f6976ace9e121.doc',1,66,'捐赠协议',1),(82,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151014032637c530ee4693a51e488c82d1b28c.doc',1,67,'捐赠协议',1),(83,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510141596c64c4a3c434194f68f5d94f06419.doc',1,68,'捐赠协议',1),(84,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510148a2a43bd55ea4daeb2476bf22d292a01.doc',1,69,'捐赠协议',1),(85,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510141e4ec90daea842b78bff55b2805f0edc.doc',1,70,'捐赠协议',1),(86,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\2015101436295911bd294b51801b4ebe15cee9f7.doc',1,71,'捐赠协议',1),(87,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025a2e25e2f5f1042e598989d94856719d0.doc',1,NULL,'立项表',1),(88,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510259dfc648bd7424ae49b30aebb7c557fc2.doc',1,NULL,'立项表',1),(89,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510255c5e9c84e9dd4cb386e08a62b5967f97.doc',1,NULL,'立项表',1),(90,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510257e59e1e7bf8f405ab374c9b6cf614796.doc',1,NULL,'立项表',1),(91,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025c4f8bc2664bc4790a7ef961e1720295d.doc',1,87,'立项表',1),(92,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510259a9220e746484c609037d422240092be.doc',1,87,'立项表',1),(93,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510253eeaecdd2993404496b056a9f5df6149.doc',1,87,'立项表',1),(94,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510254b61bfe2a98c4ff09023269deb5cc591.doc',1,87,'立项表',1),(95,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025e3a2261b018b4a539b88a13e2c22f27f.doc',1,87,'立项表',1),(96,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025780256ed4ada483db7aa9ac67dd1c4eb.doc',1,87,'立项表',1),(97,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\2015102564b3eaa9976448c6b773760b17d640d5.doc',1,87,'立项表',1),(98,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025ff59fe618d8f4d37989c59b3d488ae48.doc',1,NULL,'立项表',1),(99,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510257c01860f75f04a47ac48c3b76700d909.doc',1,89,'立项表',1),(100,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\2015102529c7ab213edc4f3885bbc096be07c3c8.doc',1,NULL,'立项表',1),(101,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025611a00f4f4f34dc29cee8c1b9ba6b192.doc',1,90,'立项表',1),(102,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025688c39bf08144fb1b9f20c2bb4e5e5f4.doc',1,90,'立项表',1),(103,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510253acea93dae344f608948c5c7c370b668.doc',1,90,'立项表',1),(104,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025326df9889a3a4552b0cf05282dc9244f.doc',1,90,'捐赠协议',1),(105,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151025184bd4f4bd1048568e52b628e6649ede.doc',1,86,'捐赠协议',1),(106,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510257f3235f57437471fa50f38472de6e821.doc',1,NULL,'立项表',1),(107,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\2015102558979e33d4164233a0c5a45a859aa5b1.doc',1,93,'捐赠协议',1),(108,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\2015102639b881b772e546e8afab8422d6925a10.doc',1,87,'捐赠协议',1),(109,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510266f037466e374463f99284b9b582ecb2b.doc',1,40,'捐赠协议',1),(110,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510265250b9d9823644f0b0934421a2fd5571.doc',1,52,'捐赠协议',1),(111,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\2015102649fd39fdf3664882a7e0dc344f3de523.doc',1,45,'捐赠协议',1),(112,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510273d08276c558d42a4836038c0f25c9158.doc',1,95,'立项表',1),(113,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151027ba466f1aea91409b87d6766736e4b863.doc',1,95,'捐赠协议',1),(114,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151027dd7b9f79ee754ede874ecfc9a4c2bbd1.doc',1,73,'捐赠协议',1),(115,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\2015102767df41e1f71840f89dbf36c2e1d709d7.doc',1,40,'捐赠协议',1),(116,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151028b817d64b4cbd41efadc192561ec8beb8.doc',1,43,'捐赠协议',1),(117,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510295e5b9cc3661a4406b261fc99f9c60476.doc',1,NULL,'立项表',1),(118,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510298992454369ad465dbf9abe3e39154c68.doc',1,NULL,'立项表',1),(119,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151029c8d0d385332e4609846c13bce1ba55b3.doc',1,NULL,'立项表',1),(120,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\201510299b0558c4633645d982d6283debce0ea9.doc',1,NULL,'立项表',1),(121,NULL,'H:\\apache-tomcat-8.0.24\\webapps\\Fund\\WEB-INF\\temp\\2015\\10\\20151029d1920a7bc7ac402598e896e792e6d6e0.doc',1,100,'捐赠协议',1),(122,NULL,'E:\\tempfiles\\2015\\10\\20151029515f2559f43f45b3a8d733db39a12c22.doc',1,NULL,'立项表',1),(123,NULL,'C:\\Fund\\temp\\2015\\10\\20151029e01e0aab0c10482f9e31fb3cd122a131.doc',1,NULL,'立项表',1),(124,NULL,'C:\\Fund\\temp\\2015\\10\\201510298e1c1e26b92342e19fdcdd77f0229c7c.doc',1,NULL,'立项表',1),(125,NULL,'C:\\Fund\\temp\\2015\\10\\201510298f5e66212da346ad96da92933934a599.doc',1,103,'捐赠协议',1),(126,NULL,'C:\\Fund\\temp\\2015\\10\\20151030d85d4bfe480845898e68ae71e525f4c8.doc',1,NULL,'立项表',1),(127,NULL,'C:\\Fund\\temp\\2015\\10\\20151030ab4d8fa0f1864e9ca74e85c3baf9a87c.doc',1,104,'捐赠协议',1),(128,NULL,'C:\\Fund\\temp\\2015\\11\\20151113ee3591a0a6334c2ab1d6833a2c70e580.doc',1,NULL,'立项表',1),(129,NULL,'C:\\Fund\\temp\\2015\\11\\20151113e94baac83a8b42c19dd9e5634a3e647d.doc',1,NULL,'立项表',1),(130,NULL,'C:\\Fund\\temp\\2015\\11\\20151116ffd7b32373db40a689874fe3d5468309.doc',1,NULL,'立项表',1),(131,NULL,'C:\\Fund\\temp\\2015\\11\\201511172ebabb6058c44cc59b95e7d553d07f48.doc',1,72,'捐赠协议',1),(132,NULL,'C:\\Fund\\temp\\2015\\11\\201511173cc62ec8a8634f86b2a73a1480a3184d.doc',1,NULL,'立项表',1),(133,NULL,'C:\\Fund\\temp\\2015\\11\\20151117c3dbe6128f484c46a4bf0020def09812.doc',1,NULL,'立项表',1),(134,NULL,'C:\\Fund\\temp\\2015\\11\\2015111743d8768cf0a64d54bf187f9315465159.doc',1,109,'捐赠协议',1),(135,NULL,'C:\\Fund\\temp\\2015\\11\\2015111770cc1f6c4f15439a977b7a7d9a2931a5.doc',1,41,'捐赠协议',1),(136,NULL,'C:\\Fund\\temp\\2015\\11\\20151122613574c2c8634b57b68606cec7a0e4c2.doc',1,NULL,'立项表',1);

/*Table structure for table `filetype` */

DROP TABLE IF EXISTS `filetype`;

CREATE TABLE `filetype` (
  `FileType_Id` int(11) NOT NULL AUTO_INCREMENT,
  `FileType_Name` varchar(50) DEFAULT NULL,
  `State` tinyint(3) NOT NULL DEFAULT '1',
  PRIMARY KEY (`FileType_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `filetype` */

insert  into `filetype`(`FileType_Id`,`FileType_Name`,`State`) values (1,'《捐赠仪式》电子版',1),(2,'奖（助）学金评审结果电子版',1),(3,'奖教金评审结果电子版',1),(4,'学生申请表',1),(5,'教师申请表',1),(6,'立项表',1),(7,'感谢信',1),(8,'其他',1);

/*Table structure for table `fundtype` */

DROP TABLE IF EXISTS `fundtype`;

CREATE TABLE `fundtype` (
  `FundType_Id` int(11) NOT NULL AUTO_INCREMENT,
  `ProjectType_Id` int(11) DEFAULT NULL,
  `Fund_Name` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`FundType_Id`),
  KEY `ProjectType_Id` (`ProjectType_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `fundtype` */

insert  into `fundtype`(`FundType_Id`,`ProjectType_Id`,`Fund_Name`,`State`) values (1,1,'奖学金',1),(2,1,'助学金',1),(3,1,'爱心援助基金',1),(4,1,'名师名导基金',1),(5,1,'创新实践基金',1),(6,1,'校园文化活动基金',1),(7,2,'奖教金',1),(8,2,'优秀辅导员培养基金',1),(9,2,'创业教育发展基金',1),(10,2,'科研、著作出版基金',1),(11,3,'老建筑修缮基金',1),(12,3,'新设施建设基金',1),(13,3,'图书基金',1),(14,4,'校友年度捐赠',1),(15,4,'毕业生“一卡通”在线捐赠',1),(16,4,'非限定用途的小额捐赠',1),(17,4,'非限定用途的大额捐赠',1),(18,5,'其他',1),(24,1,'444',0),(25,9,'fdsfsdfsd',0),(26,9,'sadsadasdasdas',1),(27,9,'dasdasdsa',1),(28,9,'r3r4334r34',1);

/*Table structure for table `inbill` */

DROP TABLE IF EXISTS `inbill`;

CREATE TABLE `inbill` (
  `InBill_Id` int(11) NOT NULL AUTO_INCREMENT,
  `MoneyCheck_Id` int(11) DEFAULT NULL,
  `Money_Num` varchar(50) DEFAULT NULL,
  `Payer` varchar(50) DEFAULT NULL,
  `Money_In` double DEFAULT '0',
  `Time_In` timestamp NULL DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`InBill_Id`),
  UNIQUE KEY `Money_Num` (`Money_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `inbill` */

insert  into `inbill`(`InBill_Id`,`MoneyCheck_Id`,`Money_Num`,`Payer`,`Money_In`,`Time_In`,`State`) values (5,43,'12321321','李奇波',1000,'2019-09-04 00:00:00',1),(6,43,'43534','李奇波',1000,'2019-09-04 00:00:00',1),(7,43,'6334634','李奇波',500,'2019-09-04 00:00:00',1),(8,43,'32423423','李奇波',6666666,'2019-09-07 00:00:00',1),(9,43,'547457645','李奇波',100000000,'2019-09-06 00:00:00',1),(15,100,'123-555666','热干面有限公司',3333,'2015-10-17 00:00:00',1),(16,100,'222-333444','佳姐公司',5555,'2015-10-22 00:00:00',1),(17,100,'333-888999','微软',100000000,'2015-10-22 00:00:00',1),(18,100,'444-222222','ggg',5,'2015-10-27 00:00:00',1),(19,108,'123-987555','jij',66666,'2015-10-20 00:00:00',1),(20,108,'222-332211','dsd',2222,'2015-10-27 00:00:00',0),(21,105,'123-556677','凤飞飞',3344,'2015-10-20 00:00:00',1),(22,105,'444-334455','Google',100000000,'2015-10-27 00:00:00',1),(23,108,'333-432421','jij',333,'2015-10-27 00:00:00',1),(24,108,'123-222111','凤飞飞',222,'2015-10-27 00:00:00',1),(26,108,'222-556677','犯人',33333,NULL,1),(27,109,'333-123456','范德萨范德萨',666777,NULL,1);

/*Table structure for table `iteminfo` */

DROP TABLE IF EXISTS `iteminfo`;

CREATE TABLE `iteminfo` (
  `ItemInfo_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Steps` int(11) DEFAULT '1',
  `Step_Amount` double DEFAULT NULL,
  `Total_Amount` double DEFAULT NULL,
  `ExecuteTime_Start` timestamp NULL DEFAULT NULL,
  `ExecuteTime_ENd` timestamp NULL DEFAULT NULL,
  `Arrival_Steps` int(11) DEFAULT '0',
  `Grant_Steps` int(11) DEFAULT '0',
  `Institute_Id` int(11) DEFAULT NULL,
  `Major_id` int(11) DEFAULT NULL,
  `People_Num` int(11) DEFAULT '0',
  `ScholarshipLevel_Id` int(11) DEFAULT NULL,
  `Level_PNum` int(11) DEFAULT '0',
  `Solo_Amount` double DEFAULT '0',
  `Judgement_Id` int(11) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `State` tinyint(3) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ItemInfo_Id`),
  KEY `Institute_Id` (`Institute_Id`),
  KEY `Major_id` (`Major_id`),
  KEY `ScholarshipLevel_Id` (`ScholarshipLevel_Id`),
  KEY `Judgement_Id` (`Judgement_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `iteminfo` */

insert  into `iteminfo`(`ItemInfo_Id`,`Steps`,`Step_Amount`,`Total_Amount`,`ExecuteTime_Start`,`ExecuteTime_ENd`,`Arrival_Steps`,`Grant_Steps`,`Institute_Id`,`Major_id`,`People_Num`,`ScholarshipLevel_Id`,`Level_PNum`,`Solo_Amount`,`Judgement_Id`,`Notes`,`State`) values (1,2,1000,2000,'2015-07-22 20:00:38','0000-00-00 00:00:00',0,0,1,1,20,NULL,NULL,NULL,NULL,NULL,1),(2,1,5000,5000,'2015-07-22 21:56:22','0000-00-00 00:00:00',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1),(3,3,3000,3000,'2015-07-22 21:57:40','0000-00-00 00:00:00',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1);

/*Table structure for table `judge` */

DROP TABLE IF EXISTS `judge`;

CREATE TABLE `judge` (
  `Judge_Id` int(11) NOT NULL,
  `Judge_Type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Judge_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `judge` */

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `Major_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Major_Name` varchar(50) DEFAULT NULL,
  `Insitute_Id` int(11) NOT NULL,
  `State` tinyint(3) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Major_Id`),
  KEY `Insitute_Id` (`Insitute_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `major` */

insert  into `major`(`Major_Id`,`Major_Name`,`Insitute_Id`,`State`) values (1,'信息管理与信息系统',1,1),(2,'财务管理',1,1),(3,'市场营销',1,1),(4,'工商管理',1,1),(5,'公共事业管理',1,1),(6,'会计',1,1),(7,'人力资源',1,1),(8,'test',1,1);

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `Message_Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_Id` int(11) NOT NULL,
  `Msg_Title` varchar(50) DEFAULT NULL,
  `Msg_Content` char(255) DEFAULT NULL,
  `Received_Time` timestamp NULL DEFAULT NULL,
  `File_Id` int(11) DEFAULT NULL,
  `Is_Readed` tinyint(3) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`Message_Id`),
  KEY `User_Id` (`User_Id`),
  KEY `File_Id` (`File_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

/*Data for the table `message` */

insert  into `message`(`Message_Id`,`User_Id`,`Msg_Title`,`Msg_Content`,`Received_Time`,`File_Id`,`Is_Readed`,`State`) values (1,2,'【教师发展项目】A公司科研出版基金审核不通过','<p>1.项目名：日你麻麻基金</p><p>2.合同编号：2233445566</p><p>3.立项日期：李荣浩</p><p>4.负责人：2015-10-26 10:52:34</p>','2015-10-26 20:05:03',NULL,0,1),(2,2,'【教师发展项目】B公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-26 20:11:07',NULL,1,0),(3,2,'【教师发展项目】C公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-26 20:10:27',NULL,1,0),(4,2,'【教师发展项目】D公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-26 20:10:15',NULL,1,1),(5,2,'【教师发展项目】E公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-26 20:06:30',NULL,1,0),(6,2,'【教师发展项目】F公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-26 20:06:50',NULL,1,0),(7,2,'【教师发展项目】G公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-26 20:05:59',NULL,1,1),(8,7,'【教师发展项目】H公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-26 20:05:13',NULL,0,1),(9,3,'亲爱的管理员你好！','欢迎你注册武汉理工大学基金会系统管理员！！！！','2015-10-26 20:05:10',NULL,1,1),(10,3,'【教师发展项目】B公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-08-26 23:18:34',NULL,0,1),(11,4,'密码修改成功','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-29 16:12:02',NULL,1,0),(12,5,'【学生培养项目】A公司XXX基金已到账','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-08-29 16:42:51',NULL,1,1),(13,6,'【学生培养项目】A公司XXX基金已到账','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-08-26 23:18:36',NULL,0,1),(14,7,'【教师发展项目】B公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-22 20:04:06',NULL,1,1),(15,7,'【教师发展项目】B公司科研出版基金审核不通过','美女，一般解释为容貌美丽的女子。中国古代关于美女的形容词和诗词歌赋众多，形成了丰富的美学资料。她们大都穿任何衣服都很漂亮，代表人物：章子怡。这种女孩子似乎随处可见，很容易接近。她很像你我家隔壁住的小妹，与你青梅竹马的长大那种。单纯得让你连一点歪念都不敢有，如果你喜欢，就要拿一生来哄的小女生。','2015-10-22 20:04:04',NULL,1,1),(16,3,'鎮ㄦ湁涓�涓柊鐨勭珛椤光�渰0}鈥濆鏍告垚鍔燂紒','<p>1.椤圭洰鍚嶏細格莱美奖学金</p><p>2.鍚堝悓缂栧彿锛歿1}</p><p>3.绔嬮」鏃ユ湡锛歿2}</p><p>4.璐熻矗浜猴細2015-10-25</p>','2015-10-26 18:15:46',NULL,0,1),(17,2,'您有一个新的立项“深圳下午茶基金”审核成功！','<p>1.项目名：深圳下午茶基金</p><p>2.合同编号：123333333</p><p>3.立项日期：易建联</p><p>4.负责人：2015-08-29</p>','2015-10-26 20:04:42',NULL,0,1),(18,2,'您有一个新的立项“热干面基金”审核成功！','<p>1.项目名：热干面基金</p><p>2.合同编号：123122</p><p>3.立项日期：易建联</p><p>4.负责人：2015-10-14</p>','2015-10-26 20:04:40',NULL,0,1),(19,2,'您有一个新的立项“热干面基金”审核失败！','<p>1.项目名：热干面基金</p><p>2.合同编号：fd9093b96f984f87bccd37be53405e14</p><p>3.立项日期：2015-08-30</p><p>4.负责人：任贤齐</p>','2015-10-26 20:04:39',NULL,0,1),(20,2,'您有一个新的立项“深圳下午茶基金”审核失败！','<p>1.项目名：深圳下午茶基金</p><p>2.合同编号：777888999</p><p>3.立项日期：2015-08-29</p><p>4.负责人：易建联</p>','2015-10-26 20:04:38',NULL,0,1),(21,2,'您有一个新的捐赠协议“格莱美奖学金”审核成功！','<p>1.项目名：格莱美奖学金</p><p>2.合同编号：2233445566</p><p>3.立项日期：2015-10-25</p><p>4.负责人：凯蒂派瑞3</p><p>5.审核人：王力宏</p>','2015-10-26 22:05:54',NULL,1,1),(22,2,'您有一个新的捐赠协议“F4校友基金”审核失败！','<p>1.项目名：F4校友基金</p><p>2.合同编号：9de17b65f12d489991b6b07f201b669b</p><p>3.立项日期：2015-10-25</p><p>4.负责人：周渝民</p><p>5.审核人：王力宏</p>','2015-10-26 22:06:15',NULL,1,0),(23,2,'您的立项有一条链接审核成功！','<p>1.链接地址：http://localhost:8080/Fund/upload/toUpload.action?projectId=93</p><P>2.链接类型：签约仪式</P><p>3.提交时间：2015-10-27</p><p>4.审核人：admin3</p>','2015-10-27 10:03:58',NULL,1,1),(24,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：哈哈基金</p><p>2.合同编号：556677889900</p><p>3.立项日期：2015-10-14</p><p>4.负责人：刘玉博</p><p>5.审核人：王力宏</p>','2015-10-27 10:04:30',NULL,1,1),(25,2,'您有一个新的捐赠协议审核失败！','<p>1.项目名：热干面基金</p><p>2.合同编号：123122</p><p>3.立项日期：2015-10-14</p><p>4.负责人：易建联</p><p>5.审核人：王力宏</p>','2015-10-27 10:04:20',NULL,1,1),(26,2,'您有一个新的立项审核失败！','<p>1.项目名：发如雪基金</p><p>2.合同编号：12345666666</p><p>3.立项日期：2015-10-27</p><p>4.负责人：方文山</p><p>5.审核人：周杰伦</p>','2015-10-27 12:30:38',NULL,1,1),(27,2,'您有一个新的立项审核失败！','<p>1.项目名：龙卷风基金</p><p>2.合同编号：bc902ecaa8b6433b936455ff2e799e75</p><p>3.立项日期：2015-10-27</p><p>4.负责人：王力宏</p><p>5.审核人：周杰伦</p>','2015-10-27 12:30:56',NULL,1,1),(28,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：龙卷风基金</p><p>2.合同编号：bc902ecaa8b6433b936455ff2e799e75</p><p>3.立项日期：2015-10-27</p><p>4.负责人：王力宏</p><p>5.审核人：王力宏</p>','2015-10-27 12:31:06',NULL,1,1),(29,2,'您有一个新的捐赠协议审核失败！','<p>1.项目名：周五基金</p><p>2.合同编号：9969aeb5285c48b7a5552b1b382e8561</p><p>3.立项日期：2015-10-14</p><p>4.负责人：乔老师</p><p>5.审核人：王力宏</p>','2015-10-27 12:31:18',NULL,1,1),(30,2,'您有一个新的立项审核失败！','<p>1.项目名：开心基金22</p><p>2.合同编号：fbd89a4078734b33a6cfdfde80093581</p><p>3.立项日期：2015-10-24</p><p>4.负责人：李荣浩</p><p>5.审核人：周杰伦</p>','2015-10-27 12:34:09',NULL,0,1),(31,2,'您有一个新的立项审核成功！','<p>1.项目名：深圳下午茶基金</p><p>2.合同编号：123333333</p><p>3.立项日期：2015-08-29</p><p>4.负责人：易建联</p><p>5.审核人：周杰伦</p>','2015-10-27 12:35:00',NULL,1,1),(32,2,'您有一个新的立项审核成功！','<p>1.项目名：菊花残基金</p><p>2.合同编号：e565f41bcfdc4a2f9f8de51209bcf4b2</p><p>3.立项日期：2015-08-29</p><p>4.负责人：周江</p><p>5.审核人：周杰伦</p>','2015-10-28 10:06:33',NULL,1,1),(33,2,'您有一个新的立项审核失败！','<p>1.项目名：加油奖学金</p><p>2.合同编号：f07282ec1c764b9b94c3ac8157428361</p><p>3.立项日期：2015-10-29</p><p>4.负责人：柯创</p><p>5.审核人：周杰伦</p>','2015-10-29 15:17:52',NULL,1,1),(34,2,'您有一个新的立项审核成功！','<p>1.项目名：完整基金</p><p>2.合同编号：222333444</p><p>3.立项日期：2015-10-29</p><p>4.负责人：李荣浩</p><p>5.审核人：周杰伦</p>','2015-10-29 15:56:46',NULL,0,1),(35,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：完整基金</p><p>2.合同编号：222333444</p><p>3.立项日期：2015-10-29</p><p>4.负责人：李荣浩</p><p>5.审核人：王力宏</p>','2015-10-29 19:39:27',NULL,1,0),(36,2,'您有一个新的立项审核失败！','<p>1.项目名：老建筑基金</p><p>2.合同编号：33445566</p><p>3.立项日期：2015-10-29</p><p>4.负责人：奥尼尔</p><p>5.审核人：周杰伦</p>','2015-10-29 19:39:06',NULL,1,0),(37,2,'您有一个新的立项审核成功！','<p>1.项目名：老建筑修缮基金</p><p>2.合同编号：55667788</p><p>3.立项日期：2015-10-29</p><p>4.负责人：李荣浩</p><p>5.审核人：周杰伦</p>','2015-10-30 09:15:55',NULL,1,1),(38,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：老建筑修缮基金</p><p>2.合同编号：55667788</p><p>3.立项日期：2015-10-29</p><p>4.负责人：李荣浩</p><p>5.审核人：王力宏</p>','2015-10-30 09:26:22',NULL,1,1),(39,2,'您的立项有一笔资金到款成功！','<p>1.项目名：完整基金</p><p>2.合同编号：222333444</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-10-30 09:29:03',NULL,1,1),(40,2,'您的立项有一笔资金发放成功！','<p>1.项目名：完整基金</p><p>2.合同编号：222333444</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-10-30 09:27:51',NULL,1,1),(41,2,'您的立项有一笔资金到款成功！','<p>1.项目名：完整基金</p><p>2.合同编号：222333444</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-10-30 09:15:27',NULL,1,1),(42,2,'您有一个新的立项审核成功！','<p>1.项目名：开心基金222</p><p>2.合同编号：2015048</p><p>3.立项日期：2015-10-30</p><p>4.负责人：李荣浩</p><p>5.审核人：周杰伦</p>','2015-10-30 23:10:38',NULL,1,1),(43,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：开心基金222</p><p>2.合同编号：2015049</p><p>3.立项日期：2015-10-30</p><p>4.负责人：李荣浩</p><p>5.审核人：王力宏</p>','2015-10-30 23:23:04',NULL,1,1),(44,2,'您的立项有一笔资金发放成功！','<p>1.项目名：老建筑修缮基金</p><p>2.合同编号：55667788</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-01 09:41:42',NULL,1,1),(45,2,'您的立项有一笔资金发放成功！','<p>1.项目名：老建筑修缮基金</p><p>2.合同编号：55667788</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-01 09:41:59',NULL,1,1),(46,2,'您的立项有一笔资金发放成功！','<p>1.项目名：老建筑修缮基金</p><p>2.合同编号：55667788</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-01 09:42:11',NULL,1,1),(47,2,'您的立项有一笔资金发放成功！','<p>1.项目名：老建筑修缮基金</p><p>2.合同编号：55667788</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-01 09:48:34',NULL,1,1),(48,2,'您有一个新的立项审核失败！','<p>1.项目名：1113奖学金</p><p>2.合同编号：2015051</p><p>3.立项日期：2015-11-13</p><p>4.负责人：好好</p><p>5.审核人：周杰伦4</p>','2015-11-13 10:01:04',NULL,0,1),(49,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：开心基金22</p><p>2.合同编号：2015048</p><p>3.立项日期：2015-10-24</p><p>4.负责人：李荣浩</p><p>5.审核人：王力宏</p>','2015-11-13 11:02:13',NULL,0,1),(50,2,'您的立项有一笔资金到款成功！','<p>1.项目名：开心基金222</p><p>2.合同编号：2015049</p><p>3.立项日期：2015-10-30</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-13 11:27:10',NULL,0,1),(51,2,'您的立项有一笔资金到款成功！','<p>1.项目名：老建筑修缮基金</p><p>2.合同编号：55667788</p><p>3.立项日期：2015-10-29</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-13 11:27:41',NULL,1,1),(52,2,'您的立项有一笔资金到款成功！','<p>1.项目名：开心基金222</p><p>2.合同编号：2015049</p><p>3.立项日期：2015-10-30</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-13 11:31:21',NULL,1,1),(53,2,'您的立项有一笔资金发放成功！','<p>1.项目名：开心基金222</p><p>2.合同编号：2015049</p><p>3.立项日期：2015-10-30</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-13 11:33:18',NULL,1,1),(54,2,'您有一个新的立项审核失败！','<p>1.项目名：周一下午基金</p><p>2.合同编号：2015052</p><p>3.立项日期：2015-11-16</p><p>4.负责人：过过过</p><p>5.审核人：周杰伦4</p>','2015-11-16 16:07:38',NULL,0,1),(55,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：统计学基金</p><p>2.合同编号：b8ebd41023264de2be224a8a7ae3815f</p><p>3.立项日期：2015-09-11</p><p>4.负责人：李隽</p><p>5.审核人：王力宏</p>','2015-11-16 16:09:30',NULL,0,1),(56,2,'您的立项有一笔资金到款成功！','<p>1.项目名：1113奖学金</p><p>2.合同编号：2015051</p><p>3.立项日期：2015-11-13</p><p>4.负责人：null</p><p>5.审核人：林俊杰</p>','2015-11-16 16:15:03',NULL,0,1),(57,2,'您有一个新的立项审核成功！','<p>1.项目名：开心基金2222</p><p>2.合同编号：20110908</p><p>3.立项日期：2015-10-24</p><p>4.负责人：奥尼尔</p><p>5.审核人：周杰伦4</p>','2015-11-17 14:28:06',NULL,0,1),(58,2,'您有一个新的立项审核成功！','<p>1.项目名：周二基金</p><p>2.合同编号：2015054</p><p>3.立项日期：2015-11-17</p><p>4.负责人：姜磊</p><p>5.审核人：周杰伦4</p>','2015-11-17 14:58:47',NULL,0,1),(59,2,'您有一个新的立项审核成功！','<p>1.项目名：深圳下午茶基金</p><p>2.合同编号：777888999</p><p>3.立项日期：2015-08-29</p><p>4.负责人：易建联</p><p>5.审核人：周杰伦4</p>','2015-11-17 15:00:28',NULL,0,1),(60,2,'您有一个新的捐赠协议审核成功！','<p>1.项目名：周二基金</p><p>2.合同编号：2015054</p><p>3.立项日期：2015-11-17</p><p>4.负责人：姜磊</p><p>5.审核人：王力宏</p>','2015-11-17 15:06:32',NULL,0,1);

/*Table structure for table `moneycheck` */

DROP TABLE IF EXISTS `moneycheck`;

CREATE TABLE `moneycheck` (
  `MoneyCheck_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Money_In_Count` double DEFAULT '0',
  `Money_Out_Count` double DEFAULT '0',
  `MoneyState` tinyint(3) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`MoneyCheck_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8;

/*Data for the table `moneycheck` */

insert  into `moneycheck`(`MoneyCheck_Id`,`Money_In_Count`,`Money_Out_Count`,`MoneyState`,`State`) values (42,0,0,0,1),(43,106669166,2400,3,1),(49,0,0,0,1),(50,6666666,6666666,3,1),(51,0,0,0,1),(58,0,0,0,1),(59,5000,4000,4,1),(60,0,0,0,1),(61,0,0,0,1),(62,40000,10000,1,1),(63,0,0,0,1),(64,0,0,0,1),(72,0,0,0,1),(73,0,0,0,1),(74,0,0,0,1),(75,0,0,0,1),(76,0,0,0,1),(77,0,0,0,1),(78,0,0,0,1),(79,0,0,0,1),(81,0,0,0,1),(82,0,0,0,1),(83,0,0,0,1),(84,0,0,0,1),(85,0,0,0,1),(86,0,0,0,1),(87,0,0,0,1),(88,0,0,0,1),(89,0,0,0,1),(90,0,0,0,1),(91,0,0,0,1),(92,0,0,0,1),(93,0,0,0,1),(94,0,0,0,1),(95,0,0,0,1),(96,0,0,0,1),(97,0,0,0,1),(98,0,0,0,1),(99,0,0,0,1),(100,100008893,100008893,3,1),(101,0,0,0,1),(102,0,0,0,1),(103,0,0,0,1),(104,0,0,0,1),(105,100003344,3344,3,1),(106,0,0,0,1),(107,0,0,0,1),(108,99999,66666,1,1),(109,672343,0,1,1),(110,0,0,0,1),(111,100000,0,2,1),(112,0,0,0,1),(113,0,0,0,1),(114,0,0,0,1),(115,0,0,0,1),(116,0,0,0,1),(117,0,0,0,1),(118,0,0,0,1),(119,0,0,0,1),(120,0,0,0,1),(121,0,0,0,1),(122,0,0,0,1),(123,0,0,0,1),(124,0,0,0,1),(125,0,0,0,1);

/*Table structure for table `newstype` */

DROP TABLE IF EXISTS `newstype`;

CREATE TABLE `newstype` (
  `NewsType_id` int(11) NOT NULL AUTO_INCREMENT,
  `Type_Name` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`NewsType_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `newstype` */

insert  into `newstype`(`NewsType_id`,`Type_Name`,`State`) values (1,'签约仪式',1),(2,'奖(助)学金评审通知',1),(3,'评审结果',1),(4,'发放仪式',1),(5,'其他',1);

/*Table structure for table `newsurl` */

DROP TABLE IF EXISTS `newsurl`;

CREATE TABLE `newsurl` (
  `NewsURL_Id` int(11) NOT NULL AUTO_INCREMENT,
  `NewsType_Id` int(11) DEFAULT NULL,
  `News_Title` varchar(50) DEFAULT NULL,
  `Launch_URL` varchar(255) DEFAULT NULL,
  `Upload_Time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Project_Id` int(11) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `Is_Passed` tinyint(3) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`NewsURL_Id`),
  KEY `NewsType_Id` (`NewsType_Id`),
  KEY `Project_Id` (`Project_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `newsurl` */

insert  into `newsurl`(`NewsURL_Id`,`NewsType_Id`,`News_Title`,`Launch_URL`,`Upload_Time`,`Project_Id`,`Notes`,`Is_Passed`,`State`) values (1,1,NULL,'http://localhost:8080/Fund/file/toUpload.action?index=0dsfsmdnfdjsknfkjdsnfk&gg=jdsnkjfndskjfdsfdssasdsdsdsdsjdjsbjdnsjdbjsbjdbsjbdjbsjdbjsbjdbjsbdjbsjdssada546565465465465465465465465465465465465465465465465465465465445sdsa','2015-10-21 20:45:16',41,NULL,0,1),(2,1,NULL,'www.baidu.com','2015-10-21 20:45:17',41,'',0,1),(3,2,NULL,'http://localhost:8080/Fund/file/toUpload.action?index=0','2015-10-21 20:45:17',41,NULL,0,1),(4,1,NULL,'http://localhost:8080/Fund/file/toUpload.action?index=0','2015-10-21 20:45:18',41,NULL,0,1),(5,1,NULL,'http://localhost:8080/Fund/file/toUpload.action?index=0','2015-10-21 20:45:18',41,NULL,0,1),(6,1,NULL,'http://localhost:8080/Fund/file/toUpload.action?index=0fdsfsdfsdfdsfdsfsdfdsfsdfsdfdsfeegregregregregregergrenjdsncjsdbhcbsdbcdsbcsdbckbsdkjcbjkdbcjkdbjkcbjkxbcjkzbxcjkzbxkcbjzkbcjkbzjk','2015-10-21 20:46:15',54,'',2,0),(7,1,NULL,'http://localhost:8080/Fund/file/toUpload.action?index=0','2015-09-19 10:02:48',53,'',0,1),(8,5,NULL,'http://localhost:8080/Fund/upload/toUpload.action?projectId=54','2015-10-23 14:35:48',54,'ggg',1,1),(9,1,NULL,'http://localhost:8080/Fund/upload/toUpload.action?projectId=93','2015-10-27 10:01:53',93,'sdsdsdsdsds',1,1),(10,1,NULL,'http://localhost:8080/Fund/upload/toUpload.action?projectId=104','2015-10-30 23:28:27',104,'',0,1),(11,4,NULL,'http://localhost:8080/Fund/upload/toUpload.action?projectId=106','2015-11-16 16:19:32',106,'',0,1);

/*Table structure for table `outbill` */

DROP TABLE IF EXISTS `outbill`;

CREATE TABLE `outbill` (
  `OutBill_Id` int(11) NOT NULL AUTO_INCREMENT,
  `MoneyCheck_Id` int(11) DEFAULT NULL,
  `Money_Out` double DEFAULT '0',
  `Time_Out` timestamp NULL DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`OutBill_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `outbill` */

insert  into `outbill`(`OutBill_Id`,`MoneyCheck_Id`,`Money_Out`,`Time_Out`,`State`) values (6,43,500,'2019-09-04 00:00:00',1),(7,43,1500,'2019-09-05 00:00:00',1),(8,43,0,'2019-09-04 00:00:00',1),(9,43,400,'2019-09-04 00:00:00',1),(10,50,6666666,'2019-09-07 00:00:00',1),(11,59,4000,'2015-09-18 00:00:00',1),(12,62,10000,'2015-09-25 00:00:00',1),(13,100,4444,'2015-10-27 00:00:00',1),(14,100,4444,'2015-10-26 00:00:00',1),(15,100,99999999,'2015-10-30 00:00:00',1),(16,100,1,'2015-10-31 00:00:00',1),(17,100,1,'2015-10-15 00:00:00',1),(18,100,4,'2015-10-20 00:00:00',1),(19,105,3344,'2015-10-28 00:00:00',1),(20,108,33333,'2015-11-18 00:00:00',1),(21,108,33332,'2015-11-24 00:00:00',1),(22,108,1,'2015-11-23 00:00:00',0),(23,108,1,'2015-12-23 00:00:00',1),(24,109,10000,NULL,0);

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `Position_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Position_Name` varchar(50) NOT NULL,
  `Level` int(11) NOT NULL DEFAULT '0',
  `State` tinyint(3) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Position_Id`),
  KEY `Level_Id` (`Level`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `position` */

insert  into `position`(`Position_Id`,`Position_Name`,`Level`,`State`) values (1,'系统管理员',1,1),(2,'项目拓展',2,1),(3,'项目管理',2,1),(4,'财务管理',2,1),(5,'受益方',2,1),(6,'基金会',3,1),(7,'捐赠方',3,1);

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `Project_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Project_Num` varchar(50) DEFAULT NULL,
  `DonationMode_Id` int(11) DEFAULT NULL,
  `Project_Name` varchar(50) DEFAULT NULL,
  `FundType_Id` int(11) DEFAULT NULL,
  `User_Id` int(11) DEFAULT NULL,
  `Leader` varchar(50) DEFAULT NULL,
  `SetUp_Time` timestamp NULL DEFAULT NULL,
  `Purpose` varchar(50) DEFAULT NULL,
  `Is_Unit` tinyint(3) DEFAULT '1',
  `BenificiaryUnit_Id` int(11) DEFAULT NULL,
  `BenificiaryContact_Id` int(11) DEFAULT NULL,
  `Donor_Id` int(11) DEFAULT NULL,
  `DonationUnit_Id` int(11) DEFAULT NULL,
  `DonationContact_Id` int(11) DEFAULT NULL,
  `DonationUser_Id` int(11) DEFAULT NULL,
  `Protocol_Id` int(11) DEFAULT NULL,
  `MoneyCheck_Id` int(11) DEFAULT NULL,
  `Publication_State` tinyint(3) DEFAULT '1',
  `AppForm_Id` int(11) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `Is_Passed` tinyint(3) DEFAULT '1',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`Project_Id`),
  UNIQUE KEY `Project_Num` (`Project_Num`),
  KEY `FundType_Id` (`FundType_Id`),
  KEY `DonationContact_Id` (`DonationContact_Id`),
  KEY `BenificiaryContact_Id` (`BenificiaryContact_Id`),
  KEY `User_Id` (`User_Id`),
  KEY `DonationMode_Id` (`DonationMode_Id`),
  KEY `Protocol_Id` (`Protocol_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8;

/*Data for the table `project` */

insert  into `project`(`Project_Id`,`Project_Num`,`DonationMode_Id`,`Project_Name`,`FundType_Id`,`User_Id`,`Leader`,`SetUp_Time`,`Purpose`,`Is_Unit`,`BenificiaryUnit_Id`,`BenificiaryContact_Id`,`Donor_Id`,`DonationUnit_Id`,`DonationContact_Id`,`DonationUser_Id`,`Protocol_Id`,`MoneyCheck_Id`,`Publication_State`,`AppForm_Id`,`Notes`,`Is_Passed`,`State`) values (40,'123333333',52,'深圳下午茶基金',1,2,'易建联','2015-08-29 21:09:04','',0,1,49,33,NULL,47,NULL,60,42,1,NULL,NULL,1,1),(41,'777888999',53,'深圳下午茶基金',1,2,'易建联','2015-08-29 21:09:07','',0,1,50,35,NULL,48,NULL,67,43,1,NULL,NULL,2,1),(43,'e565f41bcfdc4a2f9f8de51209bcf4b2',60,'菊花残基金',2,2,'周江','2015-08-29 11:55:40','',0,1,56,38,NULL,54,NULL,61,49,1,NULL,NULL,1,1),(44,'123456789',60,'华为助学基金',1,2,'王江','2015-08-28 15:02:49','用于帮助脑瘫儿童',0,1,57,39,NULL,55,NULL,30,50,2,NULL,NULL,1,1),(45,'fd9093b96f984f87bccd37be53405e14',61,'热干面基金',1,2,'任贤齐','2015-08-30 11:03:24','让学生们每天吃热干面',1,1,58,NULL,1,56,NULL,57,51,1,NULL,NULL,1,1),(52,'123122',68,'热干面基金',1,2,'易建联','2015-10-14 12:40:04','',0,1,65,46,NULL,63,NULL,56,58,1,NULL,NULL,1,1),(53,'b8ebd41023264de2be224a8a7ae3815f',69,'统计学基金',1,2,'李隽','2015-09-11 06:59:23','教材《统计学》',0,1,66,47,NULL,64,NULL,33,59,2,NULL,NULL,2,1),(54,'34444444',70,'周四基金',1,2,'乔老师','2015-10-20 17:17:06','',1,1,67,NULL,2,65,NULL,34,60,1,NULL,NULL,2,1),(55,'556677889900',71,'哈哈基金',7,2,'刘玉博','2015-10-14 12:40:05','',0,1,68,52,NULL,66,NULL,38,61,2,NULL,NULL,2,1),(56,'9969aeb5285c48b7a5552b1b382e8561',72,'周五基金',1,2,'乔老师','2015-10-14 09:25:52','',0,1,69,54,NULL,67,NULL,39,62,1,NULL,NULL,2,1),(57,'1234567',73,'开心基金',7,2,'乔老师','2015-10-20 17:04:03','好开心就捐了',1,1,70,NULL,7,68,NULL,40,63,2,NULL,NULL,3,1),(58,'87777777',74,'开心基金2',7,2,'乔老师','2015-10-20 17:16:45','',1,1,71,NULL,5,69,NULL,44,64,1,NULL,NULL,2,1),(66,'e2372db5df1440aab2a32a54072501cd',82,'李荣浩基金',3,2,'李荣浩','2015-10-14 12:40:47','',0,1,79,62,NULL,77,NULL,45,72,3,NULL,NULL,1,0),(67,'eb42f9e5b9c54b8bad5728ac00303e0d',83,'李荣浩基金',3,2,'李荣浩','2015-10-14 12:40:45','',0,1,80,63,NULL,78,NULL,46,73,4,NULL,NULL,1,0),(68,'cf04f67167204fccabad1a985dae50ea',84,'李荣浩基金',3,2,'李荣浩','2015-10-14 12:40:42','',0,1,81,64,NULL,79,NULL,47,74,4,NULL,NULL,1,0),(69,'666321e6be3440e7babdea3880b80b98',85,'李荣浩基金',3,2,'李荣浩','2015-10-14 12:40:38','',0,1,82,65,NULL,80,NULL,48,75,3,NULL,NULL,1,0),(70,'44f95cbb98454f9f96809174e99302ca',86,'奥尼尔基金',4,2,'奥尼尔','2015-10-14 17:04:23','',1,1,83,NULL,8,81,NULL,49,76,4,NULL,NULL,2,1),(71,'55555',87,'李荣浩基金',5,2,'李荣浩','2015-10-14 17:33:54','',0,1,84,66,NULL,82,NULL,50,77,2,NULL,NULL,2,1),(72,'20110908',90,'开心基金2222',1,2,'奥尼尔','2015-10-24 23:27:49','',0,1,85,67,NULL,83,NULL,65,78,3,NULL,NULL,2,1),(73,'2015048',91,'开心基金22',1,2,'李荣浩','2015-10-24 23:34:17','',0,1,86,68,NULL,84,NULL,59,79,2,NULL,NULL,2,1),(74,'ec359f18465e401395cc7a164f526e8f',93,'开心基金222',1,2,'李荣浩','2015-10-24 23:43:34','',0,1,88,70,NULL,86,NULL,NULL,81,3,NULL,NULL,1,0),(75,'0513c0d16f9f462492aa56be4d445ed6',94,'开心基金222',1,2,'李荣浩','2015-10-24 23:49:47','',0,1,89,71,NULL,87,NULL,NULL,82,3,NULL,NULL,1,0),(76,'010fb7655cad422b87771ceb9f77da47',95,'开心基金22',1,2,'李荣浩','2015-10-24 23:55:18','',0,1,90,72,NULL,88,NULL,NULL,83,1,NULL,NULL,1,0),(77,'d9558d7206b945989b4ba11a1072c12e',96,'奥尼尔基金22',1,2,'李荣浩','2015-10-24 23:57:49','',0,1,91,73,NULL,89,NULL,NULL,84,3,NULL,NULL,1,0),(78,'38f5b2cc2d874f5abb81ce40dfba41a2',97,'李荣浩基金222',1,2,'李荣浩','2015-10-25 00:00:11','',0,1,92,74,NULL,90,NULL,NULL,85,2,NULL,NULL,1,0),(79,'5a2fa90771b4476791684e0d3c8d22bf',98,'李荣浩基金222',1,2,'李荣浩','2015-10-25 00:02:31','',0,1,93,75,NULL,91,NULL,NULL,86,4,NULL,NULL,1,0),(80,'f26c75d621f54891bf0bab43ba2c2320',99,'李荣浩基金222',1,2,'李荣浩','2015-10-25 00:07:55','',0,1,94,76,NULL,92,NULL,NULL,87,4,87,NULL,1,0),(81,'62d8779944024c12b7fc170b6d2307fa',100,'周杰伦基金',1,2,'周杰伦','2015-10-25 00:12:48','没有什么用',1,1,95,NULL,9,93,NULL,NULL,88,2,NULL,NULL,1,0),(82,'6bdd2c6ac87342c6bb761af166c6fb5a',101,'奥尼尔基金222',1,2,'李荣浩','2015-10-25 00:14:32','啥打算的撒',1,1,96,NULL,10,94,NULL,NULL,89,1,NULL,NULL,1,0),(83,'5cecff0e060844679600d00ce2c1a204',102,'李荣浩基金222',1,2,'李荣浩','2015-10-25 00:18:25','哇的撒旦是',1,9,97,NULL,11,95,NULL,NULL,90,1,NULL,NULL,1,0),(84,'0c485e0731434cd5abd3a50ce5101836',103,'李荣浩基金222',1,2,'李荣浩','2015-10-25 00:21:16','哇的撒旦是',1,1,98,NULL,12,96,NULL,NULL,91,1,NULL,NULL,1,0),(85,'5fcb42277cc74b9d8c082efeeafbfddb',104,'李荣浩基金222',1,2,'李荣浩','2015-10-25 00:25:10','sadasdasd',1,9,99,NULL,13,97,NULL,NULL,92,1,88,NULL,1,0),(86,'9de17b65f12d489991b6b07f201b669b',105,'F4校友基金',14,2,'周渝民','2015-10-25 07:41:19','让更多的人能够在校园内组件乐队',1,1,100,NULL,14,98,NULL,52,93,3,89,NULL,2,1),(87,'2233445566',106,'格莱美奖学金',2,2,'凯蒂派瑞3','2015-10-25 09:34:06','组件武汉校园格莱美评审团',0,1,101,87,NULL,99,NULL,54,94,2,97,NULL,2,1),(88,'2f646073872b433d9a34e1c60a215065',107,'开心基金222',2,2,'李荣浩','2015-10-25 08:42:10','丰盛的佛挡杀佛',0,8,102,82,NULL,100,NULL,NULL,95,1,NULL,NULL,0,0),(89,'9fdb0d098ed842dba92e767a4be2e719',108,'奥尼尔基金22',1,2,'李荣浩','2015-10-25 09:43:19','',1,7,103,NULL,15,101,NULL,NULL,96,1,99,NULL,0,0),(90,'37eae4f6bda5485ab0faee0adcd7d571',109,'奥尼尔基金22',1,2,'李荣浩','2015-10-25 09:53:41','',0,7,104,91,NULL,102,8,51,97,2,103,NULL,2,1),(93,'ef9ffd9087574aef8c9058b5d583eee8',110,'好饿啊基金',1,2,'乔老师','2015-10-25 12:13:08','',0,11,105,92,NULL,103,8,53,98,1,106,NULL,2,1),(94,'12345666666',111,'发如雪基金',1,2,'方文山','2015-10-27 12:16:07','',0,1,106,93,NULL,104,8,NULL,99,1,NULL,NULL,3,1),(95,'bc902ecaa8b6433b936455ff2e799e75',112,'龙卷风基金',8,2,'王力宏','2015-10-27 12:21:11','',1,5,107,NULL,16,105,8,58,100,1,112,NULL,2,1),(96,'f07282ec1c764b9b94c3ac8157428361',NULL,'加油奖学金',1,2,'柯创','2015-10-29 15:04:19','最后一天了 加油啊',1,6,108,NULL,17,106,8,NULL,101,2,NULL,NULL,1,1),(97,'e3ff68f0390d43cca017f988023fedd5',NULL,'加油奖学金2',5,2,'柯创','2015-10-29 15:30:33','最后一天了 加油啊',1,4,109,NULL,18,107,8,NULL,102,3,117,NULL,1,0),(98,'d3e59ba08ea84ef5a89c998d5fcdcefd',115,'加油奖学金3',10,2,'李荣浩','2015-10-29 15:35:00','加油啊啊啊啊啊啊',1,1,110,NULL,19,108,8,NULL,103,1,118,NULL,1,0),(99,'d6bf9d1c490f4663ab6324c6be106c7b',116,'校友波波年度捐赠基金',14,2,'李荣浩','2015-10-29 15:45:12','',0,4,111,NULL,NULL,109,8,NULL,104,1,119,NULL,1,1),(100,'222333444',117,'完整基金',10,2,'李荣浩','2015-10-29 15:49:10','滴滴点点',1,1,112,NULL,20,110,8,62,105,1,120,NULL,1,1),(101,'645bcf73d4864741a29d4e15de3fb736',118,'文件上传基金',10,2,'李荣浩','2015-10-29 18:00:20','',0,4,113,NULL,19,111,8,NULL,106,1,122,NULL,1,1),(102,'33445566',119,'老建筑基金',11,2,'奥尼尔','2015-10-29 19:34:28','',0,1,114,NULL,NULL,112,8,NULL,107,1,123,NULL,1,0),(103,'55667788',120,'老建筑修缮基金',11,2,'李荣浩','2015-10-29 19:42:36','',0,3,115,97,19,113,8,63,108,4,124,NULL,1,1),(104,'2015049',121,'开心基金222',3,2,'李荣浩','2015-10-30 23:04:09','',0,1,116,98,NULL,114,8,64,109,1,126,NULL,1,1),(105,'2015050',122,'开心基金',4,2,'李荣浩','2015-11-13 08:54:37','',1,2,117,NULL,21,115,NULL,NULL,110,1,128,NULL,1,0),(106,'2015051',123,'1113奖学金',1,2,'好好','2015-11-13 09:52:07','',1,3,118,NULL,22,116,NULL,NULL,111,2,129,NULL,1,1),(107,'2015052',124,'周一下午基金',1,2,'过过过','2015-11-16 16:01:43','',1,2,119,NULL,23,117,NULL,NULL,112,1,130,NULL,1,1),(108,'2015053',125,'周二基金',1,2,'Katy','2015-11-17 14:49:38','',0,2,120,99,NULL,118,NULL,NULL,113,1,132,NULL,1,0),(109,'2015054',126,'周二基金',1,2,'姜磊','2015-11-17 14:57:56','',0,2,121,100,NULL,119,NULL,66,114,1,133,NULL,2,1),(120,'2015057',137,'dsadsa',1,2,'dasdsa','2015-11-22 20:29:30','',0,1,132,111,NULL,130,NULL,NULL,125,1,136,NULL,1,1);

/*Table structure for table `projecttype` */

DROP TABLE IF EXISTS `projecttype`;

CREATE TABLE `projecttype` (
  `ProjectType_Id` int(11) NOT NULL AUTO_INCREMENT,
  `ProjectType_Name` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`ProjectType_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `projecttype` */

insert  into `projecttype`(`ProjectType_Id`,`ProjectType_Name`,`State`) values (1,'学生培养项目',1),(2,'教师发展项目',1),(3,'校园建设项目',1),(4,'学校发展基金',1),(5,'其他专项基金',1),(9,'sdsadasds',1);

/*Table structure for table `protocol` */

DROP TABLE IF EXISTS `protocol`;

CREATE TABLE `protocol` (
  `Protocol_Id` int(11) NOT NULL AUTO_INCREMENT,
  `File_Id` int(11) DEFAULT NULL,
  `Is_Passed` tinyint(3) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`Protocol_Id`),
  KEY `File_Id` (`File_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

/*Data for the table `protocol` */

insert  into `protocol`(`Protocol_Id`,`File_Id`,`Is_Passed`,`State`) values (25,40,0,1),(26,41,0,1),(27,42,0,1),(28,43,0,1),(29,45,0,1),(30,46,0,1),(31,48,0,1),(32,49,0,1),(33,73,1,1),(34,51,1,1),(35,63,0,1),(36,64,0,1),(37,65,0,1),(38,72,1,1),(39,75,2,1),(40,76,0,1),(41,77,0,1),(42,78,0,1),(43,79,0,1),(44,80,1,1),(45,81,0,1),(46,82,0,1),(47,83,0,1),(48,84,0,1),(49,85,1,1),(50,86,2,1),(51,104,1,1),(52,105,2,1),(53,107,1,1),(54,108,1,1),(55,109,0,1),(56,110,2,1),(57,111,0,1),(58,113,1,1),(59,114,1,1),(60,115,0,1),(61,116,0,1),(62,121,1,1),(63,125,1,1),(64,127,1,1),(65,131,0,1),(66,134,1,1),(67,135,0,1);

/*Table structure for table `scappinfo` */

DROP TABLE IF EXISTS `scappinfo`;

CREATE TABLE `scappinfo` (
  `ScAppInfo_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Description` varchar(200) DEFAULT NULL,
  `Sc_Case` varchar(200) DEFAULT NULL,
  `View_Class` varchar(200) DEFAULT NULL,
  `View_Institute` varchar(200) DEFAULT NULL,
  `View_Judge` varchar(200) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`ScAppInfo_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `scappinfo` */

insert  into `scappinfo`(`ScAppInfo_Id`,`Description`,`Sc_Case`,`View_Class`,`View_Institute`,`View_Judge`,`Notes`,`State`) values (1,'华为牛逼啊啊啊啊啊啊啊','','','','',NULL,1),(2,'','','','','',NULL,1),(3,'','','','','',NULL,1),(4,'','','','','',NULL,1),(5,'dsdsd','dsadasccxcx','dsad','dsa','sadsadsads',NULL,1);

/*Table structure for table `scholarlevel` */

DROP TABLE IF EXISTS `scholarlevel`;

CREATE TABLE `scholarlevel` (
  `ScholarLevel_Id` int(11) NOT NULL,
  `Scholar_Type` varchar(50) NOT NULL,
  PRIMARY KEY (`ScholarLevel_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `scholarlevel` */

/*Table structure for table `scholarshipapp` */

DROP TABLE IF EXISTS `scholarshipapp`;

CREATE TABLE `scholarshipapp` (
  `ScholarshipApp_Id` int(11) NOT NULL AUTO_INCREMENT,
  `BonusNotice_Id` int(11) DEFAULT NULL,
  `Stu_Num` varchar(15) DEFAULT NULL,
  `ScIndivInfo_Id` int(11) DEFAULT NULL,
  `ScAppInfo_Id` int(11) DEFAULT NULL,
  `File_Id` int(11) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `Is_Passed` tinyint(3) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`ScholarshipApp_Id`),
  KEY `Project_Id` (`BonusNotice_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `scholarshipapp` */

insert  into `scholarshipapp`(`ScholarshipApp_Id`,`BonusNotice_Id`,`Stu_Num`,`ScIndivInfo_Id`,`ScAppInfo_Id`,`File_Id`,`Notes`,`Is_Passed`,`State`) values (5,5,'admin7',5,5,NULL,NULL,1,1);

/*Table structure for table `scindivinfo` */

DROP TABLE IF EXISTS `scindivinfo`;

CREATE TABLE `scindivinfo` (
  `ScIndivInfo_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Sc_Name` varchar(50) DEFAULT NULL,
  `Sc_Sex` tinyint(3) DEFAULT NULL,
  `Sc_Birthday` timestamp NULL DEFAULT NULL,
  `Sc_StuId` varchar(15) DEFAULT NULL,
  `Institute` varchar(50) DEFAULT NULL,
  `Degrees` varchar(50) DEFAULT NULL,
  `Major` varchar(50) DEFAULT NULL,
  `Classes` varchar(50) DEFAULT NULL,
  `Nation` varchar(50) DEFAULT NULL,
  `Enrolled_Time` timestamp NULL DEFAULT NULL,
  `Political_Status` varchar(50) DEFAULT NULL,
  `Aca_Score` varchar(5) DEFAULT NULL,
  `AllTest_Level` varchar(5) DEFAULT NULL,
  `Phone_Number` varchar(15) DEFAULT NULL,
  `Sc_Email` varchar(50) DEFAULT NULL,
  `Sc_Address` varchar(100) DEFAULT NULL,
  `Photo_Url` varchar(100) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`ScIndivInfo_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `scindivinfo` */

insert  into `scindivinfo`(`ScIndivInfo_Id`,`Sc_Name`,`Sc_Sex`,`Sc_Birthday`,`Sc_StuId`,`Institute`,`Degrees`,`Major`,`Classes`,`Nation`,`Enrolled_Time`,`Political_Status`,`Aca_Score`,`AllTest_Level`,`Phone_Number`,`Sc_Email`,`Sc_Address`,`Photo_Url`,`State`) values (1,'奥特曼',0,'2015-08-16 00:00:00','0121303491004','管理学院','本科生','信管','1301','汉族','2015-08-26 00:00:00','党员','32','4','23213213','44@qq.com','南湖',NULL,1),(2,'小明',1,'2015-09-19 00:00:00','0121303490104','管理学院','本科','信管','1301','汉','2015-09-17 00:00:00','群众','5','4','13026194611','44@qq.com','武汉理工大学南湖校区',NULL,1),(3,'小明',1,'2015-09-23 00:00:00','0121303490104','管理学院','本科','信管','1301','汉','2015-09-17 00:00:00','群众','5','4','13026194611','44@qq.com','武汉理工大学南湖校区',NULL,1),(4,'小明',0,'2015-09-23 00:00:00','0121303490104','管理学院','本科','信管','1301','汉','2015-09-15 00:00:00','群众','5','4','13026194611','44@qq.com','武汉理工大学南湖校区',NULL,1),(5,'小明',1,'2015-09-26 00:00:00','0121303490104','管理学院t5t5','本科','信管t5t5','1301','汉','2015-09-24 00:00:00','群众','55','4','13026194611','44@qq.com','武汉理工大学南湖校区',NULL,1);

/*Table structure for table `stappinfo` */

DROP TABLE IF EXISTS `stappinfo`;

CREATE TABLE `stappinfo` (
  `StAppInfo_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Description` varchar(200) DEFAULT NULL,
  `St_Case` varchar(200) DEFAULT NULL,
  `View_Class` varchar(200) DEFAULT NULL,
  `View_Institute` varchar(200) DEFAULT NULL,
  `View_Judge` varchar(200) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`StAppInfo_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `stappinfo` */

insert  into `stappinfo`(`StAppInfo_Id`,`Description`,`St_Case`,`View_Class`,`View_Institute`,`View_Judge`,`Notes`,`State`) values (1,'我是一个小傻逼dsds','','','','',NULL,1);

/*Table structure for table `stindivinfo` */

DROP TABLE IF EXISTS `stindivinfo`;

CREATE TABLE `stindivinfo` (
  `StIndivInfo_Id` int(11) NOT NULL AUTO_INCREMENT,
  `St_Name` varchar(50) DEFAULT NULL,
  `St_Sex` tinyint(3) DEFAULT NULL,
  `St_Birthday` timestamp NULL DEFAULT NULL,
  `St_StuId` varchar(15) DEFAULT NULL,
  `Institute` varchar(50) DEFAULT NULL,
  `Degrees` varchar(50) DEFAULT NULL,
  `Major` varchar(50) DEFAULT NULL,
  `Classes` varchar(50) DEFAULT NULL,
  `Nation` varchar(50) DEFAULT NULL,
  `Enrolled_Time` timestamp NULL DEFAULT NULL,
  `Political_Status` varchar(50) DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  `St_Email` varchar(50) DEFAULT NULL,
  `St_Address` varchar(100) DEFAULT NULL,
  `Photo_Url` varchar(100) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`StIndivInfo_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `stindivinfo` */

insert  into `stindivinfo`(`StIndivInfo_Id`,`St_Name`,`St_Sex`,`St_Birthday`,`St_StuId`,`Institute`,`Degrees`,`Major`,`Classes`,`Nation`,`Enrolled_Time`,`Political_Status`,`Phone`,`St_Email`,`St_Address`,`Photo_Url`,`Notes`,`State`) values (1,'柯创',1,'2015-08-21 00:00:00','0121303490109','管理学院','本科','信管','1302sds','傣族','2015-08-21 00:00:00','主席','123123213123','22@qq.com','南湖湖底',NULL,NULL,1);

/*Table structure for table `stipendapp` */

DROP TABLE IF EXISTS `stipendapp`;

CREATE TABLE `stipendapp` (
  `StipendApp_Id` int(11) NOT NULL AUTO_INCREMENT,
  `BonusNotice_Id` int(11) DEFAULT NULL,
  `Stu_Num` varchar(15) DEFAULT NULL,
  `StIndivInfo_Id` int(11) DEFAULT NULL,
  `StAppInfo_Id` int(11) DEFAULT NULL,
  `File_Id` int(11) DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `Is_Passed` tinyint(3) DEFAULT '0',
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`StipendApp_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `stipendapp` */

insert  into `stipendapp`(`StipendApp_Id`,`BonusNotice_Id`,`Stu_Num`,`StIndivInfo_Id`,`StAppInfo_Id`,`File_Id`,`Notes`,`Is_Passed`,`State`) values (1,2,'admin7',1,1,NULL,NULL,1,1);

/*Table structure for table `stu` */

DROP TABLE IF EXISTS `stu`;

CREATE TABLE `stu` (
  `Stu_Id` varchar(13) NOT NULL,
  `Card_No` varchar(6) NOT NULL,
  `Card_Pwd` varchar(10) NOT NULL,
  `Stu_Name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Stu_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stu` */

insert  into `stu`(`Stu_Id`,`Card_No`,`Card_Pwd`,`Stu_Name`) values ('0121303490104','223771','666666','克里斯保罗'),('0121303490105','223772','555555','提姆邓肯');

/*Table structure for table `testboolean` */

DROP TABLE IF EXISTS `testboolean`;

CREATE TABLE `testboolean` (
  `is_shit` tinyint(3) DEFAULT '0',
  `is_bitch` tinyint(3) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `testboolean` */

insert  into `testboolean`(`is_shit`,`is_bitch`) values (127,4);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `User_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Real_Name` varchar(30) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Position_Id` int(11) DEFAULT NULL,
  `State` tinyint(3) DEFAULT '1',
  PRIMARY KEY (`User_Id`),
  UNIQUE KEY `Username` (`Username`),
  KEY `user_ibfk_1` (`Position_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`User_Id`,`Username`,`Real_Name`,`Password`,`Position_Id`,`State`) values (1,'admin','dffdf','c4ca4238a0b923820dcc509a6f75849b',1,1),(2,'admin1','Angelababy','c4ca4238a0b923820dcc509a6f75849b',5,1),(3,'admin2','周杰伦4','c4ca4238a0b923820dcc509a6f75849b',2,1),(4,'admin3','王力宏','c4ca4238a0b923820dcc509a6f75849b',3,1),(5,'admin4','林俊杰','c4ca4238a0b923820dcc509a6f75849b',4,1),(6,'invalid','科比','c4ca4238a0b923820dcc509a6f75849b',1,0),(7,'admin5','周润发','c4ca4238a0b923820dcc509a6f75849b',6,1),(8,'admin6','山鸡','c4ca4238a0b923820dcc509a6f75849b',7,1),(9,'admin7','罗琛','c4ca4238a0b923820dcc509a6f75849b',8,1),(10,'admin8','种子','c4ca4238a0b923820dcc509a6f75849b',9,1),(11,'cable5881','gg','c81e728d9d4c2f636f067f89cc14862c',5,0),(12,'hhhhh','','3d2172418ce305c7d16d4b05597c6a59',4,0),(13,'liuyubo','刘玉博','bcbe3365e6ac95ea2c0343a2395834dd',1,0),(14,'ohyear','kg','bcbe3365e6ac95ea2c0343a2395834dd',1,0),(15,'fff','fff','343d9040a671c45832ee5381860e2996',1,0),(16,'213','21312','979d472a84804b9f647bc185a877a8b5',1,0),(17,'33','333','310dcbbf4cce62f762a2aaa148d556bd',1,0),(18,'323','3232','be83ab3ecd0db773eb2dc1b0a17836a1',4,0),(19,'admin66','鸡巴哥222','40f5888b67c748df7efba008e7c2f9d2',7,1),(20,'admin666','吧唧哥哥','c4ca4238a0b923820dcc509a6f75849b',7,0),(24,'cable6881','芙蓉峰','e3ceb5881a0a1fdaad01296d7554868d',6,1),(25,'cable5882','dsdsds','d36c71408784d8123de29768f24df75e',1,0),(26,'dfdfdfd','fgffgff','e9510081ac30ffa83f10b68cde1cac07',1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
