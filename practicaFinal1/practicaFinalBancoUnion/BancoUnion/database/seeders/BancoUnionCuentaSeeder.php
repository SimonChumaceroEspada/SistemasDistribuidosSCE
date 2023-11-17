<?php

namespace Database\Seeders;

use App\Models\BancoUnionCuenta;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class BancoUnionCuentaSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        //
        BancoUnionCuenta::factory()->count(30)->create();
    }
}
