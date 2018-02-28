create table Usuarios 
 (Usuario_Id INT AUTO_INCREMENT,
 usuario varchar(30), 
 password varchar(20), 
 puesto varchar (20), 
 nivel varchar(20) unique,
 primary key(Usuario_Id));

create table Productos
 (Producto_Id INT AUTO_INCREMENT, 
 Nombre varchar(30) not null, 
 descripcion varchar (50), 
 precio double not null, 
 unidadMedida double not null, 
 categoria varchar(20),
 primary key(Producto_Id));

create table Proveedores
(Proveedores_Id INT AUTO_INCREMENT, 
 proveedor varchar(30) not null, 
 Nombre varchar(40), 
 direccion varchar(30), 
 telefono varchar(15), 
 formaPago varchar(20), 
 RFC varchar(25) not null,
 primary key(Proveedores_Id));

INSERT INTO Usuarios (Usuario_Id , usuario, password , puesto, nivel) VALUES (NULL, 'AMartinez', 'requi1234', 'Requisitor', '4');


