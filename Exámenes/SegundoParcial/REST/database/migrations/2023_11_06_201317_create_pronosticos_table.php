<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration {
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('pronosticos', function (Blueprint $table) {
            $table->id();
            $table->dateTime('fecha');
            $table->integer('temperatura');
            $table->double('probabilidadLluvia');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('pronosticos');
    }
};
