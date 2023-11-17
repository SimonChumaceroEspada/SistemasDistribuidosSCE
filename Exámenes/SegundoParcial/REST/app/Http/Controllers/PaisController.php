<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Pais;

class PaisController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return response()->json([

            'mensaje' => 'Paises encontrados',
            'data'=>Pais::all()

        ], 200);
        
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $input=$request->all();
        $pais=Pais::create($input);
        return $pais; 
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        $pais=Pais::find($id);
        if ($pais==null)
        {
            return response()->json([

                'mensaje' => 'No se encontro el pais'
            ], 404);
        }
        return $pais;
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        $pais=Pais::find($id);
        if ($pais==null)
        {
            return response()->json([

                'mensaje' => 'No se encontro el pais'
            ], 404);
        }
        $input=$request->all();
        $pais->update($input);
        return $pais;
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        $pais=Pais::find($id);
        if ($pais==null)
        {
            return response()->json([

                'mensaje' => 'No se encontro el pais'
            ], 404);
        }
        $pais->delete();
        return $pais;
    }
}
