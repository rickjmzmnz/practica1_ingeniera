# practica1_ingeniera
Práctica 1 de la clase Ingeniería de Software.

Propósito: Aprender sobre el manejo de Hibernate para hacer un mapeo de una base relacional.

Instrucciones de instalación: El archivo de la base de datos se encuentra en la carpeta db, 
adentro está el archio practica1_ingeniera.Ingresamos a postgresql y ejecutamos el comando \i practica1_ingenieria.sql,
inmediatamente nos creará la base de datos con sus respectivas tablas.

Para hacer la conexión a la base de datos solo se debe de cambiar por el usuario y contraseña que se va a utilizar.

El modélo de la base de datos es lo mínimo para un inicio de sesión, se tiene las siguientes tablas:
usuario: cuenta con ID, contraseña y correo.
informacion_usuario: cuenta con el nombre completo del usuario.

Cuestionario:
¿Cuánto tiempo te tomó resolver la práctica?

Después de la explicación del ayudante del laboratorio me tomó una hora poder resolver la práctica, tomando en cuenta que
la tuve que repetir porqué no había hecho commits de lo que iba haciendo.Por lo cual, se podría decir que tardé 3 horas en total,
ya que estuve trabajando en ella en el laboratorio.

¿Cómo se llaman los archivos de configuración de Hibernate, tuviste alguna dificultad con la configuración de estos?

El archivo hibernate.cfg.xml no me causó problemas, realmente lo que tuve que revisar era la conexión a la base de datos, ya que la 
tenía mal configuradan, no la tenía en public.

El archivo hibernate.reveng.xml si me causó muchos problemas, primero no lo podía crear por la conexión que tenía mal con mi base,
después al tratar de hacer el mapeo no encontraba esté archivo y era porque no tenía la biblioteca de postgresql, y al final no me
quería crear las clases del mapeo, ya que lo tenía configurado con "public?", no se de donde salió ese signo de interrogación pero 
al quitarlo ya pude realizar el mapeo correctamente.

