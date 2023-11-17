<?php

namespace Database\Seeders;

// use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\User;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     */
    public function run(): void
    {
        // \App\Models\User::factory(10)->create();

        // \App\Models\User::factory()->create([
        //     'name' => 'Test User',
        //     'email' => 'test@example.com',
        // ]);
        $this->call([AgendaSeeder::class, PaisSeeder::class]);
        $this->call([FacturaSeeder::class, FacturaSeeder::class]);
        $this->call([PronosticoSeeder::class, PronosticoSeeder::class]);
        User::factory()->create(
            [
                'name' => 'Admin',
                'email' => 'admin@agenda.com',
                'password' => '123',
                'rol' => 'admin',
            ],
        );
        User::factory()->create(
            [
                'name' => 'User',
                'email' => 'user@agenda.com',
                'password' => '456',
                'rol' => 'user',
            ],
        );

        //User::factory()->create(30);

    }

}
