CREATE DATABASE practica1_ingenieria;

CREATE TABLE usuario(
id_usuario INTEGER NOT NULL PRIMARY KEY,
correo_electronico VARCHAR(100) NOT NULL,
contraseña VARCHAR(30) NOT NULL
);

CREATE TABLE informacion_usuario(
id_usuario INTEGER NOT NULL PRIMARY KEY,
nombre_usuario VARCHAR(30) NOT NULL,
apellido_paterno_usuario VARCHAR(30) NOT NULL,
apellido_materno_usuario VARCHAR(30) NOT NULL,
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);
