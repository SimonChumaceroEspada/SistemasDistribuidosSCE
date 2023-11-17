<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Pronostico>
 */
class PronosticoFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            //
            'fecha' => $this->faker->date(),
            'temperatura' => $this->faker->randomFloat(2, 0, 36),
            'probabilidadLluvia' => $this->faker->randomFloat(3, 0, 100),
        ];
    }
}
