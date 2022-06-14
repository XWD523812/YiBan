/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : membergl

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 14/06/2022 10:26:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bulletin
-- ----------------------------
DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE `bulletin`  (
  `bulletinid` int(0) NOT NULL AUTO_INCREMENT,
  `memberid` int(0) NOT NULL,
  `bulletinclass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `bulletintitle` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `bulletinbody` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bulletindate` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `bulletinstate` int(0) NOT NULL DEFAULT 0,
  `attendance` int(0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`bulletinid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bulletin
-- ----------------------------
INSERT INTO `bulletin` VALUES (1, 0, '通知', '使用说明', '自行摸索', '2022-06-02 08:57:20', 0, -999999);
INSERT INTO `bulletin` VALUES (2, 0, '活动', '春节活动', '新年快乐', '2022-06-01 16:22:28', 0, -999999);
INSERT INTO `bulletin` VALUES (3, 51, '活动', '中秋佳节', '中秋节活动安排如下………………', '2022-06-02 10:35:27', 0, 0);

-- ----------------------------
-- Table structure for force
-- ----------------------------
DROP TABLE IF EXISTS `force`;
CREATE TABLE `force`  (
  `forceid` int(0) NOT NULL AUTO_INCREMENT,
  `memberid` int(0) NOT NULL,
  `forceindex` double NOT NULL,
  `forceadddata` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `forcedate` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `forcestate` int(0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`forceid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of force
-- ----------------------------
INSERT INTO `force` VALUES (0, 0, -99999999, 'Create the world', '2022-06-01 10:52:08', 0);
INSERT INTO `force` VALUES (41, 1, 10, '端午节2', '2022-06-02 08:38:24', 0);
INSERT INTO `force` VALUES (43, 51, 10, '端午节', '2022-06-02 08:38:22', 0);
INSERT INTO `force` VALUES (44, 51, 10, '端午节', '2022-06-01 10:52:17', 0);
INSERT INTO `force` VALUES (45, 1, 10, '端午节', '2022-06-02 10:18:31', 0);
INSERT INTO `force` VALUES (46, 51, 10, '端午节', '2022-06-01 10:52:21', 0);
INSERT INTO `force` VALUES (47, 51, 10, '端午节', '2022-06-01 12:54:44', 0);
INSERT INTO `force` VALUES (48, 51, 10, '端午节', '2022-06-01 12:58:12', 0);
INSERT INTO `force` VALUES (49, 51, 10, '端午节', '2022-06-01 12:58:19', 0);
INSERT INTO `force` VALUES (50, 51, 10, '端午节', '2022-06-01 12:58:23', 0);
INSERT INTO `force` VALUES (51, 51, 10, '端午节', '2022-06-01 13:45:54', 0);
INSERT INTO `force` VALUES (52, 51, 10, '端午节', '2022-06-01 13:48:13', 0);
INSERT INTO `force` VALUES (53, 51, 10, '端午节', '2022-06-01 13:48:14', 0);
INSERT INTO `force` VALUES (54, 51, 10, '端午节', '2022-06-01 13:50:03', 0);
INSERT INTO `force` VALUES (55, 51, -10, '打架打不过，就这就这？？？', '2022-06-02 10:13:41', 0);

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `memberid` int(0) NOT NULL,
  `membername` varchar(7) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '123456',
  `bumen` varchar(7) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `force` int(0) NOT NULL DEFAULT 0,
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'ta还没有介绍自己',
  `qx` int(0) NOT NULL DEFAULT 2,
  PRIMARY KEY (`memberid`) USING BTREE,
  UNIQUE INDEX `membername`(`membername`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (-1, 'TestB', '123456', '', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (0, '向文定', '1499557299', '技术部', -9999999, '', 'ta还没有介绍自己', 0);
INSERT INTO `member` VALUES (1, '包文佩', '123456', '站长团', 20, '', 'ta还没有介绍自己', 1);
INSERT INTO `member` VALUES (2, '贺回港', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (3, '肖长海', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (4, '唐政科', '123456', '站长团', 0, '', 'ta还没有介绍自己', 1);
INSERT INTO `member` VALUES (5, '谭植元', '123456', '站长团', 0, '', 'ta还没有介绍自己', 1);
INSERT INTO `member` VALUES (6, '吴曦帆', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (7, '蔡婷婷', '123456', '办公室', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (8, '周奇杰', '123456', '技术部', 0, '', 'ta还没有介绍自己', 1);
INSERT INTO `member` VALUES (9, '段若龙', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (10, '袁栋榜', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (11, '陈骏杰', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (12, '林泰宗', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (13, '肖小可', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (14, '吴眉', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (15, '陆婷', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (16, '蒋雨婷', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (17, '田秋萍', '123456', '技术部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (18, '吴赛锋', '123456', '办公室', 0, '', 'ta还没有介绍自己', 1);
INSERT INTO `member` VALUES (19, '罗杰', '123456', '办公室', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (20, '杨潇', '123456', '办公室', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (21, '龚娟', '123456', '办公室', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (22, '王霖钰', '123456', '办公室', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (23, '曹小灿', '123456', '办公室', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (24, '唐碧荣', '123456', '策划部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (25, '欧文青', '123456', '策划部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (26, '李泽城', '123456', '策划部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (27, '吴晓惠', '123456', '策划部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (28, '陈雅兰', '123456', '策划部', 0, '', 'ta还没有介绍自己', 1);
INSERT INTO `member` VALUES (29, '熊玲', '123456', '策划部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (30, '李未', '123456', '策划部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (31, '唐超兰', '123456', '策划部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (32, '彭榕曼', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (33, '曾晶', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 1);
INSERT INTO `member` VALUES (34, '向凌峰', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 0);
INSERT INTO `member` VALUES (35, '申伊慧', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (36, '欧阳倩', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (37, '毛碧桂', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (38, '苏婷', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (39, '刘秋霞', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (40, '蔡亮', '123456', '编辑部', 0, '', 'ta还没有介绍自己', 2);
INSERT INTO `member` VALUES (51, 'TestX', '123456', '技术部', 12, '', '技术部副部长', 2);

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture`  (
  `pictureid` int(0) NOT NULL AUTO_INCREMENT,
  `bulletinid` int(0) NOT NULL,
  `pictureurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `picturedate` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`pictureid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of picture
-- ----------------------------
INSERT INTO `picture` VALUES (1, 1, 'www.baidu.com', '2022-06-02 08:21:55');
INSERT INTO `picture` VALUES (2, 1, 'www', '2022-06-01 16:26:17');
INSERT INTO `picture` VALUES (3, 1, 'www.baidu.com', '2022-06-02 08:19:48');

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply`  (
  `replyid` int(0) NOT NULL AUTO_INCREMENT,
  `bulletinid` int(0) NOT NULL,
  `memberid` int(0) NOT NULL,
  `replystate` int(0) NOT NULL DEFAULT 0,
  `replydate` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `replybody` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`replyid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES (1, 1, 1, 0, '2022-06-14 10:16:41', '收到');

SET FOREIGN_KEY_CHECKS = 1;
