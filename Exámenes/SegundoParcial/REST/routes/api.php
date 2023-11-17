<?php

use App\Http\Controllers\FacturaController;
use App\Http\Controllers\PronosticoController;
use App\Models\Pronostico;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AgendaController;
use App\Http\Controllers\PaisController;
use App\Http\Controllers\LoginController;

use App\Http\Controllers\UserController;

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

Route::middleware('jwt.verify')->apiResource('agenda', AgendaController::class);
Route::middleware('jwt.verify')->apiResource('pais', PaisController::class);

Route::post('login', [LoginController::class, 'login']);

// Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
//     return $request->user();
// });


Route::post('login', [LoginController::class, 'login']);




// Route::middleware('jwt.verify')->apiResource('user', UserController::class);

Route::middleware('jwt.verify')->apiResource('users', UserController::class);
Route::middleware('jwt.verify')->get('/user/list', [UserController::class, 'getUserList']);



Route::middleware('jwt.verify')->apiResource('facturas', FacturaController::class);

//Route::middleware('jwt.verify')->apiResource('pronosticos', PronosticoController::class);


Route::apiResource('pronosticos', PronosticoController::class);







