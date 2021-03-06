package com.raed.employes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raed.employes.entities.Employe;
import com.raed.employes.entities.Societe;
import com.raed.employes.repos.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService {
	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public List<Employe> findByNomEmploye(String nom) {
	return employeRepository.findByNomEmploye(nom);
	}
	@Override
	public List<Employe> findByNomEmployeContains(String nom) {
	return employeRepository.findByNomEmployeContains(nom);
	}
	@Override
	public List<Employe> findByNomSalaire(String nom, Double salaire) {
		return employeRepository.findByNomSalaire(nom, salaire);
	}
	@Override
	public List<Employe> findBySociete(Societe societe) {
		return employeRepository.findBySociete(societe);
	}
	@Override
	public List<Employe> findBySocieteIdSoc(Long id) {
		return employeRepository.findBySocieteIdSoc(id);
	}
	@Override
	public List<Employe> findByOrderByNomEmployeAsc() {
		return employeRepository.findByOrderByNomEmployeAsc();
	}
	@Override
	public List<Employe> trierEmployesNomsSalaire() {
		return employeRepository.trierEmployesNomsSalaire();
	}
	@Override
	public Employe saveEmploye(Employe e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Employe updateEmploye(Employe e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmploye(Employe e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEmployeById(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Employe getEmploye(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employe> getAllEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

}
