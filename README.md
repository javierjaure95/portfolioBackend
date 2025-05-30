# Spring Boot

## ForoClone 

### Descripción
Este proyecto es un clon de Reddit, permite crear comunidades, publicar en ellas, comentar publicaciones y votar posts/comentarios.
Lo cree con el fin de ser un primer acercamiento a Spring Boot

### Tecnologías Utilizadas
- Lenguaje: Java 21
- Framework: Spring Boot 3.5.0
- Base de Datos: PostgreSQL

### Instalación

1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/javierjaure95/portfolioBackend.git
2. Una vez dentro de la carpeta:
   ```bash
   cd Spring_Boot/foroclone
3. Crear y levantar los contenedores Docker
   ```bash
   docker compose up 

Esto iniciará la API RESTful en el puerto 8080 y la base de datos PostgreSQL en el puerto 5432.

### Test

Para probar la API, importa el archivo `RedditClone.postman_collection.json` en Postman.
Desde allí podrás ejecutar las distintas solicitudes para verificar el funcionamiento de los endpoints.

