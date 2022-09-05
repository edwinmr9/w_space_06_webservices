package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.ParameterIn;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameters;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

//@Path("/06_ejemplo_rest_jee_01/src/main/java/controller/SaludoController")
@Path("/06_ejemplo_rest_jee_01")
public class SaludoController {
	
	@GET
//	@Path("/primer_metodo")
	@Produces(MediaType.TEXT_PLAIN)
	@Operation(summary = "Obtener listado de documentos de tarjeta", operationId = "obtenerDocumentosTarjeta", description = "Permite obtener listado de documentos de tarjeta")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK"),
			@APIResponse(responseCode = "401", description = "Unauthorized"),
			@APIResponse(responseCode = "403", description = "Forbidden"),
			@APIResponse(responseCode = "404", description = "Not Found")
	})
	@Parameters (value = {
			@Parameter (name = "pmc", description = "Número de permiso", in = ParameterIn.PATH, schema = @Schema(type = SchemaType.INTEGER, example = "41091")),
			@Parameter (name = "idTarjeta", description = "Idenficador del tarjeta", in = ParameterIn.PATH, schema = @Schema(type = SchemaType.INTEGER, example = "52456"))
	})
	public Response obtenerDocumentos(){
		String cadena = " WELCOME TO MY WEB SERVICE JW-RS WITH JAVAEE"; 
		return Response.ok(cadena).build();
	}
}
