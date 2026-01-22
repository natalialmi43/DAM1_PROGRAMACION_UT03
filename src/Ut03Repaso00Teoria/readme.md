# Teoría
1. Conceptos básicos: ¿Qué es una clase y qué es un objeto? Explica la relación entre ambos usando el concepto de "molde" y "galleta".

Clase (El Molde): Es la plantilla o definición abstracta. Define la estructura (atributos) y el comportamiento (métodos) que tendrán los elementos creados a partir de ella, pero no contiene datos concretos por sí misma.

Objeto (La Galleta): Es la instancia concreta creada a partir de la clase. Ocupa espacio en memoria y tiene su propio estado (valores específicos en sus atributos).

Relación: La clase es el molde de metal con forma de estrella. No te puedes comer el molde. El objeto es la galleta real que sale del horno. Con un solo molde (clase) puedes crear infinitas galletas (objetos). Si rompes una galleta, el molde y las demás galletas no sufren daños.

2. Encapsulamiento: ¿Para qué sirven los modificadores private y public? ¿Por qué no es recomendable dejar los atributos como public?

private: El miembro (atributo o método) solo es visible y accesible desde dentro de la propia clase.

public: El miembro es accesible desde cualquier parte del programa.

¿Por qué no dejar atributos como public? Rompe el principio de encapsulamiento. Si un atributo es público, cualquier clase externa puede modificar su valor sin control, pudiendo dejar al objeto en un estado inválido (por ejemplo, asignar una edad = -50). Al hacerlos privados, obligas a usar métodos (setters) donde puedes añadir lógica de validación antes de aceptar el cambio.

3. El constructor: Define qué es un constructor. ¿Qué ocurre si creamos una clase y no escribimos ningún constructor de forma explícita?

Es un método especial que se ejecuta automáticamente al crear una instancia de la clase. Su objetivo principal es inicializar el objeto (dar valores de inicio a los atributos). Tiene el mismo nombre que la clase y no devuelve ningún tipo de dato (ni siquiera void).

¿Qué ocurre si no escribes ninguno? El compilador de Java inserta automáticamente un constructor por defecto (sin parámetros) que inicializa los atributos con sus valores "cero" (0 para números, null para objetos, false para booleanos). Si tú escribes cualquier constructor manualmente, el compilador deja de insertar el suyo.

4. Sobrecarga: ¿En qué consiste la sobrecarga de constructores? Pon un ejemplo de una clase con dos constructores diferentes.

Consiste en definir múltiples constructores en una misma clase, diferenciándolos por su firma (el número, tipo u orden de los parámetros). Esto permite crear objetos de diferentes formas según los datos disponibles en ese momento.


5. Palabra reservada this: Explica los dos usos principales de this en Java.

Tiene dos usos fundamentales:

Referencia al objeto actual: Para diferenciar los atributos de la clase de los parámetros del método cuando tienen el mismo nombre (evitar el shadowing).

Ej: this.nombre = nombre;

Llamada a otro constructor: Para reutilizar código llamando a un constructor desde otro dentro de la misma clase (debe ser la primera línea de código).

Ej: this("MarcaPorDefecto", 0);

6. Miembros estáticos: ¿Qué diferencia hay entre un atributo normal y uno marcado como static? ¿A quién pertenece el valor de un atributo estático?

Diferencia: Un atributo normal (de instancia) pertenece a cada objeto individual; cada objeto tiene su propia copia. Un atributo static pertenece a la clase. Solo existe una copia en memoria compartida por todos los objetos.

Pertenencia: Pertenece a la clase, no a las instancias. Si un objeto modifica un atributo estático, el cambio se refleja para todos los demás objetos.

7. Métodos getter y setter: ¿Cuál es su función? Escribe la sintaxis de un getter y un setter para un atributo int energia.

Su función es proporcionar un acceso controlado a los atributos privados (Leer con get y Escribir con set), manteniendo el encapsulamiento.

8. Ciclo de vida: ¿En qué momento se crea un objeto en memoria y qué operador se utiliza para ello?

Creación: El objeto se crea en tiempo de ejecución (runtime), específicamente cuando la instrucción es procesada por la JVM.

Operador: Se utiliza el operador new. Este operador reserva espacio en la memoria Heap y devuelve la referencia (dirección de memoria) del objeto creado.

9. Parámetros: En un método, ¿cuál es la diferencia entre pasar un tipo primitivo (como int) y pasar un objeto?

En Java, todo se pasa por valor (copia), pero el comportamiento difiere según lo que se copie:

Tipo primitivo (int, double): Se copia el valor real. Si el método modifica el parámetro, la variable original fuera del método no cambia.

Objeto: Se pasa una copia de la referencia (la dirección de memoria). No se pasa el objeto entero. Si el método usa esa referencia para modificar el estado del objeto (ej. p.setNombre(...)), el objeto original sí se ve afectado, porque ambos (original y parámetro) apuntan al mismo sitio en memoria.

10. Análisis de código: ¿Qué salida produce este código?
Persona p1 = new Persona("Ana");

Persona p2 = p1;

p2.setNombre("Eva");

System.out.println(p1.getNombre()); 

Sale Eva