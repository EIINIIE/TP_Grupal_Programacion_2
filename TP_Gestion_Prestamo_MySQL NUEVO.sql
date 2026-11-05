CREATE DATABASE TP_Gestion_Prestamo;
USE TP_Gestion_Prestamo;

CREATE TABLE Usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    sueldo FLOAT NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasenia VARCHAR(10) NOT NULL,
    cargo VARCHAR(30) NOT NULL
);

CREATE TABLE Analista (
    id_analista INT AUTO_INCREMENT PRIMARY KEY,
    id_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    sueldo FLOAT NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasenia VARCHAR(10) NOT NULL,
    contrasenia VARCHAR(10) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
	cantidadPrestamosAnalizados INT NOT NULL
);

CREATE TABLE Asesor (
    id_asesor INT AUTO_INCREMENT PRIMARY KEY,
    id_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    sueldo FLOAT NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasenia VARCHAR(10) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    cantidadSolicitudes INT NOT NULL
);

CREATE TABLE Cajero (
    id_cajero INT AUTO_INCREMENT PRIMARY KEY,
    id_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    sueldo FLOAT NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasenia VARCHAR(10) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    numeroCaja INT NOT NULL
);

CREATE TABLE Cliente (
    id_Cliente INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    sueldo FLOAT NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasenia VARCHAR(10) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    telefono VARCHAR (15) NOT NULL,
    email VARCHAR(10) NOT NULL,
    direccion VARCHAR(30) NOT NULL
);

CREATE TABLE Cobrador (
    id_cobrador INT AUTO_INCREMENT PRIMARY KEY,
    id_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    sueldo FLOAT NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasenia VARCHAR(10) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    zonaAsignada VARCHAR(30) NOT NULL
);

CREATE TABLE Prestamo (
    id_prestamo INT AUTO_INCREMENT PRIMARY KEY,
    -- private Cliente cliente;  -- en intellij tengo esto
    montoSolicitado float NOT NULL,
    cantidadCuotas INT NOT NULL,
    interes FLOAT NOT NULL,
    montoTotal FLOAT NOT NULL,
    valorCuota FLOAT NOT NULL,
    fechaSolicitud VARCHAR(10) NOT NULL,
    estado VARCHAR(30) NOT NULL
);

INSERT INTO Empleados (nombre, apellido, dni, sueldo, usuario, contrasena, cargo) VALUES
('Juan', 'Perez', '30111222', 850000, 'JEFE', 'jefe01', 'Empleados');

-- Mostrar
SELECT * FROM Usuario;
SELECT * FROM Analista;
SELECT * FROM Asesor;
SELECT * FROM Cajero;
SELECT * FROM Cliente;
SELECT * FROM Cobrador;
SELECT * FROM Prestamo;


-- Borrar tabla
DROP TABLE IF EXISTS Empleados;
DROP TABLE IF EXISTS Analista;
DROP TABLE IF EXISTS Asesor;
DROP TABLE IF EXISTS Cajero;
DROP TABLE IF EXISTS Cliente;
DROP TABLE IF EXISTS Cobrador;
DROP TABLE IF EXISTS Prestamo;

