<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Cliente>
 */
class ClienteFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'ci' => $this->faker->randomNumber(8),
            'nombres' => $this->faker->firstName(),
            'apellidos' => $this->faker->lastName(),
            'codigo_cliente' => $this->faker->randomNumber(8),
        ];
    }
}
