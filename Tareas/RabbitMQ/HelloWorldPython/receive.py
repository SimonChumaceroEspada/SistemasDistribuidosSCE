#!/usr/bin/env python

# Importamos las librerias
import pika
import sys
import os


def main():
    # Establecemos la conexion con el servidor de RabbitMQ
    # en localhost en este caso
    connection = pika.BlockingConnection(
        pika.ConnectionParameters(host='localhost'))

    # Creamos el canal de comunicacion
    channel = connection.channel()

    # Declaramos la cola 'hello'
    channel.queue_declare(queue='hello')

    # Función que se llama cuando se recibe un mensaje desde la cola
    def callback(ch, method, properties, body):
        print(f" [x] Received {body}")

    # Consumidor básico, llama a la función 'callback' cuando se recibe un mensaje
    # de la cola 'hello'
    # auto_ack=True -> indica que el mensaje se ha recibido
    channel.basic_consume(
        queue='hello', on_message_callback=callback, auto_ack=True)

    print(' [*] Waiting for messages. To exit press CTRL+C')
    # Iniciamos la recepcion de mensajes
    channel.start_consuming()


if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        # Muestra un mensaje en caso de interrupción
        print('Interrupted')
        try:
            # Sale del programa con el valor 0
            sys.exit(0)
        except SystemExit:
            # Fina el programa
            os._exit(0)
