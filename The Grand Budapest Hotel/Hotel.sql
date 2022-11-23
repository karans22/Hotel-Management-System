DROP DATABASE hotel;
CREATE DATABASE hotel;
USE hotel;
CREATE TABLE `bookingtable` (
  `book_id` int(3) NOT NULL,
  `room_no` varchar(3) DEFAULT NULL,
  `date_fro` datetime DEFAULT NULL,
  `date_to` datetime DEFAULT NULL,
  `no_of_day` int(3) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
);
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
  Cust_bill varchar(50) DEFAULT NULL);
INSERT INTO `custdetail` VALUES 
 ('1','Vijay','1Q AFS Colony','Jamnagar','Gujarat','India','0288253422','Passport','Single','Indian','1','0','Tour',50,11000),
 ('2','Amar','2T Ambica Colony ','Abu Road','Rajasthan','India','02974225333','Passport','Relationship','Indian','2','0','Tour',51,15000);
CREATE TABLE `login` (
  `userid` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `designation` varchar(100),
  `firstname` varchar(100),
  `lastname` varchar(100),
  `contactno` varchar(100),
  `address` varchar(200),
  primary key (`userid`));
INSERT INTO `login` VALUES 
('henry','msk','Downtown','Henry','Frost','954999160',21-T, 'New York City');
CREATE TABLE `roomdetail` (`room_no` varchar(3) NOT NULL, `room_type` varchar(10) NOT NULL, `room_rate` int(4) NOT NULL, `room_bed` varchar(6) NOT NULL,  primary key (`room_no`));
INSERT INTO `roomdetail` VALUES 
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
