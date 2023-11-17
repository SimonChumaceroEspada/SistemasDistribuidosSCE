<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Factura>
 */
class FacturaFactory extends Factory
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
            'nro' => $this->faker->randomNumber(8, true),
            'cuf' => $this->faker->word(),
            'cufd' => $this->faker->word(),
            'fecha' => $this->faker->date(),
            'monto_total' => $this->faker->randomFloat(3, 100, 800),
        ];
    }
}
