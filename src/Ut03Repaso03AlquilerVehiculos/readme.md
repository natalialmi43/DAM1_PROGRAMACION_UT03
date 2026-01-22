## Alquiler de Vehículos

Escribe una clase Vehiculo con los atributos: modelo, tarifaBase (diaria), esElectrico (boolean) y diasAlquiler.

Crea un método calcularPrecioFinal() que aplique las siguientes reglas:

1. Precio inicial: tarifaBase * diasAlquiler.
2. Descuento por duración: * Si se alquila más de 7 días, se aplica un 10% de descuento sobre el total. 
3. Si se alquila más de 15 días, el descuento es del 20%. 
4. Bono Ecológico: Si esElectrico es true, se restan 15€ al total final (siempre que el total sea mayor a 15€).
5. Tasa Joven: El método debe recibir la edad del conductor. Si es menor de 25 años, se suma un recargo de 50€ por concepto de seguro de riesgo. 