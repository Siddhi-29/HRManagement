
package com.bravura.project.hrmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bravura.project.hrmanagement.dao.ManagerDAO;
import com.bravura.project.hrmanagement.model.Manager;

import java.util.List;

@Service
public class ManagerService {

    private final ManagerDAO managerDAO;

    @Autowired
    public ManagerService(ManagerDAO managerDAO) {
        this.managerDAO = managerDAO;
    }

    public void addManager(Manager manager) {
        managerDAO.insertManager(manager);
    }

    public void updateManager(Manager manager) {
        managerDAO.updateManager(manager);
    }

    public void deleteManagerById(int empId) {
        managerDAO.deleteManagerById(empId);
    }

    public Manager getManagerById(int empId) {
        return managerDAO.getManagerById(empId);
    }

    public List<Manager> getAllManagers() {
        return managerDAO.getAllManagers();
    }
}
