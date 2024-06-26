package com.example.proyecto_sistema_gestion_empresarial.Interfaces;

import com.example.proyecto_sistema_gestion_empresarial.GastoUsuarios;
import com.example.proyecto_sistema_gestion_empresarial.Proyecto;
import com.example.proyecto_sistema_gestion_empresarial.Respuesta;
import com.example.proyecto_sistema_gestion_empresarial.Respuesta2;
import com.example.proyecto_sistema_gestion_empresarial.Respuesta3;
import com.example.proyecto_sistema_gestion_empresarial.Respuesta4;
import com.example.proyecto_sistema_gestion_empresarial.RespuestaModificarGasto;
import com.example.proyecto_sistema_gestion_empresarial.RespuestaModificarProyecto;
import com.example.proyecto_sistema_gestion_empresarial.RespuestaUsarPagadorId;
import com.example.proyecto_sistema_gestion_empresarial.RespuestaUsarProyectoId;
import com.example.proyecto_sistema_gestion_empresarial.RespuestaCrearGasto;
import com.example.proyecto_sistema_gestion_empresarial.RespuestaUsuarioProyecto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UsarProyecto {

    @GET("/proyectos")
    Call<Respuesta> UsarProyecto();

    @GET("/proyectos/{proyecto_id}")
    Call<RespuestaUsarProyectoId> UsarProyectoId(@Path("proyecto_id") Integer idproyecto);

    @GET("/usuariosproyectos/{proyecto_id}")
    Call<RespuestaUsuarioProyecto> LeerParticipaUsuario(@Path("proyecto_id") Integer proyecto_id);

    @PUT("/proyectos/{proyecto_id}")
    Call<RespuestaModificarProyecto> ModificarProyecto(@Path("proyecto_id") Integer proyecto_id, @Body Proyecto proyectoModificado);


    @DELETE("/proyectos/{proyecto_id}")
    Call<RespuestaUsarProyectoId> BorrarProyecto(@Path("proyecto_id") Integer idproyecto);

    @GET("/gastosList/{idproyecto}")
    Call<Respuesta2> UsarGasto(@Path("idproyecto") Integer idproyecto);

    @GET("/usuarios")
    Call<Respuesta3> UsarUsuario();

    @GET("/usuarios/{usuario_id}")
    Call<RespuestaUsarPagadorId> UsarUsuarioId(@Path("usuario_id") Integer idusuarios);

    @POST("/gastosList/{idproyecto}")
    Call<RespuestaCrearGasto> CrearGasto(@Path("idproyecto") Integer idproyecto, @Body GastoUsuarios nuevoGasto);

    @GET("/gastos/{idgasto}")
    Call<Respuesta2> LeerGasto(@Path("idgasto") Integer idgasto);

    @PUT("/gastos/{idgasto}")
    Call<RespuestaModificarGasto> ModificarGasto(@Path("idgasto") Integer idgasto, @Body GastoUsuarios gastoModificado);

    @DELETE("/gastos/{idgasto}")
    Call<Respuesta2> BorrarGasto(@Path("idgasto") Integer idgasto);

    @GET("/participaGasto/{idgasto}")
    Call<Respuesta4> LeerParticipaGasto(@Path("idgasto") Integer idgasto);

}
