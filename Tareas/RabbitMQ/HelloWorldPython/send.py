#!/usr/bin/env python

#

# Importamos pika
import pika

# Establecemos la conexion
# En caso de querer enviar a un host distinto de localhost se debe cambiar este valor
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
# Se crea el canal de comunicacion
channel = connection.channel()

# Verifica si existe la cola 'hello' y si no existe
# la crea
channel.queue_declare(queue='hello')


# exchange = '' -> es lo que recibe de respuesta, en este caso nada
# routing_key = 'hello' -> es el identificador del mensaje
# body = 'Hello World!' -> es el mensaje
channel.basic_publish(exchange='',
                      routing_key='hello',
                      body='Hello World!')
print(" [x] Sent 'Hello World!'")

# Cerramos la conexion
connection.close()
