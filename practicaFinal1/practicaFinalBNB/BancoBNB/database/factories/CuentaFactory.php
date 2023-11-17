<?php

namespace Database\Factories;

use App\Models\Cliente;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Cuenta>
 */
class CuentaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'moneda' => $this->faker->randomElement(['USD', 'BO']),
            'saldo' => $this->faker->randomFloat(2, 0, 1000),
            'numero_cuenta' => $this->faker->randomNumber(8),

            // Llave foranea
            'codigo_cliente' => function () {
                return Cliente::inRandomOrder()->first()->codigo_cliente;
            },
        ];
    }
}
