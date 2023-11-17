<?php

use App\Http\Controllers\BancoUnionClienteController;
use App\Http\Controllers\BancoUnionCuentaController;
use App\Models\BancoUnionCliente;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "api" middleware group. Make something great!
|
*/

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();

});


Route::apiResource('banco_union_clientes', BancoUnionClienteController::class);
Route::apiResource('banco_union_cuentas', BancoUnionCuentaController::class);