create database BLACKMARKET;
use BLACKMARKET;

create table Usuario(
 idUsuario int auto_increment primary key,
 Usuario varchar(20),
 Contraseña varchar(20),
 Correo varchar(20),
 TipoUsuario varchar(20)
);

create table Producto(
idProducto int auto_increment primary key,
producto varchar(30),
categoria varchar(30),
cantidad int,
precio float,
imagen longblob
);

insert into Usuario(Usuario,Contraseña,Correo,TipoUsuario) values('Vendedor','1234','asda@hotmail.com','Vendedor');
insert into Usuario(Usuario,Contraseña,Correo,TipoUsuario) values('Comprador','1234','asda@hotmail.com','Comprador');

