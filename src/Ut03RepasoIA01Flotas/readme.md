# Sistema de Gestión de Flotas "TransJava S.A.

La empresa de logística TransJava S.A. necesita un programa para gestionar sus vehículos de reparto. Debes crear una clase llamada Vehiculo siguiendo estas especificaciones:

1. Atributos y Constantes
   Constantes (static final):

Costo base de mantenimiento: $200.

Capacidad máxima de carga permitida: 2000 kg.

Atributos de instancia:

idVehiculo (String)

kilometraje (double)

cargaActual (double)

tipoMotor (String: "Diesel", "Gasolina", "Eléctrico")

2. Métodos a implementar
   A. double calcularCostoMantenimiento()
   Calcula el costo total basándose en:

Si el motor es Diesel, el costo base aumenta un 15%.

Si el motor es Gasolina, el costo base aumenta un 10%.

Si el motor es Eléctrico, el costo base tiene un descuento del 5%.

Recargo por uso: Si el kilometraje es superior a 100,000 km, añade un recargo fijo de $100.

B. boolean cargarPaquete(double pesoPaquete)
Este método debe intentar añadir peso al vehículo:

Debe comprobar si el pesoPaquete + cargaActual supera la Capacidad máxima.

Si cabe: actualiza la cargaActual y devuelve true.

Si no cabe: no actualiza nada, imprime un aviso y devuelve false.

C. String obtenerCategoriaEmisiones()
Devuelve una etiqueta según el motor:

"Eco": Eléctrico.

"Estándar": Gasolina.

"Industrial": Diesel.

D. void realizarViaje(double distancia)
Suma la distancia al kilometraje actual.

Reto: Si la distancia es negativa, el programa debe imprimir un error (o lanzar una excepción) y no sumar nada.

3. Clase de Prueba (Main)
   Para demostrar que tu código funciona, en el main debes:

Crear un vehículo Diesel con 95,000 km.

Intentar cargarle un paquete de 2500 kg (debe fallar).

Hacer un viaje de 6,000 km.

Calcular e imprimir el costo de mantenimiento (debería incluir ahora el recargo por superar los 100k km).