/*
Nombre: Auky Daniel Rodriguez Sey
Codigo Academico: IN5BV
Carné: 2019473
Fecha De Creacion : 30-03-2023
Fecha De Modificacion:
*/
-- ______________________________________

Drop database if exists DBTonysKinal2023;
Create database DBTonysKinal2023;
Use DBTonysKinal2023;

Create table Empresas(
	codigoEmpresa int auto_increment not null,
    nombreEmpresa varchar(150) not null,
    direccion varchar(150) not null,
    telefono varchar(10) not null,
    
    primary key PK_codigoEmpresa(codigoEmpresa)
);

Create table TipoEmpleado(
	codigoTipoEmpleado int not null auto_increment,
    descripcion varchar(50) not null,
    
    primary key PK_codigoTipoEmpleado (codigoTipoEmpleado)
);

Create table Empleados(
	codigoEmpleado int auto_increment not null,
    numeroEmpleado int not null,
    apellidosEmpleado varchar(150) not null,
    nombresEmpleado varchar(150) not null,
    direccionEmpleado varchar(150) not null,
    telefonoContacto varchar(10) not null,
    gradoCocinero varchar(50) not null,
    codigoTipoEmpleado int not null,
    
    primary key PK_codigoEmpleado(codigoEmpleado),
    constraint FK_Empleados_tipoEmpleado foreign key 
    (codigoTipoEmpleado) references TipoEmpleado(codigoTipoEmpleado)
);

Create table TipoPlato(
	codigoTipoPlato int auto_increment not null,
    descripciontipo varchar(100) not null,
    primary key PK_codigoTipoPlato(codigoTipoPlato)
);

Create table Productos(
	codigoProducto int not null,
    nombreProducto varchar(150) not null,
    cantidad int not null,
    
    primary key PK_codigoProducto(codigoProducto)
);

Create table Servicios(
	codigoServicio int auto_increment not null,
    fechaServicio date not null,
    tipoServicio varchar(150) not null,
    horaServicio time not null,
    lugarServicio varchar(150) not null,
    telefonoContacto varchar(10) not null,
    codigoEmpresa int not null,
    
    primary key PK_codigoServicio (codigoServicio),
    constraint FK_Servicios_Productos foreign key (codigoEmpresa)
		references Empresas(codigoEmpresa)
);

create table Presupuestos(

	codigoPresupuesto int auto_increment not null,
	fechaSolicitud date not null,
	cantidadPresupuesto decimal (10,2) not null,
    codigoEmpresa int not null,
    primary key PK_codigoPresupuesto (codigoPresupuesto),
    constraint FK_Presupuesto_Empresas foreign key (codigoEmpresa)
    references Empresas (codigoEmpresa)
);

Create table Platos(
	codigoPlato int auto_increment not null,
    cantidad int not null,
    nombrePlato varchar(50) not null,
    descripcionPlato  varchar(150) not null,
    precioPlato decimal(10,2) not null,
    codigoTipoPlato int not null,
    -- tipoPlato codigoTipoPlato int not null
    primary key PK_codigoPlato(codigoPlato),
    constraint FK_Platos_TipoPlato1 foreign key (codigoTipoPlato)
		references TipoPlato (codigoTipoPlato)
);

Create table Productos_has_Platos(
	Productos_codigoProducto int not null,
    codigoPlato int not null,
    codigoProducto int not null,
    primary key PK_Productos_codigoProducto(Productos_codigoProducto),
    constraint FK_Productos_has_Platos_productos1 foreign key (codigoProducto)
		references Productos(codigoProducto),
    constraint FK_Productos_has_Platos_Platos1 foreign key (codigoPlato)
		references Platos(codigoPlato)
);

Create table Servicios_has_Platos(
	Servicios_codigoServicio int not null,
    codigoPlato int not null,
    codigoServicio int not null,
    
    primary key PK_Servicios_codigoServicio (Servicios_codigoServicio),
    constraint FK_Servicio_has_Platos_Servicios1 foreign key(codigoServicio)
		references Servicios(codigoServicio),
	constraint FK_Servicios_has_Platos_Platos1 foreign key (codigoPlato)
		references Platos(codigoPlato)
);

