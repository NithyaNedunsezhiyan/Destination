/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lti.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-31T13:38:23.947+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "health", description = "Operations available to regular developers")
public interface HealthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /health : health check API
     * method gives health status of app
     *
     * @param appName param with App name (required)
     * @return App up or down status (status code 200)
     *         or bad input parameter (status code 400)
     */
    @Operation(
        operationId = "healthChecking",
        summary = "health check API",
        tags = { "developers" },
        responses = {
            @ApiResponse(responseCode = "200", description = "App up or down status", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "bad input parameter")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/health",
        produces = { "application/json" }
    )
    default ResponseEntity<String> healthChecking(
        @NotNull @Parameter(name = "appName", description = "param with App name", required = true) @Valid @RequestParam(value = "appName", required = true) String appName
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
