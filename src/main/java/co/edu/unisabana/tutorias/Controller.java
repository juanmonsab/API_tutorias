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
    @DeleteMapping("/eliminar/{codigo}")
    public ResponseEntity<Respuesta> eliminarEstudiante(@PathVariable("codigo") int codigo) {
        Iterator<Estudiante> iterator = estudiantes.iterator();
        while (iterator.hasNext()) {
            Estudiante estudiante = iterator.next();
            if (estudiante.getCodigo() == codigo) {
                iterator.remove();
                eliminarSesionesPorEstudiante(estudiante);
                return new ResponseEntity<>(new Respuesta("Se ha eliminado el estudiante correctamente"), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(new Respuesta("No se encontró el estudiante"), HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/sesiones/eliminar/{codigo}")
    public ResponseEntity<Respuesta> eliminarSesion(@PathVariable("codigo") int codigo) {
        Iterator<Sesion> iterator = sesiones.iterator();
        while (iterator.hasNext()) {
            Sesion sesion = iterator.next();
            if (sesion.getCodigo() == codigo) {
                iterator.remove();
                return new ResponseEntity<>(new Respuesta("Se ha eliminado la sesión correctamente"), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(new Respuesta("No se encontró la sesión"), HttpStatus.NOT_FOUND);
    }