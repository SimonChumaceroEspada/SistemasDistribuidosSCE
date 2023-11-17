<?php

namespace App\Http\Controllers;

use App\Models\Pronostico;
use Illuminate\Http\Request;

class PronosticoController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //
        $pronosticos = Pronostico::all();
        return $pronosticos;
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $input = $request->all();
        $pronostico = Pronostico::create($input);
        return $pronostico;
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
        $pronostico = Pronostico::find($id);
        if ($pronostico == null) {
            return response()->json([
                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        return $pronostico;
        //
    }
    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
        $input = $request->all();
        $pronostico = Pronostico::find($id);
        if ($pronostico == null) {
            return response()->json([

                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        $pronostico->update($input);
        return $pronostico;
    }
    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
        $pronostico = Pronostico::find($id);
        if ($pronostico == null) {
            return response()->json([

                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        $pronostico->delete();
        return $pronostico;
    }
}
