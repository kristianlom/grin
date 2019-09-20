package main;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {


    @RequestMapping(method = RequestMethod.POST, value = "created")
    public ResponseEntity<Void> created(String email, String idScooter) {

        /*
         * TODO:
         *  Valdiar que no exista registro del scooter a agregar.
         *  Realizar el alta del scooter dentro de la tabla principal del scooter.
         *  Colocar el estado del scooter a "Created".
         *  Realizar una inserción a una tabla de donde se contenga el historial de movimientos(transición) del scooter.
         *  Las posibles respuestas serían 2xx o 3xx.
         */

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "setup")
    public ResponseEntity<String> setup(String email, String idScooter) {
        /*
         *TODO:
         *  Validar la existencia del scooter.
         *  Verificar que el estado del scooter sea "Created" y de ser así actualizarlo a "Maintenance".
         *  Realizar una inserción a una tabla de donde se contenga el historial de movimientos(transición) del scooter.
         *  Las posibles respuestas serían 2xx o 3xx.
         */
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "moving")
    public ResponseEntity<String> moving(String email, String idScooter) {
        /*
         *TODO:
         *  Validar la existencia del scooter.
         *  Validar que el scooter NO se encuentre en el estado Distribución "Distributing" al ser afirmativa
         *  la validación el estado debe cambiar a "Distributing".
         *  Realizar una inserción a una tabla de donde se contenga el historial de movimientos(transición) del scooter.
         *  Las posibles respuestas serían 2xx o 3xx.
         */

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "placed")
    public ResponseEntity<String> placed(String email, String idScooter) {
        /*
         * TODO:
         *  Validar la existencia del scooter.
         *  Consultar el estado del scooter, si es "Distributing" el estado debe de cambiar a "On Street".
         *  Realizar una inserción a una tabla de donde se contenga el historial de movimientos(transición) del scooter.
         *  Las posibles respuestas serían 2xx o 3xx.
         */

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, value = "repair")
    public ResponseEntity<String> repair(String email, String idScooter) {
        /*
         * TODO:
         *  Validar la existencia del scooter.
         *  Validar que el estado del scooter se encuentre en "On Street" y cambiarlo a "Maintenance".
         *  Realizar una inserción a una tabla de donde se contenga el historial de movimientos(transición) del scooter.
         *  Las posibles respuestas serían 2xx o 3xx.
         */
        String json = "{\"hello\": \"This is a JSON response\"}";
        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}


