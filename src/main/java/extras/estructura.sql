CREATE TABLE Sucursal(
	id_sucursal SERIAL NOT null PRIMARY KEY,
	nombre VARCHAR(100),
	horario_apertura VARCHAR(50),
	horario_cierre VARCHAR(50),
	estado_sucursal VARCHAR(50)
);

CREATE TABLE Producto(
	id_producto SERIAL NOT null PRIMARY KEY,
	nombre VARCHAR(100),
	descripcion VARCHAR(300),
	precio_unitario FLOAT(30),
	peso_kg FLOAT(30)
);

CREATE TABLE Camion(
	id_camion SERIAL NOT null PRIMARY KEY,
	capacidad FLOAT(30),
	sucursal_pertenece INTEGER REFERENCES Sucursal(id_sucursal)
);

CREATE TABLE Sucursal_Producto(
	id_sucursal INTEGER,
	id_producto INTEGER,
	stock INTEGER,
	CONSTRAINT pk_sp PRIMARY KEY(id_sucursal,id_producto),
	CONSTRAINT fk_id_sucursal FOREIGN KEY (id_sucursal) REFERENCES Sucursal(id_sucursal),
	CONSTRAINT fk_id_producto FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);

CREATE TABLE Ruta(
    id_ruta SERIAL NOT null PRIMARY KEY,
    sucursal_origen INTEGER,
    sucursal_destino INTEGER,
    tiempo_de_transito INTEGER,
    capacidad_maxima FLOAT(30),
    estado_ruta VARCHAR(30),
    color VARCHAR(30),
    FOREIGN KEY (sucursal_origen) REFERENCES Sucursal(id_sucursal),
    FOREIGN KEY (sucursal_destino) REFERENCES Sucursal(id_sucursal)
);

CREATE TABLE Orden_De_Provision(
	id_orden SERIAL NOT null PRIMARY KEY,
	fecha_orden DATE,
	sucursal_destino INTEGER,
	tiempo_max_horas INTEGER,
	id_sucursal INTEGER,
	CONSTRAINT fk_id_sucursal_destino FOREIGN KEY (sucursal_destino) REFERENCES Sucursal(id_sucursal),
	CONSTRAINT fk_id_sucursal FOREIGN KEY (id_sucursal) REFERENCES Sucursal(id_sucursal)
);

CREATE TABLE ODP_Item(
	id_item INTEGER,
	id_orden INTEGER,
	id_producto INTEGER,
	cantidad INTEGER,
	CONSTRAINT pk_ITOR PRIMARY KEY(id_item,id_orden),
	CONSTRAINT fk_id_orden FOREIGN KEY (id_orden) REFERENCES Orden_De_Provision(id_orden),
	CONSTRAINT fk_id_prdoucto FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);


