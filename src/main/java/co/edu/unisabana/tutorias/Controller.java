package co.edu.unisabana.tutorias;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/estudiantes")
public class Controller {

    private static final List<Estudiante> estudiantes = new ArrayList<>();
    private static final List<Sesion> sesiones = new ArrayList<>();

    @PostMapping("/crear")
    public Respuesta agregarEstudiante(@RequestBody Estudiante estudiante) {
        Random rnd = new Random();
        int codigo = 100000 + rnd.nextInt(900000); // Generar código aleatorio de 6 dígitos
        estudiante.setCodigo(codigo);
        estudiantes.add(estudiante);
        return new Respuesta("Se ha creado el estudiante correctamente");
    }
    @GetMapping("/todos")
    public ResponseEntity<List<Estudiante>> mostrarEstudiantes() {
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }
    @GetMapping("/sesiones")
    public ResponseEntity<List<Sesion>> mostrarSesiones() {
        return new ResponseEntity<>(sesiones, HttpStatus.OK);
    }
    @PostMapping("/crearSesion")
    public ResponseEntity<Respuesta> crearSesion(@RequestBody Sesion sesion) {
        int codigoSesion = generarCodigoSesion();
        sesion.setCodigo(codigoSesion);

        Estudiante tutor = sesion.getTutor();

        if (!estudiantes.contains(tutor)) {
            return new ResponseEntity<>(new Respuesta("No se encontró el tutor"), HttpStatus.NOT_FOUND);
        }

        sesiones.add(sesion);

        return new ResponseEntity<>(new Respuesta("Se ha creado la sesión correctamente"), HttpStatus.OK);
    }