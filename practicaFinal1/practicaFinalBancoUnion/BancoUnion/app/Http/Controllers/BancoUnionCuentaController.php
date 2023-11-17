<?php

namespace App\Http\Controllers;

use App\Models\BancoUnionCuenta;
use Illuminate\Http\Request;

class BancoUnionCuentaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return BancoUnionCuenta::all();
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //$cuenta = $request->attributes->get('banco_union_cuentas');
        $input = $request->all();
        $cuenta = BancoUnionCuenta::create($input);
        return $cuenta;

    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        $cuenta = BancoUnionCuenta::find($id);
        if ($cuenta == null) {
            return response()->json([

                'mensaje' => 'No se encontro ningun cuenta'
            ], 404);
        }
        return $cuenta;
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        $input = $request->all();
        $cuenta = BancoUnionCuenta::find($id);
        if ($cuenta == null) {
            return response()->json([

                'mensaje' => 'No se encontro al cuenta'
            ], 404);
        }
        $cuenta->update($input);
        return $cuenta;
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        $cuenta = BancoUnionCuenta::find($id);
        if ($cuenta == null) {
            return response()->json([

                'mensaje' => 'No se encontro a la cuenta$cuenta'
            ], 404);
        }
        $cuenta->delete();
        return $cuenta;
    }
}
