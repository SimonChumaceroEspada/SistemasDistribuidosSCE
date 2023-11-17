<?php

namespace Database\Seeders;

use App\Models\BancoUnionCliente;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class BancoUnionClienteSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        //
        BancoUnionCliente::factory()->count(30)->create();
    }
}
