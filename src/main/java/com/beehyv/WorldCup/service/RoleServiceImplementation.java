package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Role;
import com.beehyv.WorldCup.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImplementation implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImplementation(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> fetchAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role fetchRole(Integer roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

}
