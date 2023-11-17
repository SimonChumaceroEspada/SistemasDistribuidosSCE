<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\Pais;

class PaisSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Pais::create(['nombre'=>'Bolivia','codigo'=>'BO']);
        Pais::create(['nombre'=>'Brasil','codigo'=>'BR']);
        Pais::create(['nombre'=>'Argentina','codigo'=>'AR']);
        Pais::create(['nombre'=>'Peru','codigo'=>'PE']);
        Pais::create(['nombre'=>'Chile','codigo'=>'CL']);
        Pais::create(['nombre'=>'Paraguay','codigo'=>'PY']);


    }
}
