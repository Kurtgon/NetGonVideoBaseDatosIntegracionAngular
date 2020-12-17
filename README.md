# NetGonVideo #

**Introducción**

El objetivo del proyecto es gestionar los clientes de esta aplicación que demandan péliculas y series.

Requisitos.

- Tener instalado Spring Tool Suite, para la parte backend.
- Utilizar algún navegador web para la parte frontend.

## Preparación del entorno ##

- Descargamos el backend de: https://github.com/
- Descargamos el frontend de: 

## Backend ##



- Importamos el proyecto en Spring.

  		File -> Import -> Maven -> Existing Maveng Projects

- Iniciamos el servidor desde Spring



- Desde el "**Boot Dashboard**"

  		Desplegamos el botón "local" -> click botón derecho sobre "NetGonVideoBaseDatos" -> click sobre start
  		o lo selecionamos y le pinchamos en botón de star o restar

## Funcionalidades ##

Entidad: **Customer**
src/main/java/com.jacaranda/entity/Customer

Controlador: **CustomerController**
src/main/java/com.jacaranda/controller/CustomerController



- Método Get http://localhost:8080/api/customers

	Listado de todos los clientes



- Método Get por parámetro id http://localhost:8080/api/customers/{id}

	Búsqueda de un cliente por id



- Método POST http://localhost:8080/api/customers

	Añadir o crear un cliente



- Método PUT http://localhost:8080/api/customers

	Actualizar un cliente



- Método DELETE http://localhost:8080/api/customers/{id}

	Eliminar un cliente por id

- Servicios: CrudService
src/main/java/com.jacaranda/services/CrudService

	Van los response del método crud

Repositorio: **CustomerRepository**
src/main/java/com.jacaranda/CustomerRepository

**Interface** para los métodos de búsqueda de clientes: 

- Ordenada por nombre.
- Búsqueda por dni.
- Búsqueda por id.