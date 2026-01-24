# Empresa Seguros
¡Enhorabuena! Has entrado a trabajar en una empresa de seguros, te piden escribir un programa en Java que calcule el costo anual de una póliza de seguro para los clientes.

Crea una clase Persona que represente a un cliente de una compañía de seguros. La clase debe incluir:

Atributos:

nombre (String): Nombre de la persona.

edad (int): Edad de la persona.

esFumador (boolean): Indica si la persona es fumadora.

estadoSalud (String): Estado de salud general ("Excelente", "Bueno", "Regular", "Malo").

Constructor:

Un constructor que inicializa todos los atributos de la clase.

Método:

double calcularImporteSeguro(): Este método calcula y devuelve el importe del seguro basado en los criterios especificados.

Criterios para Calcular el Importe del Seguro:

Base del seguro: El importe base del seguro es de $500.

Edad:

Si la edad es menor de 25 años, se incrementa el importe en un 20%.

Si la edad está entre 25 y 40 años, no hay cambio en el importe.

Si la edad es mayor de 40 años, se incrementa el importe en un 10%.