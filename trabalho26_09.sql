-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27-Set-2023 às 02:00
-- Versão do servidor: 10.4.11-MariaDB
-- versão do PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";
--
-- Banco de dados: `trabalho26_09`
--
-- --------------------------------------------------------
--
-- Estrutura da tabela `estoque`
--
CREATE DATABASE trabalho26_09;
USE trabalho26_09;

CREATE TABLE `estoque` (
  `estID` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `estQTD` int,
  `estValorTotal` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;