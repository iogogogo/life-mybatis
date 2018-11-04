/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1-docker
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 127.0.0.1:10100
 Source Schema         : life-mybatis

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 02/06/2018 00:34:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(50) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES (1, '信息技术部');
INSERT INTO `dept` VALUES (2, '人事部');
INSERT INTO `dept` VALUES (3, 'PCB事业部');
INSERT INTO `dept` VALUES (4, '无线终端部');
INSERT INTO `dept` VALUES (5, '测试部');
COMMIT;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 NOT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of employee
-- ----------------------------
BEGIN;
INSERT INTO `employee` VALUES (1, '小明 ', 0, '2018-06-01 16:33:52', 1);
INSERT INTO `employee` VALUES (2, '小强 ', 1, '2018-06-01 16:33:52', 2);
INSERT INTO `employee` VALUES (3, '史塔克 ', 11, '2018-06-01 16:33:52', 3);
INSERT INTO `employee` VALUES (4, '二丫 ', 24, '2018-06-01 16:33:52', 1);
INSERT INTO `employee` VALUES (5, '君临城 ', 8, '2018-06-01 16:33:52', 4);
INSERT INTO `employee` VALUES (6, '乌鸦 ', 8, '2018-06-01 16:33:52', 1);
INSERT INTO `employee` VALUES (7, '龙母 ', 4, '2018-06-01 16:33:52', 4);
INSERT INTO `employee` VALUES (8, '提利昂 ', 21, '2018-06-01 16:33:52', 5);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
