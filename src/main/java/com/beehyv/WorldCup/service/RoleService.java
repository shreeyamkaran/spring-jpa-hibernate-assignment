package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Role;
import jakarta.validation.Valid;

import java.util.List;

public interface RoleService {

    List<Role> fetchAllRoles();

    Role createRole(@Valid Role role);

    Role fetchRole(Integer roleId);
}
