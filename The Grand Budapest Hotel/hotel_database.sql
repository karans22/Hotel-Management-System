--
-- Create schema hotel
--

DROP DATABASE hotel;

CREATE DATABASE hotel;
USE hotel;

--
-- Definition of table `bookingtable`
--

DROP TABLE IF EXISTS `bookingtable`;
CREATE TABLE `bookingtable` (
  `book_id` int(3) NOT NULL,
  `room_no` varchar(3) DEFAULT NULL,
  `date_fro` datetime DEFAULT NULL,
  `date_to` datetime DEFAULT NULL,
  `no_of_day` int(3) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookingtable`
--

/*!40000 ALTER TABLE `bookingtable` DISABLE KEYS */;
INSERT INTO `bookingtable` (`book_id`,`room_no`,`date_fro`,`date_to`,`no_of_day`) VALUES 
 (1,'101','2014-01-10 00:00:00','2014-01-12 00:00:00',2),
 (2,'103','2014-01-07 00:00:00','2014-01-10 00:00:00',3),
 (3,'105','2014-01-11 00:00:00','2014-01-13 00:00:00',2),
 (4,'108','2014-01-08 00:00:00','2014-01-09 00:00:00',1),
 (5,'112','2014-01-11 00:00:00','2014-01-13 00:00:00',2),
 (9,'110','2014-01-08 00:00:00','2014-01-16 00:00:00',8),
 (10,'125','2014-01-09 00:00:00','2014-01-10 00:00:00',1),
 (11,'109','2014-01-09 00:00:00','2014-01-11 00:00:00',2),
 (12,'108','2014-01-09 00:00:00','2014-01-12 00:00:00',3);
/*!40000 ALTER TABLE `bookingtable` ENABLE KEYS */;


--
-- Definition of table `custdetail`
--

DROP TABLE IF EXISTS `custdetail`;
CREATE TABLE custdetail (
  Cust_no int(30) DEFAULT NULL,
  Cust_name varchar(30) DEFAULT NULL,
  Cust_add varchar(40) DEFAULT NULL,
  Cust_city varchar(30) DEFAULT NULL,
  Cust_state varchar(30) DEFAULT NULL,
  Cust_country varchar(30) DEFAULT NULL,
  Cust_ph varchar(10) DEFAULT NULL,
  Cust_proof varchar(20) DEFAULT NULL,
  Cust_mar_stat varchar(15) DEFAULT NULL,
  Cust_nation varchar(30) DEFAULT NULL,
  Cust_adult varchar(20) DEFAULT NULL,
  Cust_child varchar(20) DEFAULT NULL,  
  Cust_purpos varchar(30) DEFAULT NULL,
  book_id varchar(30) DEFAULT NULL,
  Cust_bill varchar(50) DEFAULT NULL
);

--
-- Dumping data for table `custdetail`
--

/*!40000 ALTER TABLE `custdetail` DISABLE KEYS */;
INSERT INTO `custdetail` VALUES 
 ('1','Vijay','1Q AFS Colony','Jamnagar','Gujarat','India','0288253422','Passport','Single','Indian','1','0','Tour',50,11000),
 ('2','Amar','2T Ambica Colony ','Abu Road','Rajasthan','India','02974225333','Passport','Relationship','Indian','2','0','Tour',51,15000);
/*!40000 ALTER TABLE `custdetail` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `userid` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `designation` varchar(100),
  `firstname` varchar(100),
  `lastname` varchar(100),
  `contactno` varchar(100),
  `address` varchar(200),
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` ENABLE KEYS */;
INSERT INTO `login` VALUES 
('mritunjay','msk','Abu Road','Mritunjay','Singh Khichi','954999160','2T1 Akrabhatta Colony'),
('Vinayak','vsk','Ajmer','Vinayak','Sharma','982835966','Q7 Housing Colony'),
('netbeans','mysql','null','null','null','null','null');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;

--
-- Definition of table `roomdetail`
--

DROP TABLE IF EXISTS `roomdetail`;
CREATE TABLE `roomdetail` (
  `room_no` varchar(3) NOT NULL,
  `room_type` varchar(10) NOT NULL,
  `room_rate` int(4) NOT NULL,
  `room_bed` varchar(6) NOT NULL,
  PRIMARY KEY (`room_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roomdetail`
--

/*!40000 ALTER TABLE `roomdetail` DISABLE KEYS */;
INSERT INTO `roomdetail` (`room_no`,`room_type`,`room_rate`,`room_bed`) VALUES 
 ('101','Non AC',700,'Single'),
 ('102','Non AC',700,'Single'),
 ('103','Non AC',700,'Single'),
 ('104','Non AC',700,'Single'),
 ('105','Non AC',700,'Single'),
 ('106','Non AC',700,'Single'),
 ('107','Non AC',700,'Single'),
 ('108','Non AC',700,'Single'),
 ('109','Non AC',700,'Single'),
 ('110','Non AC',700,'Single'),
 ('111','Non AC',1000,'Double'),
 ('112','Non AC',1000,'Double'),
 ('113','Non AC',1000,'Double'),
 ('114','Non AC',1000,'Double'),
 ('115','Non AC',1000,'Double'),
 ('116','AC',1500,'Single'),
 ('117','AC',1500,'Single'),
 ('118','AC',1500,'Single'),
 ('119','AC',1500,'Single'),
 ('120','AC',1500,'Single'),
 ('121','AC',1500,'Single'),
 ('122','AC',1500,'Single'),
 ('123','AC',1500,'Single'),
 ('124','AC',2000,'Double'),
 ('125','AC',2000,'Double');
/*!40000 ALTER TABLE `roomdetail` ENABLE KEYS */;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
