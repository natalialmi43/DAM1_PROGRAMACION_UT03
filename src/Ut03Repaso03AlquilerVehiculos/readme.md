## Alquiler de Vehículos
Escribe una clase Vehiculo con los atributos: modelo, tarifaBase (diaria), esElectrico (boolean) y diasAlquiler.
Crea un método calcularPrecioFinal() que aplique las siguientes reglas:

Precio inicial: tarifaBase * diasAlquiler.
Descuento por duración: * Si se alquila más de 7 días, se aplica un 10% de descuento sobre el total.
Si se alquila más de 15 días, el descuento es del 20%.
Bono Ecológico: Si esElectrico es true, se restan 15€ al total final (siempre que el total sea mayor a 15€).
Tasa Joven: El método debe recibir la edad del conductor. Si es menor de 25 años, se suma un recargo de 50€ por concepto de seguro de riesgo. 