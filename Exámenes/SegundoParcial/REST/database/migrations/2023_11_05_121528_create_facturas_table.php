<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateFacturasTable extends Migration
{
    public function up()
    {
        Schema::create('facturas', function (Blueprint $table) {
            $table->id(); // Campo 'id' único y autoincremental
            $table->integer('nro')->unique(); // Campo 'nro' único y autoincremental
            $table->date('fecha'); // Campo 'fecha' en formato de fecha
            $table->string('cuf', 30); // Campo 'cuf' de hasta 30 caracteres
            $table->string('cufd', 30); // Campo 'cufd' de hasta 30 caracteres
            $table->decimal('monto_total', 30, 3); // Campo 'monto_total' número flotante con 30 espacios y 3 decimales
            $table->timestamps(); // Campos 'created_at' y 'updated_at' para el registro de tiempo

            // Asegúrate de que los campos no sean nulos
            $table->string('cuf')->nullable(false)->change();
            $table->string('cufd')->nullable(false)->change();
            $table->date('fecha')->nullable(false)->change();
            $table->decimal('monto_total', 30, 3)->nullable(false)->change();
        });
    }

    public function down()
    {
        Schema::dropIfExists('facturas');
    }
}
