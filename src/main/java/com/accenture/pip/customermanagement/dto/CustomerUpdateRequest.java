package com.accenture.pip.customermanagement.dto;


import com.accenture.pip.customermanagement.constants.CustomerManagementConstant;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Builder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CustomerUpdateRequest {

    @Pattern(regexp = "[a-zA-Z][a-zA-Z .,'-]*$")
    private String firstName;

    @Pattern(regexp = "[a-zA-Z][a-zA-Z .,'-]*$")
    private String lastName;

    @Email(regexp = CustomerManagementConstant.EMAIL_REGEX)
    private String email;

    @JsonProperty("address")
    private Set<AddressDTO> addressDTOs;
}
