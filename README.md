# ThymealfSecurity
Security: usuario, contraseña y estado - Thymealf

Los archivos sql estan en el proyecto. La orden de la ejecucion de la base de datos 'tarea1_alumno' es el siguiente:

  - ALUMNO-202302101822.sql
  - ROL-202302101822.sql
  - ROL_ALU-202302101822.sql

Usuario-USER: AT12345678 - Contraseña: 123

Usuario-ADMIN-USER: AT76324897 - Contraseña: 123

Recomendacion de la rama oracle11g, para crear las tablas automaticamente debes ir a la vension ' f7c6df1 creacion ddl tablas '. Luego deberas ejecutar SpringBoot y automaticamente se estaran creando las tablas y relaciones.

Una vez que se crearon las tablas, deberas colocar en la consola ' git checkout oracle11g ', para que el codigo vuelva a la ultima version y este pueda ser usado con normalidad en la creacion de usuarios, inicio de sesion y la lista de alumnos en caso el usuario sea de rol admi es decir 'ROLE_ADMIN'