Create table Servicios_has_Empleados(
	Servicios_codigoServicio int not null,
    codigoServicio int not null,
    codigoEmpleado int not null,
    fechaEvento date not null,
    horaEvento time not null,
    lugarEvento varchar(150) not null,
  
    primary key PK_Servicios_codigoServicio (Servicios_CodigoServicio),
    constraint FK_Servicios_has_Empleados_Servicios foreign key (codigoServicio)
		references Servicios(codigoServicio),
	constraint FK_Servicios_has_Empleados_Empleados1 foreign key (codigoEmpleado)
		references Empleados(codigoEmpleado)
);

-- use DBRecuperacion;
-- _____________________Procedimientos almacenados agregar empresas ____________________________
Delimiter $$

	Create procedure sp_AgregarEmpresa(in nombreEmpresa varchar(150), in direccion varchar(150), in telefono varchar(10))
		begin
			insert into Empresas(nombreEmpresa,direccion,telefono)
				values(nombreEmpresa,direccion,telefono);
        End$$        
		
Delimiter ;

Call sp_AgregarEmpresa ('Campero','Guatemala Ciudad','0123456789');
Call sp_AgregarEmpresa ('Farmacia Galeno','Mixco','1234567890');
Call sp_AgregarEmpresa ('Pinulito','Guatemala Ciudad''1234567899');


-- _____________________Procedimientos almacenados agregar tipo de empleado ____________________________
Delimiter $$
Create procedure sp_AgregarTipoEmpleado(in descripcion varchar(50))
	begin
		insert into TipoEmpleado(descripcion)
			values(descripcion);
    End$$        
	
Delimiter ;

Call sp_AgregarTipoEmpleado ('Cocinero');
Call sp_AgregarTipoEmpleado ('Mesero');
Call sp_AgregarTipoEmpleado ('Administrativo');

-- _____________________Procedimientos almacenados agregar empleado ____________________________
Delimiter $$
Create procedure sp_AgregarEmpleado(in numeroEmpleado int, in apellidosEmpleado varchar(150), in nombresEmpleado varchar(150), in direccionEmpleado varchar(150), in telefonoContacto varchar(10), in gradoCocinero varchar(50), in codigoTipoEmpleado int)
	begin
    
		insert into Empleados(numeroEmpleado, apellidosEmpleado, nombresEmpleado, direccionEmpleado, 
                              telefonoContacto, gradoCocinero, codigoTipoEmpleado)
			values(numeroEmpleado, apellidosEmpleado, nombresEmpleado, direccionEmpleado, telefonoContacto, 
                   gradoCocinero, codigoTipoEmpleado);
    End$$ 
    
    Delimiter ;

Call sp_AgregarEmpleado(1, 'Pérez', 'Juan', 'Zona 10', '12345678', 'Chef', 1);
Call sp_AgregarEmpleado(2, 'García', 'María', 'Zona 4', '23456789', 'Cocinero', 1);
Call sp_AgregarEmpleado(3, 'López', 'Pedro', 'Zona 15', '34567890', 'Mesero', 2);

-- _____________________Procedimientos almacenados agregar tipo de plato ____________________________
Delimiter $$
Create procedure sp_AgregarTipoPlato(in descripciontipo varchar(100))
	begin
		insert into TipoPlato(descripciontipo)
			values(descripciontipo);
    End$$        
	
Delimiter ;

Call sp_AgregarTipoPlato ('Entrada');
Call sp_AgregarTipoPlato ('Plato fuerte');
Call sp_AgregarTipoPlato ('Postre');

-- _____________________Procedimientos almacenados agregar producto ____________________________
Delimiter $$
Create procedure sp_AgregarProducto(in codigoProducto int, in nombreProducto varchar(150), 
                                    in cantidad int)
	begin
		insert into Productos(codigoProducto, nombreProducto, cantidad)
			values(codigoProducto, nombreProducto, cantidad);
    End$$   
    
Delimiter ;

Call sp_AgregarProducto (1, 'Arroz', 100);
Call sp_AgregarProducto (2, 'Frijoles', 80);
Call sp_AgregarProducto (3, 'Aceite', 50);

-- _____________________Procedimientos almacenados agregar servicio ____________________________
Delimiter $$	
Create procedure sp_AgregarServicio(in fechaServicio date, in tipoServicio varchar(150), 
                                    in horaServicio time, in lugarServicio varchar(150), 
                                    in telefonoContacto varchar(10), in codigoEmpresa int)
	begin
		insert into Servicios(fechaServicio, tipoServicio, horaServicio, lugarServicio, telefonoContacto, 
                              codigoEmpresa)
			values(fechaServicio, tipoServicio, horaServicio, lugarServicio, telefonoContacto, codigoEmpresa);
    End$$  






















