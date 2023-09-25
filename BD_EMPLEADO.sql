create database EmpleadosBD

drop database EmpleadosBD

use EmpleadosBD

CREATE TABLE Empleados (
    idEmpleado INT AUTO_INCREMENT PRIMARY KEY,
    apellidos VARCHAR(20) NOT NULL,
    nombres VARCHAR(20) NOT NULL,
    edad INT CHECK (edad >= 18),
    sexo CHAR(1) CHECK (sexo IN ('M', 'F')),
    salario DECIMAL(8,2) CHECK (salario BETWEEN 1500 AND 999999.99)
);


INSERT INTO Empleados (apellidos, nombres, edad, sexo, salario)
VALUES
    ('TORRES', 'JOSE', 22, 'M', 1500),
    ('GARCIA', 'MARIA', 21, 'F', 1750),
    ('FLORES', 'JUAN', 22, 'M', 1850),
    ('CASAS', 'ANA', 23, 'F', 2000),
    ('RODRIGUEZ', 'CARLOS', 25, 'M', 2200);

select * from Empleados

