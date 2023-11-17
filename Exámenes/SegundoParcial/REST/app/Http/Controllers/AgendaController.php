<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Agenda;

class AgendaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return Agenda::all();
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
            $agenda = Agenda::create($input);
            return $agenda;
        }
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        $agenda = Agenda::find($id);
        if ($agenda == null) {
            return response()->json([

                'mensaje' => 'No se encontro a la agenda'
            ], 404);
        }
        return $agenda;
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        $input = $request->all();
        $agenda = Agenda::find($id);
        if ($agenda == null) {
            return response()->json([

                'mensaje' => 'No se encontro a la agenda'
            ], 404);
        }
        $agenda->update($input);
        return $agenda;
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        $agenda = Agenda::find($id);
        if ($agenda == null) {
            return response()->json([

                'mensaje' => 'No se encontro a la agenda'
            ], 404);
        }
        $agenda->delete();
        return $agenda;
    }
}
