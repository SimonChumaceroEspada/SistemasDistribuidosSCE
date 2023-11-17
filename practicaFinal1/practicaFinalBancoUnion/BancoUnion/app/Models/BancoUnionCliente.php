<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class BancoUnionCliente extends Model
{
    use HasFactory;

    protected $fillable = [
        'ci',
        'nombres',
        'apellidos',
        'codigo_cliente'

    ];

}
