/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : android_api

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 26/04/2022 17:51:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students`  (
  `stu_id` int(11) NOT NULL,
  `stu_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stu_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES (19200135, 'Suk', '10086', '/upload/9a8fbaa2-c83f-458d-b4a7-5dd7510f83bc.jpg');
INSERT INTO `students` VALUES (19200136, 'JGSGG', '10087', '/upload/b15068c5-3cde-41a1-b591-e46581a4c810.jpg');
INSERT INTO `students` VALUES (19200137, 'Marin', '10088', '/upload/8bb4c998-4d37-4dd9-a327-d43baea334f3.jpg');

SET FOREIGN_KEY_CHECKS = 1;
