/*
 * Copyright 2017 cmunoz.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.cic.christian.tareas;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cic.christian.configuracion.Configuracion;

/**
 * Clase Main que inicia el ejemplo de Tareas Programadas
 * 
 * @author Christian Muñoz Ason
 * @version 0.1.0
 * @since 1.8
 */
public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    /**
     * Método main que inicia la aplicación
     *
     * @param args
     *            Array de parámetros que se le pueden pasar al método
     */
    public static void main(String[] args) {

	try (AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(
		Configuracion.class)) {
	    Tarea tarea = (Tarea) contexto.getBean("EjecutadorTarea");
	    tarea.ejecutar();
	}
    }
}
