CREATE DATABASE TP_Gestion_Prestamo;
USE TP_Gestion_Prestamo;

CREATE TABLE Empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    sueldo DECIMAL(10 , 2 ),
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasena VARCHAR(255) NOT NULL,
    cargo VARCHAR(30) NOT NULL
);

INSERT INTO Empleados (nombre, apellido, dni, sueldo, usuario, contrasena, cargo) VALUES
('Juan', 'Perez', '30111222', 850000, 'JEFE', 'jefe01', 'Empleados');

-- Mostrar
SELECT * FROM Empleados;

-- Borrar tabla
DROP TABLE IF EXISTS Empleados;

