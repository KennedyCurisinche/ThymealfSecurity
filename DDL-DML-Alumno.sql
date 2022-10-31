CREATE DATABASE `tarea1_alumno` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE tarea1_alumno;
CREATE TABLE `alumno` (
  `id_alumno` bigint NOT NULL AUTO_INCREMENT,
  `alumno` varchar(255) NOT NULL,
  `cod_alumno` varchar(255) NOT NULL,
  `contrasenia` varchar(255) NOT NULL,
  `activo` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id_alumno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `rol` (
  `id_rol` bigint NOT NULL AUTO_INCREMENT,
  `rol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `rol_alu` (
  `idalu` bigint NOT NULL,
  `idrol` bigint NOT NULL,
  KEY `fk_rol_alu_idalu` (`idalu`),
  KEY `fk_rol_alu_idrol` (`idrol`),
  CONSTRAINT `fk_rol_alu_idalu` FOREIGN KEY (`idalu`) REFERENCES `alumno` (`id_alumno`),
  CONSTRAINT `fk_rol_alu_idrol` FOREIGN KEY (`idrol`) REFERENCES `rol` (`id_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

alter table tarea1_alumno.alumno auto_increment = 1;

INSERT INTO tarea1_alumno.alumno (alumno,cod_alumno,contrasenia,activo) VALUES
	 ('Marcos Curisinche','AT12345678','$2a$10$REVW0qEM/cxjMTtnByEIyOrBGrf7P6tupTZdgdrMxWY3A06QuLDve',0),
	 ('Rogger Curisinche','AT76324897','$2a$10$ta1cAFd4vO6MXblKe.VK/uY6aJBr5axG4pJs27vlI7IdpLUg9Uakm',1);

alter table tarea1_alumno.rol auto_increment = 1;

INSERT INTO tarea1_alumno.rol (rol) VALUES
	 ('ROLE_USER'),
	 ('ROLE_ADMIN');

INSERT INTO tarea1_alumno.rol_alu (idalu,idrol) VALUES
	 (1,1),
	 (2,2),
	 (2,1);