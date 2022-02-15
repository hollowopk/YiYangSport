-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: work
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food` (
  `category` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `energy` decimal(5,2) DEFAULT '0.00',
  `protein` decimal(5,2) DEFAULT '0.00',
  `fat` decimal(5,2) DEFAULT '0.00',
  `carbohydrate` decimal(5,2) DEFAULT '0.00',
  `fiber` decimal(5,2) DEFAULT '0.00',
  `vitaminA` decimal(5,2) DEFAULT '0.00',
  `vitaminC` decimal(5,2) DEFAULT '0.00',
  `vitaminE` decimal(5,2) DEFAULT '0.00',
  `carotene` decimal(5,2) DEFAULT '0.00',
  `vitaminB1` decimal(5,2) DEFAULT '0.00',
  `vitaminB2` decimal(5,2) DEFAULT '0.00',
  `niacin` decimal(5,2) DEFAULT '0.00',
  `cholesterol` decimal(5,2) DEFAULT '0.00',
  `Mg` decimal(5,2) DEFAULT '0.00',
  `Ca` decimal(5,2) DEFAULT '0.00',
  `Fe` decimal(5,2) DEFAULT '0.00',
  `Zn` decimal(5,2) DEFAULT '0.00',
  `Cu` decimal(5,2) DEFAULT '0.00',
  `Mn` decimal(5,2) DEFAULT '0.00',
  `K` decimal(5,2) DEFAULT '0.00',
  `P` decimal(5,2) DEFAULT '0.00',
  `Na` decimal(5,2) DEFAULT '0.00',
  `Se` decimal(5,2) DEFAULT '0.00',
  PRIMARY KEY (`name`),
  UNIQUE KEY `food_name_uindex` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES ('蔬菜菌藻类','上海青',18.00,1.70,0.20,3.20,1.60,200.00,10.00,0.00,200.00,0.00,0.03,0.50,0.00,91.00,59.00,1.80,0.54,0.06,0.19,245.00,36.00,56.90,3.40),('蔬菜菌藻类','丝瓜',20.00,1.30,0.20,4.00,0.00,13.00,4.00,0.08,155.00,0.02,0.04,32.00,0.00,19.00,37.00,0.30,0.22,0.05,0.07,121.00,33.00,3.70,0.20),('蔬菜菌藻类','冬瓜',10.00,0.30,0.20,2.40,1.10,0.00,16.00,0.04,0.00,0.00,0.00,0.22,0.00,10.00,12.00,0.10,0.10,0.10,0.02,57.00,11.00,2.80,0.02),('其他','冬虫夏草',292.00,20.90,4.70,61.60,20.10,0.00,2.00,0.00,0.00,0.37,0.70,3.30,84.00,197.00,66.50,4.87,1.54,0.86,595.00,95.00,264.00,1.40,0.56),('零食点心及冷饮','冰淇淋',127.00,2.40,5.30,17.30,0.00,48.00,0.00,0.24,0.00,0.01,0.03,0.20,0.00,12.00,126.00,0.50,0.37,0.02,0.05,125.00,67.00,54.20,1.73),('蔬菜菌藻类','南瓜',23.00,0.70,0.10,5.30,0.80,74.00,8.00,0.36,890.00,0.03,0.04,0.40,0.00,8.00,16.00,0.40,0.14,0.03,0.08,145.00,24.00,0.80,0.46),('蔬菜菌藻类','卷心菜',24.00,1.50,0.20,4.60,1.00,6.00,40.00,0.50,70.00,0.03,0.03,0.40,12.00,49.00,0.60,0.60,0.25,0.04,0.18,124.00,26.00,27.20,0.96),('饮料类','咖啡粉',218.00,12.20,0.50,41.10,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00),('饮料类','啤酒',32.00,0.40,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.15,0.04,1.10,0.00,6.00,13.00,0.40,0.30,0.01,47.00,12.00,11.40,0.64,0.64),('蔬菜菌藻类','圣女果',25.00,1.00,0.20,5.80,1.50,28.00,33.00,0.98,332.00,0.03,0.02,0.92,0.00,12.00,6.00,0.30,0.20,0.04,0.06,262.00,26.00,10.00,0.20),('蔬菜菌藻类','大白菜',20.00,1.60,0.20,3.40,0.90,7.00,37.50,0.36,80.00,0.05,0.04,0.65,0.00,12.00,57.00,0.80,0.46,0.06,0.19,134.00,33.00,68.90,0.57),('零食点心及冷饮','奶油蛋糕',379.00,7.20,13.90,56.50,0.60,175.00,0.00,3.31,370.00,0.13,0.11,1.40,161.00,19.00,38.00,2.30,1.88,0.17,1.19,67.00,90.00,80.70,8.06),('奶类','奶酪',328.00,25.70,23.50,3.50,0.00,152.00,0.00,0.60,0.00,0.06,0.91,0.60,11.00,57.00,799.00,2.40,6.97,0.13,0.16,75.00,326.00,584.60,1.50),('蔬菜菌藻类','娃娃菜',13.00,1.90,0.20,0.20,2.40,1.00,4.00,12.00,0.00,48.00,0.04,0.03,0.61,0.00,78.00,17.00,0.40,0.35,0.03,0.13,278.00,58.00,0.16),('蔬菜菌藻类','小白菜',14.00,1.40,0.30,2.40,0.00,154.00,64.00,0.40,853.00,0.01,0.05,0.00,0.00,30.00,117.00,1.30,0.23,0.02,0.15,116.00,26.00,132.20,0.39),('主食类','小米粥',46.00,1.40,0.70,8.40,0.00,0.00,0.00,0.26,0.00,0.02,0.07,0.90,0.00,22.00,10.00,1.00,0.41,0.07,0.16,19.00,32.00,4.10,0.30),('蔬菜菌藻类','小葱',27.00,1.60,0.40,4.90,1.40,70.00,21.00,0.49,840.00,0.05,0.06,0.40,0.00,18.00,72.00,1.30,0.35,0.06,0.16,143.00,26.00,10.40,1.06),('主食类','山药',57.00,1.90,0.20,12.40,0.80,3.00,5.00,0.24,20.00,0.05,0.02,0.30,0.00,20.00,16.00,0.30,0.27,0.24,0.12,213.00,34.00,18.60,0.55),('主食类','方便面',473.00,9.50,21.10,61.60,0.70,0.00,0.00,2.28,0.00,0.12,0.06,0.90,0.00,38.00,25.00,4.10,1.06,0.29,0.79,134.00,80.00,144.00,10.49),('饮料类','无糖美式咖啡',1.00,0.00,0.00,0.30,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,1.00,0.00),('奶类','早餐奶',68.00,2.30,3.10,7.70,0.00,24.00,1.00,0.21,0.00,0.03,0.14,0.10,0.00,11.00,120.00,0.30,0.30,0.00,0.00,109.00,73.00,0.00,1.90),('肉蛋类','明虾',85.00,13.40,1.80,3.80,0.00,0.00,0.00,1.55,0.00,0.01,0.04,4.00,273.00,31.00,75.00,0.60,3.59,0.09,0.02,238.00,189.00,119.00,25.48),('蔬菜菌藻类','木耳',27.00,1.50,0.20,2.60,2.00,1.00,0.00,20.00,20.00,0.01,0.05,0.20,0.00,57.00,34.00,5.50,0.53,0.04,0.97,52.00,12.00,8.50,0.46),('坚果类','杏仁',578.00,22.50,45.50,23.90,8.00,0.00,26.00,18.53,0.00,0.08,0.56,0.00,0.00,178.00,97.00,2.20,4.30,0.80,0.77,106.00,27.00,8.30,15.65),('其他','枸杞',258.00,13.90,1.50,64.10,16.90,625.00,48.00,1.86,750.00,0.35,0.46,4.00,0.00,96.00,60.00,5.40,1.48,0.98,0.87,434.00,209.00,252.10,13.25),('水果类','柚子',42.00,0.80,0.20,9.50,0.40,1.00,23.00,0.00,10.00,0.00,0.03,0.30,0.00,4.00,4.00,0.30,0.40,0.18,0.08,119.00,24.00,3.00,0.70),('饮料类','柠檬汁',27.00,0.90,0.20,5.50,0.00,0.00,11.00,0.00,0.00,0.01,0.02,0.10,0.00,12.00,24.00,0.10,0.09,0.04,0.06,120.00,0.00,1.20,4.15),('坚果类','核桃（干）',646.00,14.90,58.80,19.10,58.80,19.10,9.50,3.00,1.00,43.21,30.00,0.15,0.14,0.90,0.00,131.00,56.00,2.70,2.17,1.17,3.44,385.00,4.62),('水果类','桃子',42.00,0.60,0.10,10.10,1.00,2.00,10.00,0.71,20.00,0.01,0.02,0.30,0.00,8.00,6.00,0.30,0.14,0.06,0.07,127.00,11.00,1.70,0.47),('水果类','梨',51.00,0.30,0.10,13.10,2.60,2.00,5.00,0.46,20.00,0.03,0.03,0.20,0.00,8.00,7.00,0.40,0.10,0.10,0.06,85.00,14.00,1.70,0.29),('调味品','榨菜',33.00,2.20,0.30,6.50,2.10,82.00,2.00,0.00,190.00,0.03,0.06,0.50,0.00,54.00,155.00,3.90,0.63,0.14,0.35,363.00,41.00,252.60,1.93),('油脂类','橄榄油',899.00,0.00,99.90,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.10,0.56,0.00,0.00,0.00,1.00,0.00,2.00,0.00),('水果类','橘子',44.00,0.80,0.10,10.20,0.50,41.00,35.00,1.22,490.00,0.04,0.03,0.20,0.00,14.00,24.00,0.20,0.13,0.11,0.03,128.00,18.00,0.80,0.70),('水果类','橙子',48.00,0.80,0.20,11.10,0.60,13.00,33.00,0.56,160.00,0.05,0.04,0.30,0.00,14.00,20.00,0.40,0.14,0.03,0.05,159.00,22.00,1.20,0.31),('肉蛋类','河虾',87.00,16.40,2.40,0.00,0.00,48.00,0.00,5.33,0.00,0.04,0.03,0.00,240.00,60.00,325.00,4.00,2.24,0.64,0.27,329.00,186.00,133.80,29.65),('蔬菜菌藻类','洋葱',40.00,1.10,0.20,9.00,0.90,2.00,8.00,0.14,20.00,0.03,0.03,0.30,0.00,15.00,24.00,0.60,0.23,0.05,0.14,147.00,39.00,4.40,0.92),('蔬菜菌藻类','海带(浸)',16.00,1.10,0.10,3.00,0.90,26.00,0.00,0.08,310.00,0.02,0.01,0.90,0.00,61.00,241.00,3.30,0.66,0.03,1.47,222.00,29.00,107.60,4.90),('肉蛋类','火腿肠',212.00,14.00,10.40,15.60,0.00,5.00,0.00,0.71,0.00,0.26,0.43,2.30,57.00,22.00,9.00,4.50,3.22,0.36,0.14,217.00,187.00,771.20,9.20),('水果类','火龙果',55.00,1.10,0.20,13.30,1.60,0.00,3.00,0.14,0.00,0.03,0.02,0.22,0.00,30.00,7.00,0.30,0.29,0.04,0.19,20.00,35.00,2.70,0.03),('坚果类','炒花生',601.00,21.70,48.00,23.80,6.31,0.00,12.90,60.00,0.13,0.12,18.90,0.00,171.10,47.00,1.50,2.03,0.68,1.44,563.00,326.00,34.80,1.44,3.90),('主食类','烙饼',258.00,7.50,2.30,52.90,1.90,0.00,0.00,1.03,0.00,0.02,0.04,0.00,0.00,51.00,20.00,2.40,0.94,0.15,1.15,141.00,146.00,149.30,7.50),('主食类','煮面条',107.00,3.90,0.40,22.80,0.00,0.00,0.00,0.00,0.00,0.02,0.01,0.56,0.00,10.00,4.00,0.20,0.10,0.01,0.01,15.00,24.00,26.90,1.16),('主食类','燕麦片',338.00,10.10,0.20,77.40,6.00,0.00,0.00,0.91,0.00,0.46,0.07,0.00,0.00,116.00,58.00,2.90,1.75,0.21,3.91,356.00,342.00,2.10,0.00),('奶类','牛奶',65.00,3.30,3.60,4.90,0.00,54.00,1.00,0.13,0.00,0.03,0.12,0.10,15.00,11.00,107.00,0.30,0.28,0.02,0.03,109.00,73.00,37.20,1.94),('肉蛋类','牛肉(腑肋)',123.00,18.60,5.40,0.00,0.00,7.00,0.00,0.37,0.00,0.06,0.13,3.10,71.00,14.00,19.00,2.70,4.05,0.07,0.06,217.00,120.00,66.60,2.35),('肉蛋类','牛肉干',550.00,45.60,40.00,1.90,0.00,0.00,0.00,0.00,0.00,0.06,0.26,15.20,120.00,107.00,43.00,15.60,7.26,0.29,0.19,510.00,464.00,412.40,9.80),('水果类','猕猴桃',61.00,0.80,0.60,14.50,2.60,11.00,62.00,2.43,130.00,0.05,0.02,0.30,0.00,12.00,27.00,1.20,0.57,1.87,0.73,144.00,26.00,10.00,0.28),('肉蛋类','猪大排',264.00,18.30,20.40,1.70,0.00,12.00,0.00,0.11,0.00,0.80,0.15,5.30,165.00,17.00,8.00,0.80,1.72,0.12,0.05,274.00,125.00,44.50,10.30),('肉蛋类','猪小排',295.00,16.80,25.30,0.00,0.00,7.00,0.00,0.46,0.00,0.31,0.26,4.11,120.00,17.00,14.00,1.10,2.42,0.00,0.00,222.00,101.00,62.66,8.46),('肉蛋类','猪肉(奶脯)',349.00,7.70,35.50,0.00,0.00,39.00,0.00,0.49,0.00,0.14,0.06,2.00,98.00,5.00,5.00,0.80,0.73,0.13,0.00,53.00,67.00,36.70,2.22),('肉蛋类','猪肉(瘦)',143.00,20.30,6.20,1.50,0.00,44.00,0.00,0.34,0.00,0.54,0.10,5.30,81.00,25.00,6.00,3.00,2.99,0.11,0.03,305.00,189.00,57.50,9.50),('肉蛋类','猪肝',126.00,19.20,4.70,1.80,0.00,502.00,20.00,0.00,0.00,0.22,2.02,10.11,108.00,24.00,6.00,23.20,3.68,0.02,0.01,235.00,243.00,68.60,26.12),('肉蛋类','猪蹄',260.00,22.60,18.80,0.00,0.00,3.00,0.00,0.01,0.00,0.05,0.10,1.50,192.00,5.00,33.00,1.10,1.14,0.09,0.01,54.00,33.00,101.00,5.85),('坚果类','瓜子仁',615.00,19.10,53.40,16.70,4.50,0.00,0.00,79.06,0.00,1.89,0.16,0.50,0.00,287.00,115.00,2.90,0.50,0.56,0.07,547.00,604.00,5.00,5.78),('蔬菜菌藻类','生菜',16.00,1.40,0.40,2.10,0.60,60.00,20.00,0.00,360.00,0.00,0.10,0.20,0.00,29.00,70.00,1.20,0.43,0.08,0.15,100.00,31.00,80.00,1.55),('蔬菜菌藻类','番茄',15.00,0.90,0.20,3.30,1.00,31.00,14.00,0.42,375.00,0.02,0.01,0.49,0.00,12.00,4.00,0.20,0.12,0.04,0.06,179.00,24.00,9.70,0.00),('调味品','白砂糖',400.00,0.00,0.00,99.90,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,3.00,20.00,0.60,0.60,0.04,0.09,5.00,8.00,0.40,0.00),('主食类','白粥',46.00,1.10,0.30,9.90,0.10,0.00,0.00,0.00,0.00,0.00,0.03,0.20,0.00,7.00,7.00,0.10,0.20,0.03,0.20,13.00,20.00,2.80,0.20),('蔬菜菌藻类','白萝卜',16.00,0.70,0.10,4.00,1.10,0.00,19.00,0.00,0.00,0.02,0.01,0.14,0.00,12.00,47.00,0.20,0.14,0.01,0.01,0.05,167.00,16.00,0.12),('主食类','白薯',106.00,1.40,0.20,25.20,1.00,18.00,24.00,0.43,220.00,0.07,0.04,0.60,0.00,17.00,24.00,0.80,0.22,0.16,0.21,174.00,46.00,58.20,0.63),('饮料类','矿泉水',0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00),('主食类','稀饭',59.00,1.30,0.20,13.40,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,7.00,7.00,0.10,0.12,0.01,0.01,13.00,20.00,2.80,0.74),('蔬菜菌藻类','空心菜',19.00,2.20,0.20,4.00,1.90,143.00,5.00,0.10,714.00,0.03,0.05,0.22,0.00,46.00,115.00,1.00,0.27,0.05,0.52,304.00,37.00,107.60,0.00),('蔬菜菌藻类','竹笋(嫩)',23.00,2.60,0.20,3.60,1.80,0.00,5.00,0.05,0.00,0.08,0.08,0.60,1.00,9.00,0.50,0.33,0.09,1.14,389.00,64.00,0.40,0.04,0.00),('主食类','米饭',116.00,2.60,0.30,25.90,0.30,0.00,0.00,0.00,0.00,0.02,0.03,1.90,0.00,15.00,7.00,1.30,0.92,0.06,0.58,30.00,62.00,2.50,0.40),('主食类','紫薯',133.00,1.20,0.30,31.70,2.50,0.00,0.10,1.30,0.00,0.12,0.02,1.30,0.00,26.00,24.00,0.60,0.20,0.21,0.50,370.00,56.00,30.00,0.00),('零食点心及冷饮','红枣',276.00,3.20,0.50,67.80,6.20,1.00,14.00,3.04,10.00,0.04,0.16,0.90,0.00,36.00,64.00,2.30,0.65,0.27,0.39,524.00,51.00,6.20,1.02),('调味品','红糖',389.00,0.70,0.00,96.60,0.00,0.00,0.00,0.00,0.00,0.01,0.00,0.30,0.00,54.00,157.00,2.20,0.35,0.15,0.27,240.00,11.00,18.30,4.20),('蔬菜菌藻类','红萝卜',22.00,1.00,0.10,0.10,4.60,0.80,0.00,3.00,1.20,0.00,0.05,0.02,0.00,16.00,2.80,11.00,0.69,0.00,0.06,110.00,26.00,62.70,0.00),('主食类','红薯',86.00,1.57,0.10,20.12,3.00,709.00,2.40,0.26,968.00,0.08,0.06,0.56,0.00,25.00,30.00,0.61,0.30,0.15,0.26,337.00,47.00,55.00,0.60),('肉蛋类','罗非鱼',98.00,18.40,1.50,2.80,0.00,0.00,0.00,1.91,0.00,0.11,0.17,3.30,78.00,36.00,12.00,0.90,0.87,0.05,0.09,289.00,161.00,19.80,22.60),('蔬菜菌藻类','胡萝卜',39.00,1.00,0.20,8.80,1.10,688.00,13.00,0.41,130.00,0.44,0.03,0.60,0.00,14.00,32.00,1.00,0.23,0.08,190.00,27.00,71.40,0.63,0.00),('奶类','脱脂奶粉',360.70,36.20,0.91,51.16,0.00,2.40,7.81,0.00,0.00,0.21,3.44,0.74,23.00,114.00,406.00,0.17,4.00,0.00,0.00,758.00,39.00,337.00,0.00),('大豆及制品','腐竹(干)',485.00,54.20,27.20,8.10,0.00,0.00,0.00,28.43,0.00,0.02,0.17,0.80,0.00,140.00,50.00,3.80,4.71,0.86,2.38,670.00,655.00,27.10,1.51),('油脂类','色拉油',898.00,0.00,99.80,0.00,0.00,0.00,0.00,24.01,0.00,0.00,0.00,0.00,64.00,1.00,18.00,1.70,0.23,0.05,0.01,3.00,1.00,5.10,0.00),('水果类','芒果',35.00,0.60,0.20,8.30,1.30,75.00,23.00,1.21,897.00,0.01,0.04,0.30,0.00,14.00,0.00,0.20,0.09,0.06,0.20,138.00,11.00,2.80,1.44),('油脂类','芝麻油',898.00,0.00,99.70,0.20,0.00,0.00,0.00,68.53,0.00,0.00,0.00,0.00,0.00,3.00,9.00,2.20,0.17,0.05,0.76,0.00,4.00,1.10,0.00),('油脂类','花生油',899.00,0.00,99.90,0.00,0.00,0.00,0.00,42.06,0.00,0.00,0.00,0.00,0.00,2.00,12.00,2.90,0.48,0.15,0.33,1.00,15.00,3.50,0.00),('坚果类','花生米',589.00,23.90,44.40,25.70,4.30,0.00,0.00,14.97,0.00,0.12,0.10,18.90,0.00,176.00,284.00,6.90,2.82,0.89,1.70,674.00,315.00,445.10,7.10),('其他','花粉（松油）',379.70,9.60,7.70,72.50,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00),('其他','花粉（荞麦）',353.00,14.90,4.20,67.30,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00),('蔬菜菌藻类','花菜',20.00,1.70,0.20,4.20,2.10,1.00,32.00,0.00,11.00,0.04,0.04,0.32,0.00,18.00,31.00,0.40,0.17,0.02,0.09,206.00,32.00,39.20,2.86),('蔬菜菌藻类','芹菜',13.00,1.40,0.20,1.80,0.90,32.00,5.00,0.32,380.00,0.01,0.19,1.00,0.00,16.00,38.00,6.90,0.38,0.10,0.79,212.00,32.00,40.90,0.81),('蔬菜菌藻类','苦瓜',22.00,1.00,0.10,4.90,1.40,8.00,56.00,0.85,100.00,0.03,0.03,0.40,0.00,18.00,14.00,0.70,0.36,0.06,0.16,256.00,35.00,2.50,0.36),('水果类','苹果',53.00,0.40,0.20,13.70,1.70,4.00,3.00,0.43,50.00,0.02,0.02,0.20,0.00,4.00,4.00,0.30,0.04,0.07,0.03,83.00,7.00,1.30,0.10),('蔬菜菌藻类','茄子',23.00,1.10,0.20,4.90,1.30,4.00,5.00,1.13,50.00,0.02,0.04,0.60,0.00,13.00,24.00,0.50,0.23,0.10,0.13,142.00,23.00,5.40,0.48),('肉蛋类','草鱼',113.00,16.60,5.20,0.00,0.00,11.00,0.00,2.03,0.00,0.04,0.11,2.80,86.00,31.00,38.00,0.80,0.87,0.05,0.05,312.00,203.00,46.00,6.66),('水果类','荔枝',71.00,0.90,0.20,16.60,0.50,1.00,41.00,0.00,10.00,0.10,0.04,1.10,0.00,12.00,2.00,0.40,0.17,0.16,0.09,151.00,24.00,1.70,0.14),('蔬菜菌藻类','莴笋',15.00,1.00,0.10,2.80,0.60,13.00,4.00,0.19,150.00,0.02,0.02,0.50,0.00,19.00,23.00,0.90,0.33,0.07,0.19,212.00,48.00,36.50,0.54),('蔬菜菌藻类','菠菜',28.00,2.60,0.30,4.50,1.70,243.00,32.00,1.74,920.00,0.04,0.11,0.60,0.00,58.00,66.00,2.90,0.85,0.10,0.66,311.00,47.00,85.20,0.97),('水果类','菠萝',44.00,0.50,0.10,10.80,1.30,2.00,18.00,0.00,20.00,0.04,0.02,0.20,0.00,8.00,12.00,0.60,0.14,0.07,1.04,113.00,9.00,0.80,0.24),('其他','葛根',181.00,1.50,0.20,45.60,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00),('油脂类','葵花籽油',899.00,0.00,99.90,0.00,0.00,0.00,0.00,54.60,0.00,0.00,0.00,0.00,0.00,4.00,2.00,1.00,0.11,0.00,0.02,1.00,4.00,2.80,0.00),('零食点心及冷饮','蛋糕（黄蛋糕）',320.00,9.50,6.00,57.10,0.20,48.00,0.00,3.05,290.00,0.13,0.03,0.80,0.00,7.00,27.00,2.20,0.54,0.14,0.13,80.00,76.00,32.00,8.00),('调味品','蜂蜜',321.00,0.40,1.90,75.60,0.00,0.00,3.00,0.00,0.00,0.00,0.05,0.10,0.00,2.00,4.00,1.00,0.37,0.03,0.07,28.00,3.00,0.30,0.15),('蔬菜菌藻类','西兰花',27.00,3.50,0.60,3.70,2.60,13.00,56.00,0.76,151.00,0.06,0.08,0.73,0.00,22.00,50.00,0.90,0.46,0.03,0.16,179.00,61.00,46.70,0.43),('水果类','西柚',33.00,0.70,0.30,7.80,0.00,24.00,38.00,0.00,282.00,0.05,0.01,0.20,0.00,9.00,21.00,0.10,0.10,0.00,0.00,60.00,17.00,7.00,0.00),('水果类','西瓜',31.00,0.50,0.30,6.80,0.20,14.00,5.70,0.11,173.00,0.02,0.04,0.30,0.00,14.00,7.00,0.40,0.09,0.03,0.03,97.00,12.00,3.30,0.09),('大豆及制品','豆奶',30.00,2.40,1.50,1.80,0.00,0.00,0.00,4.50,0.00,0.02,0.06,0.30,0.00,7.00,23.00,0.60,0.24,5.57,0.11,92.00,35.00,3.20,0.73),('油脂类','豆油',899.00,0.00,99.90,0.00,0.00,0.00,0.00,93.08,0.00,0.00,0.00,0.00,0.00,3.00,13.00,2.00,1.09,0.16,0.43,3.00,6.00,4.90,0.00),('大豆及制品','豆浆',31.00,3.00,1.60,1.20,0.00,0.00,0.00,1.06,0.00,0.02,0.02,0.14,0.00,15.00,5.00,0.40,0.28,0.16,0.16,117.00,42.00,3.70,0.00),('大豆及制品','豆浆(甜)',34.00,2.40,0.50,4.90,0.10,0.00,0.00,1.27,0.00,0.04,0.02,0.15,0.00,15.00,27.00,0.50,0.27,0.08,0.00,54.00,21.00,0.00,0.10),('大豆及制品','豆渣',89.00,4.80,0.00,3.60,9.70,9.70,0.00,0.00,3.50,0.00,0.11,0.04,0.30,0.00,100.00,0.00,1.20,0.00,0.00,0.00,0.00,4.80,0.00),('大豆及制品','豆腐',84.00,6.60,5.30,3.40,0.00,0.00,0.00,5.79,0.00,0.06,0.02,0.21,0.00,41.00,78.00,1.20,0.57,0.08,0.12,118.00,82.00,5.60,1.50),('大豆及制品','豆腐干(白干)',197.00,14.90,11.30,9.60,0.00,2.00,0.00,13.00,25.00,0.02,0.05,0.40,0.00,69.00,447.00,7.10,1.84,0.41,1.07,137.00,174.00,329.00,7.12),('大豆及制品','豆腐脑',48.00,2.60,1.80,5.40,0.20,0.00,0.00,0.87,0.00,0.01,0.40,0.00,35.00,301.00,1.70,0.45,0.06,0.18,108.00,46.00,235.60,0.50,0.00),('大豆及制品','豆腐花',15.00,1.90,0.80,0.00,0.00,21.00,0.00,5.00,250.00,0.02,0.03,0.40,0.00,60.00,175.00,3.30,0.75,0.28,0.52,339.00,95.00,0.00,1.70),('蔬菜菌藻类','豆芽(黄豆芽)',16.00,1.70,0.10,2.60,1.20,1.00,1.00,4.00,0.00,11.00,0.02,0.02,0.35,0.00,18.00,14.00,0.30,0.20,0.05,32.00,19.00,25.80,0.27),('蔬菜菌藻类','豌豆尖',32.00,4.80,0.80,2.60,0.00,28.00,8.00,0.10,333.00,0.11,0.16,0.49,0.00,14.00,15.00,0.50,0.42,0.07,0.08,145.00,60.00,20.90,0.56),('调味品','酱油',63.00,5.60,0.10,10.10,0.20,0.00,0.00,0.00,0.00,0.05,0.13,1.70,0.00,156.00,8.60,1.17,0.06,1.11,337.00,204.00,757.00,1.39,0.00),('奶类','酸奶',70.00,3.20,1.90,10.00,0.00,19.00,1.00,0.13,0.00,0.03,0.14,0.10,15.00,11.00,140.00,0.20,0.54,0.01,0.02,135.00,90.00,32.50,1.19),('奶类','酸奶（中脂）',64.00,2.70,1.90,9.00,0.00,32.00,1.00,0.13,0.00,0.02,0.13,0.10,12.00,10.00,81.00,0.40,0.68,0.01,0.01,130.00,59.00,13.00,0.74),('奶类','酸奶（果料）',67.00,3.10,1.40,10.40,0.00,19.00,2.00,0.69,0.00,0.03,0.19,0.10,15.00,11.00,140.00,0.40,0.56,0.04,0.03,111.00,90.00,32.50,0.98),('调味品','醋',31.00,2.10,0.30,4.90,0.00,0.00,0.00,0.00,0.00,0.03,0.05,1.40,0.00,13.00,17.00,6.00,1.25,0.04,2.97,351.00,96.00,262.10,2.43),('蔬菜菌藻类','金针菇',32.00,2.40,0.40,6.00,2.70,3.00,2.00,1.14,30.00,0.15,0.19,4.10,0.00,17.00,0.00,1.40,0.39,0.14,0.10,195.00,97.00,4.30,0.28),('蔬菜菌藻类','青椒',22.00,0.80,0.80,0.30,5.20,2.20,8.00,59.00,0.38,98.00,0.02,0.62,0.00,15.00,11.00,0.30,0.21,0.05,0.05,154.00,20.00,7.00,0.02),('大豆及制品','青豆(干)',152.00,15.80,7.80,5.10,0.80,3.00,0.00,15.85,40.00,0.04,0.03,0.30,0.00,88.00,299.00,5.70,1.59,0.41,1.19,99.00,219.00,234.10,3.15),('肉蛋类','青鱼',118.00,20.10,4.20,0.00,0.00,42.00,0.00,0.81,0.00,0.03,0.07,2.90,108.00,32.00,31.00,0.90,0.96,0.06,0.04,325.00,184.00,47.40,37.69),('主食类','面包',313.00,8.30,5.10,58.60,0.50,0.00,0.00,1.66,0.00,0.03,0.06,1.70,0.00,31.00,49.00,2.00,0.75,0.27,0.37,88.00,107.00,230.40,3.15),('蔬菜菌藻类','韭菜',25.00,2.40,0.40,0.40,4.50,2.40,133.00,2.00,0.57,596.00,0.04,0.05,0.86,0.00,24.00,44.00,0.70,0.25,0.05,0.21,241.00,45.00,5.80),('饮料类','饮用水',0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00),('零食点心及冷饮','饼干',435.00,9.00,12.70,71.70,1.10,37.00,3.00,4.57,80.00,0.08,0.04,4.70,81.00,50.00,73.00,1.90,0.91,0.23,0.87,85.00,88.00,204.00,12.47),('蔬菜菌藻类','香菇(鲜)',26.00,2.20,0.30,5.20,3.30,0.00,1.00,0.00,0.00,0.00,0.08,2.00,0.00,11.00,2.00,0.30,0.66,0.12,0.25,20.00,53.00,1.40,2.58),('水果类','香蕉',93.00,1.40,0.20,22.00,1.20,5.00,8.00,0.24,60.00,0.02,0.04,0.70,0.00,43.00,7.00,0.40,0.18,0.14,0.65,256.00,28.00,0.80,0.87),('主食类','马铃薯',81.00,2.60,17.80,1.10,1.00,14.00,0.34,6.00,0.10,0.02,1.10,0.00,24.00,7.00,0.40,0.30,0.09,0.10,347.00,46.00,5.90,0.47,0.00),('蔬菜菌藻类','鱼腥草(叶)',32.00,2.10,0.10,10.70,0.00,0.00,1.60,1.28,0.00,0.03,1.20,1.04,0.00,145.00,57.00,2.30,0.40,0.09,1.00,494.00,31.00,21.60,1.25),('肉蛋类','鲈鱼',105.00,18.60,3.40,0.00,0.00,19.00,0.00,0.75,0.00,0.03,0.17,3.10,86.00,37.00,138.00,2.00,2.83,0.05,0.04,205.00,242.00,141.10,33.06),('主食类','鲜玉米',112.00,4.00,1.20,22.80,2.90,0.00,16.00,0.46,0.00,0.16,0.11,1.80,0.00,32.00,0.00,1.10,0.90,0.09,0.22,238.00,117.00,1.10,1.63),('肉蛋类','鲤鱼',109.00,17.60,4.10,0.50,0.00,25.00,0.00,1.27,0.00,0.03,0.09,2.70,84.00,33.00,50.00,1.00,2.08,0.06,0.05,334.00,204.00,53.70,15.38),('肉蛋类','鲫鱼',108.00,17.10,2.70,3.80,0.00,17.00,0.00,0.68,0.00,0.04,0.09,2.50,130.00,41.00,79.00,1.30,1.94,0.08,0.06,290.00,193.00,41.20,14.31),('肉蛋类','鳕鱼',88.00,20.40,0.50,0.50,0.00,14.00,0.00,0.00,0.00,0.04,0.13,2.70,114.00,84.00,42.00,0.50,0.86,0.01,0.01,321.00,232.00,130.30,24.80),('肉蛋类','鳗鱼',211.00,21.30,9.80,9.50,0.00,0.00,0.00,5.91,75.00,0.03,0.09,1.47,50.00,16.00,37.00,2.20,2.46,0.04,0.05,174.00,120.00,252.00,24.45),('肉蛋类','鸡肉(公鸡)',389.00,16.70,35.40,0.90,0.00,226.00,0.00,0.00,0.00,0.07,0.07,131.00,106.00,7.00,37.00,1.70,1.10,0.08,0.01,123.00,102.00,47.80,5.40),('肉蛋类','鸡肉(土鸡)',124.00,20.80,4.50,0.00,0.00,64.00,0.00,2.02,0.00,0.09,0.08,15.70,106.00,40.00,9.00,2.10,1.06,0.10,0.05,276.00,141.00,74.10,12.75),('肉蛋类','鸡肉(母鸡)',256.00,20.30,16.80,5.80,0.00,139.00,0.00,1.34,0.00,0.05,0.04,8.80,166.00,16.00,2.00,1.20,1.46,0.09,0.04,275.00,120.00,62.20,0.00),('肉蛋类','鸡胸肉',118.00,24.60,1.90,0.60,0.00,3.00,0.00,0.41,0.00,0.07,0.06,11.96,65.00,28.00,1.00,1.00,0.26,0.01,0.01,333.00,170.00,44.80,11.75),('肉蛋类','鸡腿',146.00,20.20,7.20,0.00,0.00,22.00,0.00,0.00,0.00,0.06,0.10,3.25,99.00,21.00,0.00,1.80,1.11,0.01,0.01,221.00,271.00,73.60,9.70),('肉蛋类','鸡蛋',139.00,13.10,8.60,2.40,0.00,255.00,0.00,1.14,0.00,0.09,0.20,0.20,648.00,10.00,56.00,1.60,0.89,0.19,0.03,154.00,130.00,13.15,13.96),('肉蛋类','鸡蛋清',60.00,11.60,0.10,3.10,0.00,0.00,0.00,0.01,0.00,0.04,0.31,0.20,0.00,15.00,9.00,1.60,0.02,0.05,0.02,132.00,18.00,79.40,6.97),('肉蛋类','鸭肉',240.00,15.50,19.70,0.20,0.00,52.00,0.00,0.27,0.00,0.08,0.22,4.20,94.00,14.00,6.00,2.20,1.33,0.21,0.06,191.00,122.00,69.00,12.25),('零食点心及冷饮','麻花',527.00,8.30,31.50,53.40,1.50,0.00,0.00,21.60,0.00,0.05,0.01,3.20,0.00,67.00,26.00,3.06,0.23,1.01,213.00,136.00,99.20,7.20,22.00),('蔬菜菌藻类','黄瓜',16.00,0.80,0.20,2.90,0.50,8.00,9.00,0.49,90.00,0.02,0.03,0.20,0.00,15.00,24.00,0.50,0.18,0.05,0.06,102.00,24.00,4.90,0.38),('大豆及制品','黄豆',390.00,35.00,16.00,34.20,15.50,18.00,0.00,18.90,220.00,0.41,0.20,2.10,0.00,199.00,191.00,8.20,3.34,1.35,2.26,503.00,465.00,2.20,6.16),('肉蛋类','黄鱼(大黄花鱼)',97.00,17.70,2.50,0.80,0.00,0.00,0.00,1.13,0.00,0.03,0.10,1.90,86.00,39.00,53.00,0.70,0.58,0.04,0.02,260.00,174.00,120.30,42.57),('坚果类','黑芝麻',559.00,19.10,46.10,24.00,14.00,0.00,0.00,50.40,0.00,0.66,0.25,0.59,0.00,290.00,780.00,22.70,6.13,1.77,17.85,358.00,516.00,8.30,4.70),('大豆及制品','黑豆',401.00,36.00,15.90,33.60,10.20,3.00,0.00,17.36,30.00,0.20,0.33,2.00,0.00,243.00,224.00,7.00,4.18,1.56,2.83,377.00,500.00,3.00,6.79);
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-17 11:35:00
