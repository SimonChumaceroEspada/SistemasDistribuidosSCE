<?php
namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class UserController extends Controller
{
    public function index(Request $request)
    {
        $usuario = $request->attributes->get('usuario');
        $rol = $usuario->user->rol;
        if ($rol == "admin") {
            $users = User::all();
            return $users;
        } else {
            return response()->json(['message' => 'No tienes permisos para acceder a esta información.'], 403);
        }
    }

    public function getUserList(Request $request)
    {

        $usuario = $request->attributes->get('usuario');
        $rol = $usuario->user->rol;
        if ($rol == "admin") {
            $users = User::all();
            return $users;
        } else {
            return response()->json(['message' => 'No tienes permisos para acceder a esta información desde getUserList'], 403);
        }
    }

    public function store(Request $request)
    {

        $usuario = $request->attributes->get('usuario');
        $rol = $usuario->user->rol;
        if ($rol == "admin") {
            $input = $request->all();
            $agenda = User::create($input);
            return $agenda;
        }
    }

    public function show(string $id)
    {
        $user = User::find($id);
        if ($user == null) {
            return response()->json([
                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        return $user;
        //
    }

    public function update(Request $request, string $id)
    {
        $input = $request->all();
        $user = User::find($id);
        if ($user == null) {
            return response()->json([

                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        $user->update($input);
        return $user;
    }


    public function destroy(string $id)
    {
        $user = User::find($id);
        if ($user == null) {
            return response()->json([

                'mensaje' => 'No se encontro al usuario'
            ], 404);
        }
        $user->delete();
        return $user;
    }

}
