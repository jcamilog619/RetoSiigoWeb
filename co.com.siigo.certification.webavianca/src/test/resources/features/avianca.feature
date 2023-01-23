#language: es

Característica: Reserva de vuelo en el portal de Avianca
  Quiero validar el proceso para que el cliente realice una reserva de un vuelo


  Esquema del escenario: Realizar la peticion para obener la informacion de un usuario
    Dado que el usuario ingreso al navegador
      | ciudadIda   | ciudadRegreso   | fechaSalida   | fechaRegreso   | pasajeros   |
      | <ciudadIda> | <ciudadRegreso> | <fechaSalida> | <fechaRegreso> | <pasajeros> |
    Cuando realizo la busqueda de la reserva en el portal de avianca
    Y realiza la reserva del vuelo
    Entonces se visualizara el resumen de la reserva
    Ejemplos:
      | ciudadIda | ciudadRegreso | fechaSalida     | fechaRegreso    | pasajeros       |
      | Cali      | Bogotá      | Mar, 24 ene. | Thu 21 Nov 2019 | 1 Adult,Economy |
