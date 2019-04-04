/*
 Navicat MySQL Data Transfer

 Source Server         : 127.0.0.1-mac
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : life-test

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 04/04/2019 22:56:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for sys_app
-- ----------------------------
DROP TABLE IF EXISTS `sys_app`;
CREATE TABLE `sys_app` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_key` varchar(255) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_app
-- ----------------------------
BEGIN;
INSERT INTO `sys_app` VALUES (1, 'key_001', '小花脸-001');
INSERT INTO `sys_app` VALUES (2, 'key_002', '小花脸-002');
INSERT INTO `sys_app` VALUES (3, 'key_003', '小花脸-003');
INSERT INTO `sys_app` VALUES (4, 'key_004', '小花脸-004');
INSERT INTO `sys_app` VALUES (5, 'key_005', '小花脸-005');
INSERT INTO `sys_app` VALUES (6, 'key_006', '小花脸-006');
INSERT INTO `sys_app` VALUES (7, 'key_007', '小花脸-007');
INSERT INTO `sys_app` VALUES (8, 'key_008', '小花脸-008');
INSERT INTO `sys_app` VALUES (9, 'key_009', '小花脸-009');
INSERT INTO `sys_app` VALUES (10, 'key_010', '小花脸-010');
INSERT INTO `sys_app` VALUES (11, 'key_011', '小花脸-011');
INSERT INTO `sys_app` VALUES (12, 'key_012', '小花脸-012');
INSERT INTO `sys_app` VALUES (13, 'key_013', '小花脸-013');
INSERT INTO `sys_app` VALUES (14, 'key_014', '小花脸-014');
INSERT INTO `sys_app` VALUES (15, 'key_015', '小花脸-015');
INSERT INTO `sys_app` VALUES (16, 'key_016', '小花脸-016');
INSERT INTO `sys_app` VALUES (17, 'key_017', '小花脸-017');
INSERT INTO `sys_app` VALUES (18, 'key_018', '小花脸-018');
INSERT INTO `sys_app` VALUES (19, 'key_019', '小花脸-019');
INSERT INTO `sys_app` VALUES (20, 'key_020', '小花脸-020');
COMMIT;

-- ----------------------------
-- Table structure for sys_device
-- ----------------------------
DROP TABLE IF EXISTS `sys_device`;
CREATE TABLE `sys_device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dev_key` varchar(255) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_device
-- ----------------------------
BEGIN;
INSERT INTO `sys_device` VALUES (1, 'dev_001', '小花脸-001');
INSERT INTO `sys_device` VALUES (2, 'dev_002', '小花脸-002');
INSERT INTO `sys_device` VALUES (3, 'dev_003', '小花脸-003');
INSERT INTO `sys_device` VALUES (4, 'dev_004', '小花脸-004');
INSERT INTO `sys_device` VALUES (5, 'dev_005', '小花脸-005');
INSERT INTO `sys_device` VALUES (6, 'dev_006', '小花脸-006');
INSERT INTO `sys_device` VALUES (7, 'dev_007', '小花脸-007');
INSERT INTO `sys_device` VALUES (8, 'dev_008', '小花脸-008');
INSERT INTO `sys_device` VALUES (9, 'dev_009', '小花脸-009');
INSERT INTO `sys_device` VALUES (10, 'dev_010', '小花脸-010');
INSERT INTO `sys_device` VALUES (11, 'dev_011', '小花脸-011');
INSERT INTO `sys_device` VALUES (12, 'dev_012', '小花脸-012');
INSERT INTO `sys_device` VALUES (13, 'dev_013', '小花脸-013');
INSERT INTO `sys_device` VALUES (14, 'dev_014', '小花脸-014');
INSERT INTO `sys_device` VALUES (15, 'dev_015', '小花脸-015');
INSERT INTO `sys_device` VALUES (16, 'dev_016', '小花脸-016');
INSERT INTO `sys_device` VALUES (17, 'dev_017', '小花脸-017');
INSERT INTO `sys_device` VALUES (18, 'dev_018', '小花脸-018');
INSERT INTO `sys_device` VALUES (19, 'dev_019', '小花脸-019');
INSERT INTO `sys_device` VALUES (20, 'dev_020', '小花脸-020');
COMMIT;

-- ----------------------------
-- Table structure for sys_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_relation`;
CREATE TABLE `sys_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_key` varchar(255) DEFAULT NULL,
  `dev_key` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_relation
-- ----------------------------
BEGIN;
INSERT INTO `sys_relation` VALUES (1, 'key_001', 'dev_001');
INSERT INTO `sys_relation` VALUES (2, 'key_001', 'dev_002');
INSERT INTO `sys_relation` VALUES (3, 'key_001', 'dev_003');
INSERT INTO `sys_relation` VALUES (4, 'key_001', 'dev_004');
INSERT INTO `sys_relation` VALUES (5, 'key_001', 'dev_005');
INSERT INTO `sys_relation` VALUES (6, 'key_002', 'dev_010');
INSERT INTO `sys_relation` VALUES (7, 'key_002', 'dev_011');
INSERT INTO `sys_relation` VALUES (8, 'key_002', 'dev_012');
INSERT INTO `sys_relation` VALUES (9, 'key_002', 'dev_013');
INSERT INTO `sys_relation` VALUES (10, 'key_002', 'dev_014');
INSERT INTO `sys_relation` VALUES (11, 'key_007', 'dev_012');
INSERT INTO `sys_relation` VALUES (12, 'key_008', 'dev_013');
INSERT INTO `sys_relation` VALUES (13, 'key_009', 'dev_014');
INSERT INTO `sys_relation` VALUES (14, 'key_007', 'dev_015');
INSERT INTO `sys_relation` VALUES (15, 'key_011', 'dev_016');
INSERT INTO `sys_relation` VALUES (16, 'key_007', 'dev_017');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
