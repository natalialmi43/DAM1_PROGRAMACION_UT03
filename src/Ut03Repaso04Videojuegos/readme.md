## Videojuego
Crea una clase Personaje

Atributos: nombre, nivel (int), puntosVida (int), esMagico (boolean).


Constructor: Inicializa el nombre y si es mágico. El nivel empieza en 1 y la vida en 100.


Lógica de Daño: Crea un método recibirDaño(int daño):
- Si el personaje esMagico, el daño recibido se reduce un 20%. 
- Si después de recibir daño la vida baja de 0, se debe fijar en 0.


Lógica de Curación: Crea un método curar():
- Si el nivel es menor de 5, recupera 10 puntos de vida. 
- Si el nivel es 5 o superior, recupera 25 puntos. 
- La vida nunca puede superar los 100 puntos. 