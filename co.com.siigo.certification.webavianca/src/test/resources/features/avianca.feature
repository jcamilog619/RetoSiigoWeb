#language: es

Característica: Reserva de vuelo en el portal de Avianca
  Quiero validar el proceso para que el cliente realice una reserva de un vuelo


  Esquema del escenario: Realizar la peticion para obener la informacion de un usuario
    Dado que el usuario ingreso al navegador
    Y selecciono la pagina de avianca
      | ciudadIda   | ciudadRegreso   | pasajeros   |
      | <ciudadIda> | <ciudadRegreso> | <pasajeros> |
    Cuando realiza la busqueda de la reserva en el portal de avianca
    Y realiza la reserva del vuelo
    Entonces se visualizara el resumen de la reserva
    Ejemplos:
      | ciudadIda | ciudadRegreso | pasajeros       |
      | Cali      | Bogotá        | 2 Adult,Economy |