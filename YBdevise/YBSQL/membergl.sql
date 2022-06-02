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

 Date: 01/06/2022 08:11:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for force_index
-- ----------------------------
DROP TABLE IF EXISTS `force_index`;
CREATE TABLE `force_index`  (
  `forceid` int(0) NOT NULL AUTO_INCREMENT,
  `memberid` int(0) NOT NULL,
  `forceindex` double NOT NULL,
  `forceadddata` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `forcedate` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`forceid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of force_index
-- ----------------------------
INSERT INTO `force_index` VALUES (0, 0, -99999999, 'Create the world', '2000-01-01 00:00:00');
INSERT INTO `force_index` VALUES (41, 1, 10, '端午节2', '2022-05-28 19:47:28');
INSERT INTO `force_index` VALUES (42, 1, 10, '端午节', '2022-05-28 19:40:52');
INSERT INTO `force_index` VALUES (43, 51, 10, '端午节', '2022-05-31 09:46:55');
INSERT INTO `force_index` VALUES (44, 51, 10, '端午节', '2022-05-31 09:46:56');
INSERT INTO `force_index` VALUES (45, 51, 10, '端午节', '2022-05-31 09:47:57');
INSERT INTO `force_index` VALUES (46, 51, 10, '端午节', '2022-05-31 09:47:58');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `memberid` int unsigned NOT NULL,
  `membername` varchar(7) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '123456',
  `bumen` varchar(7) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `force` int(0) NOT NULL DEFAULT 0,
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `qx` int(0) NOT NULL DEFAULT 2,
  PRIMARY KEY (`memberid`) USING BTREE,
  UNIQUE INDEX `membername`(`membername`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (0, '向文定', '1499557299', '技术部', -9999999, '', 2);
INSERT INTO `member` VALUES (1, '包文佩', '123456', '站长团', 20, '', 2);
INSERT INTO `member` VALUES (2, '贺回港', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (3, '肖长海', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (4, '唐政科', '123456', '站长团', 0, '', 2);
INSERT INTO `member` VALUES (5, '谭植元', '123456', '站长团', 0, '', 2);
INSERT INTO `member` VALUES (6, '吴曦帆', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (7, '蔡婷婷', '123456', '办公室', 0, '', 2);
INSERT INTO `member` VALUES (8, '周奇杰', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (9, '段若龙', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (10, '袁栋榜', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (11, '陈骏杰', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (12, '林泰宗', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (13, '肖小可', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (14, '吴眉', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (15, '陆婷', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (16, '蒋雨婷', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (17, '田秋萍', '123456', '技术部', 0, '', 2);
INSERT INTO `member` VALUES (18, '吴赛锋', '123456', '办公室', 0, '', 2);
INSERT INTO `member` VALUES (19, '罗杰', '123456', '办公室', 0, '', 2);
INSERT INTO `member` VALUES (20, '杨潇', '123456', '办公室', 0, '', 2);
INSERT INTO `member` VALUES (21, '龚娟', '123456', '办公室', 0, '', 2);
INSERT INTO `member` VALUES (22, '王霖钰', '123456', '办公室', 0, '', 2);
INSERT INTO `member` VALUES (23, '曹小灿', '123456', '办公室', 0, '', 2);
INSERT INTO `member` VALUES (24, '唐碧荣', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (25, '欧文青', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (26, '李泽城', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (27, '吴晓惠', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (28, '陈雅兰', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (29, '熊玲', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (30, '李未', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (31, '唐超兰', '123456', '策划部', 0, '', 2);
INSERT INTO `member` VALUES (32, '彭榕曼', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (33, '曾晶', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (34, '向凌峰', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (35, '申伊慧', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (36, '欧阳倩', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (37, '毛碧桂', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (38, '苏婷', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (39, '刘秋霞', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (40, '蔡亮', '123456', '编辑部', 0, '', 2);
INSERT INTO `member` VALUES (51, '哦哦哦哦哦', '123456', '技术部', 0, '', 2);

SET FOREIGN_KEY_CHECKS = 1;
