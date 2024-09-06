create database bdreservar_habitaciones;
use bdreservar_habitaciones;

create table rol(
idRol int not null primary key  auto_increment,
nombre varchar(40)
);


insert into rol(nombre) value("administrador");
insert into rol(nombre) value("recepcionista");
insert into rol(nombre) value("contador");
select * from rol;

create table empleado(
idEmpleado int not null primary key  auto_increment,
nombres varchar(40) not null,
apellidos varchar(40) not null,
dni varchar(20) not null,
celular varchar(30),
correo varchar(50),
estado varchar(40)
);

create table usuario(
idUsuario int not null primary key  auto_increment,
usuario varchar(40) not null,
contrasexa varchar(40) not null,
estado varchar(40) not null,
idRol int not null,
idEmpleado int not null,
foreign key fk_usuario_rol (idRol) references rol(idRol) on update cascade on delete cascade,
foreign key fk_usuario_empleado (idEmpleado) references empleado(idEmpleado) on update cascade on delete cascade
);

create table huesped(
idHuesped int not null primary key  auto_increment,
nombres varchar(40) not null,
dni varchar(20) not null,		
fecha_Nac date,
celular varchar(30),
correo varchar(50),
estado varchar(40)
);

create table tipo_habitacion(
idTipo int not null primary key  auto_increment,
nombre varchar(40) not null,
detalle varchar(100) not null,		
n_personas int not null
);

create table habitacion(
idHabitacion int not null primary key  auto_increment,
nombre varchar(40) not null,
n_piso int not null,		
precio_Dia double not null,
estado varchar(40) not null,
idTipo int not null,
foreign key fkhabitacion_tipo (idTipo) references tipo_habitacion(idTipo) on update cascade on delete cascade
);

create table Reserva(
idReserva int not null primary key  auto_increment,
fechaIngreso date not null,
fechaSalida date not null,
n_dias int not null,
n_personas int not null,
fechaRegistro date not null,
monto_Pagar double not null,
estado varchar(40) not null,
idHabitaciones int not null,
idHuesped int not null,
idUsuario int not null,
foreign key fk_reserva_habitacion (idHabitaciones) references habitacion(idHabitacion) on update cascade on delete cascade,
foreign key fk_reserva_huesped (idHuesped) references huesped(idHuesped) on update cascade on delete cascade,
foreign key fk_reserva_usuario (idUsuario) references usuario(idUsuario) on update cascade on delete cascade
);

show tables ;
 