<?php

namespace App\Http\Controllers;

use App\Models\Factura;
use Illuminate\Http\Request;

class FacturaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
        $usuario = $request->attributes->get('usuario');
        $rol = $usuario->user->rol;
        if ($rol == "admin") {
            $facturas = Factura::all();
            return $facturas;
        } else {
            return response()->json(['message' => 'No tienes permisos para acceder a esta información.'], 403);
        }
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {

        $usuario = $request->attributes->get('usuario');
        $rol = $usuario->user->rol;
        if ($rol == "admin") {
            $input = $request->all();
            $agenda = Factura::create($input);
            return $agenda;
        }
    }
    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
        $factura = Factura::find($id);
        if ($factura == null) {
            return response()->json([
                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        return $factura;
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
        $input = $request->all();
        $factura = Factura::find($id);
        if ($factura == null) {
            return response()->json([

                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        $factura->update($input);
        return $factura;
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
        $factura = Factura::find($id);
        if ($factura == null) {
            return response()->json([

                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        $factura->delete();
        return $factura;
    }
}
