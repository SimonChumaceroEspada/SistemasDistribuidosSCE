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
        Schema::create('banco_union_clientes', function (Blueprint $table) {
            $table->id();
            $table->integer('ci')->unique();
            $table->string('nombres');
            $table->string('apellidos');
            $table->unsignedBigInteger('codigo_cliente')->unique();
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('banco_union_clientes');
    }
};
