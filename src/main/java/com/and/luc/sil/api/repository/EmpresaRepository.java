package com.and.luc.sil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.and.luc.sil.api.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	Empresa findByCnpj(String cnpj);
}
