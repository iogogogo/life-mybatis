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

 Date: 02/06/2018 00:03:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
