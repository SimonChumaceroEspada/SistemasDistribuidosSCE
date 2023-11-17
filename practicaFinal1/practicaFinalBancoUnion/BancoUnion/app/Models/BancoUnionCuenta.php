<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class BancoUnionCuenta extends Model
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
        return $this->belongsTo(BancoUnionCliente::class, 'codigo_cliente', 'codigo_cliente');
    }
}
