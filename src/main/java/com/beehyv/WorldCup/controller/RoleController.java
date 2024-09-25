package com.beehyv.WorldCup.controller;

import com.beehyv.WorldCup.entity.Role;
import com.beehyv.WorldCup.service.RoleService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public List<Role> fetchAllRoles() {
        return roleService.fetchAllRoles();
    }

    @PostMapping("/roles")
    public Role createRole(@Valid @RequestBody Role role) {
        return roleService.createRole(role);
    }

    @GetMapping("/roles/{role-id}")
    public Role fetchRole(@PathVariable("role-id") Integer roleId) {
        return roleService.fetchRole(roleId);
    }
}
