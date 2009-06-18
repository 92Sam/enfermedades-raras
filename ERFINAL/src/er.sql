-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.75-0ubuntu10


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema enf
--

CREATE DATABASE IF NOT EXISTS enf;
USE enf;
CREATE TABLE  `enf`.`centrodiagnostico` (
  `oid` varchar(100) NOT NULL,
  `nombre` varchar(50) default NULL,
  `direccion` varchar(100) default NULL,
  `municipio` varchar(50) default NULL,
  `provincia` varchar(50) default NULL,
  `pais` varchar(10) default NULL,
  `telefono` varchar(12) default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `enf`.`centrodiagnostico` VALUES  ('1','Hospital Sant Joan de Déu','Pg. de Sant Joan de Déu, 2','Esplugues de Llobregat','Barcelona','España','932532100'),
 ('2','Hospital Clínic','C/Villarroel,170','Barcelona','Barcelona','España','932275428');
CREATE TABLE  `enf`.`enfermedad` (
  `oid` varchar(100) NOT NULL,
  `tratamiento_oid` varchar(100) default NULL,
  `nombre` varchar(50) default NULL,
  `descripcion` varchar(500) default NULL,
  PRIMARY KEY  (`oid`),
  KEY `tratamiento_oid` (`tratamiento_oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `enf`.`enfermedad` VALUES  ('1','1','escapula elevada','La escápula elevada o deformidad de Sprengel es una enfermedad congénita rara, consiste en una posición anormalmente alta con respecto al tórax y al cuello del niño de la escápula. Se produce al no descender la escapula durante el desarrollo embrionario. Puede detectarse mediante ecografia antes del nacimiento. El unico tratamiento eficaz es quirurgico'),
 ('2','2','mal de san vito','La enfermedad de Huntington es una enfermedad neurológica, es progresiva, degenerativa, hereditaria, autosómica y dominante. No hay cura para esta enfermedad. Es una enfermedad que afecta al cerebro (áreas determinadas), donde las neuronas van degenerándose y finalmente mueren. Como resultado de esto, el paciente puede experimentar movimientos incontrolables, disturbios emocionales y deterioro mental.');
CREATE TABLE  `enf`.`enfermedad_centro` (
  `oid` varchar(100) NOT NULL,
  `enfermedad_oid` varchar(100) default NULL,
  `centro_diagnostico_oid` varchar(100) default NULL,
  PRIMARY KEY  (`oid`),
  KEY `enfermedad_oid` (`enfermedad_oid`),
  KEY `centro_diagnostico_oid` (`centro_diagnostico_oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `enf`.`enfermedad_centro` VALUES  ('1','1','2');
CREATE TABLE  `enf`.`firma` (
  `oid` varchar(100) default NULL,
  `nombre` varchar(50) default NULL,
  `apellidos` varchar(50) default NULL,
  `nif` varchar(9) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `enf`.`firma` VALUES  ('1244905621576fc1e108','Manuel','Molero Busto','47013928L');
CREATE TABLE  `enf`.`historia` (
  `oid` varchar(100) NOT NULL,
  `enfermedad_oid` varchar(100) default NULL,
  `usuarionormal_oid` varchar(100) default NULL,
  `historia` varchar(500) default NULL,
  PRIMARY KEY  (`oid`),
  KEY `enfermedad_oid` (`enfermedad_oid`),
  KEY `usuarionormal_oid` (`usuarionormal_oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `enf`.`proyecto` (
  `oid` varchar(100) NOT NULL,
  `usuarioadministrador_oid` varchar(100) default NULL,
  `enfermedad_oid` varchar(100) default NULL,
  `nombre` varchar(30) default NULL,
  `fechainicio` date default NULL,
  `fechafin` date default NULL,
  PRIMARY KEY  (`oid`),
  KEY `usuarioadministrador_oid` (`usuarioadministrador_oid`),
  KEY `enfermedad_oid` (`enfermedad_oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `enf`.`tratamiento` (
  `oid` varchar(100) NOT NULL,
  `frecuencia` varchar(20) default NULL,
  `duracion` varchar(20) default NULL,
  `nombre` varchar(50) default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `enf`.`tratamiento` VALUES  ('1',NULL,NULL,'Quirurgico'),
 ('2',NULL,NULL,'Sin Cura');
CREATE TABLE  `enf`.`usuarioadministrador` (
  `oid` varchar(100) NOT NULL,
  `nombre` varchar(30) default NULL,
  `apellidos` varchar(50) default NULL,
  `contrasena` varchar(50) default NULL,
  `nif` varchar(9) default NULL,
  `email` varchar(50) default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `enf`.`usuarioadministrador` VALUES  ('1','Manuel','Molero Busto','635','47013928L','MM_6891@hotmail.com');
CREATE TABLE  `enf`.`usuariocualificado` (
  `oid` varchar(100) NOT NULL,
  `nombre` varchar(20) default NULL,
  `apellidos` varchar(50) default NULL,
  `contrasena` varchar(30) default NULL,
  `nif` varchar(9) default NULL,
  `email` varchar(50) default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `enf`.`usuarionormal` (
  `oid` varchar(100) NOT NULL,
  `nombre` varchar(50) default NULL,
  `apellidos` varchar(50) default NULL,
  `contrasena` varchar(100) default NULL,
  `nif` varchar(9) default NULL,
  `email` varchar(50) default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `enf`.`usuarionormal` VALUES  ('1244742301231ffffffffe7472ca4','Antonio','Vazquez','antonio','48902392P','ant@hotmail.com'),
 ('12449047016343321078','Manuel','Molero Busto','635','47013928L','MM_6891@hotmail.com');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
