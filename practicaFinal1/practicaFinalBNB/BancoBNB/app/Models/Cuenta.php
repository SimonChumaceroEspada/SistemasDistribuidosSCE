<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cuenta extends Model
{
    use HasFactory;

    protected $fillable = [
        'numero_cuenta',
        'moneda',
        'saldo',
        'codigo_cliente',


    ];

    public function cliente()
    {
        return $this->belongsTo(Cliente::class, 'codigo_cliente', 'codigo_cliente');
    }
}
