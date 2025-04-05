# PA-Tienda

## Clases
	Cliente
		 nombre
		 apellido
		 correo electronico
		 numero de contacto
		 estado civil
		 ciudad	

	Dispositivo
		 marca
		 memoria ram
		 memoria almacenamiento
		 procesador
		 modelo
		 año de fabricacion
		 precio
		 cantidad stock
	 Computador
		 gpu
		 psu
		 chasis
		 pantalla
	 Notebook
		 resolucion
		 tipo de teclado
		 bateria(medida en mAh)
	Tablet
		 resolucion
		 accesorios


	Tienda
		 direccion
		 catalogo

## Funcionalidades

Agregar clientes y disposivitivos, modificar direccion de la tienda, realizar ventas de dispositivos a clientes especificos, buscar dispositivos disponibles(por marca, modelo o precio) y generar una lista asociada a un cliente.

## Relaciones

 Cliente -> Tienda
 Dispositivo -> Tienda
 Dispositivo -> Cliente
